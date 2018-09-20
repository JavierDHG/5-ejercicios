import  java.io.*;

public class factorial {
    
public static int factorial(int x)
{
if (x>1)
return x* factorial(x-1);
else
return 1;
}

public static void main(String[] args) throws IOException 
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
bw.write("Ingrese un numero para obtener su factoria"+"\n");
bw.flush();
int input;
int iterations=1;
try
{
for(int i = 0; i<iterations;i++)
{
    input= Integer.parseInt(br.readLine());
    bw.write("El resultado de factorial  " + input + "\t"+"es"+"\n" + factorial (input)+"\n");
}
bw.flush();
}
catch(Exception x)
{
    
}


bw.write("Aqui empieza fibonacci"+"\n");
bw.write("Ingrese en limite"+"\n");
bw.flush();
int lim=Integer.parseInt(br.readLine());
int y = 0;
int z = 1;
int aux;

while(z + y <= lim){
            aux = y;
            y= z;
            z = aux + y;
            bw.write(z+"\n");
            bw.flush();
}
        bw.write("Aqui empieza el triangulo de pascal"+"\n");
        int pisos=0;
        int[]x=new int[1];
        bw.write("Cantidad de pisos"+"\n");
        bw.flush();
        pisos = Integer.parseInt(br.readLine());
        for(int i=1;i<=pisos;i++){
            int[] trian = new int[i];
            for(int a=0;a<i;a++){
                if(a==0 || a==(i-1)){
                    trian[a]=1;
                }else{
                    trian[a]=x[a]+x[a-1];
                }
                bw.write("["+trian[a]+"]");
                bw.flush();
            }
            x=trian;
            bw.write(""+"\n");
            bw.flush();
        }
}
}