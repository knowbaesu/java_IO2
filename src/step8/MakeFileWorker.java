package src.step8;

public class MakeFileWorker implements Runnable{
	private int makeCount;
	private int makePeriod;	
	public MakeFileWorker(int makeCount, int makePeriod) {
		super();
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}
	@Override
	public void run() {
		//makeDir()
		//makeFile()
	}	
	// public void makeDir(){}
	// public void makeFile(){} 
}







