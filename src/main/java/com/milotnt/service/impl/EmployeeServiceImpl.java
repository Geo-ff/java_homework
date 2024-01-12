package com.milotnt.service.impl;

import com.milotnt.mapper.EmployeeMapper;
import com.milotnt.pojo.Employee;
import com.milotnt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工服务的实现类。
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 查询所有员工信息。
     *
     * @return 包含所有员工信息的列表。
     */
    @Override
    public List<Employee> findAll() {
        return employeeMapper.findAll();
    }

    /**
     * 根据员工账号删除员工。
     *
     * @param employeeAccount 待删除的员工账号。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean deleteByEmployeeAccount(Integer employeeAccount) {
        return employeeMapper.deleteByEmployeeAccount(employeeAccount);
    }

    /**
     * 添加新员工信息。
     *
     * @param employee 待添加的员工对象。
     * @return 如果添加成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean insertEmployee(Employee employee) {
        return employeeMapper.insertEmployee(employee);
    }

    /**
     * 根据员工账号修改员工信息。
     *
     * @param employee 待更新的员工对象。
     * @return 如果更新成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean updateMemberByEmployeeAccount(Employee employee) {
        return employeeMapper.updateMemberByEmployeeAccount(employee);
    }

    /**
     * 根据员工账号查询员工信息。
     *
     * @param employeeAccount 员工账号。
     * @return 包含员工信息的列表，如果不存在则返回空列表。
     */
    @Override
    public List<Employee> selectByEmployeeAccount(Integer employeeAccount) {
        return employeeMapper.selectByEmployeeAccount(employeeAccount);
    }

    /**
     * 查询员工数。
     *
     * @return 员工总数。
     */
    @Override
    public Integer selectTotalCount() {
        return employeeMapper.selectTotalCount();
    }
}
