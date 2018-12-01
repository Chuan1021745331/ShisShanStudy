package com.chuan.maven.service;

import com.chuan.maven.model.Employee;

/**
 * <p>
 *
 * </p>
 *
 * @author JingChuan
 * @since 2018/12/1 10:39
 */
public interface EmpliyeeService {

   void addEmployee(Employee employee);

    Employee findEmployeeById(Integer id);
}
