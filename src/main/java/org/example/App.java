package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 1 Solution
 *  Copyright 2021 Patrick Mac
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner x = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name = x.nextLine();

        String s = "Hello, "+name+", nice to meet you!";

        System.out.println(s);
    }
}
