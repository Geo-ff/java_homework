package com.milotnt.service;

import com.milotnt.pojo.ClassTable;

import java.util.List;

/**
 * 课程服务接口。
 */
public interface ClassTableService {

    /**
     * 查询所有课程。
     *
     * @return 包含所有课程信息的列表。
     */
    List<ClassTable> findAll();

    /**
     * 根据课程ID删除课程。
     *
     * @param classId 课程ID。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    Boolean deleteClassByClassId(Integer classId);

    /**
     * 添加课程。
     *
     * @param classTable 包含课程信息的课程对象。
     * @return 如果添加成功，返回 true；否则返回 false。
     */
    Boolean insertClass(ClassTable classTable);

    /**
     * 根据课程ID查询课程表。
     *
     * @param classId 课程ID。
     * @return 如果找到对应的课程，返回课程信息；否则返回 null。
     */
    ClassTable selectByClassId(Integer classId);

    /**
     * 根据课程ID删除已预约的课程。
     *
     * @param classId 课程ID。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    Boolean deleteOrderByClassId(Integer classId);
}
