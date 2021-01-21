package com.jasonImut;

import java.util.*;

public class Main2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Masukkan ciphertext : ");
        String ciphertext = sc.nextLine();
        System.out.println(" Jumlah Shift ( value ) : ");
        int shift = sc.nextInt();
        String decryptMessage = "";
        for(int i=0; i < ciphertext.length();i++)

        {
            // ambil satu huruf (looping)
            char alphabet = ciphertext.charAt(i);
            // a-z non-kapital
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alpabet
                alphabet = (char) (alphabet - shift);

                // jika kurang dari a
                if(alphabet < 'a') {
                    //reshift
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            // A-Z Kapital
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
                // shift alphabet
                alphabet = (char) (alphabet - shift);

                //jika kurang dari 'A'
                if (alphabet < 'A') {
                    // reshift
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else
            {
                decryptMessage = decryptMessage + alphabet;
            }
        }
        System.out.println(" decrypt message : " + decryptMessage);
    }
}
