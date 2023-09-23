class Constructors {
    private double length;
    private double breadth;

    public Constructors()  //non-parameterized
    {
          length=1;
          breadth=1;
//        setLength(1);    // we can also use these validating methods to check whether positive arguements are passed
//        setBreadth(1);
    }

    public Constructors(double l,double b) //parameterized
    {
        length=l;
        breadth=b;
//        setLength(l);
//        setBreadth(b);
    }

    public Constructors(double s)
    {
          length=breadth=s;
//        setLength(s);
//        setBreadth(s);
    }

    public double getLength(double length)
    {
        return length;
    }
    public double getBreadth(double breadth)
    {
        return breadth;
    }

    public void setLength(double l)
    {
        if(l>0)
            length=l;
        else
            length=0;
    }

    public void setBreadth(double b)
    {
        if (b>0)
            breadth=b;
        else
            breadth=0;
    }

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

class Test6{
    public static void main(String[] args) {
        Constructors r1=new Constructors();
        Constructors r2=new Constructors(-10,5);
        Constructors r3=new Constructors(10);
        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());

        System.out.println(r3.isSquare());
    }
}
