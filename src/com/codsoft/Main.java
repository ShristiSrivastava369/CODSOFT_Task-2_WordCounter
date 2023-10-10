package com.codsoft;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textReceived="";
        int count=0,words=1;          
        System.out.println("Word Counting Application ~ CodSoft");
        System.out.println("Enter Text : ");
        String text=sc.nextLine();
        if(text=="" || text==" " || text==null) {
        	System.err.println("Please Enter A text! Try Again");
        }
        else {
        word(textReceived, count, words, text);
        }
}

	private static void word(String textReceived, int count, int words, String text) {
		for(int i=0;i<text.length();i++) {
        	if(text.charAt(i)==' ') {
        		words++;
        	}
        	textReceived=textReceived+text.charAt(i);
        	count++;
        }
        
        System.out.println("Text received is : "+textReceived+"\nCount is : "+count+"\nTotal words: "+words);
	}
}