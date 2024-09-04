class Staff{
    String StaffName;
    int StaffId;
    long Phone;
    double salary;

    Staff (int StaffId, String StaffName,double salary,int Phone){
       this.StaffId=StaffId;
        this.StaffName=StaffName;
        this.salary=salary;
        this.Phone=Phone;
        display();
    }
    void display(){
        System.out.println(StaffId+"\t"+StaffName+"\t"+Phone+"\t"+salary);
    }
}
public class p2 {
    public static void main(String args[]){
        System.out.println("StaffId\tStaffName\tPhone\tSalary");
//


    }
}
