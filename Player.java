
import java.util.Scanner;

public class Player {
	String name;
	int row;
	int col;
	
	// Player constructor
	Player(String name_in) {
		name = name_in;	
	}
	
	// Requires: 1 <= row <= 3 && 1 <= col <= 3
	// Assume an integer is read in
	// Don't worry if it's a string or some other type
	// Effects: Reads in position player wants to 
	// make their move at, returns position
	void read_move() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter row and column position: ");
		System.out.println("row:");
		row = scan.nextInt();
		while (row < 1 || row > 3) {
			System.out.println("Invalid input. Please re-enter: ");
			System.out.println("row: ");
			row = scan.nextInt();
		}
		
		System.out.println("column:");
		col = scan.nextInt();
		
		while (col < 1 && col > 3) {
			System.out.println("Invalid input. Please re-enter: ");
			System.out.println("column: ");
			col = scan.nextInt();
		}
		// Close scan once row and column are determined 
		scan.close();
	}
	
	// Requires: 
	// Returns the position the user wants to play at
	// Board has 9 spots
	// Top left is spot 1 and bottom right is position 9
	int get_position() {
		return row * col;
	}
	
	void print_position(int position_in) {
		System.out.println("Position:" + position_in);
	}
	
	public static void main(String [ ] args) {
		Player player1 = new Player("Samuel");
		int position_tracker = 0;
		player1.read_move();
		position_tracker = player1.get_position();
		player1.print_position(position_tracker);
	}
	
}
