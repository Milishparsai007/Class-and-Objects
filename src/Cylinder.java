class Cylinder {
    public double radius;
    public double height;

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea()
    {
        return 2*lidArea()*height;
    }

    public double volume()
    {
        return lidArea()*height;
    }

    public double circumference()
    {
        return 2*Math.PI*radius*height;
    }
}

class Test3{
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.radius=3;
        c1.height=4;

        System.out.printf("Area : %.3f",c1.lidArea()); //Here we've reduced the digits after the decimal point
        System.out.println();
        System.out.println("Total Surface Area : "+c1.totalSurfaceArea());
        System.out.println("Volume : "+c1.volume());
        System.out.println("Circumference : "+c1.circumference());
    }
}
