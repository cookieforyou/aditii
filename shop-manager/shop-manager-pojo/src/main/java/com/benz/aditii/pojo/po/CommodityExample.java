package com.benz.aditii.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Long value) {
            addCriterion("goodsprice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Long value) {
            addCriterion("goodsprice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Long value) {
            addCriterion("goodsprice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Long value) {
            addCriterion("goodsprice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Long value) {
            addCriterion("goodsprice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Long value) {
            addCriterion("goodsprice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Long> values) {
            addCriterion("goodsprice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Long> values) {
            addCriterion("goodsprice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Long value1, Long value2) {
            addCriterion("goodsprice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Long value1, Long value2) {
            addCriterion("goodsprice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andStocknumIsNull() {
            addCriterion("stocknum is null");
            return (Criteria) this;
        }

        public Criteria andStocknumIsNotNull() {
            addCriterion("stocknum is not null");
            return (Criteria) this;
        }

        public Criteria andStocknumEqualTo(Integer value) {
            addCriterion("stocknum =", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotEqualTo(Integer value) {
            addCriterion("stocknum <>", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumGreaterThan(Integer value) {
            addCriterion("stocknum >", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stocknum >=", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumLessThan(Integer value) {
            addCriterion("stocknum <", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumLessThanOrEqualTo(Integer value) {
            addCriterion("stocknum <=", value, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumIn(List<Integer> values) {
            addCriterion("stocknum in", values, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotIn(List<Integer> values) {
            addCriterion("stocknum not in", values, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumBetween(Integer value1, Integer value2) {
            addCriterion("stocknum between", value1, value2, "stocknum");
            return (Criteria) this;
        }

        public Criteria andStocknumNotBetween(Integer value1, Integer value2) {
            addCriterion("stocknum not between", value1, value2, "stocknum");
            return (Criteria) this;
        }

        public Criteria andGoodskindIsNull() {
            addCriterion("goodskind is null");
            return (Criteria) this;
        }

        public Criteria andGoodskindIsNotNull() {
            addCriterion("goodskind is not null");
            return (Criteria) this;
        }

        public Criteria andGoodskindEqualTo(String value) {
            addCriterion("goodskind =", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindNotEqualTo(String value) {
            addCriterion("goodskind <>", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindGreaterThan(String value) {
            addCriterion("goodskind >", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindGreaterThanOrEqualTo(String value) {
            addCriterion("goodskind >=", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindLessThan(String value) {
            addCriterion("goodskind <", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindLessThanOrEqualTo(String value) {
            addCriterion("goodskind <=", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindLike(String value) {
            addCriterion("goodskind like", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindNotLike(String value) {
            addCriterion("goodskind not like", value, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindIn(List<String> values) {
            addCriterion("goodskind in", values, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindNotIn(List<String> values) {
            addCriterion("goodskind not in", values, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindBetween(String value1, String value2) {
            addCriterion("goodskind between", value1, value2, "goodskind");
            return (Criteria) this;
        }

        public Criteria andGoodskindNotBetween(String value1, String value2) {
            addCriterion("goodskind not between", value1, value2, "goodskind");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceIsNull() {
            addCriterion("discountprice is null");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceIsNotNull() {
            addCriterion("discountprice is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceEqualTo(Long value) {
            addCriterion("discountprice =", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceNotEqualTo(Long value) {
            addCriterion("discountprice <>", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceGreaterThan(Long value) {
            addCriterion("discountprice >", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("discountprice >=", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceLessThan(Long value) {
            addCriterion("discountprice <", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceLessThanOrEqualTo(Long value) {
            addCriterion("discountprice <=", value, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceIn(List<Long> values) {
            addCriterion("discountprice in", values, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceNotIn(List<Long> values) {
            addCriterion("discountprice not in", values, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceBetween(Long value1, Long value2) {
            addCriterion("discountprice between", value1, value2, "discountprice");
            return (Criteria) this;
        }

        public Criteria andDiscountpriceNotBetween(Long value1, Long value2) {
            addCriterion("discountprice not between", value1, value2, "discountprice");
            return (Criteria) this;
        }

        public Criteria andSalesIsNull() {
            addCriterion("sales is null");
            return (Criteria) this;
        }

        public Criteria andSalesIsNotNull() {
            addCriterion("sales is not null");
            return (Criteria) this;
        }

        public Criteria andSalesEqualTo(Integer value) {
            addCriterion("sales =", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotEqualTo(Integer value) {
            addCriterion("sales <>", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThan(Integer value) {
            addCriterion("sales >", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales >=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThan(Integer value) {
            addCriterion("sales <", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesLessThanOrEqualTo(Integer value) {
            addCriterion("sales <=", value, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesIn(List<Integer> values) {
            addCriterion("sales in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotIn(List<Integer> values) {
            addCriterion("sales not in", values, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesBetween(Integer value1, Integer value2) {
            addCriterion("sales between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("sales not between", value1, value2, "sales");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andGoodsdescIsNull() {
            addCriterion("goodsdesc is null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescIsNotNull() {
            addCriterion("goodsdesc is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescEqualTo(String value) {
            addCriterion("goodsdesc =", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescNotEqualTo(String value) {
            addCriterion("goodsdesc <>", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescGreaterThan(String value) {
            addCriterion("goodsdesc >", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescGreaterThanOrEqualTo(String value) {
            addCriterion("goodsdesc >=", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescLessThan(String value) {
            addCriterion("goodsdesc <", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescLessThanOrEqualTo(String value) {
            addCriterion("goodsdesc <=", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescLike(String value) {
            addCriterion("goodsdesc like", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescNotLike(String value) {
            addCriterion("goodsdesc not like", value, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescIn(List<String> values) {
            addCriterion("goodsdesc in", values, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescNotIn(List<String> values) {
            addCriterion("goodsdesc not in", values, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescBetween(String value1, String value2) {
            addCriterion("goodsdesc between", value1, value2, "goodsdesc");
            return (Criteria) this;
        }

        public Criteria andGoodsdescNotBetween(String value1, String value2) {
            addCriterion("goodsdesc not between", value1, value2, "goodsdesc");
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