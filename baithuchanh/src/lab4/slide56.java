package lab4;

import java.util.HashSet;
import java.util.Scanner;


public class slide56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashsetString=new HashSet<>();
        Scanner sc= new Scanner(System.in);
        hashsetString.add("wil");
        hashsetString.add("nike");
        hashsetString.add("vol");
        hashsetString.add("kia");
        hashsetString.add("len");
        hashsetString.add("leno");
        System.out.println("cac phan tu trong hashsetString la:");
        System.out.println(hashsetString);
        System.out.println("nhap phan tu can xoa");
        name = sc.nextLine();
        if(hashsetString.contains(name)){
            hashsetString.remove(name);
            System.out.println("xoa thanh cong");
            System.out.println("cac phan  tu con lai trong hashsetString");
            System.out.println(hashsetString);
        }else{
            System.out.println("xoa khong thanh cong");
        }
    }
    
}