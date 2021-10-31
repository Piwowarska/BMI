package com.company;

import DataBase.DataBase;
import gui.GUI;
import model.Bmi;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
        DataBase database = new DataBase();

        int idd;
        while (true) {
            GUI.showMenu();

            Scanner reader=new Scanner(System.in);
            String  choose = reader.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("Podaj wagę w kg");
                    double weightt = reader.nextInt();
                    System.out.println("podaj wzrost w m");
                    double heightt = reader.nextDouble();
                    double BMIresult=database.calculateBmi(weightt, heightt);
                    BMIresult=Math.round(BMIresult);
                    System.out.println(BMIresult);
                    int size=database.showSizeBmi();
                    database.addKeyListKey(size);
                    Bmi bmi=database.addBmi(heightt,weightt,size,BMIresult);

                    if(BMIresult<18.5) {
                        System.out.println("Posiadasz niedowage");
                }
                     else if ((18.5 < BMIresult && BMIresult<=24.9)) {
                        System.out.println("Waga prawidłowa");
                    }
                       else if (25<BMIresult && BMIresult<29.9) {
                        System.out.println("Posiadasz nadwagę");
                    }
                        else if(30<BMIresult && BMIresult<34.9) {
                        System.out.println("Posiadasz otyłość I stopnia");
                    }
                        else if (35<BMIresult && BMIresult<39.9) {
                        System.out.println("Posiadasz otyłość II stopnia");
                    }
                        else if (BMIresult>=40) {
                        System.out.println("Posiadasz otyłość III stopnia");
                    }
                    else {
                        System.out.println("Prawidłowa masa ciała");
                    }
                    break;
                case "2":

                    System.out.println("Istniejące numery Id:");
                    database.showQuantityKey();
                    System.out.println("Podaj numer Id");
                    idd= reader.nextInt();
                    boolean numberKey=database.contaisKey(idd);
                    if (!numberKey) {
                        System.out.println("Nie ma takiego Id");
                    } else {
                        database.showMap(idd);
                    }
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nie ma takiego numeru menu!!!");

            }

        }
    }
}