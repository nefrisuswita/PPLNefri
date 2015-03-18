package com.example.lenovo.ppl.Model;

/**
 * Created by lenovo on 3/18/2015.
 */
public class Menjabat {
    private String username;
    private String idKelas;

    public Menjabat(String username, String idKelas) {
        this.username = username;
        this.idKelas = idKelas;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }
}
