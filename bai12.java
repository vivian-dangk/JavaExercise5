
package DangKhaiVy_30209244459;
import java.util.Random;
import java.util.ArrayList;
public class bai12 {
    public static ArrayList<Integer> nhapmang(){
        Random vao = new Random();
        ArrayList<Integer> nhap = new ArrayList<>();
        for(int i=0;i<10;i++){
            nhap.add(vao.nextInt(100)+1);
        }
        return nhap;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nhap=nhapmang();
        System.out.println("Mang la: "+nhap);
        int s=0;
        for(int i=0;i<nhap.size();i++){
            s+=nhap.get(i);
        }
        System.out.println("Tong cac phan tu cua mang la: "+s);
    }
}
