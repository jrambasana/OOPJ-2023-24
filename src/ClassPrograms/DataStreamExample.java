package ClassPrograms;

import java.io.*;  
public class DataStreamExample {  
 public static void main(String args[]){    
  try{    
    FileInputStream fin=new FileInputStream("D:\\01 KU\\03 Even Sem 2024\\OOPJ - Sem 4\\eclipse-workspace\\OOPJ-2023-24\\src\\ClassPrograms\\DataStreamExample.java");    
    FileOutputStream fout=new FileOutputStream("D:\\01 KU\\03 Even Sem 2024\\OOPJ - Sem 4\\eclipse-workspace\\OOPJ-2023-24\\src\\ClassPrograms\\DataStreamExample2.java");    

    int i=0;    
    while((i=fin.read())!=-1){    
        fout.write(i);
        System.out.print((char)i);  
    }    
    fin.close();    
    fout.close();    
    System.out.println("File copied successfully...");    
  }catch(Exception e){System.out.println(e);}    
 }    
}  
