package com.jasonImut;

import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Masukkan Plaintext : ");
        String plaintext = sc.nextLine();
        System.out.println(" Jumlah Shift ( value ) : ");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < plaintext.length();i++)
        {
            // ambil huruf
            alphabet = plaintext.charAt(i);

            // a-z non kapital
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alphabet
                alphabet = (char) (alphabet + shift);
                // jika lebih besar dari z
                if(alphabet > 'z') {
                    // algoritma
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }

            // A-Z Kapital
            else if(alphabet >= 'A' && alphabet <= 'Z') {
                // shift alphabet
                alphabet = (char) (alphabet + shift);

                // jika lebih besar dari Z
                if(alphabet > 'Z') {
                    //reshift
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else {
                ciphertext = ciphertext + alphabet;
            }

        }
        System.out.println(" ciphertext : " + ciphertext);
    }
}