package stringWordAndLetterSortPKG;

// This program sort a given string by its words and letters within words

import java.util.Scanner;             // Imported Scanner Utility
import java.util.Arrays;              // Imported Arrays Utility

public class StringWordAndLetterSort {                     // class declared and defined

	public static void main(String []args){                        // main method implemented
        
        Scanner input = new Scanner(System.in);             //Creating Scanner class object
        
        System.out.println("Enter the String you want to sort :");         // Printing info
        
        // String str = "india is a great country!";
        
        String str = input.nextLine();
        
        String upperStr = str.toUpperCase();             // Converting input data to upper case
        
       System.out.println();                               // prnting a blank line
       System.out.println("String Sort Based On The Words - Before: ");  // Printing the info
       System.out.println();                               // prnting a blank line
        System.out.println("   "+upperStr);  // Printing the info
        System.out.println();                               // prnting a blank line
       
       String[] strArray = upperStr.split(" ");               // spliting the input data based on the space
       
       Arrays.sort(strArray);                                   // sorting splitted array
       
       System.out.println("String Sort Based On The Words - After: ");           // printing info
        System.out.println();                               // prnting a blank line
       
       for(String s: strArray)                             // for-each loop to print the sortec input data
       {
        System.out.println("   " +s);                                // printing info
       }
       
        System.out.println();                               // prnting a blank line
        System.out.println("String Word Sort Based On The Letters - After: ");           // printing info
        System.out.println();                               // prnting a blank line
        
        for(String s: strArray)                        // for-each loop to sort the word based on the letter and to print the same  
       {
         char[] charArray = s.toCharArray();                   // converting a string into an charArray
         Arrays.sort(charArray);                              // sorting a word based on the letters
         String sortedString = new String(charArray);         // converting a charArray to string
         System.out.println("   " +sortedString);              // printing sorted word
       }
        
        input.close();                                        // closed a scanner
	}

}
