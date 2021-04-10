import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mau sac: ");
        String s1 = sc.nextLine();
        System.out.println("nhap fittle: ");
        String s2 = sc.nextLine();
        System.out.print("nhap side1");
        double s3 = sc.nextDouble();
        System.out.print("nhap side2");
        double s4 = sc.nextDouble();
        System.out.print("nhap side3");
        double s5 = sc.nextDouble();

        Triangle a = new Triangle(s1, s2, s3, s4, s5);
        System.out.println(a.getAria());
        System.out.println(a.toString());
    }
}
