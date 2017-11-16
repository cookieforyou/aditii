package com.benz.aditii.pojo.po;

public class Provider {
    private Long id;

    private String pname;

    private String phone;

    private String address;

    private String show;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show == null ? null : show.trim();
    }
}