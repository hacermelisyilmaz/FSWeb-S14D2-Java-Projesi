package com.workintech.model;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public void create() {
        System.out.println("com.workintech.model.Wall direction: " + direction);
    }

    public String getDirection() {
        return direction;
    }
}
