package com.graduate.design.graduatedesign.Service;

import com.graduate.design.graduatedesign.Mapper.MapMapper;
import com.graduate.design.graduatedesign.dto.MapDto;
import com.graduate.design.graduatedesign.pojo.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 荒城
 * @title: MapServiceImpl
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2923:13
 */
@Service
public class MapServiceImpl implements MapService{
    @Autowired
    private MapMapper mapMapper;
    @Override
    public List<MapDto> findAllEqu() {
       List<Equipment> equipments= mapMapper.findAllEqu();
        ArrayList<MapDto> mapDtoList = new ArrayList<>();
        for (Equipment equipment: equipments){
            MapDto mapDto = new MapDto();
            mapDto.setName(equipment.getEquipment_name());
            mapDto.setLocation_X(equipment.getLon());
            mapDto.setLocation_Y(equipment.getLat());
            mapDto.setEquipmentId(equipment.getEqu_id());
            mapDtoList.add(mapDto);
        }
        return mapDtoList;
    }
}
