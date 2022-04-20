package Submarine;

public class Runner 
{
	public static int numRows = 10;
    public static int numCols = 20;
    public static int playerGuesses = 100;
    public static String[][] grid = new String[numRows][numCols];

	public static void main(String[] args) 
	{
	    System.out.println("**** Welcome to Faraj and Ayala game ");

	    //Step 1 – Create the ocean map
	    
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
                System.out.print(i);
        System.out.println();

        //Middle section of Ocean Map
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = " ";
                if (j == 0)
                    System.out.print(i + "|" + grid[i][j]);
                else if (j == grid[i].length - 1)
                    System.out.print(grid[i][j] + "|" + i);
                else
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        //Last section of Ocean Map
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();

	}

}
