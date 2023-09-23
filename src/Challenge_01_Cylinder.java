class Cylinder_1 {
    private double radius;
    private double height;

    public double getRadius()
    {
        return radius;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double h)
    {
        if(h>0)
            height=h;
        else
            height=0;
    }
    public void setRadius(double r)
    {
        if (r>0)
            radius=r;
        else
            radius=0;
    }

    public Cylinder_1()
    {
        setRadius(1);
        setHeight(1);
    }

    public Cylinder_1(double r,double h)
    {
        setHeight(h);
        setRadius(r);
    }

    public double lidarea()
    {
        return Math.PI*radius*radius;
    }

    public double volume()
    {
        return lidarea()*height;
    }

    public double tsa()
    {
        return 2*lidarea()*height;
    }

    public double circumference()
    {
        return 2*Math.PI*radius*height;
    }
}

class Test7
{
    public static void main(String[] args) {

        Cylinder_1 c1=new Cylinder_1();
        System.out.println("Radius : "+c1.getRadius());
        System.out.println("height : "+c1.getHeight());
        System.out.println("Lid Area : "+c1.lidarea());
        System.out.println("TSA : "+c1.tsa());
        System.out.println("Volume : "+c1.volume());
        System.out.println("Circumference : "+c1.circumference());
        System.out.println();

        Cylinder_1 c2=new Cylinder_1(10,5);
        System.out.println("Radius : "+c2.getRadius());
        System.out.println("height : "+c2.getHeight());
        System.out.println("Lid Area : "+c2.lidarea());
        System.out.println("TSA : "+c2.tsa());
        System.out.println("Volume : "+c2.volume());
        System.out.println("Circumference : "+c2.circumference());

    }
}
