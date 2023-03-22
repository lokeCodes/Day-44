// https://www.codechef.com/problems/RECENTCONT
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            int start =0;
            int ltime =0;
            for(int i=1;i<=n;i++){
                String code = s.next();
                if( code.equals("START38") ){
                    start=start+1;
                }else{
                    ltime=ltime+1;
                }
            }
            System.out.println(start+" "+ltime);
        }
		
	}
}
