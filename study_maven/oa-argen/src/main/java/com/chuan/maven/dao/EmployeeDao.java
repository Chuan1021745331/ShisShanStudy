package com.chuan.maven.dao;

import com.chuan.maven.model.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  EmployeeDao
 * </p>
 *
 * @author JingChuan
 * @since 2018/12/1 10:27
 */
public interface EmployeeDao {
    /** */
    void insert(Employee employee);
    /** */
    Employee findById(@Param("id") Integer id);
}
