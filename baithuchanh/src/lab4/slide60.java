package lab4;

import java.util.LinkedHashSet;

public class slide60 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSetsStrings = new LinkedHashSet<>();
        linkedHashSetsStrings.add("Java");
        linkedHashSetsStrings.add("C++");
        linkedHashSetsStrings.add("PHP");
        for (String str : linkedHashSetsStrings){
            System.out.println(str);
        }
    }
    
}