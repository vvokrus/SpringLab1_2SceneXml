package work.shapes;

public class Point extends Shape{
    private Coords coords;


    public Point(Coords coords){
        setCoords(coords);
        setColor(DEFAULT_COLOR);
    }

    public Point(Coords coords, String color){
        setColor(color);
        setCoords(coords);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Point. Color:"+getColor()+" "+coords);
    }

    public long getX(){
        return coords.getX();
    }
    public long getY(){
        return coords.getY();
    }
    public void setCoords(Coords coords){
        this.coords = coords;
    }
    public Coords getCoords(){
        return coords;
    }

    public void setX(long x){
        coords.setX(x);
    }
    public void setY(long y){
        coords.setY(y);
    }


}
