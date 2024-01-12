package com.milotnt.mapper;

import com.milotnt.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * 接口名：AdminMapper
 * 说明：管理员数据访问接口
 */
@Mapper
public interface AdminMapper {

    /**
     * 根据账号和密码查询管理员
     *
     * @param admin 管理员对象
     * @return 查询到的管理员对象
     */
    Admin selectByAccountAndPassword(Admin admin);
}
