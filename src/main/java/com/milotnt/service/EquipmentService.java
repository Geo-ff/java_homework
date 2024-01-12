package com.milotnt.service;

import com.milotnt.pojo.Equipment;

import java.util.List;

/**
 * 器械服务接口。
 */
public interface EquipmentService {

    /**
     * 查询所有器械。
     *
     * @return 包含所有器械信息的列表。
     */
    List<Equipment> findAll();

    /**
     * 根据器械 id 删除器械。
     *
     * @param equipmentId 器械 id。
     * @return 如果删除成功，返回 true；否则返回 false。
     */
    Boolean deleteByEquipmentId(Integer equipmentId);

    /**
     * 添加器材。
     *
     * @param equipment 包含器械信息的器械对象。
     * @return 如果添加成功，返回 true；否则返回 false。
     */
    Boolean insertEquipment(Equipment equipment);

    /**
     * 根据器械 id 修改器械信息。
     *
     * @param equipment 包含更新后器械信息的器械对象。
     * @return 如果修改成功，返回 true；否则返回 false。
     */
    Boolean updateEquipmentByEquipmentId(Equipment equipment);

    /**
     * 根据器械 id 查询器械。
     *
     * @param equipmentId 器械 id。
     * @return 包含器械信息的列表。
     */
    List<Equipment> selectByEquipmentId(Integer equipmentId);

    /**
     * 查询器械总数。
     *
     * @return 器械总数。
     */
    Integer selectTotalCount();
}
