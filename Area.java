class AreasMethodeOverloading{
    void area(int l, int b){
        int a=l*b;
        System.out.println("Area of rectangle is"+a);
    }
    void area(double b, double h){
        double a=0.5*b*h;
        System.out.println("Area of triangle is"+a);
    }
    void area(double r){
        double a=3.14*r*r;
        System.out.println("Area of circle is"+a);
    }
}
public class Area{
    public static void main(String[] args) {
        AreasMethodeOverloading ob=new AreasMethodeOverloading();
        ob.area(3,4);
        ob.area(4.7,8.9);
        ob.area(6.8);
    }
}
