package com.milotnt.service;

import com.milotnt.pojo.ClassOrder;

import java.util.List;

/**
 * 报名服务接口。
 */
public interface ClassOrderService {

    /**
     * 查询所有报名表信息。
     *
     * @return 包含所有报名表信息的列表。
     */
    List<ClassOrder> findAll();

    /**
     * 添加报名信息。
     *
     * @param classOrder 包含报名信息的报名对象。
     * @return 如果添加成功，返回 true；否则返回 false。
     */
    Boolean insertClassOrder(ClassOrder classOrder);

    /**
     * 根据会员账号查询个人报名课表。
     *
     * @param memberAccount 会员账号。
     * @return 包含个人报名课表信息的列表。
     */
    List<ClassOrder> selectClassOrderByMemberAccount(Integer memberAccount);

    /**
     * 删除已预约的课程。
     *
     * @param classOrderId 报名课程的ID。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    Boolean deleteByClassOrderId(Integer classOrderId);

    /**
     * 查询会员是否报名该课程。
     *
     * @param classId       课程ID。
     * @param memberAccount 会员账号。
     * @return 如果会员报名了该课程，返回报名信息；否则返回 null。
     */
    ClassOrder selectMemberByClassIdAndMemberAccount(Integer classId, Integer memberAccount);

    /**
     * 根据课程ID查询所有报名的会员。
     *
     * @param classId 课程ID。
     * @return 包含所有报名的会员信息的列表。
     */
    List<ClassOrder> selectMemberOrderList(Integer classId);
}
