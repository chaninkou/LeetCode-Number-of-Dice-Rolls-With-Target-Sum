package leetcode1155;

public class Main {
	public static void main(String[] args) {
		int d = 2;
		
		int f = 6;
		
		int target = 7;
		
		System.out.println("d: " + d + " withf: " + f + " target: " + target);
		
		FindNumberOfDiceRolls solution = new FindNumberOfDiceRolls();
		
		System.out.println("Solution: " + solution.numRollsToTarget(d, f, target));
	}
}
