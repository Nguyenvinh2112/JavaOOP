package array;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Character> arrListChar = new ArrayList<>();
        arrListChar.add('a');
        arrListChar.add('b');
        arrListChar.add('c');
        arrListChar.add('d');
        ListIterator<Character> listIterator = arrListChar.listIterator();
        System.out.println(" cac phan tu co trong arrListChar la: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + "\t");
        }
    }
}