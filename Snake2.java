package modify;

import java.util.Random;
import java.util.Scanner;

public class Snake2 {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		Scanner sc=new Scanner(System.in);

		int p=0,p2=0;
		int position=0;
		int position2=0;
		System.out.println("Enter first player name");
		String player = sc.next();
		System.out.println("Enter Second Player Name");
		String player2=sc.next();
		System.out.println("Let's start the game");
		
//		Game loop**********
		
		while(true) {
			int dice=r.nextInt(6)+1;

			
		System.out.println("Position Snake at 12,20,34,43,49 number\n");
		System.out.println("Enter player\n");
		
		String round=sc.next();
//		first player position logic************************
		if(round.equals(player)) {
			position+=dice;
//			first player snake bite************
			if(position==12||position==20||position==34||position==43||position==48) {
				System.out.println("Snake bite...........");
				switch (position) {
				case 12:
					position=5;
					break;
				case 20:
					position=14;
					break;
				case 34:
					position=29;
					break;
				case 43:
					position=30;
					break;
				case 48:
					position=15;
					break;
					
				}
			}
			
//			first player laderrr***************
			
			else if(position==15||position==28||position==30||position==41) {
				System.out.println("laderrr.......");
				switch (position) {
				case 15:
					position=25;
					break;
				case 28:
					position=32;
					break;
				case 30:
					position=35;
					break;
				case 41:
					position=46;
					break;
					
				}
			}
			
		}
		
//		second player position logic*************8888
		
		else if(round.equals(player2)) {

			position2+=dice;
			
//			second player snake bite logic************************************
			
			if(position2==12||position2==20||position2==34||position2==43||position2==49) {
				position2=5;
				System.out.println("snake bite............\n");
			}
			
//			second player ladderr logic***************************8
			
			else if(position2==15||position2==28||position2==30||position2==41) {
				System.out.println("laderrr.......");
				switch (position2) {
				case 15:
					position2=25;
					break;
				case 28:
					position2=32;
					break;
				case 30:
					position2=35;
					break;
				case 41:
					position2=46;
					break;
				}
			}
		}else {
			System.out.println("Enter valid player");
		}
				
		System.out.println("Dice is : "+dice);
		if(position<50) {
			System.out.println(player+"'s position is : "+position);
			 p=position;
			
			
		}else if(position>50) {
			position=p;
			System.out.println(player+"'s position is : "+p);
		}else if(position==50) {
			System.out.println(player+" win>>>>>>>>>>>>>>>>>>>>>>>>");
			System.exit(0);;
		}
		
		if(position2<50) {
			System.out.println(player2+"'s position is : "+position2);
			 p2=position2;
			
			
		}else if(position2>50) {
			position2=p2;
			System.out.println(player2+"'s position is : "+p2);
		}else if(position2==50) {
			System.out.println(player2+" win>>>>>>>>>>>>>>>>>>>>>>>>");
			System.exit(0);
		}
		
		}
			
			
	}


}
