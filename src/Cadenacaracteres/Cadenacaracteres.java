import  java.io.*;
public class Cadenacaracteres {
				//Created by Javier David Hernandez Garcia on September 2018.
				//Date 20/09/18
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String chain;	//Here the string is initialized as string type
        char[]word;	//An arrangement called word is created
        char character;	//The variable of type char called character starts
        int accountant=0;	//The accountant is initialized as an int and its initial state is set to 0
        int i=0;	//The int i is initialized to 0
        bw.write("Enter a message"+"\n");	//Here the message is placed
        bw.flush();
        
        chain=br.readLine();	//Here we read the message we wrote above
       	word = chain.toCharArray();	//The word is saved in our word arrangement and is changed to carater
        for( i = 0; i < word.length; i++ ){	//A for is created so that the int i goes through our message
            character=word[i];//Here the position of the letters is saved
            for(int a = 0; a < word.length; a++ ){ 	//Here the position of the letters is saved with another 
		 if(word[a]==character){           	//int to compare them and know if they are equal
                    accountant++;		   	//The counter adds up the number of words that you find but that are equal
                }
            }
        bw.write(word[i]+" "+accountant+"\n");	   	//Here the result is already printed with the number of letters of the word entered
        accountant=0;
        bw.flush();
        }
    } 
}

