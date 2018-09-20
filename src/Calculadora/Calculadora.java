import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class Calculadora {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        double numx = 0;
        double numz = 0 ;
        int residuo = 0;
        bw.write("Escriba el signo" + " de la operacion:"+"\n");
        bw.write("+ sumar"+"\n");
        bw.write("- restar"+"\n");
        bw.write("* multiplicar"+"\n");
        bw.write("/ dividir"+"\n");
        bw.write("p potencia"+"\n");
        bw.write("r raiz cuadrada"+"\n");
        bw.write("% residuo division"+"\n");
        bw.flush();
        char opcion =br.readLine().charAt(0);
        
        switch(opcion)
        {
            case '+':
                bw.write("Digite el valor de numx"+"\n");
                bw.flush();
                numx = Integer.parseInt(br.readLine());
                bw.write("Digite el valor de numz"+"\n");
                bw.flush();
                numz = Integer.parseInt(br.readLine());
                bw.write("El resultado es :"+(numx+numz)+"\n");
                bw.flush();
                break;
            case '-':
                bw.write("Digite el valor de numx"+"\n");
                bw.flush();
                numx = Integer.parseInt(br.readLine());
                bw.write("Digite el valor de numz"+"\n");
                bw.flush();
                numz = Integer.parseInt(br.readLine());
                bw.write("El resultado es :"+(numx-numz)+"\n");
                bw.flush();
                break;    
            case '*':
                bw.write("Digite el valor de xa"+"\n");
                bw.flush();
                int x1 = Integer.parseInt(br.readLine());
                bw.write("Digite el valor de xb"+"\n");
                bw.flush();
                int x2 = Integer.parseInt(br.readLine());
                int resul1=multi(x1,x2);
                bw.write("El resultado es :"+(resul1)+"\n");
                bw.flush();
                break;    
            case '/':
                bw.write("Digite el valor de numx"+"\n");
                bw.flush();
                numx = Integer.parseInt(br.readLine());
                bw.write("Digite el valor de numz"+"\n");
                bw.flush();
                numz = Integer.parseInt(br.readLine());
                bw.write("El resultado es :"+(numx/numz)+"\n");
                bw.flush();
                break; 
            case 'p':
                bw.write("Digite el valor de xa"+"\n");
                bw.flush();
                int x3 = Integer.parseInt(br.readLine());
                bw.write("Digite el valor de xb"+"\n");
                bw.flush();
                int x4 = Integer.parseInt(br.readLine());
                int resul2=poten(x3,x4);
                bw.write("El resultado es :"+(resul2)+"\n");
                bw.flush();
                break;    
            case 'r':
                bw.write("Digite el valor de numx"+"\n");
                bw.flush();
                numx = Integer.parseInt(br.readLine());
                double resul=Math.sqrt(numx);
                bw.write("El resultado es :"+ resul+"\n");
                bw.flush();
                break;        
            case '%':
                bw.write("Digite el valor del divisor"+"\n");
                bw.flush();
                numx = Integer.parseInt(br.readLine());
                bw.write("Digite el valor del dividendo"+"\n");
                bw.flush();
                numz = Integer.parseInt(br.readLine());
                residuo=(int) (numz%numx);
                bw.write("El resultado es :"+ residuo+"\n");
                bw.flush();
                break;                             
                    }  
    }
        public static int multi(int xa,int xb){
        int res;
        if(xb==1){
            return xa;
        }
        else{
            res=xa+multi(xa,xb-1);
        }
        return res;
    }
	 public static int poten(int t,int t1){
        int res;
        if(t1==1){
            return t;
        }
        else{
            res=t*poten(t,t1-1);
        }
        return res;
    }
}