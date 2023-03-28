import java.util.*;
import java.util.Scanner;
class Gusser{
	Scanner sc=new Scanner(System.in);
	int GNum;
		int GNumber() {
Scanner sc=new Scanner(System.in);
System.out.println("Gusser gusses some number :");
	 GNum=sc.nextInt();
 return GNum;
	}
}
class Player{
	int PNum;
	int PNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Player pls gusses some number :");
		PNum=sc.nextInt();
		return PNum;
	}
}
class Empire{
	int numfromgusser;
	int pp1;
	int pp2;
	int pp3;
	int pp4;
	Scanner sc=new Scanner(System.in);
	void numfromgusser() {

        Gusser g=new Gusser();
       numfromgusser = g.GNumber();
	}
	void numfromplayer() {
		Player p1=new Player();
		 pp1=p1.PNum();
		Player p2=new Player();
		 pp2=p2.PNum();
		Player p3=new Player();
		 pp3=p3.PNum();
		Player p4=new Player();
	      pp4= p4.PNum();
	}
	void compare() {
		     if(numfromgusser==pp1) {
			if(numfromgusser==pp1 && numfromgusser==pp2 && numfromgusser==pp3 && numfromgusser==pp4) {
				System.out.println("P1 & p2 & p3 & p4 please participate in the  game again ");
				retry();
			}else if (numfromgusser==pp1&& numfromgusser==pp2) {
				System.out.println("palyer 1 && 2 won the game ");
			}else if(numfromgusser==pp1&& numfromgusser==pp3) {
				System.out.println("player 1 && 3 won the game ");
			}else if(numfromgusser==pp1&&numfromgusser==pp4) {
				System.out.println("player 1 && 4 won the game");
			}else System.out.println("player 1 won the game");
		     
	         } else if(numfromgusser==pp2) {
	        	 
		     if(numfromgusser==pp2 && numfromgusser==pp3 && numfromgusser==pp4) {
		    	 System.out.println("player 2 & 3 & 4 Game is Draw b/w them ");
		    	 System.out.println("Please participate again ");
		    	 retry1();
		     }
		     else if (numfromgusser==pp2 && numfromgusser==pp3) {
			System.out.println("palyer 2  && 3 won the game ");
			retry23();
		   }else if(numfromgusser==pp2 && numfromgusser==pp4) {
		 	System.out.println("player 2 && 4 won the game ");
		   }else {
		 	System.out.println("player 2 won the game: ");
	}	}
	else if(numfromgusser==pp3) {
		if(numfromgusser==pp3 && numfromgusser==pp4) {
			System.out.println("player 3 & 4 won the game");
		}else System.out.println("player 3 won the game :");
	}
	else if(numfromgusser==pp4) {
		System.out.println("player 4 won the game");
	}else System.out.println("no one won the game Betterluck Next time:!");
		
	}
	void numtwothreefour() {
		Player p2=new Player();
		pp2=p2.PNum();
		Player p3=new Player();
		pp3=p3.PNum();
		Player p4=new Player();
		pp4=p4.PNum();
	}
	void twothree() {
		Player p2=new Player();
		pp2=p2.PNum();
		Player p3=new Player();
		pp3=p3.PNum();
		
	}
	
//	hello
	static void retry23() {
		Scanner sc=new Scanner(System.in);
		Empire e=new Empire();
		String pass="123";
		System.out.println("pls enter the password");
		String password=sc.nextLine();
		if (password.equals(pass)) {
		e.numfromgusser();
		e.twothree();
		e.compare();
		}
		else{
			System.out.println("pls enter some vaild password");
			System.exit(0);
			}		}
	
static void retry() {
	Scanner sc=new Scanner(System.in);
	Empire e=new Empire();
	String pass="123";
	System.out.println("pls enter the password");
	String password=sc.nextLine();
	if (password.equals(pass)) {
	e.numfromgusser();
	e.numfromplayer();
	e.compare();
	}
	else{
		System.out.println("pls enter some vaild password");
		System.exit(0);
		}
		
	}
static void retry1() {
	Scanner sc=new Scanner(System.in);
	Empire e=new Empire();
	String pass="123";
	System.out.println("pls enter the password");
	String password=sc.nextLine();
	if (password.equals(pass)) {
		e.numfromgusser();
		e.numtwothreefour();
		e.compare();
	}
	else{
		System.out.println("pls enter some vaild password");
		System.exit(0);
	}		
}
}
public class GusserGame
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Empire e=new Empire();
		String pass="123";
		System.out.println("pls enter the password");
		String password=sc.nextLine();
		if (password.equals(pass)) {
		e.numfromgusser();
		e.numfromplayer();
		e.compare();
		}
		else{
			System.out.println("pls enter some vaild password");
			System.exit(0);
		}
		}
	}

