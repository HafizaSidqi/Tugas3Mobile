package com.fti.firstrecycleview;

public class MemberModel {
    private String namaMember;
    private int fotoMember;
    private String deskripsi;

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNamaMember() {
        return namaMember;
    }

    public void setNamaMember(String namaMember) {
        this.namaMember = namaMember;
    }

    public int getFotoMember() {
        return fotoMember;
    }

    public void setFotoMember(int fotoMember) {
        this.fotoMember = fotoMember;
    }
}
