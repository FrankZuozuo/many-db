package com.wretchant.manydb;

import com.wretchant.manydb.mapper.rtx.InterMapper;
import com.wretchant.manydb.mapper.titan.AmdMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyDbApplicationTests {



    @Autowired
    private InterMapper interMapper;
    @Autowired
    private AmdMapper amdMapper;

    @Test
    public void contextLoads() {
        Assert.assertEquals(5, interMapper.findAll().size());
        Assert.assertEquals(6, amdMapper.findAll().size());

        interMapper.findAll().forEach(System.out::println);
        amdMapper.findAll().forEach(System.out::println);
    }

}
