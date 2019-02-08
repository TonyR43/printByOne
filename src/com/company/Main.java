package com.company;

public class Main
    {
        
        public static void main(String[] args)
            {
                int num = 1;
                
                System.out.println("Count up from 1.");
                
                while (num <= 10)
                {
                    System.out.println(num ++);
                }
                
                num = 10;
                
                System.out.println("\nCount down from 10." );
                
                while (num >= 1)
                {
                    System.out.println(num --);
                }
                
            }
    }