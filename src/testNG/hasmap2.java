package testNG;

import java.util.HashMap;
import java.util.Set;

public class hasmap2 {

	public static void main(String[] args) {
		String str = "abcaba";
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		// 5<=5
		for (int i = 0; i <= str.length() - 1; i++)
		{ //5
		char charValue = str.charAt(i); //b
		if (mp.containsKey(charValue)) //a-->true
		{
		mp.put(charValue, mp.get(charValue) + 1); //a 3
		}
		else
		{
		mp.put(charValue, 1); //c 1
		}
		}
		Set<Character> keys = mp.keySet(); //[a, b, c]
		//print occurence of each char
		for (Character key : keys)
		{
		System.out.println(key +": "+ mp.get(key)); // a : 3 b : 2 c: 1
		}
		//print only duplicate element
		for (Character key : keys)
		{
		if(mp.get(key)>1) {
		System.out.println(key +": "+ mp.get(key));
		}
		}
		//System.out.println("a: "+ mp.get('a'));
		
}
}
