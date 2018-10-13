package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class WorkInfo implements Serializable {
    /**
     * 工作相关信息id
     */
    private Long workId;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 工号
     */
    private String num;

    /**
     * 直接上级工号
     */
    private String parentNum;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 性别 0 男 1 女
     */
    private Boolean sex;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 入职时间
     */
    private Date joinTime;

    /**
     * 工作地区/门店
     */
    private String workPlace;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 0 表示为认证 1 表示认证通过 -1 表示认证失败
     */
    private Integer active;

    /**
     * 登陆id , 一般不会加外键约束
     */
    private Long loginId;

    private static final long serialVersionUID = 1L;

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getParentNum() {
        return parentNum;
    }

    public void setParentNum(String parentNum) {
        this.parentNum = parentNum == null ? null : parentNum.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace == null ? null : workPlace.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", workId=").append(workId);
        sb.append(", name=").append(name);
        sb.append(", num=").append(num);
        sb.append(", parentNum=").append(parentNum);
        sb.append(", department=").append(department);
        sb.append(", sex=").append(sex);
        sb.append(", birth=").append(birth);
        sb.append(", joinTime=").append(joinTime);
        sb.append(", workPlace=").append(workPlace);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", active=").append(active);
        sb.append(", loginId=").append(loginId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}