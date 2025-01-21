
package DangKhaiVy_30209244459;
import java.util.ArrayList;
import java.util.Scanner;
public class bai7 {
    public static ArrayList<Integer> nhapmang(){
        ArrayList<Integer> nhap = new ArrayList<>();
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap so phan tu cua mang: ");
        int n=vao.nextInt();
        System.out.println("Hay nhap phan tu cua mang: ");
        for(int i=0;i<n;i++){
            nhap.add(vao.nextInt());
        }
        return nhap;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nhap = nhapmang();
        System.out.println("Mang la: ");
        for(int i=nhap.size()-1;i>=0;i--){
            System.out.print(nhap.get(i)+"   ");
        }
    }
}
