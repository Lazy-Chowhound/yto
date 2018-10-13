package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class YtoLogin implements Serializable {
    /**
     * 登陆id
     */
    private Long loginId;

    /**
     * 登陆用户名
     */
    private String loginUsername;

    /**
     * 登陆密码md5值
     */
    private String loginPassword;

    /**
     * 登陆手机号
     */
    private String loginPhoneNumber;

    /**
     * 邮箱
     */
    private String loginEmail;

    /**
     * 微信openid
     */
    private String wechatOpenid;

    /**
     * 用户头像
     */
    private String headerUrl;

    /**
     * 用户类型 1表示普通用户 2表示员工 -1表示注销
     */
    private Integer userType;

    /**
     * 用户成功创建时间
     */
    private Date createTime;

    /**
     * 用户最后更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername == null ? null : loginUsername.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public String getLoginPhoneNumber() {
        return loginPhoneNumber;
    }

    public void setLoginPhoneNumber(String loginPhoneNumber) {
        this.loginPhoneNumber = loginPhoneNumber == null ? null : loginPhoneNumber.trim();
    }

    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail == null ? null : loginEmail.trim();
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl == null ? null : headerUrl.trim();
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loginId=").append(loginId);
        sb.append(", loginUsername=").append(loginUsername);
        sb.append(", loginPassword=").append(loginPassword);
        sb.append(", loginPhoneNumber=").append(loginPhoneNumber);
        sb.append(", loginEmail=").append(loginEmail);
        sb.append(", wechatOpenid=").append(wechatOpenid);
        sb.append(", headerUrl=").append(headerUrl);
        sb.append(", userType=").append(userType);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}