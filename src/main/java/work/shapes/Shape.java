package work.shapes;

public abstract class Shape {
    private String color;

    public static final String DEFAULT_COLOR = "BLACK";

    public Shape(){
        this(DEFAULT_COLOR);
    }
    public Shape(String color){
        setColor(color);
    }

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public abstract void draw();
}
