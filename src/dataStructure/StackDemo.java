package dataStructure;


        import java.util.Stack;

public class StackDemo {


    static void stack_push (Stack<Integer> Stack){
        for(int i = 0; i < 10; i++){
            Stack.push(i);
        }

    }

    static void stack_pop(Stack<Integer>Stack){
        System.out.println("Pop");
        for(int i=0; i<10; i++){
            Integer y = (Integer)Stack.pop();
            System.out.println(y);
        }

    }
    static void stack_peek (Stack<Integer>Stack){
        Integer element = (Integer)Stack.peek();
        System.out.println("Element on stack top:"+element);
    }
    static void stack_search(Stack<Integer>Stack, int element){
        Integer pos = (Integer) Stack.search(element);
        if (pos ==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at position:"+pos);
    }

    public static void main(String[] args) {
        Stack<Integer>Stack = new Stack<>();

        stack_push(Stack);
        stack_pop(Stack);
        stack_push(Stack);
        stack_peek(Stack);
        stack_peek(Stack);
        stack_search(Stack,2);
        stack_search(Stack,3);



    }
}
