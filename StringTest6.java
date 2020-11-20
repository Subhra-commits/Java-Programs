//Write a Java program to input a sentence and find if a given pattern is present in the sentence or not.

import java.util.*;

public class StringTest6  {

	public static boolean isPresent(String p, String str){
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
		
		for(int j=0; j< pos; j++){
			if(str1[j].equalsIgnoreCase(p)){
				System.out.print(" At position "+(j+1));
				return true;
				
			}
			
		}
		return false;
	}
	


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String str = sc.nextLine();
		
        System.out.print("\nEnter the pattern to be searched: ");
		String patt = sc.next();
		str = str + " ";
		if(isPresent(patt,str))
			System.out.println(", entered pattern is present.");
		
		else
			System.out.println("Entered pattern is not present.");
    }
}