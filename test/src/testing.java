//import java.math.BigDecimal;
//abstract class Shape {
//    protected String name;
//
//    public Shape(String name) {
//        this.name = name;
//    }
//
//    public abstract double calculateArea();
//
//    public void displayInfo() {
//        System.out.println("Shape: " + name);
//        System.out.println("Area: " + calculateArea());
//    }
//}
//class Circle extends Shape{
//    //Circle -> radius 
//    BigDecimal radius;
//    public Circle(String name,BigDecimal radius){
//        super(name);
//        this.radius=radius;
//    }
//    public BigDecimal calculateArea(){
//        return 3.14159*radius*radius;
//    }
//    public void displayInfo(){
//        super.displayInfo();
//    }
//}
//class Rectangle extends Shape{
//    double length;
//    double width;
//    public Rectangle(String name,double length,double width){
//        super(name);
//        this.length=length;
//        this.width=width;
//    }
//    public double calculateArea(){
//        if(length<=0 || width<=0){
//            return -1;
//            
//        }
//        return length*width;
//    }
//    public void displayInfo(){
//        super.displayInfo();
//    }
//}
//
// 