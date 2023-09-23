class Product {
    private int itemno;
    private String name;
    private double price;
    private short qty;

    public int getItemno()
    {
        return itemno;
    }
    public int getQty()
    {
        return qty;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }

    Product(int itemno)
    {
        this.itemno=itemno;
    }

    Product(int itemno,String name)
    {
        this.itemno=itemno;
        this.name=name;
    }

    Product(int itemno,String name,double price,short qty)
    {
        this.itemno=itemno;
        this.name=name;
        this.price=price;
        this.qty=qty;
    }
}

class Customer
{
    private int custid;
    private String name;
    private String address;
    private int phno;

    public int getCustid()
    {
        return custid;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public int getPhno()
    {
        return phno;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(int phno)
    {
        this.phno=phno;
    }


    Customer(int custid,String name)
    {
        this.custid=custid;
        this.name=name;
    }
    Customer(int custid,String name,String address,int phno)
    {
        this.custid=custid;
        this.name=name;
        this.address=address;
        this.phno=phno;
    }
    public String toString()
    {
        return "Custid : "+custid+"NAme : "+name+"Address: "+address+"Phone : "+phno;
    }


}

public class Challenge_02 {
    public static void main(String[] args) {

        Product p1=new Product(1);
        Product p2=new Product(2,"Apple");
        Product p3=new Product(3,"Mango",30.56, (short) 1);

        Customer c1=new Customer(11224455,"Milish");
        Customer c2=new Customer(11224455,"Milish","pune",89890533);

        System.out.println(c2);
    }
}
