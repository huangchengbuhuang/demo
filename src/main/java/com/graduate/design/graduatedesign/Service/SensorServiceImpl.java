package com.graduate.design.graduatedesign.Service;

import com.graduate.design.graduatedesign.Mapper.SensorMapper;
import com.graduate.design.graduatedesign.dto.SensorDto;
import com.graduate.design.graduatedesign.pojo.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 荒城
 * @title: SensorServiceImpl
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2618:56
 */
@Service
public class SensorServiceImpl implements SensorService {
@Autowired
private SensorMapper sensorMapper;
    @Override
    public Map<String, Object> SensorGetPage(int limit, int offset) {
        HashMap<String, Object> resultMap = new HashMap<>();
        //查询传感器集合
        List<Sensor> sensorlist = sensorMapper.SensorGetPage(limit,offset);
        //传输给实时数据该有的数据
        ArrayList<SensorDto> sensorDtolist = new ArrayList<>();
        for(Sensor sensor:sensorlist){
            SensorDto sensorDto = new SensorDto();
            sensorDto.setName(sensor.getSensor_name());
            sensorDto.setId(sensor.getSenser_id());
            sensorDto.setData(sensor.getAva_data());
            sensorDto.setDataLimit(sensor.getNormal_data());
            /*  Date date = new Date();
    date.setTime(milliSecond);
    System.out.println(new SimpleDateFormat().format(date));*/
            //转变为标准时间
            long timeMillis = System.currentTimeMillis();
            Date date = new Date();
            date.setTime(timeMillis);
            String time = new SimpleDateFormat().format(date);
            sensorDto.setDate(time);
            sensorDtolist.add(sensorDto);

        }


        //查找传感器的总数
        Integer total=0;
        total=sensorMapper.findAllCount();
        resultMap.put("total",total);
        resultMap.put("data",sensorDtolist);

        return resultMap;

    }

}
