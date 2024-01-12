package com.milotnt.pojo;

/**
 * 类名：Member
 * 说明：会员实体类
 */
public class Member {

    private Integer memberAccount; // 会员账号
    private String memberPassword; // 会员密码
    private String memberName; // 会员姓名
    private String memberGender; // 会员性别
    private Integer memberAge; // 会员年龄
    private Integer memberHeight; // 会员身高
    private Integer memberWeight; // 会员体重
    private Long memberPhone; // 会员手机号
    private String cardTime; // 会员办卡时间
    private Integer cardClass; // 会员卡等级
    private Integer cardNextClass; // 会员下次卡等级

    /**
     * 获取会员账号。
     *
     * @return 会员账号
     */
    public Integer getMemberAccount() {
        return memberAccount;
    }

    /**
     * 设置会员账号。
     *
     * @param memberAccount 会员账号
     */
    public void setMemberAccount(Integer memberAccount) {
        this.memberAccount = memberAccount;
    }

    /**
     * 获取会员密码。
     *
     * @return 会员密码
     */
    public String getMemberPassword() {
        return memberPassword;
    }

    /**
     * 设置会员密码。
     *
     * @param memberPassword 会员密码
     */
    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    /**
     * 获取会员姓名。
     *
     * @return 会员姓名
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * 设置会员姓名。
     *
     * @param memberName 会员姓名
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * 获取会员性别。
     *
     * @return 会员性别
     */
    public String getMemberGender() {
        return memberGender;
    }

    /**
     * 设置会员性别。
     *
     * @param memberGender 会员性别
     */
    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    /**
     * 获取会员年龄。
     *
     * @return 会员年龄
     */
    public Integer getMemberAge() {
        return memberAge;
    }

    /**
     * 设置会员年龄。
     *
     * @param memberAge 会员年龄
     */
    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }

    /**
     * 获取会员身高。
     *
     * @return 会员身高
     */
    public Integer getMemberHeight() {
        return memberHeight;
    }

    /**
     * 设置会员身高。
     *
     * @param memberHeight 会员身高
     */
    public void setMemberHeight(Integer memberHeight) {
        this.memberHeight = memberHeight;
    }

    /**
     * 获取会员体重。
     *
     * @return 会员体重
     */
    public Integer getMemberWeight() {
        return memberWeight;
    }

    /**
     * 设置会员体重。
     *
     * @param memberWeight 会员体重
     */
    public void setMemberWeight(Integer memberWeight) {
        this.memberWeight = memberWeight;
    }

    /**
     * 获取会员手机号。
     *
     * @return 会员手机号
     */
    public Long getMemberPhone() {
        return memberPhone;
    }

    /**
     * 设置会员手机号。
     *
     * @param memberPhone 会员手机号
     */
    public void setMemberPhone(Long memberPhone) {
        this.memberPhone = memberPhone;
    }

    /**
     * 获取会员办卡时间。
     *
     * @return 会员办卡时间
     */
    public String getCardTime() {
        return cardTime;
    }

    /**
     * 设置会员办卡时间。
     *
     * @param cardTime 会员办卡时间
     */
    public void setCardTime(String cardTime) {
        this.cardTime = cardTime;
    }

    /**
     * 获取购买课时
     *
     * @return 购买课时
     */
    public Integer getCardClass() {
        return cardClass;
    }

    /**
     * 设置购买课时
     *
     * @param cardClass 购买课时
     */
    public void setCardClass(Integer cardClass) {
        this.cardClass = cardClass;
    }

    /**
     * 获取剩余课时。
     *
     * @return 剩余课时
     */
    public Integer getCardNextClass() {
        return cardNextClass;
    }

    /**
     * 设置剩余课时
     *
     * @param cardNextClass 剩余课时
     */
    public void setCardNextClass(Integer cardNextClass) {
        this.cardNextClass = cardNextClass;
    }

    /**
     * 重写toString方法，方便输出对象信息。
     *
     * @return 字符串表示的对象信息
     */
    @Override
    public String toString() {
        return "Member{" +
                "memberAccount=" + memberAccount +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberGender='" + memberGender + '\'' +
                ", memberAge=" + memberAge +
                ", memberHeight=" + memberHeight +
                ", memberWeight=" + memberWeight +
                ", memberPhone=" + memberPhone +
                ", cardTime='" + cardTime + '\'' +
                ", cardClass=" + cardClass +
                ", cardNextClass=" + cardNextClass +
                '}';
    }
}
