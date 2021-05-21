package com.graduate.design.graduatedesign.Service;

import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 荒城
 * @title: SensorService
 * @projectName graduatedesign
 * @description: TODO
 * @date 2021/4/2618:56
 */
@Service
public interface SensorService {
    Map<String, Object> SensorGetPage(int pageNum ,int pageSize);
}
