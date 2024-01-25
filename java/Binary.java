import java.io.*;
public class Binary
{
 //BY ITERATION
 public static int search(int a[],int n,int x)//a[] (array) should be in sorted order
 {
  int start=0,end=n-1,mid=0;
  while(start<=end)
  {
    mid=(start+end)/2;
    if(a[mid]==x)
      return mid+1;//returning 1-based position
    if(a[mid]>x)
      end=mid-1;
    else if(a[mid]<x)
      start=mid+1;
  } 
  return -1;//if we reach here then ele was not present
 }

 

 public static void main(String [] args)throws IOException
 { 
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the size of array:");
  int n=Integer.parseInt(br.readLine());
  
  int a[]=new int[n];
  System.out.println("Enter the array elements in sorted order:");
  for(int i=0;i<n;i++)
  {
   a[i]=Integer.parseInt(br.readLine());
  }
  
  System.out.println("Enter the number to search:");
  int x=Integer.parseInt(br.readLine());
  
  int pos=search(a,n,x);
  if(pos==-1)
   System.out.println("Search Unsuccessful");
  else
   System.out.println("Element "+x+" found at position(1-based): "+pos);

  

 }
}