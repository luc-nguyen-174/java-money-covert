import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate = 23000;
        double usd,vnd;
        System.out.println("Nhap vao tien USD:");
        usd=scanner.nextDouble();
        double convert= usd*rate;
        System.out.print(convert);
    }
}