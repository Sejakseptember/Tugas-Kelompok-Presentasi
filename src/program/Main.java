package program;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void menuA(){
        int input;
        do{
        Scanner in = new Scanner(System.in);
        txtRW txtRW = new txtRW();
        System.out.println("--------");
        System.out.println("1. Read");
        System.out.println("2. Write");
        System.out.println("3. Main Menu");
        System.out.print("Pilih : ");
        input = in.nextInt();
        switch (input) {
            case 1:
                txtRW.read();
                break;
            case 2:
                txtRW.write();
                break;
            case 3:
                break;
            }
        }while (input!=3);
    }
    public static void main(String[] args) throws IOException {
        while (true) {
            ScnBfr ScnBfr = new ScnBfr();
            RetriveData RetriveData = new RetriveData();
            int input;
            Scanner in = new Scanner(System.in);
            System.out.println("----------");
            System.out.println("1. BufferedInputStream dan InputStream");
            System.out.println("2. Retrieve data from web");
            System.out.println("3. Read and Write .txt File");
            System.out.println("4. Keluar");
            System.out.print("Masukkan Pilihan : ");
            input = in.nextInt();
            switch (input){
                case 1:
                    ScnBfr.io();
                    break;
                case 2:
                    RetriveData.web();
                    break;
                case 3:
                    menuA();
                    break;
                case 4:
                    System.exit(0);
            }
        }
       }
}
