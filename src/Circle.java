public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){
    }

    Circle(double radius){
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.pow(this.radius, 2)*Math.PI;
    }
}

class TestCircle{
    public static void main(String[] args){
        Circle c = new Circle(5);
        System.out.println("Radius = "+c.getRadius());
        System.out.println("Area = "+c.getArea());
    }
}
