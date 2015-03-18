package com.example.lenovo.ppl.Model;

/**
 * Created by lenovo on 3/18/2015.
 */
public class RequestRole {
    private String username;
    private String idKelas;
    private int status;

    public RequestRole(String username, String idKelas, int status) {
        this.username = username;
        this.idKelas = idKelas;
        this.status = status;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
