package src.step9;

import java.io.File;
import java.io.IOException;
import java.util.Random;

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
		makeDir();
		try {
			makeFile();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}	
	public void makeDir(){
		File dir=new File(Path.MAKE_PATH);
		if(dir.isDirectory()==false)
			dir.mkdirs();		
	}
	public void makeFile() throws IOException, InterruptedException{
		for(int i=0;i<makeCount;i++) {
			String fileName=createFileName(i);
			File file=new File(Path.MAKE_PATH+File.separator+fileName);
			file.createNewFile();
			System.out.println(fileName+" 생성 - MakeFileWorker Thread");
			Thread.sleep(this.makePeriod);
		}//for
	} //makeFile
	public String createFileName(int num) {
		String fileName=num+"_"+System.currentTimeMillis();
		Random random=new Random();
		if(random.nextBoolean())
			fileName+=".avi";
		else
			fileName+=".mp3";
		return fileName;
	}
}//class







