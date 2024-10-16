package chapter13;

import java.io.*;

public class InputStreamReaderExample {  
    public static void main(String[] args) {  
        try  {  
            InputStream stream = new FileInputStream("C:\\Users\\Jatin\\Desktop\\Play Posit LCM LeDs.txt");  
            Reader reader = new InputStreamReader(stream);  
            System.out.println("Start input: "); 
            int data = reader.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = reader.read();  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}
