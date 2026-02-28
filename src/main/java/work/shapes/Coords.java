package work.shapes;

public class Coords {
    private long x;
    private long y;
    public Coords(){
        setX(0);
        setY(0);
    }
    public Coords(long x,long y){
        setX(x);
        setY(y);
    }

    public void setX(long x){
        this.x=x;
    }
    public void setY(long y){
        this.y=y;
    }
    public long getX(){
        return x;
    }
    public long getY(){
        return y;
    }

    @Override
    public String toString(){
        return String.format("x: %d, y: %d", x, y);
    }
}
