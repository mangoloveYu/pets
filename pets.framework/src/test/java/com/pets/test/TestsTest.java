package com.pets.test;

import com.pets.App;
import com.pets.common.SequenceIdGenerator;
import com.pets.dao.TestsMapper;
import com.pets.model.entity.*;
import com.pets.model.enums.GenderEnum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class TestsTest {

    @Resource
    private TestsMapper testsMapper;

    private static final Logger logger = LoggerFactory.getLogger("33333");
    @Test
    public void testEnum() {

        logger.info("1111111");

        System.out.println(GenderEnum.MAN);
        System.out.println(GenderEnum.MAN.getIndex());
        System.out.println(GenderEnum.MAN.getValue());
    }
    @Test
    public void testNewId() {
        SequenceIdGenerator generator =new SequenceIdGenerator(1,10);
        for(int i = 0; i<100000;i++){
            System.out.println(generator.nextId());
        }

    }

    @org.junit.Test
    public void testFindUser() {
        ArrayList<Tests> testList = testsMapper.findTestList();
        for (Tests item: testList) {
            System.out.println(item.getName());
            System.out.println(item.getGender());
        }
        System.out.println(testList);
    }

}
