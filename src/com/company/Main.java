package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       try {
        Days days = Days.valueOf(scanner.next());
           switch (days) {
               case DUYSHOMBU -> System.out.println("Дуйшомбу куну жава сабагын окуйм.");
               case SHEISHEMBI -> System.out.println("Шейшемби куну англис тил сабагын окуйм.");
               case SHARSHEMBI -> System.out.println("Шаршемби куну жава сабагын окуйм.");
               case BEYSHEMBI -> System.out.println("Бейшемби куну Софт скилс сабагын окуйм.");
               case JUMA -> System.out.println("Жума куну жава сабагын окуйм.");
               case ISHEMBI -> System.out.println("Ишемби куну дем алыш.");
               case JECKSHEMBI -> System.out.println("Жекшемби куну дем алыш.");
           }
       }catch (Exception a){
           System.out.println("Башка кундор жок!");
       }
        }
    }
