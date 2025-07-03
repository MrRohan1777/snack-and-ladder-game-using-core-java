package modify;

import java.util.Random;
import java.util.Scanner;

public class Snake2 {
	
	
	

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int p = 0, p2 = 0;
		int firstPlayerPosition = 0;
		int secondPlayerPosition = 0;
		boolean showDetailsFlag = true;
		System.out.println("Enter first player name");
		String firstPlayer = sc.next();
		System.out.println("Enter Second Player Name");
		String secondPlayer = sc.next();
		System.out.println("Let's start the game");
		String turn = firstPlayer;

		// Game loop****
		while (true) {
			int dice = r.nextInt(6) + 1;

			if (showDetailsFlag) {
				System.out.println("Snake Position at 12,20,34,43,49 number");
				System.out.println("Ladder Position at 15,28,30,41 number\n");
			}
			System.out.println("Enter player\n");
			showDetailsFlag = true;
			String round = sc.next();

			// For first player
			if (round.equals(firstPlayer) && turn.equals(firstPlayer)) {
				firstPlayerPosition += dice;
				snakeBite(firstPlayerPosition);
				playersLadder(firstPlayerPosition);
				turn = secondPlayer;
			}
			// For Second Player
			else if (round.equals(secondPlayer) && turn.equals(secondPlayer)) {
				secondPlayerPosition += dice;
				snakeBite(secondPlayerPosition);
				playersLadder(secondPlayerPosition);
				turn = firstPlayer;
			} else {
				System.out.println("Its " + turn + "'s turn.......");
				showDetailsFlag = false;
			}

			if ((round.equals(firstPlayer) || round.equals(secondPlayer)) && showDetailsFlag) {
				System.out.println("Dice is : " + dice);
				if (firstPlayerPosition < 50) {
					System.out.println(firstPlayer + "'s position is : " + firstPlayerPosition);
					p = firstPlayerPosition;

				} else if (firstPlayerPosition > 50) {
					firstPlayerPosition = p;
					System.out.println(firstPlayer + "'s position is : " + p);
				} else if (firstPlayerPosition == 50) {
					System.out.println(firstPlayer + " win>>>>>>>>>>>>>>>>>>>>>>>>");
					System.exit(0);
				}

				if (secondPlayerPosition < 50) {
					System.out.println(secondPlayer + "'s position is : " + secondPlayerPosition);
					p2 = secondPlayerPosition;

				} else if (secondPlayerPosition > 50) {
					secondPlayerPosition = p2;
					System.out.println(secondPlayer + "'s position is : " + p2);
				} else if (secondPlayerPosition == 50) {
					System.out.println(secondPlayer + " win>>>>>>>>>>>>>>>>>>>>>>>>");
					System.exit(0);
				}
			}
		}

	}

	private static void playersLadder(int playerPosition) {
		if (playerPosition == 15 || playerPosition == 28 || playerPosition == 30 || playerPosition == 41) {
			System.out.println("laderrr.......");
			switch (playerPosition) {
			case 15:
				playerPosition = 25;
				break;
			case 28:
				playerPosition = 32;
				break;
			case 30:
				playerPosition = 35;
				break;
			case 41:
				playerPosition = 46;
				break;

			}
		}
	}

	private static void snakeBite(int playerPosition) {
		if (playerPosition == 12 || playerPosition == 20 || playerPosition == 34 || playerPosition == 43
				|| playerPosition == 49) {
			System.out.println("Snake bite...........");
			switch (playerPosition) {
			case 12:
				playerPosition = 5;
				break;
			case 20:
				playerPosition = 14;
				break;
			case 34:
				playerPosition = 29;
				break;
			case 43:
				playerPosition = 30;
				break;
			case 49:
				playerPosition = 15;
				break;

			}
		}

			
	}


}
