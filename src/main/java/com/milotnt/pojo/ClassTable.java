package com.milotnt.pojo;

/**
 * 类名：ClassTable
 * 说明：课程实体类
 */
public class ClassTable {

    private Integer classId; // 课程ID
    private String className; // 课程名称
    private String classBegin; // 课程开始时间
    private String classTime; // 课程时长
    private String coach; // 教练

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
     * 获取课程时长。
     *
     * @return 课程时长
     */
    public String getClassTime() {
        return classTime;
    }

    /**
     * 设置课程时长。
     *
     * @param classTime 课程时长
     */
    public void setClassTime(String classTime) {
        this.classTime = classTime;
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
     * 重写toString方法，方便输出对象信息。
     *
     * @return 字符串表示的对象信息
     */
    @Override
    public String toString() {
        return "ClassTable{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", classBegin='" + classBegin + '\'' +
                ", classTime='" + classTime + '\'' +
                ", coach='" + coach + '\'' +
                '}';
    }
}
