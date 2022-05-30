import javax.swing.*;
import java.util.Scanner;


public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, nwPass;
        int reply;


        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();
        System.out.print("Şifreniz:");
        password = input.nextLine();

        if ((userName.equals("patika")) && password.equals("java123")) {
            System.out.print("Başarıyla Giriş Yaptınız!");
        } else {
            System.out.print("Bilgileriniz Hatalıdır! Şifrenizi sıfırlamak ister misiniz? Evet için 1'e Hayır için 2'ye basınız.:");
        }
        reply = input.nextInt();

        switch (reply){
            case 1:
            System.out.println("Yeni Şifrenizi Giriniz:");
            nwPass = input.nextLine();
            if (nwPass.equals("java123")){
                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            } else {
                System.out.println("Şifre oluşturuldu");
            } break;

        }


    }


}










