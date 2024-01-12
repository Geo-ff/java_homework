package com.milotnt.mapper;

import com.milotnt.pojo.ClassTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 接口名：ClassTableMapper
 * 说明：课程信息数据访问接口
 */
@Mapper
public interface ClassTableMapper {

    /**
     * 查询所有课程
     *
     * @return 所有课程列表
     */
    List<ClassTable> findAll();

    /**
     * 根据课程ID删除课程
     *
     * @param classId 课程ID
     * @return 删除是否成功
     */
    Boolean deleteClassByClassId(Integer classId);

    /**
     * 添加课程
     *
     * @param classTable 课程对象
     * @return 添加是否成功
     */
    Boolean insertClass(ClassTable classTable);

    /**
     * 根据课程ID查询课表
     *
     * @param classId 课程ID
     * @return 课程对象
     */
    ClassTable selectByClassId(Integer classId);

    /**
     * 根据课程ID删除已预约的课程
     *
     * @param classId 课程ID
     * @return 删除是否成功
     */
    Boolean deleteOrderByClassId(Integer classId);
}
