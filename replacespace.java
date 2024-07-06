//You have been given a string 'STR' of words.
//You need to replace all the spaces between words with “@40”.

import java.util.* ;
import java.io.*; 
public class replacespace {
	public static StringBuilder replaceSpaces(StringBuilder str) {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				result.append("@40");
			}else{
				result.append(str.charAt(i));
			}
		}return result;
	}
}
