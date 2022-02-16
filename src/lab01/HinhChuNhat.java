package lab01;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap canh 1: ");
        double c1 = scan.nextDouble();
        System.out.print("Nhap canh 2: ");
        double c2 = scan.nextDouble();

        System.out.println("Chu vi: "+(c1+c2)*2);
        System.out.println("Dien tich: "+c1*c2);
        System.out.println("Canh nho: "+Math.min(c1,c2));
    }
}
