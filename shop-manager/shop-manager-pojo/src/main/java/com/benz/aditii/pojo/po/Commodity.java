package com.benz.aditii.pojo.po;

public class Commodity {
    private Long id;

    private String goodsname;

    private Long goodsprice;

    private Integer stocknum;

    private String goodskind;

    private Long discountprice;

    private Integer sales;

    private Long pid;

    private String goodsdesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Long getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Long goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getStocknum() {
        return stocknum;
    }

    public void setStocknum(Integer stocknum) {
        this.stocknum = stocknum;
    }

    public String getGoodskind() {
        return goodskind;
    }

    public void setGoodskind(String goodskind) {
        this.goodskind = goodskind == null ? null : goodskind.trim();
    }

    public Long getDiscountprice() {
        return discountprice;
    }

    public void setDiscountprice(Long discountprice) {
        this.discountprice = discountprice;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getGoodsdesc() {
        return goodsdesc;
    }

    public void setGoodsdesc(String goodsdesc) {
        this.goodsdesc = goodsdesc == null ? null : goodsdesc.trim();
    }
}