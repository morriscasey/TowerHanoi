/**
 * Practice recursion using Towers of Hanoi
 * @author Casey Morris
 *
 */
public class TowersOfHanoi
{
	//Constants
	private static final char START = 'A';
	private static final char AUXILIARY = 'B';
	private static final char END = 'C';
	
	private int totalDiscs;
	private int totalMoves = 0;
	
	//Default Constructor
	public TowersOfHanoi()
	{
		totalDiscs = 1;
	}
	
	/**
	 * Creates Tower of Hanoi object based on user disc input
	 * @param discs Integer does not check for out of bound parameters
	 */
	public TowersOfHanoi(int discs)
	{
		this.totalDiscs =discs;
	
	}
	
	/**
	 * Starts recursion using helper method called Move().
	 */
	public void start()
	{
		move(totalDiscs, START, AUXILIARY, END);
	}
	
	/**
	 * Helper method that moves the current disc based on it's position
	 * @param currentDisc current disc to move
	 * @param first  current position of disc on peg
	 * @param middle middle position the disc can move too
	 * @param last last position the disc can move too
	 */
	private void move(int currentDisc, char first, char middle, char last)
	{
		if(currentDisc == 1)
		{
			display(first, last);
			moveCounter();
		}
		else
		{
			move(currentDisc-1, first, last, middle);
			display(first, last);
			moveCounter();
			move(currentDisc-1, middle, first, last);
		}	
	}
	
	/**
	 * Gets total moves to solve
	 * @return totalSteps integer based on the amount of moves to complete.
	 */
	public int getTotalMoves()
	{
		return totalMoves;
	}
	
	/**
	 * Adds to total amount of moves.
	 */
	private void moveCounter()
	{
		totalMoves++;
	}

	/**
	 * Displays the position the disc move from and to
	 * @param moveFrom
	 * @param moveTo
	 */
	private void display(char moveFrom, char moveTo)
	{
		System.out.println("Disc moves from peg " + moveFrom + " to peg " + moveTo);
	}
}


