
package DangKhaiVy_30209244459;
import java.util.Scanner;
import java.util.ArrayList;
public class bai8 {
    public static ArrayList<String> nhapmang(){
        Scanner vao = new Scanner(System.in);
        ArrayList<String> nhap = new ArrayList<>();
        System.out.println("Nhap so luong trai cay: ");
        int n=vao.nextInt();
        System.out.println("Hay nhap ten trai cay: ");
        vao.nextLine();
        for(int i=0;i<n;i++){
            nhap.add(vao.nextLine());
        }
        return nhap;
    }
    public static void main(String[] args) {
        ArrayList<String> nhap = nhapmang();
        ArrayList<String> nhap2 = new ArrayList<>(nhap);
        System.out.println("Mang dau la: "+nhap);
        System.out.println("Mang copy la: "+nhap2);
    }
}
