package com.java.filehandling;

import java.io.*;
import java.util.Scanner;

public class ByteStreams {

    public static void main(String[] args) throws FileNotFoundException {

     ByteStreams bs = new ByteStreams();
//     bs.writeIntoFile();
//     bs.writeIntoJpeg();
     bs.openFile();

    }

    public void readFromFile(){
        File file = new File("E:\\Hi Raghav.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            int temp;
            while ((temp=fis.read()) != -1){
                System.out.print((char) temp);
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                fis.close();
            }catch (IOException e){
                System.out.println(e);
            }
        }
    }
    public void writeIntoFile() {
        File file = new File("E:\\Hi Raghav.txt");
        File file2 = new File("E:\\Output Raghav.txt");
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2);
            String data = "Harcoded Data";
            fos.write(data.getBytes());
            int temp;
            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeIntoJpeg() {
        File file = new File("E:\\Raghavendra_Photo.jpeg");
        File file2 = new File("E:\\Raghav.jpeg");
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2);
            String data = "Harcoded Data";
            fos.write(data.getBytes());
            int temp;
            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //try with resources code
    public void openFile() throws FileNotFoundException {
        File file = new File("E:\\Hi Raghav.txt");
        try(FileInputStream fis = new FileInputStream(file); Scanner sc = new Scanner(System.in)){
            try{
                int temp;
                while ((temp=fis.read()) != -1){
                    System.out.print((char) temp);
                }
            }catch (FileNotFoundException e){
                System.out.println(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
