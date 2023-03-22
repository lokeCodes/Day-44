// https://www.codechef.com/problems/TLG
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int max=0;
		int c1 =0;
		int c2 =0;
		int player=0;
		while(r-- > 0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    c1 = c1+a;
		    c2 = c2+b;
		    int res = (c1>=c2) ? c1-c2 : c2-c1;
		    if(res>max && c1>c2){
		        max=res;
		        player=1;
		    }else if(res>max && c2>c1){
		        max=res;
		        player=2;
		    }
		    
		}
		System.out.println(player+" "+max);
	}
}
