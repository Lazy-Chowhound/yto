package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class StaffDetail implements Serializable {
    /**
     * 详细信息id
     */
    private Long detailId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号码
     */
    private String idCardNumber;

    /**
     * 性别 0 男 1 女
     */
    private Boolean sex;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 户籍住址
     */
    private String address;

    /**
     * 图像url
     */
    private String imgUrl;

    /**
     * 家庭成员
     */
    private String members;

    /**
     * 学历
     */
    private String education;

    /**
     * 紧急联系电话
     */
    private String emerPhone;

    /**
     * 详细信息创建时间
     */
    private Date createTime;

    /**
     * 详细信息最后更新时间
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

    public Long getDetailId() {
        return detailId;
    }

    public void setDetailId(Long detailId) {
        this.detailId = detailId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber == null ? null : idCardNumber.trim();
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members == null ? null : members.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getEmerPhone() {
        return emerPhone;
    }

    public void setEmerPhone(String emerPhone) {
        this.emerPhone = emerPhone == null ? null : emerPhone.trim();
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
        sb.append(", detailId=").append(detailId);
        sb.append(", realName=").append(realName);
        sb.append(", idCardNumber=").append(idCardNumber);
        sb.append(", sex=").append(sex);
        sb.append(", birth=").append(birth);
        sb.append(", address=").append(address);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", members=").append(members);
        sb.append(", education=").append(education);
        sb.append(", emerPhone=").append(emerPhone);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", active=").append(active);
        sb.append(", loginId=").append(loginId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}