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
    // br = new BufferedReader(new FileReader("in.txt"));
    // out = new PrintWriter(new FileWriter("out.txt"));
    int t=readInt();
    while(t-->0)
    {
    	int n = readInt();
    	generate_derangement(n);
    }
    
  }
  	static void generate_derangement(int N)
	{
	  // Generate Sequence and insert
	  // into a priority queue.
	  int arr[] = new int[N];
	  int x = 1;
	  for(int i=0;i<N;i++)
	  {
	  	arr[i]=x;
	  	x++;
	  }
	  
	  int temp=0;
	  int i=0;
	  int j=0;
	  if(N%2==0){
		  while(i<N)
		  {
		  	temp=arr[i];
		  	arr[i]=arr[i+1];
		  	arr[i+1]=temp;
		  	i=i+2;
		  }
		  for(int l=0;l<N;l++)
		  {
		  	System.out.print(arr[l]+" ");
		  }
		  System.out.println();
	  }
	  else{
	  	while(j<N-1)
	  	{
	  		temp=arr[j];
	  		arr[j]=arr[j+1];
	  		arr[j+1]=temp;
	  		j=j+2;
	  	}
	  	temp=arr[N-2];
	  	arr[N-2]=arr[N-1];
	  	arr[N-1]=temp;
	  	for(int k=0;k<N;k++)
		  {
		  	System.out.print(arr[k]+" ");
		  }
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
