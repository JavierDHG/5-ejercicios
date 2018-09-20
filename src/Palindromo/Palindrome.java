import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class Palindrome {
 public static void main(String[] args) throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("Enter the phrase"+"\n"); //Here the phrase is entered
        bw.flush();
        String y=br.readLine();		   //The phrase put above is read
        bw.write("The word upside down is:"+palindrome(y,y.length()-1)+"\n"); //Here the word put above is printed
        bw.flush();
        if(y.equals(palindrome(y,y.length()-1))){		//The initial word is compared with the word upside down
        bw.write("The word"+" "+y+" "+"is palindrome"+"\n");    //Here the word is printed when it is palindrome
        bw.flush(); 
        }else {
        bw.write("The word"+" "+y+" "+"It is not palindrome"+"\n"); //If the condition above is not met, then it is not palindrome
        bw.flush(); 
        }
    }
 public static String palindrome(String a,int length){ 		//A variable of type string is created that contains a variable of type string called a and another variable of type int called length
     
     if(length==0){						//If the length is equal to 0, it returns the initial word
         return a.charAt(length)+"";
     }else{
         return a.charAt(length) + (palindrome(a,length-1));	//Here the operation is done to put the word upside down
     }
         

 }
}