/*
1        1
12      21
123    321
1234  4321
1234554321
1234554321
1234  4321
123    321
12      21
1        1
*/
public class Butterfly
{
 //BY ITERATION
 public static void patternIterative()
 {
  int a=8;
  for(int i=1;i<=5;i++)//for printing first 5 rows
  {
   for(int j=1;j<=i;j++)//for printing first triangle
   {
    System.out.print(j);
   }
   for(int x=0;x<a;x++)//for giving spaces between two triangles
   {
    System.out.print(" ");
   }
   a-=2;
   for(int k=i;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();//for giving next line
  }

  a+=2;
  for(int i=5;i>=1;i--)//for printing next 5 rows
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   for(int x=0;x<a;x++)
   {
    System.out.print(" ");//for giving spaces between two triangles
   }
   a+=2;
   for(int k=i;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();//for giving next line
  }
 }
 
 
 

 public static void main(String [] args)
 {
  patternIterative();
  
 }
}