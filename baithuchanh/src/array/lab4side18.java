package array;

import java.util.ArrayList;

public class lab4side18 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInt = new ArrayList<>();
        arrListInt.add(0);
        arrListInt.add(7);
        arrListInt.add(9);
        arrListInt.add(1);
        System.out.println("Cac ptu co trong arrListInt la: ");
        for(int number : arrListInt ) {
            System.out.println(number + "\t");
        }
    }
}