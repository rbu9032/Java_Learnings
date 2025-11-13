package com.java.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandling {

    public static void main(String[] args)  {
           FileHandling obj = new FileHandling();
           try
           {
               obj.openFile();

           }catch (FileNotFoundException e){
               System.out.println(e);
           }

    }

    public void openFile() throws FileNotFoundException{
        File file = new File("C:\\CapGemini Training\\DAY-7\\PLL-SQL.txt"); //If the file is found in given path program will, execute if not it will throw FileNotFoundException
        FileInputStream fileInputStream = new FileInputStream(file);
    }
}
