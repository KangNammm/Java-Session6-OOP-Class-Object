package TH;

public class Calculator {
    double a;
    double b;
    public Calculator(){
    }
    public Calculator(double a, double b){
        this.a = a;
        this.b = b;
    }

    // get và set
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    // tính tổng
    public double add(){
        return a+b;
    }
    public  double sub(){
        return a-b;
    }
    public double nulti(){
        return a*b;
    }
    public double div(){
        return a/b;
    }

}
