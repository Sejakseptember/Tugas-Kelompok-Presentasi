/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package program;

import java.io.*;
import java.util.Scanner;

public class txtRW {
    public void read(){
        Scanner scanner = new Scanner(System.in);
        String line = null;
        String path;
        try {
            System.out.println("Masukkan Path file : ");
            path = scanner.nextLine();
//            FileReader fileReader = new FileReader("Z:/Untitled12.txt");
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            bufferedReader.close();
        }catch (FileNotFoundException e){
            System.out.println("Cant open file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void write(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Masukkan Path File = ");
            String path = in.readLine();
//            FileWriter fileWriter = new FileWriter("Z:/opt.txt");
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("Masukkan Kata ");
            String word = in.readLine();
            bufferedWriter.write(word);
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("Error Writing file");
            e.printStackTrace();
        }
    }
}

