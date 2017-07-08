package cn.dongyiming.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NcSongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcSongExample() {
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

        public Criteria andSongNameIsNull() {
            addCriterion("song_name is null");
            return (Criteria) this;
        }

        public Criteria andSongNameIsNotNull() {
            addCriterion("song_name is not null");
            return (Criteria) this;
        }

        public Criteria andSongNameEqualTo(String value) {
            addCriterion("song_name =", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameNotEqualTo(String value) {
            addCriterion("song_name <>", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameGreaterThan(String value) {
            addCriterion("song_name >", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameGreaterThanOrEqualTo(String value) {
            addCriterion("song_name >=", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameLessThan(String value) {
            addCriterion("song_name <", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameLessThanOrEqualTo(String value) {
            addCriterion("song_name <=", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameLike(String value) {
            addCriterion("song_name like", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameNotLike(String value) {
            addCriterion("song_name not like", value, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameIn(List<String> values) {
            addCriterion("song_name in", values, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameNotIn(List<String> values) {
            addCriterion("song_name not in", values, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameBetween(String value1, String value2) {
            addCriterion("song_name between", value1, value2, "songName");
            return (Criteria) this;
        }

        public Criteria andSongNameNotBetween(String value1, String value2) {
            addCriterion("song_name not between", value1, value2, "songName");
            return (Criteria) this;
        }

        public Criteria andSongIdIsNull() {
            addCriterion("song_id is null");
            return (Criteria) this;
        }

        public Criteria andSongIdIsNotNull() {
            addCriterion("song_id is not null");
            return (Criteria) this;
        }

        public Criteria andSongIdEqualTo(Integer value) {
            addCriterion("song_id =", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdNotEqualTo(Integer value) {
            addCriterion("song_id <>", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdGreaterThan(Integer value) {
            addCriterion("song_id >", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("song_id >=", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdLessThan(Integer value) {
            addCriterion("song_id <", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdLessThanOrEqualTo(Integer value) {
            addCriterion("song_id <=", value, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdIn(List<Integer> values) {
            addCriterion("song_id in", values, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdNotIn(List<Integer> values) {
            addCriterion("song_id not in", values, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdBetween(Integer value1, Integer value2) {
            addCriterion("song_id between", value1, value2, "songId");
            return (Criteria) this;
        }

        public Criteria andSongIdNotBetween(Integer value1, Integer value2) {
            addCriterion("song_id not between", value1, value2, "songId");
            return (Criteria) this;
        }

        public Criteria andSongDescIsNull() {
            addCriterion("song_desc is null");
            return (Criteria) this;
        }

        public Criteria andSongDescIsNotNull() {
            addCriterion("song_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSongDescEqualTo(String value) {
            addCriterion("song_desc =", value, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescNotEqualTo(String value) {
            addCriterion("song_desc <>", value, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescGreaterThan(String value) {
            addCriterion("song_desc >", value, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescGreaterThanOrEqualTo(String value) {
            addCriterion("song_desc >=", value, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescLessThan(String value) {
            addCriterion("song_desc <", value, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescLessThanOrEqualTo(String value) {
            addCriterion("song_desc <=", value, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescLike(String value) {
            addCriterion("song_desc like", value, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescNotLike(String value) {
            addCriterion("song_desc not like", value, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescIn(List<String> values) {
            addCriterion("song_desc in", values, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescNotIn(List<String> values) {
            addCriterion("song_desc not in", values, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescBetween(String value1, String value2) {
            addCriterion("song_desc between", value1, value2, "songDesc");
            return (Criteria) this;
        }

        public Criteria andSongDescNotBetween(String value1, String value2) {
            addCriterion("song_desc not between", value1, value2, "songDesc");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeIsNull() {
            addCriterion("album_code is null");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeIsNotNull() {
            addCriterion("album_code is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeEqualTo(Integer value) {
            addCriterion("album_code =", value, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeNotEqualTo(Integer value) {
            addCriterion("album_code <>", value, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeGreaterThan(Integer value) {
            addCriterion("album_code >", value, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("album_code >=", value, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeLessThan(Integer value) {
            addCriterion("album_code <", value, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeLessThanOrEqualTo(Integer value) {
            addCriterion("album_code <=", value, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeIn(List<Integer> values) {
            addCriterion("album_code in", values, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeNotIn(List<Integer> values) {
            addCriterion("album_code not in", values, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeBetween(Integer value1, Integer value2) {
            addCriterion("album_code between", value1, value2, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("album_code not between", value1, value2, "albumCode");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNull() {
            addCriterion("album_name is null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNotNull() {
            addCriterion("album_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameEqualTo(String value) {
            addCriterion("album_name =", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotEqualTo(String value) {
            addCriterion("album_name <>", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThan(String value) {
            addCriterion("album_name >", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThanOrEqualTo(String value) {
            addCriterion("album_name >=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThan(String value) {
            addCriterion("album_name <", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThanOrEqualTo(String value) {
            addCriterion("album_name <=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLike(String value) {
            addCriterion("album_name like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotLike(String value) {
            addCriterion("album_name not like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIn(List<String> values) {
            addCriterion("album_name in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotIn(List<String> values) {
            addCriterion("album_name not in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameBetween(String value1, String value2) {
            addCriterion("album_name between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotBetween(String value1, String value2) {
            addCriterion("album_name not between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andSingerCodeIsNull() {
            addCriterion("singer_code is null");
            return (Criteria) this;
        }

        public Criteria andSingerCodeIsNotNull() {
            addCriterion("singer_code is not null");
            return (Criteria) this;
        }

        public Criteria andSingerCodeEqualTo(Integer value) {
            addCriterion("singer_code =", value, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerCodeNotEqualTo(Integer value) {
            addCriterion("singer_code <>", value, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerCodeGreaterThan(Integer value) {
            addCriterion("singer_code >", value, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("singer_code >=", value, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerCodeLessThan(Integer value) {
            addCriterion("singer_code <", value, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerCodeLessThanOrEqualTo(Integer value) {
            addCriterion("singer_code <=", value, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerCodeIn(List<Integer> values) {
            addCriterion("singer_code in", values, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerCodeNotIn(List<Integer> values) {
            addCriterion("singer_code not in", values, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerCodeBetween(Integer value1, Integer value2) {
            addCriterion("singer_code between", value1, value2, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("singer_code not between", value1, value2, "singerCode");
            return (Criteria) this;
        }

        public Criteria andSingerNameIsNull() {
            addCriterion("singer_name is null");
            return (Criteria) this;
        }

        public Criteria andSingerNameIsNotNull() {
            addCriterion("singer_name is not null");
            return (Criteria) this;
        }

        public Criteria andSingerNameEqualTo(String value) {
            addCriterion("singer_name =", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameNotEqualTo(String value) {
            addCriterion("singer_name <>", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameGreaterThan(String value) {
            addCriterion("singer_name >", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameGreaterThanOrEqualTo(String value) {
            addCriterion("singer_name >=", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameLessThan(String value) {
            addCriterion("singer_name <", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameLessThanOrEqualTo(String value) {
            addCriterion("singer_name <=", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameLike(String value) {
            addCriterion("singer_name like", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameNotLike(String value) {
            addCriterion("singer_name not like", value, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameIn(List<String> values) {
            addCriterion("singer_name in", values, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameNotIn(List<String> values) {
            addCriterion("singer_name not in", values, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameBetween(String value1, String value2) {
            addCriterion("singer_name between", value1, value2, "singerName");
            return (Criteria) this;
        }

        public Criteria andSingerNameNotBetween(String value1, String value2) {
            addCriterion("singer_name not between", value1, value2, "singerName");
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