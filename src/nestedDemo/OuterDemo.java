package nestedDemo;

public class OuterDemo {

    public static class InnerDemo1 {

        public void displayInformation(){
            System.out.println("How to I go PNT Campus");
        }
    }

    public static class InnerDemo2 {

        public void print(){
            System.out.println("Please print for me the Information");
        }
    }

    public static void main(String[] args) {
        OuterDemo.InnerDemo1 id1 = new OuterDemo.InnerDemo1();
        OuterDemo.InnerDemo2 id2 = new OuterDemo.InnerDemo2();
        id1.displayInformation();
        id2.print();
    }
}
