class Rectangle {
    public double length;
    public double breadth;

    public double area()
    {
        return length*breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean isSquare()
    {
        return length==breadth;
    }
}

class Test2{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=5;
        r1.breadth=6;
        System.out.println(r1.isSquare());
        System.out.println("Area : "+r1.area());
        System.out.println("Perimeter : "+r1.perimeter());
    }
}
