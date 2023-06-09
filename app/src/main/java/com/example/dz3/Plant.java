package com.example.dz3;

public class Plant {

    private String name;
    private String description;
    private int res;

    public Plant (String name, String description, int res) {
        this.name = name;
        this.description = description;
        this.res = res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
