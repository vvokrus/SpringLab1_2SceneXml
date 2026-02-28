package work.shapes;

import java.awt.*;

public class Circle extends Shape{
    private double radius;
    private Coords center;

    public Circle(Coords center, double radius, String color){
        setRadius(radius);
        setColor(color);
        setCenter(center);
    }
    public Circle(Coords center, double radius){
        this(center, radius, DEFAULT_COLOR);
    }
    public Circle(Coords center){
        this(center, 0, DEFAULT_COLOR);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setCenter(Coords center) {
        this.center = center;
    }
    public double getRadius() {
        return radius;
    }
    public Coords getCenter() {
        return center;
    }
    public long getX(){
        return center.getX();
    }
    public long getY(){
        return center.getY();
    }
    public void setX(long x){
        center.setX(x);
    }
    public void setY(long y){
        center.setY(y);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Point. Color:"+getColor()+
                " Center: "+center+
                ". Radius:"+getRadius());
    }
}
