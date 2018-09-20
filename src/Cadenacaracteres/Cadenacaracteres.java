import  java.io.*;
public class Cadenacaracteres {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String cadena;
        char[]palabra;
        char caracter;
        int contador=0;
        int i=0;
        bw.write("Ingrese un mensaje"+"\n");
        bw.flush();
        
        cadena=br.readLine();
        palabra = cadena.toCharArray();
        for( i = 0; i < palabra.length; i++ ){
            caracter=palabra[i];
            for(int a = 0; a < palabra.length; a++ ){
                if(palabra[a]==caracter){
                    contador++;
                }
            }
            contador=0;
        }
        bw.write(palabra[i]+" "+contador+"\n");
        
        bw.flush();

    } 
}

