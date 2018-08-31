package staticDemo;

public class StudentInfo {

    String name;
    int id;
    static String schoolname = "PeopleNTech";
    static String service;

    StudentInfo(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void showInformation (){

        System.out.println("Student Name:"+ name);
        System.out.println("Student ID:"+ id);
    }

    public static void service(){
        System.out.println("Job Placement " + " Mentoring" + " Tutoring");
    }

    public static void main(String[] args) {
        StudentInfo si = new StudentInfo("Asif Tanvir",3702);
        System.out.println(StudentInfo.schoolname);
        si.showInformation();
        service();
    }
}
