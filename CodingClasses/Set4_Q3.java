/*Write a java program for a Staff class having four variables StaffName , StaffId , Phone and salary . Define the required constructors to initialise the value to its variables as shown in output. Define method display to print the value in the same format as shown here :
Create 4 objects with passing the appropriate parameters to the constructor.
Test cases :
Staffid Staffname Salary Phone
101     Ram       1000.0 987654321
102     null      0.0    765489322
0       Shyam     5000.0 657894321
104     Sita      0.0    623489076
Note : Don’t pass zero or null in parameters while creating the object, take it as default*/

class Staff{
    String Sname; //Staff name
    int Sid; //Staff ID
    int phone; //Staff phone
    float salary;  //Staff salary
    Staff(int i,String n,float s,int p)
    {
        Sname=n;
        Sid=i;
        phone=p;
        salary=s;
    }
    void display()

    {
        System.out.println(Sid+"\t\t\t"+Sname+"\t\t"+salary+"\t\t"+phone);
    }
}

public class Set4_Q3 {
    public static void main(String args[]){
        System.out.println("S_ID\t\tS_Name\t\tSalary\t\tPhone");
        Staff s[]=new Staff[4]; //Initializing array of objects
        s[0]=new Staff(101,"Ram Ji",70000,987654321);
        s[0].display();
        s[1]=new Staff(102,"Madhav",65000,765489322);
        s[1].display();
        s[2]=new Staff(103,"Shyam",75000,657894321);
        s[2].display();
        s[3]=new Staff(104,"Sita",95000,623489076);
        s[3].display();
    }
}
