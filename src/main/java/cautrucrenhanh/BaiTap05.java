/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautrucrenhanh;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BaiTap05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sokm;
        double ThanhTien;
        Scanner sc= new Scanner(System.in);
        System.out.println("TINH TIEN TAXI");
        System.out.print("nhap so km:");
        sokm = sc.nextDouble();
        if (sokm== 1){
            ThanhTien = sokm * 15000;
            System.out.println("Thanh tien la:" + ThanhTien);
            
       }else if(sokm>= 2 && sokm<=5){
           ThanhTien = (sokm - 1) * 13500 + 1 * 15000;
            System.out.println("Thanh tien la:" + ThanhTien);
            
       }else if(sokm>= 6 && sokm<=120){
           ThanhTien = ((sokm - 5) * 11000)+ (1 * 15000) +(4 * 13500);
            System.out.println("Thanh tien la:" + ThanhTien);
       }
    }
    
}
