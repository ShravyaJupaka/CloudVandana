package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Angram {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the first string ");
     String s1=sc.nextLine();
     System.out.println("enter the second string");
     String s2=sc.nextLine();
     checkanagram(s1,s2);
	}
	private static void checkanagram( String s1, String s2) {
	      int n1=s1.length();
	      int n2=s2.length();
	      if(n1!=n2) {
	    	  return;	
		}
	      char ch1[]=s1.toCharArray();
	      char ch2[]=s2.toCharArray();
	      //sort the two strings
	      Arrays.sort(ch1);  	
	      Arrays.sort(ch2);
	      //compare sorted strings
	      boolean flag=true;
	      for(int i=0;i<n1;i++) {
	    	  if(ch1[i]!=ch2[i]) {
	    		  flag=false;
	    		  break;
	    	  }
	      }
	      if(flag=true) {
	    	  System.out.println("two strings are anagrams");
	      }
	      else {
	    	  System.out.println("two strings are not anagrams");
	      }
	}

}
