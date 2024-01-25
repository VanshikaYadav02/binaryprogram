//program for selection sort
import java.io.*;
public class Selection
{
 
 public static void sort(int a[],int n)
 {
  int min,t;
  for(int i=0;i<n-1;i++)
  {
   min=i;
   for(int j=i+1;j<n;j++)
   {
    if(a[j]<a[min])//use condition a[j]>a[min] for sorting in descending order then min will denote max
      min=j;
   }
   t=a[min];
   a[min]=a[i];
   a[i]=t;
  }
 }//sort method ends here

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
  System.out.println("Elements after selection sort:");
  for(int i=0;i<n;i++)
  {
   System.out.println(a[i]);
  }
 }
}