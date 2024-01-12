package com.milotnt.controller;

import com.milotnt.pojo.Admin;
import com.milotnt.pojo.Member;
import com.milotnt.service.AdminService;
import com.milotnt.service.EmployeeService;
import com.milotnt.service.EquipmentService;
import com.milotnt.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * 类名：LoginController
 * 说明：登录控制器类，处理管理员和会员登录相关请求
 */
@Controller
public class LoginController {

    @Autowired
    private MemberService memberService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EquipmentService equipmentService;

    /**
     * 跳转管理员登录页面
     *
     * @return 返回管理员登录页面视图
     */
    @RequestMapping("/")
    public String toAdminLogin() {
        return "adminLogin";
    }

    /**
     * 跳转会员登录页面
     *
     * @return 返回会员登录页面视图
     */
    @RequestMapping("/toUserLogin")
    public String toUserLogin() {
        return "userLogin";
    }

    /**
     * 管理员登录
     *
     * @param admin  管理员对象
     * @param model  数据模型
     * @param session HTTP会话
     * @return 若登录成功则跳转至管理员主页，否则返回管理员登录页面
     */
    @RequestMapping("/adminLogin")
    public String adminLogin(Admin admin, Model model, HttpSession session) {
        Admin admin1 = adminService.adminLogin(admin);
        if (admin1 != null) {
            //会员人数
            Integer memberTotal = memberService.selectTotalCount();
            model.addAttribute("memberTotal", memberTotal);
            session.setAttribute("memberTotal", memberTotal);

            //员工人数
            Integer employeeTotal = employeeService.selectTotalCount();
            model.addAttribute("employeeTotal", employeeTotal);
            session.setAttribute("employeeTotal", employeeTotal);

            //健身房总人数
            Integer humanTotal = memberTotal + employeeTotal;
            model.addAttribute("humanTotal", humanTotal);
            session.setAttribute("humanTotal", humanTotal);

            //器材数
            Integer equipmentTotal = equipmentService.selectTotalCount();
            model.addAttribute("equipmentTotal", equipmentTotal);
            session.setAttribute("equipmentTotal", equipmentTotal);

            return "adminMain";
        }
        model.addAttribute("msg", "您输入的账号或密码有误，请重新输入！");
        return "adminLogin";
    }

    /**
     * 会员登录
     *
     * @param member 会员对象
     * @param model  数据模型
     * @param session HTTP会话
     * @return 若登录成功则跳转至会员主页，否则返回会员登录页面
     */
    @RequestMapping("/userLogin")
    public String userLogin(Member member, Model model, HttpSession session) {
        Member member1 = memberService.userLogin(member);
        if (member1 != null) {
            model.addAttribute("member", member1);
            session.setAttribute("user", member1);
            return "userMain";
        }
        model.addAttribute("msg", "您输入的账号或密码有误，请重新输入！");
        return "userLogin";
    }

    /**
     * 跳转管理员主页
     *
     * @param model   数据模型
     * @param session HTTP会话
     * @return 返回管理员主页视图
     */
    @RequestMapping("/toAdminMain")
    public String toAdminMain(Model model, HttpSession session) {
        Integer memberTotal = (Integer) session.getAttribute("memberTotal");
        Integer employeeTotal = (Integer) session.getAttribute("employeeTotal");
        Integer humanTotal = (Integer) session.getAttribute("humanTotal");
        Integer equipmentTotal = (Integer) session.getAttribute("equipmentTotal");
        model.addAttribute("memberTotal", memberTotal);
        model.addAttribute("employeeTotal", employeeTotal);
        model.addAttribute("humanTotal", humanTotal);
        model.addAttribute("equipmentTotal", equipmentTotal);
        return "adminMain";
    }

    /**
     * 跳转会员主页
     *
     * @param model   数据模型
     * @param session HTTP会话
     * @return 返回会员主页视图
     */
    @RequestMapping("/toUserMain")
    public String toUserMain(Model model, HttpSession session) {
        Member member = (Member) session.getAttribute("user");
        model.addAttribute("member", member);
        return "userMain";
    }

}
