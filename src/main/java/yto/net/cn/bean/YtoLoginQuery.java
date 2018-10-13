package yto.net.cn.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YtoLoginQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public YtoLoginQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(Long value) {
            addCriterion("login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(Long value) {
            addCriterion("login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(Long value) {
            addCriterion("login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(Long value) {
            addCriterion("login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(Long value) {
            addCriterion("login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(Long value) {
            addCriterion("login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<Long> values) {
            addCriterion("login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<Long> values) {
            addCriterion("login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(Long value1, Long value2) {
            addCriterion("login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(Long value1, Long value2) {
            addCriterion("login_id not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameIsNull() {
            addCriterion("login_username is null");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameIsNotNull() {
            addCriterion("login_username is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameEqualTo(String value) {
            addCriterion("login_username =", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameNotEqualTo(String value) {
            addCriterion("login_username <>", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameGreaterThan(String value) {
            addCriterion("login_username >", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("login_username >=", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameLessThan(String value) {
            addCriterion("login_username <", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameLessThanOrEqualTo(String value) {
            addCriterion("login_username <=", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameLike(String value) {
            addCriterion("login_username like", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameNotLike(String value) {
            addCriterion("login_username not like", value, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameIn(List<String> values) {
            addCriterion("login_username in", values, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameNotIn(List<String> values) {
            addCriterion("login_username not in", values, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameBetween(String value1, String value2) {
            addCriterion("login_username between", value1, value2, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginUsernameNotBetween(String value1, String value2) {
            addCriterion("login_username not between", value1, value2, "loginUsername");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNull() {
            addCriterion("login_password is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNotNull() {
            addCriterion("login_password is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordEqualTo(String value) {
            addCriterion("login_password =", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotEqualTo(String value) {
            addCriterion("login_password <>", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThan(String value) {
            addCriterion("login_password >", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("login_password >=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThan(String value) {
            addCriterion("login_password <", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("login_password <=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLike(String value) {
            addCriterion("login_password like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotLike(String value) {
            addCriterion("login_password not like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIn(List<String> values) {
            addCriterion("login_password in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotIn(List<String> values) {
            addCriterion("login_password not in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordBetween(String value1, String value2) {
            addCriterion("login_password between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("login_password not between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberIsNull() {
            addCriterion("login_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberIsNotNull() {
            addCriterion("login_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberEqualTo(String value) {
            addCriterion("login_phone_number =", value, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberNotEqualTo(String value) {
            addCriterion("login_phone_number <>", value, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberGreaterThan(String value) {
            addCriterion("login_phone_number >", value, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("login_phone_number >=", value, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberLessThan(String value) {
            addCriterion("login_phone_number <", value, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("login_phone_number <=", value, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberLike(String value) {
            addCriterion("login_phone_number like", value, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberNotLike(String value) {
            addCriterion("login_phone_number not like", value, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberIn(List<String> values) {
            addCriterion("login_phone_number in", values, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberNotIn(List<String> values) {
            addCriterion("login_phone_number not in", values, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberBetween(String value1, String value2) {
            addCriterion("login_phone_number between", value1, value2, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("login_phone_number not between", value1, value2, "loginPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLoginEmailIsNull() {
            addCriterion("login_email is null");
            return (Criteria) this;
        }

        public Criteria andLoginEmailIsNotNull() {
            addCriterion("login_email is not null");
            return (Criteria) this;
        }

        public Criteria andLoginEmailEqualTo(String value) {
            addCriterion("login_email =", value, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailNotEqualTo(String value) {
            addCriterion("login_email <>", value, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailGreaterThan(String value) {
            addCriterion("login_email >", value, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailGreaterThanOrEqualTo(String value) {
            addCriterion("login_email >=", value, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailLessThan(String value) {
            addCriterion("login_email <", value, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailLessThanOrEqualTo(String value) {
            addCriterion("login_email <=", value, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailLike(String value) {
            addCriterion("login_email like", value, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailNotLike(String value) {
            addCriterion("login_email not like", value, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailIn(List<String> values) {
            addCriterion("login_email in", values, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailNotIn(List<String> values) {
            addCriterion("login_email not in", values, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailBetween(String value1, String value2) {
            addCriterion("login_email between", value1, value2, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andLoginEmailNotBetween(String value1, String value2) {
            addCriterion("login_email not between", value1, value2, "loginEmail");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIsNull() {
            addCriterion("wechat_openid is null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIsNotNull() {
            addCriterion("wechat_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidEqualTo(String value) {
            addCriterion("wechat_openid =", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotEqualTo(String value) {
            addCriterion("wechat_openid <>", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidGreaterThan(String value) {
            addCriterion("wechat_openid >", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_openid >=", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLessThan(String value) {
            addCriterion("wechat_openid <", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLessThanOrEqualTo(String value) {
            addCriterion("wechat_openid <=", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLike(String value) {
            addCriterion("wechat_openid like", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotLike(String value) {
            addCriterion("wechat_openid not like", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIn(List<String> values) {
            addCriterion("wechat_openid in", values, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotIn(List<String> values) {
            addCriterion("wechat_openid not in", values, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidBetween(String value1, String value2) {
            addCriterion("wechat_openid between", value1, value2, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotBetween(String value1, String value2) {
            addCriterion("wechat_openid not between", value1, value2, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlIsNull() {
            addCriterion("header_url is null");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlIsNotNull() {
            addCriterion("header_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlEqualTo(String value) {
            addCriterion("header_url =", value, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlNotEqualTo(String value) {
            addCriterion("header_url <>", value, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlGreaterThan(String value) {
            addCriterion("header_url >", value, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlGreaterThanOrEqualTo(String value) {
            addCriterion("header_url >=", value, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlLessThan(String value) {
            addCriterion("header_url <", value, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlLessThanOrEqualTo(String value) {
            addCriterion("header_url <=", value, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlLike(String value) {
            addCriterion("header_url like", value, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlNotLike(String value) {
            addCriterion("header_url not like", value, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlIn(List<String> values) {
            addCriterion("header_url in", values, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlNotIn(List<String> values) {
            addCriterion("header_url not in", values, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlBetween(String value1, String value2) {
            addCriterion("header_url between", value1, value2, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andHeaderUrlNotBetween(String value1, String value2) {
            addCriterion("header_url not between", value1, value2, "headerUrl");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Integer value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Integer value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Integer value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Integer value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Integer value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Integer> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Integer> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Integer value1, Integer value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}