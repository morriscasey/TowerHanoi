/**
 * Driver to test Towers of Hanoi
 * @author Casey Morris
 *
 */
public class HanoiDriver
{

	public static void main(String[] args)
	{
		TowersOfHanoi towerOfThreeDiscs = new TowersOfHanoi(3);
		towerOfThreeDiscs.start();
		System.out.println(towerOfThreeDiscs.getTotalMoves());
		
		System.out.println("");
		
		TowersOfHanoi towerDefault = new TowersOfHanoi();
		towerDefault.start();
		System.out.println(towerDefault.getTotalMoves());
		

	}

}
