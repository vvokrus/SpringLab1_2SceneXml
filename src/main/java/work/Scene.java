package work;

import work.shapes.Shape;

import java.util.List;

public class Scene {
    private List<Shape> shapes;

    public Scene() {}

    public Scene(List<Shape> shapes){
        setShapes(shapes);
    }

    public List<Shape> getShapes(){
        return shapes;
    }
    public void setShapes(List<Shape> shapes){
        this.shapes = shapes;
    }

    public void draw(){
        for(Shape shape:getShapes()){
            shape.draw();
        }
    }
}
