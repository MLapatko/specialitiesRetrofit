package com.example.user.specialitiesretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 21.09.2017.
 */

public class Speciality {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("href")
    @Expose
    private String href;

    public Speciality(int id, String name, String href) {
        this.id = id;
        this.name = name;
        this.href = href;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Speciality{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", href='" + href + '\'' +
                '}';
    }

    public void setIdSpec(int idSpec) {
        this.id = idSpec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
