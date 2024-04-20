package lab3;

public class FullTime extends nhanvien{
    private int ngayLamThem;
    private  int loaiChucVu;

    public FullTime(String ten){
        this.ten = ten;
    }
    public FullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucVu){
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loainhanvien(){
        return "Nhan vien toan thoi gian";
    }
    public void TinhLuong() {
    if (loaiChucVu == configs.Sep) {
        luong = configs.FullTime_Sep + ngayLamThem * configs.FullTime_LamThem;
    } else if (loaiChucVu == configs.Linh) {
        luong = configs.FullTime_Linh + ngayLamThem * configs.FullTime_LamThem;
    }
}
}