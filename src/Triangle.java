import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Map;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Nhap gia tri canh a: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap gia tri canh b: ");
        float b = scanner.nextFloat();
        System.out.println("Nhap gia tri canh c: ");
        float c = scanner.nextFloat();
        float result = a + b + c;
        if (a == b && b == c || a == c && b == c) {
            System.out.println("Đây là tam giác đều ");
            System.out.println("Chu vi của tam giác là " + result);
            System.out.println("Diện tích tam giác là" + AcreageEquilateralTriangle(a, b, c));

        } else if (a == b || b == c || c == a) {
            System.out.println("Đây là tam giác cân");
            System.out.println("Diện tích tam giác:  " + IsoscelesTriangle(a, b, c));

        } else if (Math.abs(b - c) < a && a < b + c || Math.abs(a - c) < b && b < a + c || Math.abs(b - a) < c && c < b + b) {
            System.out.println("Đây là tam giác bình thường ");
            System.out.println("Chu vi của tam giác là " + result);
            System.out.println("Diện tích tam giác : " + TriangleNomal(a, b ,c));

        } else {
            System.out.println("Đây không phải tam giác");

        }
    }

    public static Double AcreageEquilateralTriangle(float a, float b, float c) {
        double h = Math.sqrt(c*c - (a/2)*(a/2));
        double s = h*a/2;
        return s;
    }

    public static Double IsoscelesTriangle(double a, double b, double c) {
        double h,s;
        if (a == b) {
            h = Math.sqrt(a*a - (c/2)*(c/2));
            s = h*c/2;
            return s;
        } else if (b == c) {
            h = Math.sqrt(b*b - (a/2)*(a/2));
            s = h*a/2;
            return s;
        } else if (c == a) {
            h = Math.sqrt(a*a - (b/2)*(b/2));
            s = h*b/2;
            return s;
        }
        return 0.0;
    }
    public static Double TriangleNomal(double a, double b, double c) {
        double p = (a + b + c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
