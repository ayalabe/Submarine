package Submarine;

import java.util.Random;

public class CreateSubmarine {
	
	static Random rand = new Random();
	private Submarine[] submarines; 
	private int[] arrCordinatot;
	private String[] because = {"up", "down", "right", "left"};
	
	public CreateSubmarine(){
		
	}
	
	
	
	public void CreateSubmarine(int size, Submarine submarine) {
		int[] arrCenter = new int[2];
		int[] center = randomIndex(arrCordinatot);
		if(size == 1) {
			submarine.setX(center[0]);
			submarine.setY(center[1]);
		}	
		while(size >0) {
			
		}
	}
	
	
	public int[] randomIndex(int[] arrCordinatot) {
		
		arrCordinatot[0] = rand.nextInt(11);
		arrCordinatot[1] = rand.nextInt(21);
		
		return arrCordinatot;
	}
	
	public int[] getCordinatAraundCenter(int[] point) {
		int[] newPoint = new int[2];
		int randBecause = rand.nextInt(4);
		switch(this.because[randBecause]) {
		case "up":
			newPoint[0] = point[0];
			newPoint[1] = point[1]++;
			break;
		case "down":
			newPoint[0] = point[0];
			newPoint[1] = point[1]--;
			break;
		case "right":
			newPoint[0] = point[0]++;
			newPoint[1] = point[1];
			break;
		case "left":
			newPoint[0] = point[0]--;
			newPoint[1] = point[1];
			break;
		}
		return newPoint;
	}

}
