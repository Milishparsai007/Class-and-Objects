//Here wwe are creating an circle class and we will write its properties and behaviour.


class Circle {
    public double radius;
    public double area()
    {
        return Math.PI * radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}

class Test1{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=5.5;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}