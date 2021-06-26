/********************************************************************
*******  ######      #       #   #  #####    ###   ******************
*******  #          #  #     #  #     #      #  #  ******************
*******  ######    ######    ###      #      ###   ******************
*******       #   #      #   #  #     #      #  #  ******************
*******  ######  #        #  #   #  #####    ###   ******************
*********************************************************************
********************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;
import java.lang.*;



public class test{

  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;
  

  public static void main(String[] args) throws IOException 
  {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    int t = readInt();
        while (t-- > 0)
        {
            int n = readInt();
            long[] arr = new long[n+1];
            //Pair[] p = new Pair[n+1];
            Map<Long, Integer> tmp = new TreeMap<>();

            for(int i=1;i<=n;i++)
            {
                arr[i] = readLong();
//                p[i] = new Pair(arr[i], i);
                tmp.put(arr[i], i);
            }
            //System.out.println(tmp);

//            Arrays.sort(p);
            long limit = 2L *n-1;

            int count = 0;
            for(Map.Entry<Long, Integer> e:tmp.entrySet())
            {
               for(Map.Entry<Long, Integer> e1:tmp.entrySet())
               {
                   if(!e.getKey().equals(e1.getKey()))
                   {
                       if(e.getKey()*e1.getKey()>limit)
                           break;
                      else
                       {
                           long key1 = e.getKey();
                           long key2 = e1.getKey();
                           int value1 = e.getValue();
                           int value2 = e1.getValue();
                           //System.out.println(key1+" "+key2+" "+value1+" "+value2);
                           if(key1*key2==value1+value2)
                               count++;
                       }
                   }
               }
            }
            System.out.println(count/2);
        }
  }
  static long fact(long x)
  {
  	if(x==0)
  	return 1;
  	else return x*fact(x-1);
  }

  static String next() throws IOException 
  
  {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }

  static long readLong() throws IOException 
  {
    return Long.parseLong(next());
  }

  static int readInt() throws IOException
  {
    return Integer.parseInt(next());
  }

  static double readDouble() throws IOException 
  {
    return Double.parseDouble(next());
  }

  static char readCharacter() throws IOException 
  {
    return next().charAt(0);
  }

  static String readLine() throws IOException 
  {
    return br.readLine().trim();
  }

}
