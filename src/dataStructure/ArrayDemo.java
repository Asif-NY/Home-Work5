package dataStructure;

public class ArrayDemo {
    int roll_no;
    String name;

    ArrayDemo(int roll_no, String name){
        this.name = name;
        this.roll_no = roll_no;
    }

    public static void main(String[] args) {
        ArrayDemo []ar = new ArrayDemo[4];
        ar[0]= new ArrayDemo(1,"Asif");
        ar[1]= new ArrayDemo(2,"Tanvir");
        ar[2]= new ArrayDemo(3,"Jhon");

        for(int i= 0; i< ar.length; i++){

            System.out.println(ar[i].roll_no+" "+ar[i].name);


        }
    }
}

