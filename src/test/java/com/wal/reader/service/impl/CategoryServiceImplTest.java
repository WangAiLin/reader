package com.wal.reader.service.impl;

import com.wal.reader.entity.Category;
import com.wal.reader.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CategoryServiceImplTest {

    @Resource
    private CategoryService categoryService;

    @Test
    public void selectAll() throws Exception {
        List<Category> list = categoryService.selectAll();
        System.out.println(list);
    }

}