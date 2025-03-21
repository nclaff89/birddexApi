package com.nc.birddexApi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Bird {

    private @Id
    @GeneratedValue Long id;
    private String name;
    private boolean canFly;

    public Bird(Long id, String name, boolean canFly) {
        this.name = name;
        this.canFly = canFly;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getCanFly() {
        return this.canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Bird)) {
            return false;
        }

        Bird bird = (Bird) o;
        return Objects.equals(bird.id, this.id) && Objects.equals(bird.name, this.name) && Objects.equals(bird.canFly, this.canFly);
    }

}
