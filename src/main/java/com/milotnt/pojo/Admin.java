package com.milotnt.pojo;

/**
 * 类名：Admin
 * 说明：管理员实体类
 */
public class Admin {

    private Integer adminAccount; // 管理员账号
    private String adminPassword; // 管理员密码

    /**
     * 获取管理员账号。
     *
     * @return 管理员账号
     */
    public Integer getAdminAccount() {
        return adminAccount;
    }

    /**
     * 设置管理员账号。
     *
     * @param adminAccount 管理员账号
     */
    public void setAdminAccount(Integer adminAccount) {
        this.adminAccount = adminAccount;
    }

    /**
     * 获取管理员密码。
     *
     * @return 管理员密码
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * 设置管理员密码。
     *
     * @param adminPassword 管理员密码
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * 重写toString方法，方便输出对象信息。
     *
     * @return 字符串表示的对象信息
     */
    @Override
    public String toString() {
        return "Admin{" +
                "adminAccount=" + adminAccount +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }
}
