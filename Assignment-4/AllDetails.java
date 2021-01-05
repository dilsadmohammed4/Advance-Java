// There is class People which is a super class and having attributes(Citizen-ID,name,Mobileno) . All other classes inherited to people class are Teacher(subject,salary,school_name), Student(branch,rollno,mark_secured), Advocate(branch,Experience_in_years,type(jr/sr), income), Doctor(specialization,Experience,income). Input appropriate data through constructor (use super) and display the details of each profession.

class People {

    String phNo;
    String citzn_Id, Name;

    People(String citzn_Id, String Name, String phNo) {

        this.citzn_Id = citzn_Id;
        this.Name = Name;
        this.phNo = phNo;
    }

    void showPeopleData() {
        System.out.println("Citizen Id:" + citzn_Id);
        System.out.println("Name:" + Name);
        System.out.println("Phone Number:" + phNo);
    }
}

class Teacher extends People {

    String sub, schoolName;
    double salary;

    Teacher(String citzn_Id, String Name, String phNo, String sub, String schoolName, double salary) {
        super(citzn_Id, Name, phNo);
        this.sub = sub;
        this.schoolName = schoolName;
        this.salary = salary;
    }

    void showTeacherData() {
        showPeopleData();
        System.out.println("Subject:" + sub);
        System.out.println("School Name:" + schoolName);
        System.out.println("Salary:" + salary);
    }

}

class Student extends People {

    String studentBranch;
    int rollNo, mark;

    Student(String citzn_Id, String Name, String phNo, String studentBranch, int rollNo, int mark) {
        super(citzn_Id, Name, phNo);
        this.studentBranch = studentBranch;
        this.rollNo = rollNo;
        this.mark = mark;

    }

    void showStudentData() {
        showPeopleData();
        System.out.println("Student Branch:" + studentBranch);
        System.out.println("Roll No:" + rollNo);
        System.out.println("Mark:" + mark);
    }

}

class Advocate extends People {
    String advBranch, type;
    double income;
    int expYear;

    Advocate(String citzn_Id, String Name, String phNo, String advBranch, String type, double income, int expYear) {
        super(citzn_Id, Name, phNo);
        this.advBranch = advBranch;
        this.expYear = expYear;
        this.type = type;
        this.income = income;

    }

    void showDataAdvocate() {
        showPeopleData();
        System.out.println("Advocate Branch:" + advBranch);
        System.out.println("Experience In Year:" + expYear + " Year");
        System.out.println("Type(Senior/Junior):" + type);
        System.out.println("INCOME:" + this.income);
    }

}

class Doctor extends People {
    String specialization;
    int Experience;
    double income;

    Doctor(String citzn_Id, String Name, String phNo, String specialization, int Experience, double income) {
        super(citzn_Id, Name, phNo);
        this.specialization = specialization;
        this.Experience = Experience;
        this.income = income;
    }

    void showDoctorData() {
        showPeopleData();
        System.out.println("Specilization:" + specialization);
        System.out.println("Experience In Year:" + Experience + " Year");
        System.out.println("Income:" + income);
    }
}

public class AllDetails {
    public static void main(String[] args) {
        System.out.println("=====Teachers Data=====");
        Teacher t = new Teacher("BC12", "Mohammed Tazzmul Hussen", "7377983977", "Science", "Berhempur High School",
                90000.00);
        t.showTeacherData();
        System.out.println("=====Student Data=====");
        Student s = new Student("MCA07", "Dilsad Mohammed", "8895669070", "School Of Computer Apllication", 1970006,
                700);
        s.showStudentData();

        System.out.println("=====Advocate Data=====");
        Advocate a = new Advocate("ADV02", "Biswanath Panda", "180040024", "Unknown", "Senior", 45000.00, 5);
        a.showDataAdvocate();
        System.out.println("=====Doctor Data=====");
        Doctor d = new Doctor("DCT23", "Dilras Bano Begum", "1240456780", "Heart Sergeon", 3, 300000.00);
        d.showDoctorData();

    }
}
