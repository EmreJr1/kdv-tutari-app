import java.util.Scanner;
/*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18
        tutar 1000 TL'den büyük ise
        KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

public class Kdv_tutari {
    public static void main(String[] args) {
        double tl , KdvOran ;
        /*kullanıcıdan veri alma kısmı*/
        Scanner input = new Scanner(System.in);
        System.out.print("Para Tutarını Giriniz:");
        tl = input.nextDouble();

        if (tl<=1000){
            KdvOran=0.18;
            double KdvTutar = tl*KdvOran ;
            double KdvliTutar = tl+KdvTutar;
            System.out.println("Kdvli Ücret:"+ KdvliTutar);
        }else {
            KdvOran=0.08;
            double KdvTutar = tl*KdvOran ;
            double KdvliTutar = tl+KdvTutar;
            System.out.println("Kdvli Ücret:"+ KdvliTutar);
        }
}

}



