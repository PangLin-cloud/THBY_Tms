package com.tianhai.pojo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeContractExample() {
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

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("contract_type like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("contract_type not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andPartyAIsNull() {
            addCriterion("party_a is null");
            return (Criteria) this;
        }

        public Criteria andPartyAIsNotNull() {
            addCriterion("party_a is not null");
            return (Criteria) this;
        }

        public Criteria andPartyAEqualTo(String value) {
            addCriterion("party_a =", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyANotEqualTo(String value) {
            addCriterion("party_a <>", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyAGreaterThan(String value) {
            addCriterion("party_a >", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyAGreaterThanOrEqualTo(String value) {
            addCriterion("party_a >=", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyALessThan(String value) {
            addCriterion("party_a <", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyALessThanOrEqualTo(String value) {
            addCriterion("party_a <=", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyALike(String value) {
            addCriterion("party_a like", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyANotLike(String value) {
            addCriterion("party_a not like", value, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyAIn(List<String> values) {
            addCriterion("party_a in", values, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyANotIn(List<String> values) {
            addCriterion("party_a not in", values, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyABetween(String value1, String value2) {
            addCriterion("party_a between", value1, value2, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyANotBetween(String value1, String value2) {
            addCriterion("party_a not between", value1, value2, "partyA");
            return (Criteria) this;
        }

        public Criteria andPartyBIsNull() {
            addCriterion("party_b is null");
            return (Criteria) this;
        }

        public Criteria andPartyBIsNotNull() {
            addCriterion("party_b is not null");
            return (Criteria) this;
        }

        public Criteria andPartyBEqualTo(String value) {
            addCriterion("party_b =", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBNotEqualTo(String value) {
            addCriterion("party_b <>", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBGreaterThan(String value) {
            addCriterion("party_b >", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBGreaterThanOrEqualTo(String value) {
            addCriterion("party_b >=", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBLessThan(String value) {
            addCriterion("party_b <", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBLessThanOrEqualTo(String value) {
            addCriterion("party_b <=", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBLike(String value) {
            addCriterion("party_b like", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBNotLike(String value) {
            addCriterion("party_b not like", value, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBIn(List<String> values) {
            addCriterion("party_b in", values, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBNotIn(List<String> values) {
            addCriterion("party_b not in", values, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBBetween(String value1, String value2) {
            addCriterion("party_b between", value1, value2, "partyB");
            return (Criteria) this;
        }

        public Criteria andPartyBNotBetween(String value1, String value2) {
            addCriterion("party_b not between", value1, value2, "partyB");
            return (Criteria) this;
        }

        public Criteria andAddressFileIsNull() {
            addCriterion("address_file is null");
            return (Criteria) this;
        }

        public Criteria andAddressFileIsNotNull() {
            addCriterion("address_file is not null");
            return (Criteria) this;
        }

        public Criteria andAddressFileEqualTo(String value) {
            addCriterion("address_file =", value, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileNotEqualTo(String value) {
            addCriterion("address_file <>", value, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileGreaterThan(String value) {
            addCriterion("address_file >", value, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileGreaterThanOrEqualTo(String value) {
            addCriterion("address_file >=", value, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileLessThan(String value) {
            addCriterion("address_file <", value, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileLessThanOrEqualTo(String value) {
            addCriterion("address_file <=", value, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileLike(String value) {
            addCriterion("address_file like", value, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileNotLike(String value) {
            addCriterion("address_file not like", value, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileIn(List<String> values) {
            addCriterion("address_file in", values, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileNotIn(List<String> values) {
            addCriterion("address_file not in", values, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileBetween(String value1, String value2) {
            addCriterion("address_file between", value1, value2, "addressFile");
            return (Criteria) this;
        }

        public Criteria andAddressFileNotBetween(String value1, String value2) {
            addCriterion("address_file not between", value1, value2, "addressFile");
            return (Criteria) this;
        }

        public Criteria andFileNumberIsNull() {
            addCriterion("file_number is null");
            return (Criteria) this;
        }

        public Criteria andFileNumberIsNotNull() {
            addCriterion("file_number is not null");
            return (Criteria) this;
        }

        public Criteria andFileNumberEqualTo(String value) {
            addCriterion("file_number =", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotEqualTo(String value) {
            addCriterion("file_number <>", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberGreaterThan(String value) {
            addCriterion("file_number >", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("file_number >=", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberLessThan(String value) {
            addCriterion("file_number <", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberLessThanOrEqualTo(String value) {
            addCriterion("file_number <=", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberLike(String value) {
            addCriterion("file_number like", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotLike(String value) {
            addCriterion("file_number not like", value, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberIn(List<String> values) {
            addCriterion("file_number in", values, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotIn(List<String> values) {
            addCriterion("file_number not in", values, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberBetween(String value1, String value2) {
            addCriterion("file_number between", value1, value2, "fileNumber");
            return (Criteria) this;
        }

        public Criteria andFileNumberNotBetween(String value1, String value2) {
            addCriterion("file_number not between", value1, value2, "fileNumber");
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