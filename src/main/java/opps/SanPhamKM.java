package opps;

public class SanPhamKM extends SanPham {
    private double mucKm;

    public SanPhamKM() {

    }

    public double getMucKm() {
        return mucKm;
    }

    public void setMucKm(double mucKm) {
        this.mucKm = mucKm;
    }

    public static void nhap() {
        SanPhamKM sp = new SanPhamKM();
        System.out.print("Ten san pham: ");
        sp.setTenSp(scan.next());
        System.out.print("Nhap don gia: ");
        sp.setDonGia(new Double(scan.next()));
        System.out.print("Nhap giam gia: ");
        sp.setGiamGia(new Double(scan.next()));
        System.out.print("Nhap giam gia: ");
        sp.setMucKm(new Double(scan.next()));

        listSp.add(sp);
    }
}

class Demo {
    public static void main(String[] arsg) {
        SanPhamKM.nhap();
        SanPhamKM.xuat();
    }
}
