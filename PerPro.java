import java.io.*;

class Personal {
    String name, Adress;
    Long number;

    Personal(String name, String Adress, Long number) {
        this.name = name;
        this.Adress = Adress;
        this.number = number;
    }

}

class Profession extends Personal {

    String job_Id, Designation, job_Type;
    Double salary;
    int month;

    Profession(String name, String Adress, Long number, String job_Id, String Designation, String job_Type,
            Double salary) {
        super(name, Adress, number);
        this.job_Id = job_Id;
        this.Designation = Designation;
        this.job_Type = job_Type;
        this.salary = salary;

    }

    void display() {
        System.out.println("==========================");
        System.out.println("Name: " + name);
        System.out.println("Adress: " + Adress);
        System.out.println("Number: " + number);
        System.out.println("Job ID: " + job_Id);
        System.out.println("Designation: " + Designation);
        System.out.println("Job Type: " + job_Type);
        System.out.println("Salary: " + salary);

    }
}

public class PerPro {
    public static void main(String[] args) throws Exception {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        String name1, Adress1;
        Long number1;
        String job_Id1, Designation1, job_Type1;
        Double salary1;
        int month;
        System.out.print("Enter The Name:");
        name1 = br.readLine();
        System.out.print("Enter The Adress:");
        Adress1 = br.readLine();
        System.out.print("Enter The Number:");
        number1 = Long.parseLong(br.readLine());
        System.out.print("Enter The Job ID:");
        job_Id1 = br.readLine();
        System.out.print("Enter The Designation:");
        Designation1 = br.readLine();
        System.out.print("Enter The Job Type:");
        job_Type1 = br.readLine();
        System.out.print("Enter The Month In Number:");
        month = Integer.parseInt(br.readLine());
        salary1 = 2000.00 * month;
        Profession obj = new Profession(name1, Adress1, number1, job_Id1, Designation1, job_Type1, salary1);
        obj.display();

    }

}
