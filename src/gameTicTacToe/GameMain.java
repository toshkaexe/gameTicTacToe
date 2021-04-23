package gameTicTacToe;

import java.util.Scanner;

public class GameMain {
	
	public static void main(String[] args) {

	    try (Scanner in = new Scanner(System.in)) {
			System.out.println("Start game");


			System.out.println("Enter Number of rows: ");
			int a = in.nextInt();

			System.out.println("Enter Number of columns: ");
			int b = in.nextInt();
			BuildMatrix startGame = new BuildMatrix();
			startGame.row(a).col(b).build();
		}

	}

}
