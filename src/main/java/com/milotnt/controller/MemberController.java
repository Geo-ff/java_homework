package com.milotnt.controller;

import com.milotnt.pojo.Member;
import com.milotnt.service.MemberService;
import com.milotnt.service.factory.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 类名：MemberController
 * 说明：控制器类，用于处理与"member"相关的请求
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    /**
     * 查询会员
     *
     * @param model 数据模型
     * @return 返回会员查询页面视图
     */
    @RequestMapping("/selMember")
    public String selectMember(Model model) {
        List<Member> memberList = memberService.findAll();
        model.addAttribute("memberList", memberList);
        return "selectMember";
    }

    /**
     * 跳转新增会员页面
     *
     * @return 返回新增会员页面视图
     */
    @RequestMapping("/toAddMember")
    public String toAddMember() {
        return "addMember";
    }

    /**
     * 新增会员
     *
     * @param member 会员对象
     * @return 重定向至会员查询页面视图
     */
    @RequestMapping("/addMember")
    public String addMember(Member member) {
        //会员账号&卡号随机生成
        Integer account = IdGenerator.generateId();

        //初始密码
        String password = "123456";

        //获取当前日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String nowDay = simpleDateFormat.format(date);

        Integer nextClass = member.getCardClass();

        member.setMemberAccount(account);
        member.setMemberPassword(password);
        member.setCardTime(nowDay);
        member.setCardNextClass(nextClass);

        memberService.insertMember(member);

        return "redirect:selMember";
    }

    /**
     * 删除会员
     *
     * @param memberAccount 会员账号
     * @return 重定向至会员查询页面视图
     */
    @RequestMapping("/delMember")
    public String deleteMember(Integer memberAccount) {
        memberService.deleteByMemberAccount(memberAccount);
        return "redirect:selMember";
    }

    /**
     * 跳转会员修改页面
     *
     * @param memberAccount 会员账号
     * @param model         数据模型
     * @return 返回会员修改页面视图
     */
    @RequestMapping("/toUpdateMember")
    public String toUpdateMember(Integer memberAccount, Model model) {
        List<Member> memberList = memberService.selectByMemberAccount(memberAccount);
        model.addAttribute("memberList", memberList);
        return "updateMember";
    }

    /**
     * 修改会员信息
     *
     * @param member 会员对象
     * @return 重定向至会员查询页面视图
     */
    @RequestMapping("/updateMember")
    public String updateMember(Member member) {
        memberService.updateMemberByMemberAccount(member);
        return "redirect:selMember";
    }

    /**
     * 跳转会员卡查询页面
     *
     * @return 返回会员卡查询页面视图
     */
    @RequestMapping("/toSelByCard")
    public String toSelectByCardId() {
        return "selectByMemberAccount";
    }

    /**
     * 根据会员卡号查询
     *
     * @param model         数据模型
     * @param memberAccount 会员账号
     * @return 返回会员卡查询页面视图
     */
    @RequestMapping("/selByCard")
    public String selectByCardId(Model model, Integer memberAccount) {
        List<Member> memberList = memberService.selectByMemberAccount(memberAccount);
        if (memberList != null) {
            model.addAttribute("memberList", memberList);
        } else {
            String message = "会员卡号不存在！";
            model.addAttribute("noMessage", message);
        }
        return "selectByMemberAccount";
    }
}
