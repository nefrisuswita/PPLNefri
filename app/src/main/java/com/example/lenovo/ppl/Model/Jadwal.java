package com.example.lenovo.ppl.Model;

import java.sql.Date;

/**
 * Created by lenovo on 3/18/2015.
 */
public class Jadwal {
    private String id;
    private String judul;
    private Date tanggal;
    private String waktuMulai;
    private String waktuAkhir;
    private String ruangan;
    private String deskripsi;
    private String idKelas;
    private String username;

    public Jadwal(String id, String judul, Date tanggal, String waktuMulai, String waktuAkhir, String ruangan, String deskripsi, String idKelas, String username) {
        this.id = id;
        this.judul = judul;
        this.tanggal = tanggal;
        this.waktuMulai = waktuMulai;
        this.waktuAkhir = waktuAkhir;
        this.ruangan = ruangan;
        this.deskripsi = deskripsi;
        this.idKelas = idKelas;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getWaktuMulai() {
        return waktuMulai;
    }

    public void setWaktuMulai(String waktuMulai) {
        this.waktuMulai = waktuMulai;
    }

    public String getWaktuAkhir() {
        return waktuAkhir;
    }

    public void setWaktuAkhir(String waktuAkhir) {
        this.waktuAkhir = waktuAkhir;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
