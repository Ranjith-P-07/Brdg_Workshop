import java.util*;
public class TicTacToeGame(){
	//UC-1 creating Board method to initialize with blank space
	public static char[] Board(){
		char[] board = new char[10];
		for (int index = 0; index < board.length;index++){
			board[index]=' ';
		}
		return board;
	}

	public static void main(String args[]){
		system.out.println("Welcome to TIc Tac Toe Game");
		char[] BoardObj = new char[10];
		BoardObj=Board();
		TicTacToeGame TicTacToeGameObj=new TicTacToeGame();
		TicTacToeGameObj.UserSelection();
	}
}
