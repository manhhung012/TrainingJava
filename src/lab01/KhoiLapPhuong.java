package lab01;

import java.util.Scanner;

public class KhoiLapPhuong {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap canh: ");
        double c = scan.nextDouble();

        System.out.print("The tich: "+Math.pow(c,3));
    }
}
