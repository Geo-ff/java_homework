package com.milotnt.service.impl;

import com.milotnt.mapper.EquipmentMapper;
import com.milotnt.pojo.Equipment;
import com.milotnt.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 器械服务的实现类。
 */
@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentMapper equipmentMapper;

    /**
     * 查询所有器械信息。
     *
     * @return 包含所有器械信息的列表。
     */
    @Override
    public List<Equipment> findAll() {
        return equipmentMapper.findAll();
    }

    /**
     * 根据器械ID删除器械。
     *
     * @param equipmentId 待删除的器械ID。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean deleteByEquipmentId(Integer equipmentId) {
        return equipmentMapper.deleteByEquipmentId(equipmentId);
    }

    /**
     * 添加新器械信息。
     *
     * @param equipment 待添加的器械对象。
     * @return 如果添加成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean insertEquipment(Equipment equipment) {
        return equipmentMapper.insertEquipment(equipment);
    }

    /**
     * 根据器械ID修改器械信息。
     *
     * @param equipment 待更新的器械对象。
     * @return 如果更新成功，返回 true；否则返回 false。
     */
    @Override
    public Boolean updateEquipmentByEquipmentId(Equipment equipment) {
        return equipmentMapper.updateEquipmentByEquipmentId(equipment);
    }

    /**
     * 根据器械ID查询器械信息。
     *
     * @param equipmentId 器械ID。
     * @return 包含器械信息的列表，如果不存在则返回空列表。
     */
    @Override
    public List<Equipment> selectByEquipmentId(Integer equipmentId) {
        return equipmentMapper.selectByEquipmentId(equipmentId);
    }

    /**
     * 查询器械总数。
     *
     * @return 器械总数。
     */
    @Override
    public Integer selectTotalCount() {
        return equipmentMapper.selectTotalCount();
    }
}
