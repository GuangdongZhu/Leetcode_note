package encryption_algorithm;
import javax.swing.*;
import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class main_code {
    public static void main(String[] args) throws NoSuchAlgorithmException {
//        Scanner s = new Scanner(System.in);
//        String input = s.nextLine();
        String input = "朱广冬";
        System.out.println("plaintext: "+input);
//        s.close();

        byte[] ciphertext;

        byte[] plaintext = input.getBytes();
        md5 md5_algorithm = new md5(plaintext);

        ciphertext = md5_algorithm.getCipher();
//        for (byte bb : ciphertext)
//            System.out.print(bb+" ");
//        System.out.println();
        System.out.println(ciphertext.length);

//        //可以通用
//        char[] ch = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//        StringBuffer sb = new StringBuffer();
//        for (byte b : ciphertext)
//        {
//            sb.append(ch[((b>>4)&15)]);
//            sb.append(ch[b&15]);
//        }
//        System.out.println("ciphertext: "+ s.toString());

    }
}
//A4 CD 2D 07 C8 85 3D 2A 94 D6 91 74 49 3F 47 34
//1079ABB1C76CA6A1FDD73F9B742AC889
//[B@5fa7e7ff
//[B@5fa7e7ff
//-92 -51 45 7 -56 -123 61 42 -108 -42 -111 116 73 63 71 52
//16 121 -85 -79 -57 108 -90 -95 -3 -41 63 -101 116 42 -56 -119