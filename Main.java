package com.itfactory;
import java.util.Scanner;
public class Main {




        public static void main(String[] args) {
            System.out.println("Introduceti numele persoanei: ");
            Scanner scanner = new Scanner(System.in);
            String numeIntrodus = scanner.nextLine();

            System.out.println("Introduceti varsta persoanei: ");
            int varstaIntrodusa = Integer.parseInt(scanner.nextLine());

            if (varstaIntrodusa<18){
                EnumMinorMajor sub18 = EnumMinorMajor.MINOR;
                System.out.println("ATENTIE! Persoane este: " + sub18);
            }else{
                EnumMinorMajor peste18 = EnumMinorMajor.MAJOR;
                System.out.println("Persoana este: " + peste18);
            }
        }
    }


