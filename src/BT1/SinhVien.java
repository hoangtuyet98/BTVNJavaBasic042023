package BT1;

public class SinhVien {
    public String diaChi = "hà nội";  //biến toàn cục
    public static float diem = 2.3f;  //biến static

    //gọi hàm để in ra biến static
    public static void diemsv() {
        System.out.println(diem);
    }

    public void thongTinNhanVien() {
        String ten = "Tuyet";  //biến local
        int tuoi = 23;
        System.out.println(ten + " " + "tuoi" + tuoi);

    }

    //gọi hàm để in ra biến toàn cục
    public String diaChi(String dc) {
        this.diaChi = dc;
        return dc;
    }

    public static void main(String[] args) {

        SinhVien sv = new SinhVien();
        sv.thongTinNhanVien();
        System.out.println(sv.diaChi);
        diemsv();
        System.out.println(ThongTin.thongtin);
    }
}
