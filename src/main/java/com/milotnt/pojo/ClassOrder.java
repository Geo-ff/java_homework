package com.milotnt.pojo;

/**
 * 类名：ClassOrder
 * 说明：课程预约实体类
 */
public class ClassOrder {

    private Integer classOrderId; // 课程预约ID
    private Integer classId; // 课程ID
    private String className; // 课程名称
    private String coach; // 教练
    private String memberName; // 会员姓名
    private Integer memberAccount; // 会员账号
    private String classBegin; // 课程开始时间

    /**
     * 无参构造方法。
     */
    public ClassOrder() {
    }

    /**
     * 带参构造方法。
     *
     * @param classId       课程ID
     * @param className     课程名称
     * @param coach         教练
     * @param memberName    会员姓名
     * @param memberAccount 会员账号
     * @param classBegin    课程开始时间
     */
    public ClassOrder(Integer classId, String className, String coach, String memberName, Integer memberAccount, String classBegin) {
        this.classId = classId;
        this.className = className;
        this.coach = coach;
        this.memberName = memberName;
        this.memberAccount = memberAccount;
        this.classBegin = classBegin;
    }

    /**
     * 获取课程预约ID。
     *
     * @return 课程预约ID
     */
    public Integer getClassOrderId() {
        return classOrderId;
    }

    /**
     * 设置课程预约ID。
     *
     * @param classOrderId 课程预约ID
     */
    public void setClassOrderId(Integer classOrderId) {
        this.classOrderId = classOrderId;
    }

    /**
     * 获取课程ID。
     *
     * @return 课程ID
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 设置课程ID。
     *
     * @param classId 课程ID
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 获取课程名称。
     *
     * @return 课程名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置课程名称。
     *
     * @param className 课程名称
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取教练。
     *
     * @return 教练
     */
    public String getCoach() {
        return coach;
    }

    /**
     * 设置教练。
     *
     * @param coach 教练
     */
    public void setCoach(String coach) {
        this.coach = coach;
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
     * 获取课程开始时间。
     *
     * @return 课程开始时间
     */
    public String getClassBegin() {
        return classBegin;
    }

    /**
     * 设置课程开始时间。
     *
     * @param classBegin 课程开始时间
     */
    public void setClassBegin(String classBegin) {
        this.classBegin = classBegin;
    }

    /**
     * 重写toString方法，方便输出对象信息。
     *
     * @return 字符串表示的对象信息
     */
    @Override
    public String toString() {
        return "ClassOrder{" +
                "classOrderId=" + classOrderId +
                ", classId=" + classId +
                ", className='" + className + '\'' +
                ", coach='" + coach + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberAccount=" + memberAccount +
                ", classBegin='" + classBegin + '\'' +
                '}';
    }
}
