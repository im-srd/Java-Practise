class Emp {
    int id;
    String name;
    float salary;
    Emp (int i1,float s1) {
        id=i1;
        salary=s1;
    }
        Emp (int i2,String n2,float s2)
        {
            id=i2;
            name=n2;
            salary=s2;
        }

        void display()
        {
            System.out.println(id+","+name+","+salary);
        }
    }
    public class Shivam {
        public static void main(String args[]) {
            Emp e1=new Emp(1,2000);
            e1.display();
            Emp e2=new Emp(2,"shyam",4000);
            e2.display();
        }
    }