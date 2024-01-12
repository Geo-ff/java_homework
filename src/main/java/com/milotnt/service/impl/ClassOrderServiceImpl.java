package com.milotnt.service.impl;

import com.milotnt.mapper.ClassOrderMapper;
import com.milotnt.pojo.ClassOrder;
import com.milotnt.service.ClassOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 课程订单服务的实现类。
 */
@Service
public class ClassOrderServiceImpl implements ClassOrderService {

    @Autowired
    private ClassOrderMapper classOrderMapper;

    /**
     * 查询所有课程订单信息。
     *
     * @return 包含所有课程订单信息的列表。
     */
    @Override
    public List<ClassOrder> findAll() {
        return classOrderMapper.findAll();
    }

    /**
     * 添加课程订单信息。
     *
     * @param classOrder 待添加的课程订单对象。
     * @return 如果添加成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean insertClassOrder(ClassOrder classOrder) {
        return classOrderMapper.insertClassOrder(classOrder);
    }

    /**
     * 根据会员账号查询个人课程订单信息。
     *
     * @param memberAccount 会员账号。
     * @return 包含个人课程订单信息的列表。
     */
    @Override
    public List<ClassOrder> selectClassOrderByMemberAccount(Integer memberAccount) {
        return classOrderMapper.selectClassOrderByMemberAccount(memberAccount);
    }

    /**
     * 删除指定课程订单。
     *
     * @param classOrderId 待删除的课程订单ID。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean deleteByClassOrderId(Integer classOrderId) {
        return classOrderMapper.deleteByClassOrderId(classOrderId);
    }

    /**
     * 根据课程ID和会员账号查询课程订单。
     *
     * @param classId       课程ID。
     * @param memberAccount 会员账号。
     * @return 包含课程订单信息的对象，如果不存在则返回 null。
     */
    @Override
    public ClassOrder selectMemberByClassIdAndMemberAccount(Integer classId, Integer memberAccount) {
        return classOrderMapper.selectMemberByClassIdAndMemberAccount(classId, memberAccount);
    }

    /**
     * 根据课程ID查询所有报名的会员。
     *
     * @param classId 课程ID。
     * @return 包含报名会员信息的列表。
     */
    @Override
    public List<ClassOrder> selectMemberOrderList(Integer classId) {
        return classOrderMapper.selectMemberOrderList(classId);
    }
}
