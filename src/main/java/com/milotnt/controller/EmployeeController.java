package com.milotnt.controller;

import com.milotnt.pojo.Employee;
import com.milotnt.service.EmployeeService;
import com.milotnt.service.factory.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 类名：EmployeeController
 * 说明：员工控制器类，用于处理与"employee"相关的请求
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * 查询所有员工
     *
     * @param model 数据模型
     * @return 返回员工列表页面
     */
    @RequestMapping("/selEmployee")
    public String selectEmployee(Model model) {
        List<Employee> employeeList = employeeService.findAll();
        model.addAttribute("employeeList", employeeList);
        return "selectEmployee";
    }

    /**
     * 跳转新增员工页面
     *
     * @return 返回新增员工页面
     */
    @RequestMapping("/toAddEmployee")
    public String toAddEmployee() {
        return "addEmployee";
    }

    /**
     * 新增员工
     *
     * @param employee 员工信息
     * @return 重定向到员工列表页面
     */
    @RequestMapping("/addEmployee")
    public String addEmployee(Employee employee) {
        Integer account = IdGenerator.generateId(); // 使用工号生成工具类

        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowDay = simpleDateFormat.format(date);

        employee.setEmployeeAccount(account); // 设置员工工号
        employee.setEntryTime(nowDay); // 设置员工进入时间

        employeeService.insertEmployee(employee);

        return "redirect:selEmployee";
    }

    /**
     * 删除员工
     *
     * @param employeeAccount 员工工号
     * @return 重定向到员工列表页面
     */
    @RequestMapping("/delEmployee")
    public String deleteEmployee(Integer employeeAccount) {
        employeeService.deleteByEmployeeAccount(employeeAccount);
        return "redirect:selEmployee";
    }

    /**
     * 跳转员工修改页面
     *
     * @param employeeAccount 员工工号
     * @param model           数据模型
     * @return 返回员工修改页面
     */
    @RequestMapping("/toUpdateEmployee")
    public String toUpdateEmployee(Integer employeeAccount, Model model) {
        List<Employee> employeeList = employeeService.selectByEmployeeAccount(employeeAccount);
        model.addAttribute("employeeList", employeeList);
        return "updateEmployee";
    }

    /**
     * 修改员工信息
     *
     * @param employee 员工信息
     * @return 重定向到员工列表页面
     */
    @RequestMapping("/updateEmployee")
    public String updateEmployee(Employee employee) {
        employeeService.updateMemberByEmployeeAccount(employee);
        return "redirect:selEmployee";
    }
}
