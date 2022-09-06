package ru.n1kk0n.hashcodeandequals;

import java.util.Objects;

public class ColoredPoint extends Point {
    private String color;

    public ColoredPoint() {
        super();
        this.color = "black";
    }

    public ColoredPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColoredPoint that = (ColoredPoint) o;
        return color.equals(that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "ColoredPoint{" +
                "x=" + super.getX() +
                ", y=" + super.getY() +
                ", color='" + color + '\'' +
                '}';
    }
}
