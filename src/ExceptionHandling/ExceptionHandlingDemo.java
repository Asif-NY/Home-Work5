package ExceptionHandling;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        try {

            int x = 10;
            int y = 5;
            int result = 10/0;

            System.out.println("Result:"+result);

        }catch(Exception e){
            System.out.println("Exception:"+e);

        }

        System.out.println("Must how me the result");

    }

}
