import java.util.Scanner;
public class Eustaquio {
  

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
    
    
    
    

    
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        
        System.out.print("Enter a string in lowercase: ");
        String word= cs.next();
        
        System.out.print("Enter a char to find: ");
        String charac= cs.next();
        
        int result1=finder(word,charac);
        System.out.println("The letter yung are finding is the "+result1+" character in the word");
        
        int result2 = counter(word);
        System.out.println("The count of letter is "+result2);
        
        String result3 = upper(word);
        System.out.println("Uppercase all letters "+result3);
        
       
        
    }
    
}