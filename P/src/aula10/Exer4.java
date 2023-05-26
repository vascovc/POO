package aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exer4 {
	
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new FileReader("words.txt"));
		ArrayList<String> str = new ArrayList<String>();
		
		while (input.hasNext()) {
			String word = input.next();
			//System.out.println(word);
			if(word.length() > 2) {
				str.add(word);//alinea b
			}
			if(word.endsWith("s"))//alinea c
				System.out.println(word);
		}
		input.close();
		System.out.println(str);
		
		ArrayList<String> str1 = new ArrayList<String>();
		int count;
        for(String s:str) {
        	count=0;
            char[] ch = s.toCharArray();//palavra para char array
            for(char c:ch) {
                if(!Character.isLetter(c)) {
                    count++;
                }
            if(count>0)
            	str1.add(s);
            }
        }//tambem se podia ter utilizado o matches com a expressao regex "[^a-zA-Z]"
        str.removeAll(str1);
		System.out.println(str);
	}
}