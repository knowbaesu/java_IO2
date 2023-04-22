package src.step9;

import java.io.File;

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
		makeDirs();//디렉토리 생성을 위해 호출 
		//7초 간격으로 5번 이동시키기 위해 for loop를 이용 
		for(int i=0;i<moveCount;i++) {
			try {
				Thread.sleep(movePeriod);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			moveFiles();//디렉토리 내의 파일을 이동시키기 위해 호출 
			System.out.println("MoveFileWorker Thread가 파일들을 이동");
		}
	}
	//디렉토리가 없으면 생성 ( movie 와 music ) 
	public void makeDirs() {
		File movieDir=new File(Path.MOVIE_PATH);
		if(movieDir.isDirectory()==false)
			movieDir.mkdirs();
		File musicDir=new File(Path.MUSIC_PATH);
		if(musicDir.isDirectory()==false)
			musicDir.mkdirs();
	}
	/* 
	 *  확장자별로 파일을 이동시키는 메서드 
	 *  repository 디렉토리에 있는 파일리스트를 반환받아 확장자를 확인하여 
	 *  .avi 파일은 movie 디렉토리로 이동시키고 .mp3 파일은 music 디렉토리로 이동시킨다 
	 */
	public void moveFiles() {
		File repositoryDir=new File(Path.MAKE_PATH);
		File[] files=repositoryDir.listFiles();// repository 디렉토리에 있는 파일들의 정보를 배열로 반환받는다 
		for(int i=0;i<files.length;i++) {
			String name=files[i].getName();//파일명을 반환받는다  예) 19_1646269373105.avi
			String destDir=null;//이동할 디렉토리 경로를 저장 
			if(name.endsWith(".avi")) {
				destDir=Path.MOVIE_PATH;
			}else if(name.endsWith(".mp3")) {
				destDir=Path.MUSIC_PATH;
			}
			// 파일을 이동시킨다 
			File destFile=new File(destDir+File.separator+name);
			//원본파일.renameTo(목적지파일);
			files[i].renameTo(destFile);
		}//for
	}//method	
}
