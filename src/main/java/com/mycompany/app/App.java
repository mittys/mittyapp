package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String[] change(String[] s, int first, int second) {
		
		if(!(s.length>0)) { System.out.println("Array can NOT be empty"); return s;}

		if(first <0 || second <0) { System.out.println("Negative numbers can NOT be accepted"); return s; }
		else if(first >=s.length || second >=s.length) { System.out.println("Numbers bigger than size can NOT be accepted"); return s; }
		else if(first==second) { return s; }
		else if((s.length >first && s.length >second) || (s.length >second && s.length >first)) {
		
			if(s[first]==null || s[second]==null) { System.out.println("Element is null"); return s; }

			String temp=s[first];
			s[first]=s[second];
			s[second]=temp; 
		
			return s;
		}
		else {System.out.println("Uknown Error"); return s; }}
}
