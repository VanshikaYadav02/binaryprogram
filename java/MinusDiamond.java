/*
1234554321
1234  4321
123    321
12      21
1        1
12      21
123    321
1234  4321
1234554321
*/
public class MinusDiamond
{
 //BY ITERATION
 public static void patternIterative()
 {
  int a=0;
  
  //for printing first 5 rows of pattern
  for(int i=5;i>=1;i--)
  {
   for(int j=1;j<=i;j++)//for printing first triangle
   {
    System.out.print(j);
   }
   for(int x=0;x<a;x++)//for giving spaces between two triangles
   {
    System.out.print(" ");
   }
   a+=2;
   for(int k=i;k>=1;k--)//for printing second triangle
   {
    System.out.print(k);
   }
   System.out.println();//for giving line
  }
  
  a=a-4;
  //for printing the remaning rows of pattern 
  for(int i=2;i<=5;i++)
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
   for(int k=i;k>=1;k--)//for printing second triangle
   {
    System.out.print(k);
   }
   System.out.println();//for giving line
  } 
 }

 //BY RECURSION
 static int ar=0;
 static int br=6;
 public static void patternRecursive()
 {
  upperHalf(5);
  lowerHalf(2);
 }

 public static void upperHalf(int i)
 {
   if(i<1)//i->5to1 if i<1 then pattern printed completely
     return;
   for(int j=1;j<=i;j++)//for printing first triangle
   {
    System.out.print(j);
   }
   for(int x=0;x<ar;x++)//for giving spaces between two triangles
   {
    System.out.print(" ");
   }
   ar+=2;
   for(int k=i;k>=1;k--)//for printing second triangle
   {
    System.out.print(k);
   }
   System.out.println();//for giving line 
   upperHalf(i-1);
 } 

 public static void lowerHalf(int i)
 {
   if(i>5)
    return;
    for(int j=1;j<=i;j++)//for printing first triangle
    {
     System.out.print(j);
    }
    for(int x=0;x<br;x++)//for giving spaces between two triangles
    {
     System.out.print(" ");
    }
    br-=2;
    for(int k=i;k>=1;k--)//for printing second triangle
    {
     System.out.print(k);
    }
    System.out.println();//for giving line
    lowerHalf(i+1); 
 }

 public static void main(String []args)
 {
  //patternIterative();
  patternRecursive();
 }
}