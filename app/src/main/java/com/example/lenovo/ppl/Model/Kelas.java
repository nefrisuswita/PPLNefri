package com.example.lenovo.ppl.Model;

/**
 * Created by lenovo on 3/18/2015.
 */
public class Kelas {
    private String id;
    private String nama;

    public Kelas(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
