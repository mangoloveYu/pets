package com.pets.testmodule.dao;

import com.pets.testmodule.model.entity.Tests;
import java.util.ArrayList;

/**
 * @description 测试映射类
 * @author 芒果love
 */
public interface TestsMapper {
    /**
     * 查询列表
     *
     * @param
     * @return ArrayList<Tests>
     */
    ArrayList<Tests> findTestList();
}