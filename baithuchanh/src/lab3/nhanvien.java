package lab3;

public class nhanvien {
    protected String ten;
    protected long luong;
    public nhanvien(){    
    }
    public nhanvien(String ten){
        this.ten = ten;
    }
    protected String loainhanvien(){
        return "";
    }
    public void xuatThongTin(){
       System.out.println("Nhan vien: " +ten);
       System.out.println("Loai nhan vien: " +loainhanvien());
       System.out.println("Luong: " +luong+ "VND");
    }
}
