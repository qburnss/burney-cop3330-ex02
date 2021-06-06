/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        System.out.println("What is the input string?");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int amount = 0;

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                amount++;
        }

        System.out.println(string +" has " + amount + " characters.");
    }
}

