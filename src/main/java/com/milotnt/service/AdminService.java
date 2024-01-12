package com.milotnt.service;

import com.milotnt.pojo.Admin;

/**
 * 管理员服务接口。
 */
public interface AdminService {

    /**
     * 管理员登录验证。
     *
     * @param admin 包含管理员账号和密码的管理员对象。
     * @return 如果验证成功，返回管理员对象；否则返回 null。
     */
    Admin adminLogin(Admin admin);
}
