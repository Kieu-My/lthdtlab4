import java.util.Scanner;

public class GiaoDich{
    Private String maGiaoDich, ngayGiaoDich;
    Private long donGia;
    Prinvate float dienTich;
    Scanner scanner = new Scanner(System.in);
    public GiaoDich(){
        super();
    }
    public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich){
        super();
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getmaGiaoDich(){
        return maGiaoDich;
    }
    public void SetMaGiaoDich(String maGiaoDich){
        this.maGiaoDich = maGiaoDich;
    }

    public String getngayGiaoDich(){
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(){
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public long getDoGia(){
        return donGia;
    }
    public void setdonGia(long donGia){
        this.donGia = donGia;
    }
    public float getDienTich(){
        return dienTich;
    }
    public void setDienTich(float dienTich){
        this.dienTich = dienTich;
    }
    public void nhap(){
        System.out.print("nhap ma giao dich: ");
        maGiaoDich = Scanner.nextLine();
        System.out.print("nhap ngay giao dich (ngay/thang/nam): ");
        ngayGiaoDich = Scanner.nextLine();
        System.out.print("nhap don gia: ");
        donGia = Scanner.nextLine();
        System.out.print("nhap dien tich: ")
        dienTich = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public String toString(){
        return "MaGiaoDich:" + this.maGiaoDich + "NgayGiaoDich: " + this.ngayGiaoDich + "donGia: " + this.donGia + 

    }


}