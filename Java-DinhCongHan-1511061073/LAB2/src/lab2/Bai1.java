/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai1 {
     public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.prinln("Nhập hệ số bậc 2, a = ");
        float a = Bai1.scanner.nextFloat();
        System.out.prinln("Nhập hệ số bậc 1, b = ");
        float b = Bai1.scanner.nextFloat();
        System.out.prinln("Nhập hằng số tự do, c = ");
        float c = Bai1.scanner.nextFloat();
        giaiPTBac2(a, b, c);
    }
    
    public static void giaiPTBac2(float a, float b, float c) {

        if (a == 0) 
        {
            if (b == 0) 
            {
                System.out.println("Phương trình vô nghiệm!");
            }
            else 
            {
                System.out.println("Phương trình có một nghiệm: "+ "x = " + (-c / b));//sua cho nay
            }
            return;
        }

        float delta = b*b - 4*a*c;//sua cho nay
        float x1;
        float x2;
        
        if (delta > 0) 
        {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: " + "\n x1 = " + x1 + " và x2 = " + x2);
        } 
        else if (delta == 0) 
        {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "+ "x1 = x2 = " + x1);
        } 
        else 
        {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}

