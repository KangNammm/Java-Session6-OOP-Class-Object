package BT.Circle;

public class Circle {
    private double r;
    private String color;
     Circle(){
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return "Circle{" +
                "radius=" + r +
                ", color='" + color + '\'' +
                '}';
    }

    public double area(){
         return Math.PI*r*2;
    }
    public double parameter(){
        return Math.PI*r*r;
    }
}
