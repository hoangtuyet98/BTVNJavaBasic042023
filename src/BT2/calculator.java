package BT2;

public class calculator {
    public static int tongSoNguyen(int a, int b){
        return a+b;
    }
    public static float tichSoThuc(float c, float d){
        return c*d;
    }
    public static void main(String[] args) {
        System.out.println(tongSoNguyen(3,5));
        System.out.println(tichSoThuc(2.3f,4.3f));

    }
}
