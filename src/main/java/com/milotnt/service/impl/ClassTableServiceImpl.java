package com.milotnt.service.impl;

import com.milotnt.mapper.ClassTableMapper;
import com.milotnt.pojo.ClassTable;
import com.milotnt.service.ClassTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 课程表服务的实现类。
 */
@Service
public class ClassTableServiceImpl implements ClassTableService {

    @Autowired
    private ClassTableMapper classTableMapper;

    /**
     * 查询所有课程信息。
     *
     * @return 包含所有课程信息的列表。
     */
    @Override
    public List<ClassTable> findAll() {
        return classTableMapper.findAll();
    }

    /**
     * 根据课程ID删除课程。
     *
     * @param classId 待删除的课程ID。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean deleteClassByClassId(Integer classId) {
        return classTableMapper.deleteClassByClassId(classId);
    }

    /**
     * 添加课程信息。
     *
     * @param classTable 待添加的课程对象。
     * @return 如果添加成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean insertClass(ClassTable classTable) {
        return classTableMapper.insertClass(classTable);
    }

    /**
     * 根据课程ID查询课程信息。
     *
     * @param classId 课程ID。
     * @return 包含课程信息的对象，如果不存在则返回 null。
     */
    @Override
    public ClassTable selectByClassId(Integer classId) {
        return classTableMapper.selectByClassId(classId);
    }

    /**
     * 根据课程ID删除已预约的课程。
     *
     * @param classId 课程ID。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean deleteOrderByClassId(Integer classId) {
        return classTableMapper.deleteOrderByClassId(classId);
    }
}
