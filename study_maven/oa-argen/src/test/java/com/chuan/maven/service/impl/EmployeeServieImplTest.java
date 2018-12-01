package com.chuan.maven.service.impl;

import com.chuan.maven.model.Employee;
import com.chuan.maven.service.EmpliyeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:application.xml"})
public class EmployeeServieImplTest {

    @Autowired
    private EmpliyeeService empliyeeService;

    @Test
    public void insertTest(){
        Employee employee = new Employee();
        employee.setName("chuan");
        employee.setAge(20);
        empliyeeService.addEmployee(employee);
    }

    @Test
    public void findEmployeeById(){
        Employee employee = empliyeeService.findEmployeeById(1);
        Assert.assertTrue("chuan".equals( employee.getName()));
    }
}