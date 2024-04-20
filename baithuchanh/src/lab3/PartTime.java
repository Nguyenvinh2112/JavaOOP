package lab3;
public class PartTime extends nhanvien{
    private int gioLamViec;

    public PartTime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loainhanvien(){
        return "Nhan vien thoi vu";
    }
    public void TinhLuong(){
        luong = configs.PARTTime_LamThem * gioLamViec;
    }
}