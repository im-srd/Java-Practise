
/*2 (a) Design a super class called Staff with details as StaffId, Name, Phone, Salary. Extend this class
        by writing three subclasses namely Teaching (domain, publications), Technical (skills), and Contract
        (period). Write a Java program to read and display at least 3 staff objects of all three
        categories.
    (b) Write a Java class called Customer to store their name and date_of_birth. The date_of_birth
        format should be dd/mm/yyyy. Write methods to read customer data as <name, dd/mm/yyyy> and
        display as <name, dd, mm, yyyy> using String Tokenizer class considering the delimiter character
        as “/”.*/

class Staff {
    String staffID,name;
    long salary,phone;
    Staff(String sid,String n,long sal,long ph)
    {
        staffID=sid;
        name=n;
        salary=sal;
        phone=ph;
    }
    void display()
    {
        System.out.print(staffID+"\t"+name+"\t"+salary+"\t"+phone);
    }
}

class Teaching extends Staff {
    String domain,publication;
    Teaching(String sid,String n,long sal,long ph,String d, String pub)
    {
        super(sid,n,sal,ph);
        domain=d;
        publication=pub;
    }
    void display()
    {
        super.display();
        System.out.println("\t"+domain+"\t\t"+publication);
    }
}

class Technical extends Staff{
    String skill;
    Technical(String sid,String n,long sal,long ph, String s)
    {
        super(sid,n,sal,ph);
        skill=s;
    }
    void display()
    {
        super.display();
        System.out.println("\t\t\t\t\t\t"+skill);
    }
}

class Contract extends Staff{
    int period;
    Contract(String sid,String n,long sal,long ph,int p)
    {
        super(sid,n,sal,ph);
        period=p;
    }
    void display()
    {
        super.display();
        System.out.println("\t\t\t\t\t\t\t\t"+period);
    }
}

class Lab2a{
    public static void main(String args[]){
        Staff s[]=new Staff[3];
        s[0]=new Teaching("4331a","Shivam",49990,805190261,"CEO","2019");
        s[1]= new Technical("4331b","Shubham",59990,798392020,"HERO");
        s[2]=new Contract("4331c","Shyam",149990,700459137,2);
        System.out.println("StaffID\tName\tSalary\tPhone No.\tDomain\tPublication\tSkill\tPeriod");
        for(int i=0;i<=2;i++)
        {
            s[i].display();
            System.out.println();
        }
    }
}

/*OUTPUT:
StaffID	    Name	Salary	Phone No.	Domain	Publication	Skill	Period
4331a	    Shivam	49990	805190261	CEO		2019

4331b	    Shubham	59990	798392020						HERO

4331c	    Shyam	149990	700459137								2
*/