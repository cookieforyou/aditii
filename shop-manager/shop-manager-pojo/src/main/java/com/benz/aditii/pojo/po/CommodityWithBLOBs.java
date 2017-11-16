package com.benz.aditii.pojo.po;

public class CommodityWithBLOBs extends Commodity {
    private String goodscolor;

    private String image;

    private String size;

    public String getGoodscolor() {
        return goodscolor;
    }

    public void setGoodscolor(String goodscolor) {
        this.goodscolor = goodscolor == null ? null : goodscolor.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }
}