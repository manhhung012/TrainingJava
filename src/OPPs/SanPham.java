package OPPs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

    public static List<SanPham> listSp = new ArrayList<>();
    public static Scanner scan = new Scanner(System.in);

    public SanPham() {
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public static void nhap() {
        SanPham sp = new SanPham();
        System.out.print("Ten san pham: ");
        sp.setTenSp(scan.next());
        System.out.print("Nhap don gia: ");
        sp.setDonGia(new Double(scan.next()));
        System.out.print("Nhap giam gia: ");
        sp.setGiamGia(new Double(scan.next()));

        listSp.add(sp);
    }

    public static void xuat() {
        System.out.print(listSp);
    }


    private double getThueNhapKhau() {
        return donGia * 1.1;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "tenSp='" + tenSp + '\'' +
                ", donGia=" + donGia +
                ", giamGia=" + giamGia +
                '}';
    }

    public static void main(String[] args) {
        SanPham.nhap(); //nhap sp1
        SanPham.nhap(); //nhap sp2
        SanPham sp = new SanPham("sp3", 10000); //nhap sp3 (khong co giam gia)
        SanPham.xuat(); //Xuat danh sach sp
    }


}
