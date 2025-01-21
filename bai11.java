
package DangKhaiVy_30209244459;
import java.util.Random;
import java.util.ArrayList;
public class bai11 {
    public static ArrayList<Integer> nhapmang(){
        ArrayList<Integer> nhap = new ArrayList<>();
        Random vao = new Random();
        for(int i=0;i<10;i++){
            nhap.add(vao.nextInt(100)+1);
        }
        return nhap;
    }
    public static int maxmang(ArrayList<Integer> nhap){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nhap.size();i++){
            if(nhap.get(i)>max){
                max=nhap.get(i);
            }
        }
        return max;
    }
    public static int minmang(ArrayList<Integer> nhap){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nhap.size();i++){
            if(nhap.get(i)<min){
                min=nhap.get(i);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nhap = nhapmang();
        System.out.println("Mang la: "+nhap);
        System.out.println("Gia tri lon nhat mang la: "+maxmang(nhap));
        System.out.println("Gia tri nho nhat mang la: "+minmang(nhap));
    }
}
