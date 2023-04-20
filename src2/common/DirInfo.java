package src2.common;

import java.io.File;

public interface DirInfo {
	//인터페이스이므로 static final 상수로 인식된다 ( 상수는 대문자, 합성어는 underscore로 연결)
	String OUTPUT_DIR="C:"+File.separator+"kosta260"+File.separator+"iotest1"+File.separator;
	String OUTPUT_DIR2="C:"+File.separator+"kosta260"+File.separator+"iotest2"+File.separator;
}
