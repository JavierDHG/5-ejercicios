import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;
public class Calculator {
				//Created by Javier David Hernandez Garcia on September 2018.
				//Date 20/09/18				

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        double numx = 0;
        double numz = 0 ;	//The variables of type double start at 0
        int residue = 0; 	//The variable of type int start at 0	
        bw.write("Write the sign" + " of the operation:"+"\n");	//Here you enter the sign to make the desired operation
        bw.write("+ addiction"+"\n");
        bw.write("- subtract"+"\n");
        bw.write("* multiply"+"\n");
        bw.write("/ divide"+"\n");
        bw.write("p potency"+"\n");
        bw.write("r square root"+"\n");
        bw.write("% division waste"+"\n");
        bw.flush();
        char option =br.readLine().charAt(0);	//The sign placed previously is read
        
        switch(option)		//A switch is created that, depending on the sign placed, makes its operation
        {
            case '+':
                bw.write("Enter the value of numx"+"\n");	//Enter a number for the numx variable
                bw.flush();
                numx = Integer.parseInt(br.readLine());	//The number put in the previous variable is read
                bw.write("Enter the value of numz"+"\n");	//Enter a number for the numz variable
                bw.flush();
                numz = Integer.parseInt(br.readLine());	//The number put in the previous variable is read
                bw.write("The result is :"+(numx+numz)+"\n");	//The operation is done and it prints the result of the operation
                bw.flush();
                break;
            case '-':
                bw.write("Enter the value of numx"+"\n");	//Enter a number for the numx variable
                bw.flush();
                numx = Integer.parseInt(br.readLine());	//The number put in the previous variable is read
                bw.write("Enter the value of numz"+"\n");	//Enter a number for the numz variable
                bw.flush();
                numz = Integer.parseInt(br.readLine());		//The number put in the previous variable is read
                bw.write("The result is :"+(numx-numz)+"\n");	//The operation is done and it prints the result of the operation
                bw.flush();
                break;    
            case '*':
                bw.write("Enter the value of xa"+"\n");		//Enter a number for the xa variable
                bw.flush();
                int x1 = Integer.parseInt(br.readLine());	//The number put in the previous variable is read
                bw.write("Enter the value of xb"+"\n");
                bw.flush();
                int x2 = Integer.parseInt(br.readLine());	//Enter a number for the xb variable
                int resul1=multi(x1,x2);			 //The operation is performed based on the recursion of this operation
                bw.write("The result is :"+(resul1)+"\n");	//The operation is done and it prints the result of the operation
                bw.flush();
                break;    
            case '/':
                bw.write("Enter the value of numx"+"\n");	//Enter a number for the numx variable
                bw.flush();
                numx = Integer.parseInt(br.readLine());		//The number put in the previous variable is read
                bw.write("Enter the value of numz"+"\n");	//Enter a number for the numz variable
                bw.flush();
                numz = Integer.parseInt(br.readLine());		//The number put in the previous variable is read
                bw.write("The result is :"+(numx/numz)+"\n");	//The operation is done and it prints the result of the operation
                bw.flush();
                break; 
            case 'p':
                bw.write("Enter the value of t"+"\n");		//Enter a number for the t variable
                bw.flush();
                int x3 = Integer.parseInt(br.readLine());	//The number put in the previous variable is read
                bw.write("Enter the value of t1"+"\n");		//Enter a number for the t1 variable
                bw.flush();
                int x4 = Integer.parseInt(br.readLine());	//Enter a number for the xb variable
                int resul2=poten(x3,x4);		 	//The operation is performed based on the recursion of this operation
                bw.write("The result is :"+(resul2)+"\n");	//The operation is done and it prints the result of the operation
                bw.flush();
                break;    
            case 'r':
                bw.write("Enter the value of numx"+"\n");	//Enter a number for the numx variable
                bw.flush();
                numx = Integer.parseInt(br.readLine());		//The number put in the previous variable is read
                double resul=Math.sqrt(numx);	       		//Here the code does the work to get the square root of the previous variable
                bw.write("The result is :"+ resul+"\n");	//The operation is done and it prints the result of the operation
                bw.flush();
                break;        
            case '%':
                bw.write("Enter the value of the divider"+"\n");	//Enter a number for the numx variable
                bw.flush();
                numx = Integer.parseInt(br.readLine());	 	//The number put in the previous variable is read
                bw.write("Enter the value of the dividend"+"\n");	//Enter a number for the numz variable
                bw.flush();
                numz = Integer.parseInt(br.readLine());		//Enter a number for the numz variable
                residue=(int) (numz%numx);		 	//The operation of the division is made and only the residue of this is taken
                bw.write("The result is :"+ residue+"\n");      //The operation is done and it prints the result of the operation
                bw.flush();
                break;                             
                    }  
    }
        public static int multi(int xa,int xb){			//An int called multi is created that contains xa and xb that are int	
        int res;						//An int is created where the result of the operation of xa and xb is saved
        if(xb==1){						//When the condition of xb is true, we return the value of xa
            return xa;
        }
        else{							//When the condition is not met, it will do the operation to find the result
            res=xa+multi(xa,xb-1);
        }
        return res;						//Here we return the result as a product of the operation done
    }
	 public static int poten(int t,int t1){			//An int called poten is created that contains t and t1 that are int
        int res;						//An int is created where the result of the operation of t and t1 is saved
        if(t1==1){						//When the condition of t1 is true, we return the value of xa
            return t;		
        }
        else{							//When the condition is not met, it will do the operation to find the result
            res=t*poten(t,t1-1);
        }
        return res;						//Here we return the result as a product of the operation done
    }
}
