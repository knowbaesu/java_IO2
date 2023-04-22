package src.step8;

public class MoveFileWorker implements Runnable{
	private int moveCount;
	private int movePeriod;	
	public MoveFileWorker(int moveCount, int movePeriod) {
		super();
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}
	@Override
	public void run() {
		//makeDirs();
		//movieFiles();
	}
	//public void makeDirs(){}
	//public void movieFiles(){}
}
