import java.util.Scanner;
public class Poopcode
{
  public static void main (String[] args)
  {
  System.out.println("uh oh poopy, how many?");
  Scanner sc = new Scanner(System.in);
  int luca = sc.nextInt();
  poopyjudger(luca);
  }
  public static void poopyjudger (int poopy) 
  {
	if (poopy < 0) 
	{
		System.out.println("no such thing");
	}else if (poopy == 0) {
		System.out.println("no poopy :(");
	}else if (5 >= poopy) {
		System.out.println("small poopy, eat more");
	}else if(10>= poopy){
		System.out.println("medium poopy, heck yeah");
	}else {
		System.out.println("Big poopy, holy crap ;)");
	} 
	  
  }
}
