/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Bai3 {
    public static Random rd = new Random();	

    public static void main(String[] args) {
        System.out.print("Nhập số dòng của mảng: ");
        int m = Bai1.x.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int n = Bai1.x.nextInt();
        int arr[][] = new int [m][n];
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
            do{
                arr[i][j] = rd.nextInt(51);
            }while(arr[i][j]<0);
//            arr[i] = rd.nextInt(5);
            System.out.printf("a[%d][%d] = %d \n", i,j,arr[i][j]);
            
            }
        }
        System.out.println("Dãy số: ");
         for (int i = 0; i < m; i++) {
             
            for (int j = 0; j < n; j++) {
//            System.out.printf("a[%d][%d] = %d  ", i,j,arr[i][j]);
              System.out.printf(" %d \t", arr[i][j]);
            }
            System.out.println();
        }
        int tong=0;
        System.out.print("Nhập số dòng của mảng cần tính Tổng: ");
        int k = Bai1.x.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
                { 
                    if(i==k)
                    {
                        tong=tong+arr[i][j];
                    }
                }
            
            
        }
        System.out.println("Tong:"+ tong);
    }
}
