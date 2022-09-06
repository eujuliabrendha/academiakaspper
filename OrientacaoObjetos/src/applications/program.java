package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.triangle;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    //    double xA, xB, xC, yA, yB, yC;

        triangle x, y;    //import
        x = new triangle();
        y = new triangle();


        System.out.println("Entre com as medidas do triangulo X: ");
//        xA = sc.nextDouble();
//        xB = sc.nextDouble();
//        xC = sc.nextDouble();

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas do triangulo Y: ");
//        yA = sc.nextDouble();
//        yB = sc.nextDouble();
//        yC = sc.nextDouble();

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

//        double p = (xA + xB + xC) / 2;
//        double p = (x.a + x.b + x.c) / 2;
//        double areaX = Math.sqrt(p * (p - xA) * ( p - xB) * (p - xC));
//        double areaX = Math.sqrt(p * (p - x.a) * ( p - x.b) * (p - x.c));
        
        double areaX = x.area();
        double areaY = y.area();

//        p = (yA + yB + yC) /2;
//        p = (y.a + y.b + y.c) /2;
//        double areaY = Math.sqrt(p * (p - yA) * ( p - yB) * (p - yC));
//        double areaY = Math.sqrt(p * (p - y.a) * ( p - y.b) * (p - y.c));

        System.out.printf("Area do Triangulo X : %.4f%n", areaX);
        System.out.printf("Area do Triangulo Y : %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("O triangulo com a maior area eh o X");
        }
        else {
            System.out.println("O triangulo com a maior area eh o Y");
        }

        sc.close();
    }

}