package HomeWorks;

import java.util.Scanner;

public class Homework1 {

    //Declaring variables
    private static double a, b, c,  d, cd, x1, x2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //getting values from user
        System.out.println("Consider the quadratic equation : ax^2 + bx + c = 0");
        System.out.print("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        c = scanner.nextDouble();

        if(a == 0){
            if (b == 0){
                if(c == 0){
                    System.out.println("Every number can be a solution for this equation");
                }else {
                    System.out.println("There is no solution for this equation");
                }
            }
            else {
                System.out.println("There is  only a real solution: X1 = - c / b = " + -c + " / " + b);
            }
        }else {
            //calculating discriminant
            d = ((b*b)-(4 * a *c  )) / (4 * a *a);

            if(d > 0){
                cd = Math.sqrt(d);
                x1 = (-b) / (2 * a) + cd;
                x2 = (-b) / (2 * a) - cd;
                System.out.println("There is two real solutions : ");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);

            }
            else if(d == 0){
                x1 = -b / 2*a;
                System.out.println("There is a real solution:");
                System.out.println("X1 = " + x1);
            }else {
                d = d * -1;
                cd = Math.sqrt(d);
                x1 = -b / 2 * a;
                System.out.println("There is two complex solutions : ");
                System.out.println("X1 = " + x1 + "+ i " + cd);
                System.out.println("X2 = " + x1 + "- i " + cd);

            }
        }
      }
}

