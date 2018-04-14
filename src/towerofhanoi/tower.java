package towerofhanoi;

public class tower {

	public static void main(String[] args) {
		tower t = new tower();
		t.move(4, 'A', 'C', 'B');
	}
	
	
	private void move(int numOfDiscs, char from, char to, char inter) {
		if(numOfDiscs > 1)
			move(numOfDiscs - 1, from, inter, to);
		System.out.println("Moving " + numOfDiscs + " from " + from + " to " + to);
		
		if(numOfDiscs > 1)
			move(numOfDiscs - 1, inter, to, from);
	}

}
