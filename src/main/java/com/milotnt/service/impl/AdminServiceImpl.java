package com.milotnt.service.impl;

import com.milotnt.mapper.AdminMapper;
import com.milotnt.pojo.Admin;
import com.milotnt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员服务的实现类。
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 管理员登录验证。
     *
     * @param admin 包含账号和密码的管理员对象。
     * @return 如果验证成功，返回完整的管理员信息；否则返回 null。
     */
    @Override
    public Admin adminLogin(Admin admin) {
        // 调用 AdminMapper 中的方法查询数据库
        return adminMapper.selectByAccountAndPassword(admin);
    }
}
