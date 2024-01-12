package com.milotnt.controller;

import com.milotnt.pojo.Equipment;
import com.milotnt.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 类名：EquipmentController
 * 说明：器材控制器类，用于处理与"equipment"相关的请求
 */
@Controller
@RequestMapping("/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    /**
     * 查询所有器材
     *
     * @param model   数据模型
     * @param session HTTP会话
     * @return 返回器材列表页面
     */
    @RequestMapping("/selEquipment")
    public String selectEquipment(Model model, HttpSession session) {
        List<Equipment> equipmentList = equipmentService.findAll();
        session.setAttribute("equipmentList", equipmentList);
        model.addAttribute("equipmentList", equipmentList);
        return "selectEquipment";
    }

    /**
     * 删除器材
     *
     * @param equipmentId 器材ID
     * @return 重定向到器材列表页面
     */
    @RequestMapping("/delEquipment")
    public String deleteEquipment(Integer equipmentId) {
        equipmentService.deleteByEquipmentId(equipmentId);
        return "redirect:selEquipment";
    }

    /**
     * 跳转修改器材页面
     *
     * @param equipmentId 器材ID
     * @param model       数据模型
     * @return 返回器材修改页面
     */
    @RequestMapping("/toUpdateEquipment")
    public String toUpdateEquipment(Integer equipmentId, Model model) {
        List<Equipment> equipmentList = equipmentService.selectByEquipmentId(equipmentId);
        model.addAttribute("equipmentList", equipmentList);
        return "updateEquipment";
    }

    /**
     * 修改器材
     *
     * @param equipment 器材信息
     * @return 重定向到器材列表页面
     */
    @RequestMapping("/updateEquipment")
    public String updateEquipment(Equipment equipment) {
        equipmentService.updateEquipmentByEquipmentId(equipment);
        return "redirect:selEquipment";
    }

    /**
     * 跳转新增器材页面
     *
     * @return 返回新增器材页面
     */
    @RequestMapping("/toAddEquipment")
    public String toAddEquipment() {
        return "addEquipment";
    }

    /**
     * 新增器材
     *
     * @param equipment 器材信息
     * @return 重定向到器材列表页面
     */
    @RequestMapping("/addEquipment")
    public String addEquipment(Equipment equipment) {
        equipmentService.insertEquipment(equipment);
        return "redirect:selEquipment";
    }
}
