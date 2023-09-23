import java.util.Scanner;

class Subjects {
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    //Property methods:-
    //1. getter methods which can be read
    public String getSubID()
    {
        return subID;
    }
    public String getName()
    {
        return name;
    }
    public int getMaxMarks()
    {
        return maxMarks;
    }
    public int getMarksObtain()
    {
        return marksObtain;
    }

    //2. Setter methods for writing
    //In this case we can only set maxMarks and marksObtain as subID and name are fixed for a particular subject.
    public void setMaxMarks(int maxm)
    {
        maxMarks=maxm;
    }
    public void setMarksObtain(int m)
    {
        marksObtain=m;
    }
    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;  //assume that passing marks is 40% of max marks
    }

    //Constructors:-
    //1. at the time of object creation i.e., in this case object is a subject, we will need at least subID and the name
    // for a particular subject. So there cannot be a default constructor and non-parameterized constructor.
    public Subjects(String subID,String name)
    {
        this.subID=subID;
        this.name=name;
    }

    //2. Another possibility is a constructor with all the arguments that are defined as variables in the subjects class.
    public Subjects(String subID,String name,int maxMarks,int marksObtain)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtain=marksObtain;
    }

    public String toString()
    {
        return "\nSubject ID : "+subID+"\nSubject name : "+name+"\nMax marks : "+maxMarks+"\nMarks obtained : "+marksObtain;
    }

}

class Student1
{
    private String rollNo;
    private String name;
    private String dept;
    private String []subjects;

    //getter methods
    public String getRollNo()
    {
        return rollNo;
    }
    public String getName()
    {
        return name;
    }
    public String getDept()
    {
        return dept;
    }
    public String[] getSubjects()
    {
        return subjects;
    }

    //setter methods
    //in this we can only have setter method for subjects as rollNo,name,dept of a student cannot be changed.
//    public void setSubjects(String ...subs)  // this is variable arguments as there can be multiple subjects
//    {
//        String subID,name;
//        Scanner sc=new Scanner(System.in);
//        for (int i=0;i<subjects.length;i++)
//        {
//            subID=sc.next();
//            name=sc.next();
//            subs[i]=new Subjects(subID,name);
//        }
//    }

    //constructors
    public Student1(String rollNo,String name,String dept)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
    }
    public Student1(String rollNo,String name,String dept,String[] subjects)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.dept=dept;
        this.subjects=subjects;
    }

    public String toString()
    {
        return "\nRoll No: "+rollNo+"\nName : "+name+"\nDepartment : "+dept+"\nSubjects : "+subjects;
    }
}

public class Array_Of_Objects {
    public static void main(String[] args) {

        Subjects subs[]=new Subjects[3]; // This is an array of references which will refer to the objects.
        subs[0]=new Subjects("S101","DSA",100,90); //subs[0] will contain the reference to this object
        subs[1]=new Subjects("S102","OS",100,95); // similarly subs[1]
        subs[2]=new Subjects("S103","TOC",100,85);// similarly subs[2]

        // displaying each object using for each loop and the toString method will be called for displaying objects
        for (Subjects s:subs)
        {
            System.out.println(s);
            System.out.println(s.isQualified());
        }

        Student1 studs[]=new Student1[3];
        studs[0]=new Student1("34","milish","CSE");


    }
}
