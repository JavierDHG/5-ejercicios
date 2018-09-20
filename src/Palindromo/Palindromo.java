import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class Palindromo {
 public static void main(String[] args) throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        bw.write("Ingrese la frase"+"\n");
        bw.flush();
        String y=br.readLine();
        bw.write("La palabra al reves es:"+palindromo(y,y.length()-1)+"\n");
        bw.flush();
        if(y.equals(palindromo(y,y.length()-1))){
        bw.write("La palabra"+y+" "+"es palindromo"+"\n");
        bw.flush(); 
        }else {
        bw.write("La palabra"+" "+y+" "+"No es palindromo"+"\n");
        bw.flush(); 
        }
    }
 public static String palindromo(String a,int longitud){
     
     if(longitud==0){
         return a.charAt(longitud)+"";
     }else{
         return a.charAt(longitud) + (palindromo(a,longitud-1));
     }
         

 }
}