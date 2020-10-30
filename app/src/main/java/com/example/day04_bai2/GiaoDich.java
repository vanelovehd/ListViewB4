package com.example.day04_bai2;

public class GiaoDich {
    String ngay, ma, gtMua, gtBan, loiNhuan;

    public GiaoDich(String ngay, String ma, String gtMua, String gtBan, String loiNhuan) {
        this.ngay = ngay;
        this.ma = ma;
        this.gtMua = gtMua;
        this.gtBan = gtBan;
        this.loiNhuan = loiNhuan;
    }

    public GiaoDich() {
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getGtMua() {
        return gtMua;
    }

    public void setGtMua(String gtMua) {
        this.gtMua = gtMua;
    }

    public String getGtBan() {
        return gtBan;
    }

    public void setGtBan(String gtBan) {
        this.gtBan = gtBan;
    }

    public String getLoiNhuan() {
        return loiNhuan;
    }

    public void setLoiNhuan(String loiNhuan) {
        this.loiNhuan = loiNhuan;
    }
}
