package com.milotnt.mapper;

import com.milotnt.pojo.ClassOrder;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 接口名：ClassOrderMapper
 * 说明：课程报名信息数据访问接口
 */
@Mapper
public interface ClassOrderMapper {

    /**
     * 查询所有报名表信息
     *
     * @return 所有报名表信息列表
     */
    List<ClassOrder> findAll();

    /**
     * 添加报名信息
     *
     * @param classOrder 报名信息对象
     * @return 添加是否成功
     */
    Boolean insertClassOrder(ClassOrder classOrder);

    /**
     * 根据会员账号查询个人报名课表
     *
     * @param memberAccount 会员账号
     * @return 个人报名课表列表
     */
    List<ClassOrder> selectClassOrderByMemberAccount(Integer memberAccount);

    /**
     * 删除已预约的课程
     *
     * @param classOrderId 报名信息ID
     * @return 删除是否成功
     */
    Boolean deleteByClassOrderId(Integer classOrderId);

    /**
     * 查询会员是否报名该课程
     *
     * @param classId       课程ID
     * @param memberAccount 会员账号
     * @return 报名信息对象
     */
    ClassOrder selectMemberByClassIdAndMemberAccount(Integer classId, Integer memberAccount);

    /**
     * 根据课程ID查询所有报名的会员
     *
     * @param classId 课程ID
     * @return 报名的会员列表
     */
    List<ClassOrder> selectMemberOrderList(Integer classId);
}
