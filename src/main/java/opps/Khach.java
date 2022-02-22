package opps;

import java.util.List;
import java.util.Map;

public class Khach {
    private String tenKhach;
    private Map<String,Integer> gioHang;

    public Khach() {
    }

    public Khach(String tenKhach, Map<String, Integer> gioHang) {
        this.tenKhach = tenKhach;
        this.gioHang = gioHang;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }
}
