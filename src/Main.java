import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Flask1:");
        double flask1 = sc.nextDouble();
        System.out.println("Enter temperature in Flask2:");
        double flask2 = sc.nextDouble();
        System.out.println(flask1>=20 && flask1<=40 && flask2 >=75 ? "All works properly" : "Danger");
        sc.close();
    }
}