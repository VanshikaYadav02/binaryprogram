import java.util.*;
public class TossCoin
{
  public static void main(String [] args)
  {
  String name1,name2;
  int n,d,c1=0,c2=0,i=0; 
  char ch1,ch2;

  Scanner sc=new Scanner(System.in);

  System.out.println("A player is declared the winner if he gets the maximum no of correct guesses");
  System.out.println("Enter player 1 name: ");
  name1=sc.nextLine();
  System.out.println("Enter player 2 name: ");
  name2=sc.nextLine();  

  System.out.println("Enter number of times you want to play the game: ");   
  n=sc.nextInt();

  while(i<n)
  {
    System.out.println("Chance: "+(i+1));
    System.out.println("Player 1 "+name1+" press H for Head & T for Tail");
    ch1=sc.next().charAt(0);
    System.out.println("Player 2 "+name2+" press H for Head & T for Tail");
    ch2=sc.next().charAt(0); 
    
    if((ch1!='H'&&ch1!='T')||(ch2!='H'&&ch2!='T'))
    {
       System.out.println("Invalid choice");
       continue;
    }
    
    d=(int)(Math.random()*2);//result randomly in either 0 or 1.Here 1->Head and 0->Tail
    if((d==1 && ch1=='H')||(d==0 && ch1=='T'))
       c1++;
    if((d==1 && ch2=='H')||(d==0 && ch2=='T'))
       c2++;
    i+=1;
    
    if(d==1)
     System.out.println("Coin is flipped and it showed Head");
    else
     System.out.println("Coin is flipped and it showed Tail");
  }
  if(c1>c2)
     System.out.println("Player 1 "+name1+" wins");
  else if(c2>c1)
     System.out.println("Player 2 "+name2+" wins");
  else
     System.out.println("Match draw");
  }
}
  