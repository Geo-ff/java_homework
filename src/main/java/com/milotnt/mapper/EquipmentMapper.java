package com.milotnt.mapper;

import com.milotnt.pojo.Equipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 接口名：EquipmentMapper
 * 说明：器械信息数据访问接口
 */
@Mapper
public interface EquipmentMapper {

    /**
     * 查询所有器械
     *
     * @return 所有器械列表
     */
    List<Equipment> findAll();

    /**
     * 根据器械 id 删除器械
     *
     * @param equipmentId 器械 id
     * @return 删除是否成功
     */
    Boolean deleteByEquipmentId(Integer equipmentId);

    /**
     * 添加器材
     *
     * @param equipment 器械对象
     * @return 添加是否成功
     */
    Boolean insertEquipment(Equipment equipment);

    /**
     * 根据器械 id 修改器械信息
     *
     * @param equipment 器械对象
     * @return 修改是否成功
     */
    Boolean updateEquipmentByEquipmentId(Equipment equipment);

    /**
     * 根据器械 id 查询器械
     *
     * @param equipmentId 器械 id
     * @return 器械对象列表
     */
    List<Equipment> selectByEquipmentId(Integer equipmentId);

    /**
     * 查询器械总数
     *
     * @return 器械总数
     */
    Integer selectTotalCount();
}
