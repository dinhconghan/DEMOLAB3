/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Random;
import java.util.Scanner;
public class Bai2 {
    public static Random rd = new Random();	// khai báo 1 đối tượng Random
	public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {
            do{
                arr[i] = rd.nextInt();
            }while(arr[i]<0);
//            arr[i] = rd.nextInt(5);
            System.out.printf("a[%d] = %d \n", i,arr[i]);
            
        }
        System.out.println("Dãy số là số nguyên tố: ");
        showPrimeNumber(arr);
        
    }
    public static void showPrimeNumber(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) {
                System.out.printf("a[%d] = %d \n", i,arr[i]);
            }
        }
    }
     public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        
        int squareRoot = (int) Math.sqrt(n);
        for (int i =2 ; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
