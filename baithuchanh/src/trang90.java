import java.util.Scanner;

public class trang90 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Nhap chuoi ki tu bat ki : ");
        String chuoiKiTu = inputScanner.next();

        System.out.println("Chuoi ki tu theo tung dong : ");
        for(int i =0 ; i < chuoiKiTu.length() ; i++ ) {
            System.out.println(chuoiKiTu.charAt(i));
        }
    }
}