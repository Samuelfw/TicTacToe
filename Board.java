/**
 * 
 */

/**
 * @author samuelfw
 *
 */
public class Board {
	Board() {}
	
	
	void draw() {
		System.out.println("   |   |  ");
		System.out.println("-----------");
		System.out.println("   |   |  ");
		System.out.println("-----------");
		System.out.println("   |   |  ");
	}
	
	void draw_move(int player_number) {
		char move;
		// Player one draws 'x'
		if (player_number == 1) {
			move = 'x';
		}
		// If above conditional doesn't execute, player2 is making the move
		// Player2 draws 'o'
			move = 'o';
		
		
	}
	
	public static void main(String [ ] args) {
		Board board = new Board();
		board.draw();
	}
	
}
