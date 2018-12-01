package com.chuan.maven.service.impl;

import com.chuan.maven.dao.EmployeeDao;
import com.chuan.maven.model.Employee;
import com.chuan.maven.service.EmpliyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author JingChuan
 * @since 2018/12/1 10:41
 */
@Service
public class EmployeeServieImpl implements EmpliyeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public void addEmployee(Employee employee) {
        employeeDao.insert(employee);
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeDao.findById(id);
    }
}
