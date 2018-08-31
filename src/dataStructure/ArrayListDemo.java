package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size:"+number.size());

        number.add(12);
        number.add(20);
        number.add(30);
        number.add(40);
        //for (int i : number){
        //System.out.println(i);
        Iterator itr = number.iterator();
        while(itr.hasNext()){

            System.out.println(itr.next());
            System.out.println();



        }
        number.remove(2);
        System.out.println("After remove:"+number);
        System.out.println("Size:"+number.size());
    }
}
