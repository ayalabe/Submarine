package Submarine;

public class Submarine {
	
	private int indexX = 0;
	private int indexY = 0;
	protected int[] x;
	protected int[] y;
	
	
	public Submarine(int[] x, int[] y) {
		this.x = x;
		this.y = y;
	}


	public int[] getX() {
		return x;
	}


	public void setX(int x) {
		this.x[indexX] = x;
		indexX++;
	}


	public int[] getY() {
		return y;
	}


	public void setY(int y) {
		this.y[indexY] = y;
		indexY++;
	}
	
	

}
