package com.example.user.specialitiesretrofit;

/**
 * Created by user on 21.09.2017.
 */

public class Speciality {
    private int id;
    private String name;
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
