package lab3;

public class TinhLuong {
    public static void main(String[] args) {
        FullTime sep = new FullTime("Le Van Sep");
        sep.setLoaiChucVu(1);

        FullTime linh1 = new FullTime("Nguyen Van A");
        FullTime linh2 = new FullTime("Nguyen Van B", 4);
        linh1.setLoaiChucVu(2);
        linh2.setLoaiChucVu(2);

        PartTime thoiVu = new PartTime("Vu Thoi Vu", 240);

        sep.TinhLuong();
        linh1.TinhLuong();
        linh2.TinhLuong();
        thoiVu.TinhLuong();

        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}