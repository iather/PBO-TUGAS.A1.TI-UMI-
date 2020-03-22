/*  
	Name 	: Andi Muhammad Ridhal Alfaridzi
	Stambuk : 13020180005
	Class 	: A1 Engineering Informatic
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class BacaString{
	public static void main(String[] args ) throws IOException{

	/* Kamus */
	String str;
	BufferedReader datAIn = new BufferedReader (new InputStreamReader(System.in));
	
	/* Program */
	System.out.print("\n ==========>  Apakah Anda benar-benar sayang Ibu? <========== \n");
	System.out.print("\n Jawab Sejujurnya => ");
	str = datAIn.readLine();
	System.out.print("Jawaban Anda : " + str);
	}
}