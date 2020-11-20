/* Write a Java program to input a sentence and find the following abbreviations (Consider input: Netaji Subhas Chandra Bose):

NSCB​

N.S.C. Bose

Bose N. S. C.

Netaji Bose

N B

N.B.

ijateN sahbuS ardnahC esoB

Bose Chandra Subhas Netaji */

import java.util.*;

class Abbreviation{
	
	public void isPresent(String str){
		String word = "";
		String str1[] = new String[50];
		int pos=0;
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) != ' ')
				word = word + str.charAt(i);
			
			else{
				str1[pos] = word;
				pos++;
				word = "";
			}
		}
		
		for(int i=0; i< pos; i++){
				System.out.print(str1[i].charAt(0));							// NSCB
		}
		
		System.out.println();
		
		for(int i=0; i< pos-1; i++){
				System.out.print(str1[i].charAt(0) + ".");						// N.S.C. Bose
		}
		System.out.println(str1[pos-1] + " " );
		
		System.out.print(str1[pos-1] + " " );
			for(int i=0; i< pos-1; i++){
				System.out.print(str1[i].charAt(0) + ".");						// Bose N.S.C.
		}
		System.out.println();
		
		System.out.println(str1[0] + " "+str1[pos-1]);              			// Netaji Bose
		
		System.out.println(str1[0].charAt(0) + " "+str1[pos-1].charAt(0)); 		// N B
		
		System.out.println(str1[0].charAt(0) + "."+str1[pos-1].charAt(0)+"."); 	//N.B.
		
			
		for(int i=0; i< pos; i++){	
			for(int j=str1[i].length()-1; j>=0;j--){
				System.out.print(str1[i].charAt(j));							// ijateN sahbuS ardnahC esoB
			}
			System.out.print(" ");
		}
		System.out.println();
		
		for(int i=pos-1; i>= 0; i--){
			System.out.print(str1[i] +" ");										// Bose Chandra Subhas Netaji
		}
		
	}
	
}

public class StringTest7  {

	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String str = sc.nextLine();
		Abbreviation ab = new Abbreviation();
        str = str + " ";
		
		System.out.println("\nAbbreviations are: \n_____________________________________________________________");
		ab.isPresent(str);
    }
}