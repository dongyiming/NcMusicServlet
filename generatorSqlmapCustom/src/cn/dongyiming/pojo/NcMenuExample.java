package cn.dongyiming.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NcMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcMenuExample() {
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

        public Criteria andMenuCodeIsNull() {
            addCriterion("menu_code is null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIsNotNull() {
            addCriterion("menu_code is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCodeEqualTo(Integer value) {
            addCriterion("menu_code =", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotEqualTo(Integer value) {
            addCriterion("menu_code <>", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThan(Integer value) {
            addCriterion("menu_code >", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_code >=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThan(Integer value) {
            addCriterion("menu_code <", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeLessThanOrEqualTo(Integer value) {
            addCriterion("menu_code <=", value, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeIn(List<Integer> values) {
            addCriterion("menu_code in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotIn(List<Integer> values) {
            addCriterion("menu_code not in", values, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeBetween(Integer value1, Integer value2) {
            addCriterion("menu_code between", value1, value2, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_code not between", value1, value2, "menuCode");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNull() {
            addCriterion("menu_desc is null");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNotNull() {
            addCriterion("menu_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDescEqualTo(String value) {
            addCriterion("menu_desc =", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotEqualTo(String value) {
            addCriterion("menu_desc <>", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThan(String value) {
            addCriterion("menu_desc >", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThanOrEqualTo(String value) {
            addCriterion("menu_desc >=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThan(String value) {
            addCriterion("menu_desc <", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThanOrEqualTo(String value) {
            addCriterion("menu_desc <=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLike(String value) {
            addCriterion("menu_desc like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotLike(String value) {
            addCriterion("menu_desc not like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescIn(List<String> values) {
            addCriterion("menu_desc in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotIn(List<String> values) {
            addCriterion("menu_desc not in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescBetween(String value1, String value2) {
            addCriterion("menu_desc between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotBetween(String value1, String value2) {
            addCriterion("menu_desc not between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeIsNull() {
            addCriterion("author_code is null");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeIsNotNull() {
            addCriterion("author_code is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeEqualTo(Integer value) {
            addCriterion("author_code =", value, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeNotEqualTo(Integer value) {
            addCriterion("author_code <>", value, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeGreaterThan(Integer value) {
            addCriterion("author_code >", value, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_code >=", value, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeLessThan(Integer value) {
            addCriterion("author_code <", value, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeLessThanOrEqualTo(Integer value) {
            addCriterion("author_code <=", value, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeIn(List<Integer> values) {
            addCriterion("author_code in", values, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeNotIn(List<Integer> values) {
            addCriterion("author_code not in", values, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeBetween(Integer value1, Integer value2) {
            addCriterion("author_code between", value1, value2, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("author_code not between", value1, value2, "authorCode");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNull() {
            addCriterion("author_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIsNotNull() {
            addCriterion("author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorNameEqualTo(String value) {
            addCriterion("author_name =", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotEqualTo(String value) {
            addCriterion("author_name <>", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThan(String value) {
            addCriterion("author_name >", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameGreaterThanOrEqualTo(String value) {
            addCriterion("author_name >=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThan(String value) {
            addCriterion("author_name <", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLessThanOrEqualTo(String value) {
            addCriterion("author_name <=", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameLike(String value) {
            addCriterion("author_name like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotLike(String value) {
            addCriterion("author_name not like", value, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameIn(List<String> values) {
            addCriterion("author_name in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotIn(List<String> values) {
            addCriterion("author_name not in", values, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameBetween(String value1, String value2) {
            addCriterion("author_name between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andAuthorNameNotBetween(String value1, String value2) {
            addCriterion("author_name not between", value1, value2, "authorName");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("menu_type is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("menu_type is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(Integer value) {
            addCriterion("menu_type =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(Integer value) {
            addCriterion("menu_type <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(Integer value) {
            addCriterion("menu_type >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_type >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(Integer value) {
            addCriterion("menu_type <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(Integer value) {
            addCriterion("menu_type <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<Integer> values) {
            addCriterion("menu_type in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<Integer> values) {
            addCriterion("menu_type not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(Integer value1, Integer value2) {
            addCriterion("menu_type between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_type not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlIsNull() {
            addCriterion("menu_picurl is null");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlIsNotNull() {
            addCriterion("menu_picurl is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlEqualTo(String value) {
            addCriterion("menu_picurl =", value, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlNotEqualTo(String value) {
            addCriterion("menu_picurl <>", value, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlGreaterThan(String value) {
            addCriterion("menu_picurl >", value, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlGreaterThanOrEqualTo(String value) {
            addCriterion("menu_picurl >=", value, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlLessThan(String value) {
            addCriterion("menu_picurl <", value, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlLessThanOrEqualTo(String value) {
            addCriterion("menu_picurl <=", value, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlLike(String value) {
            addCriterion("menu_picurl like", value, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlNotLike(String value) {
            addCriterion("menu_picurl not like", value, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlIn(List<String> values) {
            addCriterion("menu_picurl in", values, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlNotIn(List<String> values) {
            addCriterion("menu_picurl not in", values, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlBetween(String value1, String value2) {
            addCriterion("menu_picurl between", value1, value2, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andMenuPicurlNotBetween(String value1, String value2) {
            addCriterion("menu_picurl not between", value1, value2, "menuPicurl");
            return (Criteria) this;
        }

        public Criteria andPlaycountIsNull() {
            addCriterion("playcount is null");
            return (Criteria) this;
        }

        public Criteria andPlaycountIsNotNull() {
            addCriterion("playcount is not null");
            return (Criteria) this;
        }

        public Criteria andPlaycountEqualTo(Long value) {
            addCriterion("playcount =", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotEqualTo(Long value) {
            addCriterion("playcount <>", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountGreaterThan(Long value) {
            addCriterion("playcount >", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountGreaterThanOrEqualTo(Long value) {
            addCriterion("playcount >=", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountLessThan(Long value) {
            addCriterion("playcount <", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountLessThanOrEqualTo(Long value) {
            addCriterion("playcount <=", value, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountIn(List<Long> values) {
            addCriterion("playcount in", values, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotIn(List<Long> values) {
            addCriterion("playcount not in", values, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountBetween(Long value1, Long value2) {
            addCriterion("playcount between", value1, value2, "playcount");
            return (Criteria) this;
        }

        public Criteria andPlaycountNotBetween(Long value1, Long value2) {
            addCriterion("playcount not between", value1, value2, "playcount");
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