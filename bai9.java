
package DangKhaiVy_30209244459;
import java.util.Scanner;
import java.util.ArrayList;
public class bai9 {
    public static ArrayList<Integer> nhapmang(){
        ArrayList<Integer> nhap = new ArrayList<>();
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap so phan tu cua mang: ");
        int n=vao.nextInt();
        System.out.println("Hay nhap cac phan tu trong mang: ");
        for(int i=0;i<n;i++){
            nhap.add(vao.nextInt());
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
        ArrayList<Integer> nhap=nhapmang();
        System.out.println("Mang la: "+nhap);
        System.out.println("Gia tri lon nhat mang la: "+maxmang(nhap));
        System.out.println("Gai tri nho nhat mang la: "+minmang(nhap));
    }
}
