package com.tianhai.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ThbyUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThbyUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrIsNull() {
            addCriterion("birthday_str is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrIsNotNull() {
            addCriterion("birthday_str is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrEqualTo(String value) {
            addCriterion("birthday_str =", value, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrNotEqualTo(String value) {
            addCriterion("birthday_str <>", value, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrGreaterThan(String value) {
            addCriterion("birthday_str >", value, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrGreaterThanOrEqualTo(String value) {
            addCriterion("birthday_str >=", value, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrLessThan(String value) {
            addCriterion("birthday_str <", value, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrLessThanOrEqualTo(String value) {
            addCriterion("birthday_str <=", value, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrLike(String value) {
            addCriterion("birthday_str like", value, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrNotLike(String value) {
            addCriterion("birthday_str not like", value, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrIn(List<String> values) {
            addCriterion("birthday_str in", values, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrNotIn(List<String> values) {
            addCriterion("birthday_str not in", values, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrBetween(String value1, String value2) {
            addCriterion("birthday_str between", value1, value2, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andBirthdayStrNotBetween(String value1, String value2) {
            addCriterion("birthday_str not between", value1, value2, "birthdayStr");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressIsNull() {
            addCriterion("Currentaddress is null");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressIsNotNull() {
            addCriterion("Currentaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressEqualTo(String value) {
            addCriterion("Currentaddress =", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressNotEqualTo(String value) {
            addCriterion("Currentaddress <>", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressGreaterThan(String value) {
            addCriterion("Currentaddress >", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressGreaterThanOrEqualTo(String value) {
            addCriterion("Currentaddress >=", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressLessThan(String value) {
            addCriterion("Currentaddress <", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressLessThanOrEqualTo(String value) {
            addCriterion("Currentaddress <=", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressLike(String value) {
            addCriterion("Currentaddress like", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressNotLike(String value) {
            addCriterion("Currentaddress not like", value, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressIn(List<String> values) {
            addCriterion("Currentaddress in", values, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressNotIn(List<String> values) {
            addCriterion("Currentaddress not in", values, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressBetween(String value1, String value2) {
            addCriterion("Currentaddress between", value1, value2, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andCurrentaddressNotBetween(String value1, String value2) {
            addCriterion("Currentaddress not between", value1, value2, "currentaddress");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("Nativeplace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("Nativeplace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("Nativeplace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("Nativeplace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("Nativeplace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("Nativeplace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("Nativeplace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("Nativeplace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("Nativeplace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("Nativeplace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("Nativeplace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("Nativeplace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("Nativeplace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("Nativeplace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrIsNull() {
            addCriterion("create_time_str is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrIsNotNull() {
            addCriterion("create_time_str is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrEqualTo(String value) {
            addCriterion("create_time_str =", value, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrNotEqualTo(String value) {
            addCriterion("create_time_str <>", value, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrGreaterThan(String value) {
            addCriterion("create_time_str >", value, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrGreaterThanOrEqualTo(String value) {
            addCriterion("create_time_str >=", value, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrLessThan(String value) {
            addCriterion("create_time_str <", value, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrLessThanOrEqualTo(String value) {
            addCriterion("create_time_str <=", value, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrLike(String value) {
            addCriterion("create_time_str like", value, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrNotLike(String value) {
            addCriterion("create_time_str not like", value, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrIn(List<String> values) {
            addCriterion("create_time_str in", values, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrNotIn(List<String> values) {
            addCriterion("create_time_str not in", values, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrBetween(String value1, String value2) {
            addCriterion("create_time_str between", value1, value2, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andCreateTimeStrNotBetween(String value1, String value2) {
            addCriterion("create_time_str not between", value1, value2, "createTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterionForJDBCDate("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterionForJDBCDate("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterionForJDBCDate("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrIsNull() {
            addCriterion("leave_time_str is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrIsNotNull() {
            addCriterion("leave_time_str is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrEqualTo(String value) {
            addCriterion("leave_time_str =", value, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrNotEqualTo(String value) {
            addCriterion("leave_time_str <>", value, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrGreaterThan(String value) {
            addCriterion("leave_time_str >", value, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrGreaterThanOrEqualTo(String value) {
            addCriterion("leave_time_str >=", value, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrLessThan(String value) {
            addCriterion("leave_time_str <", value, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrLessThanOrEqualTo(String value) {
            addCriterion("leave_time_str <=", value, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrLike(String value) {
            addCriterion("leave_time_str like", value, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrNotLike(String value) {
            addCriterion("leave_time_str not like", value, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrIn(List<String> values) {
            addCriterion("leave_time_str in", values, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrNotIn(List<String> values) {
            addCriterion("leave_time_str not in", values, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrBetween(String value1, String value2) {
            addCriterion("leave_time_str between", value1, value2, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeStrNotBetween(String value1, String value2) {
            addCriterion("leave_time_str not between", value1, value2, "leaveTimeStr");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andPositionLevelIsNull() {
            addCriterion("position_level is null");
            return (Criteria) this;
        }

        public Criteria andPositionLevelIsNotNull() {
            addCriterion("position_level is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLevelEqualTo(Integer value) {
            addCriterion("position_level =", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotEqualTo(Integer value) {
            addCriterion("position_level <>", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelGreaterThan(Integer value) {
            addCriterion("position_level >", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_level >=", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelLessThan(Integer value) {
            addCriterion("position_level <", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelLessThanOrEqualTo(Integer value) {
            addCriterion("position_level <=", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelIn(List<Integer> values) {
            addCriterion("position_level in", values, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotIn(List<Integer> values) {
            addCriterion("position_level not in", values, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelBetween(Integer value1, Integer value2) {
            addCriterion("position_level between", value1, value2, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("position_level not between", value1, value2, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andIsJobIsNull() {
            addCriterion("is_job is null");
            return (Criteria) this;
        }

        public Criteria andIsJobIsNotNull() {
            addCriterion("is_job is not null");
            return (Criteria) this;
        }

        public Criteria andIsJobEqualTo(String value) {
            addCriterion("is_job =", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotEqualTo(String value) {
            addCriterion("is_job <>", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobGreaterThan(String value) {
            addCriterion("is_job >", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobGreaterThanOrEqualTo(String value) {
            addCriterion("is_job >=", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobLessThan(String value) {
            addCriterion("is_job <", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobLessThanOrEqualTo(String value) {
            addCriterion("is_job <=", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobLike(String value) {
            addCriterion("is_job like", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotLike(String value) {
            addCriterion("is_job not like", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobIn(List<String> values) {
            addCriterion("is_job in", values, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotIn(List<String> values) {
            addCriterion("is_job not in", values, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobBetween(String value1, String value2) {
            addCriterion("is_job between", value1, value2, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotBetween(String value1, String value2) {
            addCriterion("is_job not between", value1, value2, "isJob");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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