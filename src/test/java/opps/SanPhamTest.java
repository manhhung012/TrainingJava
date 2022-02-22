package opps;

import org.junit.Test;


import static org.junit.Assert.*;

public class SanPhamTest {

    @Test
    public void testNhapSanPham() {
        String ten = "sp1";
        Double gia = 15000.0;
        Double giam = 5000.0;
        String insert = SanPham.nhap(ten,gia,giam);

        giam = 2000.0;
        String update = SanPham.nhap(ten,gia,giam);

        assertEquals("Insert Successfully",insert);
        assertEquals("Update Successfully",update);
    }

    @Test
    public void testTinhThueCuaSanPham(){
        SanPham sp = new SanPham("sp1",10000.0,5000.0);

        Double thueTest = 11000.0;
        Double thue = sp.getThueNhapKhau();

        assertEquals(thueTest,thue);
    }



}