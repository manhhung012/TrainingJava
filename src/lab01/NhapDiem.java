package lab01;

import java.util.Scanner;

public class NhapDiem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ho va Ten: ");
        String hoTen = scan.nextLine();
        System.out.print("Diem TB: ");
        double diem = Double.parseDouble(scan.nextLine());

        System.out.printf(hoTen+":"+diem);
    }
}
