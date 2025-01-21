
package DangKhaiVy_30209244459;
import java.util.ArrayList;
import java.util.Random;
public class bai6 {
    public static ArrayList<Integer> nhapmang(){
        ArrayList<Integer> nhap = new ArrayList<>();
        Random vao = new Random();
        for(int i=0;i<15;i++){
            nhap.add(vao.nextInt(50)+1);
        }
        return nhap;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nhap = nhapmang();
        System.out.println("Mang la: "+nhap);
        int demle=0;
        int demchan=0;
        for(int i=0;i<nhap.size();i++){
            if(nhap.get(i)%2==0){
                demchan++;
            }else{
                demle++;
            }
        }
        System.out.println("Mang co "+demchan+" so chan va "+demle+" so le.");
    }
}
