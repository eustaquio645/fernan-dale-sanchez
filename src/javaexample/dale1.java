/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

/**
 *
 * @author stmaderz
 */
import java.util.Scanner;
public class dale1 {
 
 //eustquio, Gracelyn
    static int finder(String word1,String charac1){
        //for finding the char
        int Index = word1.indexOf(charac1); 
        int letter= Index+1;
        
        
        return letter;
         
    }
    
    static int counter(String word1){
		//counting for how many char are in the user input
        int count=0;
          for(int i = 0; i < word1.length(); i++) {    
            if(word1.charAt(i) != ' ')    
                count++;    
        } 
          return count;
    }
    
    static String upper(String word1){
		//use to uppercase the user input
        String result = word1.toUpperCase();
        
        return result;
    }
 

    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        //User will be asked to enter the count of strings 
        System.out.print("Enter number of strings you would like to enter:");
        count = scan.nextInt();
        
        
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        
        //User is entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        
        //Sorting the strings
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
     
     System.out.print("Enter a string in lowercase: ");
        String word= scan.next();
        
        System.out.print("Enter a char to find: ");
        String charac= scan.next();
        
        int result1=finder(word,charac);
        System.out.println("The letter yung are finding is the "+result1+" character in the word");
        
        int result2 = counter(word);
        System.out.println("The count of letter is "+result2);
        
        String result3 = upper(word);
        System.out.println("Uppercase all letters "+result3);
        
        
    }
}

