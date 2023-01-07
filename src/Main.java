import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, yas, ucus_tipi;
        double brut, net;
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Lütfen Gidilecek Mesafeyi 'Km' Cinsinden Giriniz: ");
        mesafe = input.nextInt();
        System.out.println("-----------------------------------------------------------------------");
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = input.nextInt();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Tek Yön Gidiş: 1\nÇift Yön Gidiş-Geliş: 2");
        System.out.print("Bilet Türünüzü Yukarıda Belirtilmiş Şekilde Giriniz: ");
        ucus_tipi = input.nextInt();
        System.out.println("-----------------------------------------------------------------------");
        if ((mesafe <= 0) || (yas <= 0))
        {
            System.out.println("Hatalı Giriş Yaptınız.");
        } else {
            brut = mesafe * 0.10;
            if (yas < 12) {
                net = brut - (brut * 0.50);
            } else if ((yas > 12) && (yas < 24)) {
                net = brut - (brut * 0.10);
            } else if (yas > 65) {
                net = brut - (brut * 0.30);
            } else {
                net = brut;
            }
            switch (ucus_tipi) {
                case 1:
                    net = net;
                    break;
                case 2:
                    net = (net - (net * 0.20)) * 2;
                    break;
                default:
                    System.out.println("Hatalı Giriş Yaptınız.");
            }
            System.out.println("BİLET BİLGİLERİNİZ");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Gidilecek Mesafe= " + mesafe);
            System.out.println("Yaşınız= " + yas);
            System.out.println("Bilet Türünüz= " + ucus_tipi);
            System.out.println("Fiyat= " + net);


        }
    }
}