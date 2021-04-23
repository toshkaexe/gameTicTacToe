package gameTicTacToe;

public class BuildMatrix {

	int col;
	int row;

	public BuildMatrix() {
		// NOPE
	}

	public BuildMatrix row(int a) {
		this.col = a;
		return this;
	}

	public BuildMatrix col(int a) {

		this.row = a;
		return this;
	}

	void build() {

		int numberOfGames = col * row;
		String[][][] helpArray = new String[numberOfGames][col][row];

		int count = 0;
		while (count < numberOfGames) {
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < row; j++) {
					helpArray[count][i][j] = "x";
				}
			}
			count++;
		}

		count = 0;
		while (count < numberOfGames)

		{
			int k = 0;
			for (int i = 0; i < col; i++) {

				{
					for (int j = 0; j < row; j++) {

						if (k <= count)
							helpArray[count][i][j] = "o";
						k++;
					}

				}
			}
			count++;

		}

		count = 0;
		while (count < numberOfGames) {
			for (int i = 0; i < col; i++) {

				{
					for (int j = 0; j < row; j++) {

						System.out.print(helpArray[count][i][j] + "\t");
					}
					System.out.println(" ");
				}
			}
			count++;
			System.out.println("Game: " + count);
		}

	}

};

