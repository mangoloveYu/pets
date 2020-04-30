package com.pets.controller;

import com.pets.model.entity.Tests;
import com.pets.model.vo.TestVO;
import com.pets.service.ITestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.ArrayList;


/**
 * @author 芒果love
 */
@RestController
@RequestMapping(value="/Test")
@Api(tags = "测试相关接口")
@Validated
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Resource
    private ITestService iUserService;

    @ApiOperation(value="获取用户信息", notes="根据id来获取用户详细信息")
    @ApiImplicitParam(name="id", value="用户ID", required=true, dataType="String")
    @RequestMapping(value="/{id}", method= RequestMethod.GET)
    public ArrayList<TestVO> getInfo(@PathVariable String id) {
        var result = new ArrayList<TestVO>();
        ArrayList<Tests> testList = iUserService.findTestList();
        for (Tests item: testList) {
            var entity = new TestVO();
            entity.setId(item.getId());
            entity.setName(item.getName());
            entity.setYears(item.getYears());
            result.add(entity);
        }
        return result;
    }

}
