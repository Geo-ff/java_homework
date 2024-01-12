package com.milotnt.service;

import com.milotnt.pojo.Employee;

import java.util.List;

/**
 * 员工服务接口。
 */
public interface EmployeeService {

    /**
     * 查询所有员工。
     *
     * @return 包含所有员工信息的列表。
     */
    List<Employee> findAll();

    /**
     * 根据员工账号删除员工。
     *
     * @param employeeAccount 员工账号。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    Boolean deleteByEmployeeAccount(Integer employeeAccount);

    /**
     * 添加新员工。
     *
     * @param employee 包含员工信息的员工对象。
     * @return 如果添加成功，返回 true；否则返回 false。
     */
    Boolean insertEmployee(Employee employee);

    /**
     * 根据员工账号修改员工信息。
     *
     * @param employee 包含更新后员工信息的员工对象。
     * @return 如果修改成功，返回 true；否则返回 false。
     */
    Boolean updateMemberByEmployeeAccount(Employee employee);

    /**
     * 根据员工账号查询员工。
     *
     * @param employeeAccount 员工账号。
     * @return 包含员工信息的列表。
     */
    List<Employee> selectByEmployeeAccount(Integer employeeAccount);

    /**
     * 查询员工数。
     *
     * @return 员工总数。
     */
    Integer selectTotalCount();
}
