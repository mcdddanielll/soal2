/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas2;

import java.util.Scanner;

/**
 *
 * @author Danielrorrrrr
 */
public class Tugas2 {

    public static void main(String[] args) {
        Scanner inputan = new Scanner (System.in);
        
          double volumetabung, jarijariTB, tinggiTB;
        double PHI = 22/7;
        System.out.println("Masukkan jari jari tabung  :");
        jarijariTB = inputan.nextDouble ();
        System.out.println("masukkan tinggi tabung  :");
        tinggiTB = inputan.nextDouble ();
        volumetabung = PHI*jarijariTB*jarijariTB*tinggiTB;
        System.out.println("hasilnya adalah : " + volumetabung);
       
    }
    
}