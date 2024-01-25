// program of bubble sort 
import java.io.*;
public class Bubble
{
 //sorting in ascending order
 public static void sort(int a[],int n)
 { 
   int t;
   for(int i=0;i<n-1;i++)//for no of passes
   {
    for(int j=0;j<n-1-i;j++)
    {
      if(a[j]>a[j+1])
      {
       t=a[j];
       a[j]=a[j+1];
       a[j+1]=t;
      }
    }
   }
 }
 public static void main(String [] args)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the size of array:");
  int n=Integer.parseInt(br.readLine());

  int a[]=new int[n];
  System.out.println("Enter the array elements:");
  for(int i=0;i<n;i++)
  {
    a[i]=Integer.parseInt(br.readLine());
  }
 
  sort(a,n);
  System.out.println("Elements after bubble sorting:");
  for(int i=0;i<n;i++)
  {
   System.out.println(a[i]);
  }
 }
}