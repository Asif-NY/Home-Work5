package SingletonClass;

public class SingletonDemo {

    private SingletonDemo() {
    }

    public static SingletonDemo getInstance() {

        SingletonDemo s = new SingletonDemo();
        return s;
    }
    public void dispaly(){
        System.out.println("Show me the result");
    }

    public static void main(String[] args) {
        SingletonDemo s = SingletonDemo.getInstance();
        s.dispaly();
    }
}