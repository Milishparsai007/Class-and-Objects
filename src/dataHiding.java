class dataHiding {
    private double length;
    private double breadth;

    public double getLength()  //for reading length
    {
        return length;
    }
    public void setLength(double l)  //for writing length
    {
        if (l>0)
            length=l;
        else
            length=0;
    }

    public double getBreadth()  //for reading breadth
    {
        return length;
    }
    public void setBreadth(double b)  //for writing breadth
    {
        if (b>0)
            breadth=b;
        else
            breadth=0;
    }

    public double area()
    {
//        return getLength()*getBreadth();  //we can use this also.
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

class Test5
{
    public static void main(String[] args) {

        dataHiding r1=new dataHiding();
//        r1.length=5;
//        r1.breadth=5;
        //the above code will show error because the length and breadth variables are private and cannot be accesed outside
        //the class in which they are declared.
        //to avoid this error we use get and set property methods.

        r1.setLength(10.56);
        r1.setBreadth(11.56);

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
        System.out.println("Area : "+r1.area());
        System.out.println("Perimeter : "+r1.perimeter());
        System.out.println(r1.isSquare());

    }
}
