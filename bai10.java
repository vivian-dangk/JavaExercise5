
package DangKhaiVy_30209244459;
import java.util.Scanner;
import java.util.ArrayList;
public class bai10 {
    public static ArrayList<Integer> nhapmang(){
        ArrayList<Integer> nhap = new ArrayList<>();
        Scanner vao = new Scanner(System.in);
        System.out.println("Hay nhap so pahn tu cua mang: ");
        int n = vao.nextInt();
        System.out.println("Hay nhap cac phan tu trong mang: ");
        for(int i=0;i<n;i++){
            nhap.add(vao.nextInt());
        }
        return nhap;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nhap = nhapmang();
        System.out.println("Mang la: "+nhap);
        for(int i=0;i<nhap.size()-1;i++){
            for(int j=i+1;j<nhap.size();j++){
                if(nhap.get(i).equals(nhap.get(j))){
                    nhap.remove(j);
                    j--;
                }
            }
        }
        System.out.println("Mang sau khi xoa la: "+nhap);
    }
}
