class Student {
    public int roll;
    String name;
    String course;
    int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public double average()
    {
        return (float)total()/3;
    }

    public char grade()
    {
        if(average()>90)
            return 'A';
        else if (average()<=90 &&average()>80) {
            return 'B';
        }
        else if (average()<=80 && average()>60) {
            return 'C';
        }
        else
            return 'D';
    }

//    public void showDetails()
//    {
//        System.out.println("Name : "+name);
//        System.out.println("Course : "+course);
//        System.out.println("Roll no. : "+roll);
//    }

    public String toString()
    {
        return "Roll : "+roll+"\nName : "+name+"\nCourse : "+course;
    }
    //This method will show the object i.e., if we want to show the object then we will use this method
}

class Test4
{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.roll=34;
        s1.name="Milish";
        s1.course="CSE";
        s1.m1=90;
        s1.m2=95;
        s1.m3=90;

//        s1.showDetails();
        System.out.println(s1);
        //here directly we have printed the object so toString method will be called.
        System.out.println("Total : "+s1.total());
        System.out.println("Average : "+s1.average());
        System.out.println("Grade : "+s1.grade());
    }
}