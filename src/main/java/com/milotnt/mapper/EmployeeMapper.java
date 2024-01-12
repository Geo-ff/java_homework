package com.milotnt.mapper;

import com.milotnt.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 接口名：EmployeeMapper
 * 说明：员工信息数据访问接口
 */
@Mapper
public interface EmployeeMapper {

    /**
     * 查询所有员工
     *
     * @return 所有员工列表
     */
    List<Employee> findAll();

    /**
     * 根据员工账号删除员工
     *
     * @param employeeAccount 员工账号
     * @return 删除是否成功
     */
    Boolean deleteByEmployeeAccount(Integer employeeAccount);

    /**
     * 添加新员工
     *
     * @param employee 员工对象
     * @return 添加是否成功
     */
    Boolean insertEmployee(Employee employee);

    /**
     * 根据员工账号修改员工信息
     *
     * @param employee 员工对象
     * @return 修改是否成功
     */
    Boolean updateMemberByEmployeeAccount(Employee employee);

    /**
     * 根据员工账号查询员工
     *
     * @param employeeAccount 员工账号
     * @return 员工对象列表
     */
    List<Employee> selectByEmployeeAccount(Integer employeeAccount);

    /**
     * 查询员工数
     *
     * @return 员工数
     */
    Integer selectTotalCount();
}
