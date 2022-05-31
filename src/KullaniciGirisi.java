import javax.swing.*;
import java.util.Scanner;


public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, nwPass;


        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();
        System.out.print("Şifreniz:");
        password = input.nextLine();

        if ((userName.equals("patika")) && password.equals("java123")) {
            System.out.print("Başarıyla Giriş Yaptınız!");
        } else {
            System.out.print("Bilgileriniz Hatalıdır!");
        }

        System.out.print("Şifrenizi Sıfırlamak İstiyorsanız 1'i İstemiyorsanız 2'yi Seçiniz:");
        int reply = input.nextInt();
        input.nextLine();

        switch (reply) {
            case 1:
                System.out.print("Yeni Bir Parola Giriniz: ");
                nwPass = input.nextLine();

                if (nwPass.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz. ");
                } else {
                    System.out.print("Şifre oluşturuldu.");
                    System.out.print("Yeni Parolanız: " + nwPass);
                }

                break;
            case 2:
                System.out.print("Parolanızı Sıfırlanmak istemediniz.");
                break;
            default:
                System.out.println("Lütfen '1' veya '2' değerlerinden birini giriniz.");


        }


    }
}









