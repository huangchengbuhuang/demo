/**
 * Created by dell-pc on 2017/12/19.
 */

    //ÿ���û����豸�������ͼģʽ����ʾ
var mapObj, cluster;
var markers = [];
$(document).ready(function () {
    mapObj = new AMap.Map("mapShow", {
        //��ά��ͼ��ʾ�ӿ�
        view: new AMap.View2D({
            center: new AMap.LngLat(104.451345, 37.284562),//��ͼ���ĵ�
            zoom: 4 //��ͼ��ʾ�����ż���
        })
    });
    mapObj.plugin(["AMap.ToolBar"], function () {
        var toolBar = new AMap.ToolBar();
        mapObj.addControl(toolBar);
    });
    //�����������ݣ�չʾÿ���豸
    $.post(ip+"/equipment/findLocationUserId",params,function(json){
        console.log(data)
        $.each(json.data, function (i, item) {
            var ss = '�豸���ƣ�<span style="font-size:14px;text-decoration:underline;" >' + item.name + '</span>';
            lng = item.location_X;
            lat = item.location_Y;
            addPoint(lng,lat, ss,item.equipmentId);
        });
        //��������������λ�ú�����ģ����þۼ�����
        mapObj.plugin(["AMap.MarkerClusterer"], function () {
            cluster = new AMap.MarkerClusterer(mapObj, markers);
            cluster.setGridSize(20);
        });
    });
});
//չʾ������Ϣ
var showSensors = function (infoWindow, marker,gid) {
    infoWindow.open(mapObj, marker.getPosition());
};
function addPoint(lng, lat, content, typeIcon,gid) {
    var marker = new AMap.Marker({
        position: new AMap.LngLat(lng, lat),
        draggable: false, //���ǿ���ק
        raiseOnDrag: true//�����ק����ʱ���������뿪��ͼ��Ч��
    });
    var infoWindow = new AMap.InfoWindow({
        content: content,
        offset: new AMap.Pixel(0, 0)//-113, -140
    });
    AMap.event.addListener(marker, 'click', function () { //�����marker�����Զ������Ϣ����
        showSensors(infoWindow, marker,gid);
    });
    marker.setMap(mapObj);
    markers.push(marker);
}

