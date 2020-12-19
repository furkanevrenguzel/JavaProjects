package HomeWorks;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        double l1, l2, l, ly1, ly2, q1, q2, j, mb, w1, w2 , my, x, n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length l1 [m] = ");
        l1 = scanner.nextDouble();
        System.out.print("Enter the length l2 [m] = ");
        l2 = scanner.nextDouble();
        System.out.print("Enter the moment of interia ly1 [m^4] = ");
        ly1 = scanner.nextDouble();
        System.out.print("Enter the moment of interia ly2 [m^4] = ");
        ly2 = scanner.nextDouble();
        System.out.print("Enter the corresponding q1 [kN/m] = ");
        q1 = scanner.nextDouble();
        System.out.print("Enter the corresponding q2 [kN/m] = ");
        q2 = scanner.nextDouble();

        l = l1 + l2;
        j = ly1 / ly2;

        System.out.println("The total length of the beam is :" + l);
        mb = ((q1 * l1*l1*l1)+ (q2 * (l2*l2*l2) * j)) / (8 * (l1 + l2 * j));
        n = l / 10;

        for(x = 0; x <= l ; x = n + x){
            if(x <= l1){
                w1 = (x/l1) - ((x/l1) * (x/l1));
                my = (mb * (x/l1)) - (q1 * (l1 * l1)/ 2)  * w1;
                System.out.println("x = " + x + "     m(x) = " + my + " kNm");
            }
            else if(x >= l1){
                w2 = ((x - l1) /l2) - (((x-l1)/l2)*((x-l1)/l2));
                my = mb * (1 - (x-l1)/l2) - ((q2 * l2 * l2)/2) * w2;
                System.out.println("x = " + x + "     m(x) = " + my + " kNm");
            }
        }
    }
}
