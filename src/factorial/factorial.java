import  java.io.*;

public class factorial {
				//Created by Javier David Hernandez Garcia on September 2018.
				//Date 20/09/18
    
public static int factorial(int x)	//Here the recursion called factorial of type int is created, which contains x which is also of this type
{
if (x>1)	//An int is created where the result of the operation of x 	  
return x* factorial(x-1); //Here the condition is placed that if x is greater than one do the operation
else
return 1; 	//If the condition is not met, the original value is returned
}

public static void main(String[] args) throws IOException 
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
bw.write("Enter a number to get your factorial"+"\n");		//The number to be converted into factorial is entered
bw.flush();
int input;							//A variable called input of type int is created
int iterations=1;						//A variable called iterations of type int is created that has a value of 1
try								//A try catch is created to place an exception
{
for(int i = 0; i<iterations;i++)				//Here a for is created, from which the numbers to multiply
{
    input= Integer.parseInt(br.readLine());			//Here the number put before is read and it is placed in the input variable
    bw.write("The factorial result  " + input + "\t"+"is"+"\n" + factorial (input)+"\n");	 //The number entered previously is printed and then the result of the operation
}
bw.flush();
}
catch(Exception x)
{
    
}


bw.write("Here begins fibonacci"+"\n"); 
bw.write("Enter in limit"+"\n");		//Here you enter the limit where the fibonacci goes
bw.flush();
int lim=Integer.parseInt(br.readLine());	//The limit previously set as an int is read
int y = 0;					//A variable called "y" is created as an int that starts at 0
int z = 1;					//A variable called "z" is created as an int that starts at 1
int aux;					//A variable named aux of type int is created that will take the value of "y"

while(z + y <= lim){				//A conditional is created that, while the sum of "z + y" is less than or equal to the lim, make the operations that follow
            aux = y;				//The variable of aux, takes the number that contains "y	"
            y= z;				//The variable "y" will take the number that contains z
            z = aux + y;			//Then "z" takes the result of the operation between aux and "y"
            bw.write(z+"\n");			//Here the result of z is printed
            bw.flush();
}
        bw.write("Here begins the pascal triangle"+"\n"); 
        int floors=0;				//A variable called floors of type int is created
        int[]x=new int[1];			//You create an array of type int called x that will contain the number one
        bw.write("Number of floors"+"\n");	//Here you enter the number of floors you want for the triangle
        bw.flush();
        floors = Integer.parseInt(br.readLine());	//The number of floors previously mentioned is read
        for(int i=1;i<=floors;i++){			 // A cycle is created that will print the floors
            int[] trian = new int[i];		 	//An arrangement called trian is created that will contain the number of floors that the variable "i" has		
            for(int a=0;a<i;a++){		 	//A cycle is created that prints the sides of the trian
                if(a==0 || a==(i-1)){		 	//Here the trian is printed when a is equal to 1
                    trian[a]=1;
                }else{				 	//Here if the above is not fulfilled, do the operations to place the corresponding numbers in each row
                    trian[a]=x[a]+x[a-1];
                }
                bw.write("["+trian[a]+"]");      	//The finished triangle is printed here
                bw.flush();
            }
            x=trian;				//Here the triangle is printed when it equals one
            bw.write(""+"\n");
            bw.flush();
        }
}
}
