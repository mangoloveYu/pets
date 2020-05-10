package com.pets.testmodule.service.impl;

import com.pets.testmodule.dao.TestsMapper;
import com.pets.testmodule.model.entity.Tests;
import com.pets.testmodule.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @description 测试服务类
 * @author 芒果love
 */
@Service
public class TestServiceImpl implements ITestService {

    @Resource
    private TestsMapper testsMapper;

    @Override
    public ArrayList<Tests> findTestList() {
        ArrayList<Tests> test = testsMapper.findTestList();
        return test;
    }

}