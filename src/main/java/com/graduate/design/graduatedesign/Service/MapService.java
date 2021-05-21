package com.graduate.design.graduatedesign.Service;

import com.graduate.design.graduatedesign.dto.MapDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 荒城
 * @title: MapService
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2923:12
 */
@Service
public interface MapService {
    List<MapDto> findAllEqu();
}
