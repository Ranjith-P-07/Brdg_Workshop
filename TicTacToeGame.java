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
	//UC-2 Userselction
   public static userSlection(){
      Scanner in = new Scanner(System.in);
      char computerMark='X';
      System.out.println("Enter Mark : ");
      char playerMark=in.next().charAt(0);
      if(playerMark=='X' || playerMark=='X'){
         computerMark='O';
      }
      else if (playerMark=='O'|| playerMark=='O'){
         computerMark='X';
      }
      else{
         System.out.println("Invalid Input Mark");
      }
   }
	//UC-3 Displaying of Board
   public void boardDisplay(char[] show){
      for(int box = 0; box< show.length;i++){
         if(box==3||box==6){
            System.out.println();
         }
         System.out.print(show[box]+"|");
      }
   }

	public static void main(String args[]){
		system.out.println("Welcome to TIc Tac Toe Game");
		char[] boardObj = new char[10];
		BoardObj=Board();
		TicTacToeGame TicTacToeGameObj=new TicTacToeGame();
		TicTacToeGameObj.userSelection();
	}
}
