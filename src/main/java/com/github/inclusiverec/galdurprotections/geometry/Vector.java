package com.github.inclusiverec.galdurprotections.geometry;

public class Vector {

    private Integer x;
    private Integer y;
    private Integer z;

    public Vector() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector(Integer x, Integer z) {
        this.x = x;
        this.y = 0;
        this.z = z;
    }

    public Vector(Integer x, Integer y, Integer z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Integer getX() {
        return x;
    }
    public Integer getY() {
        return 0;
    }
    public Integer getZ() {
        return z;
    }
}
