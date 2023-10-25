import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DSKH {
    KhachHang[] a;
    int n;

    Scanner sc = new Scanner(System.in);

    public DSKH(){

    }

    public DSKH(KhachHang[] a, int n){
        this.a=a;
        this.n=n;
    }

    public void nhap(){
        System.out.print("Nhap n khach hang dau tien: ");
        n = sc.nextInt();
        sc.nextLine();
        a = new KhachHang[n];
        for(int i = 0; i < n; i++){
            a[i]= new KhachHang();
            a[i].nhap();
        }
    }

    public void xuat() {
        n = a.length;
        System.out.println("Danh sach cac khach hang: ");
        for(int i = 0; i < n; i++) {
            a[i].xuat();
        }
    }

    public void them() {
        n = a.length;
        a = Arrays.copyOf(a, n + 1);
        a[n] = new KhachHang();
        System.out.println("Nhap thong tin khach hang can them: ");
        a[n].nhap();
        n++;
    }

    public void them(KhachHang x){
        n = a.length;
        a = Arrays.copyOf(a, n + 1);
        a[n] = new KhachHang(x);
        n++;
    }
    
    public void sua(){
        System.out.print("Nhap ma khach hang can duoc sua: ");
        String id = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMa().equals(id)) {
                isExisted = true;
                System.out.print("Ma khach hang duoc sua thanh: ");
                String ma = sc.nextLine();
                a[i].setMa(ma);
                System.out.print("Ho duoc sua thanh: ");
                String ho = sc.nextLine();
                a[i].setHo(ho);
                System.out.print("Ten duoc sua thanh: ");
                String ten = sc.nextLine();
                a[i].setTen(ten);
                System.out.print("Gioi tinh duoc sua thanh: ");
                String phai = sc.nextLine();
                a[i].setPhai(phai);
                System.out.print("Ngay sinh duoc sua thanh: ");
                String ngaysinh=sc.nextLine();
                a[i].setNgaysinh(ngaysinh);
                break;
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma khach hang!");
    }

    public void sua(String id) {
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMa().equals(id)) {
                isExisted = true;
                System.out.print("Ma khach hang duoc sua thanh: ");
                String ma = sc.nextLine();
                a[i].setMa(ma);
                System.out.print("Ho duoc sua thanh: ");
                String ho = sc.nextLine();
                a[i].setHo(ho);
                System.out.print("Ten duoc sua thanh: ");
                String ten = sc.nextLine();
                a[i].setTen(ten);
                System.out.print("Gioi tinh duoc sua thanh: ");
                String phai=sc.nextLine();
                a[i].setPhai(phai);
                System.out.print("Ngay sinh duoc sua thanh: ");
                String ngaysinh=sc.nextLine();
                a[i].setNgaysinh(ngaysinh);
                break;
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma khach hang!");
    }
    
    public void timkiem(){
        System.out.print("Nhap ma khach hang muon tim: ");
        String ma = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if(a[i].getMa().equals(ma)) {
                isExisted = true;
                System.out.println("Thong tin khach hang can tim: ");
                a[i].xuat();
                break;
            }
        }
        if(!isExisted) 
            System.out.println("Khong tim thay ma khach hang!");
    }
    
    public int timkiemma(String ma){
        n = a.length;
        int vitri = -1;
        for (int i = 0; i < n; i++) {
            if(a[i].getMa().equals(ma)) {
                vitri = i;
                break;
            }
        }
        return vitri;
    }
    
    public KhachHang timkiem(String ma){
        n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i].getMa().equals(ma)) {
                return a[i];
            }
        }  
        return null;
    }
    
    public void timkiemho(){
        System.out.print("Nhap ho khach hang muon tim: ");
        String ho = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getHo().contains(ho)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong co khach hang nao mang ho "+ho+"!");
    }

    public void timkiemho(String ho){
        boolean isExisted = false;
        n = a.length;
        for(int i = 0; i < n; i++) {
            if (a[i].getHo().contains(ho)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if(!isExisted) 
            System.out.println("Khong co khach hang nao mang ho "+ho+"!");
    }
    public void timkiemten(){
        System.out.print("Nhap ten khach hang muon tim: ");
        String ten = sc.nextLine();
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i].getTen().contains(ten)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if (!isExisted) 
            System.out.println("Khong co khach hang nao mang ho "+ten+"!");
    }
    public void timkiemten(String ten){
        boolean isExisted = false;
        n = a.length;
        for (int i = 0; i <n ; i++) {
            if (a[i].getTen().contains(ten)) {
                isExisted = true;
                a[i].xuat();
            }
        }
        if (!isExisted) 
            System.out.println("Khong co khach hang nao mang ho "+ten+"!");
    }

    public void xoa(){
        System.out.print("Nhap ma khach hang muon xoa: ");
        String id = sc.nextLine();
        n = a.length;
        int vitri = timkiemma(id);
        if(vitri == -1) 
            System.out.println("Khong tim thay ma khach hang!");
        else {
            a = Arrays.copyOf(a, n + 2);
            for(int i = vitri; i < n; i++) {
                a[i] = a[i + 1];
            }
            a = Arrays.copyOf(a, n - 1);
            n--;
        }
    }
    
    public void xoa(String id){
        n = a.length;
        int vitri = timkiemma(id);
        if(vitri == -1) 
            System.out.println("Khong tim thay ma khach hang!");
        else {
            a = Arrays.copyOf(a, n + 2);
            for(int i = vitri; i < n; i++) {
                a[i] = a[i + 1];
            }
            a = Arrays.copyOf(a, n - 1);
            n--;
        }
    }

    public void thongketuoi(){
        Map < Integer, Integer> count = new HashMap<>();
        n = a.length;
        for(int i = 0; i < n; i++){
            if(count.containsKey(a[i].getTuoi())) count.put(a[i].getTuoi(), count.get(a[i].getTuoi()) + 1);
            else count.put(a[i].getTuoi(), 1);
        }
        System.out.println("Bang thong ke tuoi cua khach hang: ");
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
