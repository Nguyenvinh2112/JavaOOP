import java.util.Scanner;
public class phuongtrinhbac1 {
    public static void main(String[] args) {
     java.util.Scanner sc = new Scanner(System.in);
     double a,b,x;
     System.out.printf("nhap gia tri cua a:");
     a = sc.nextDouble();
     System.out.printf("nhap gia tri cua b:");
     b = sc.nextDouble();
     if(a==0) System.out.println("phuong trinh vo nghiem");
     else { x = -b/a; System.out.println("nghiem cua phuong trin3h la : " + "x ="+x);}

    }
    
}
