package opps;

import java.util.ArrayList;
import java.util.List;

public class SanPham {
    private String tenSp;
    private Double donGia;
    private Double giamGia;

    public static List<SanPham> listSp = new ArrayList<>();

    public SanPham() {
    }

    public SanPham(String tenSp, Double donGia,  Double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham(String tenSp,  Double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = 0.0;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(Double giamGia) {
        this.giamGia = giamGia;
    }

    public static String nhap(String ten, Double gia, Double giam) {
        boolean check = false;
        String status = "";
        for(int i = 0; i<SanPham.listSp.size(); i++){
            if(SanPham.listSp.get(i).getTenSp()==ten){
                SanPham.listSp.get(i).setTenSp(ten);
                SanPham.listSp.get(i).setDonGia(gia);
                SanPham.listSp.get(i).setGiamGia(giam);
                check = true;
                status = "Update Successfully";
            }
        }
        if(!check){
            SanPham sp = new SanPham();
            sp.setTenSp(ten);
            sp.setDonGia(gia);
            sp.setGiamGia(giam);

            listSp.add(sp);
            status = "Insert Successfully";
        }

        return status;
    }


    public Double getThueNhapKhau() {
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
}
