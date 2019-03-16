/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author Administrator
 */
public class Bai9 {
    public static void main(String[] args) throws IOException {
    
        
             FileOutputStream fos = new FileOutputStream("d:/abc.txt");
             String s="Chao cac ban";
             for(int i =0;i<s.length();i++)
                fos.write(s.charAt(i));
                
            FileInputStream fis= new FileInputStream("d:/abc.txt");
            int ibyts = fis.available();
            System.out.println("File co tat ca "+ibyts+" ky tu");
            byte ibuf[]= new byte[ibyts];
            int byrd = fis.read(ibuf,0,ibyts);
            System.out.println("Tong so ky tu doc duoc la:"+byrd);
            System.out.println("Chuoi ky tu la "+new String(ibuf));
        
        File f1 = new File("d:/abc.txt");
        f1.delete();
    }
}
