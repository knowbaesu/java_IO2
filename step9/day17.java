package step7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgService {
    public void copyAndPasteImage(String orgFilePath, String destFilePath) throws IOException {
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            bis=new BufferedInputStream(new FileInputStream(orgFilePath));
            bos=new BufferedOutputStream(new FileOutputStream(destFilePath));
            int data=bis.read(); // read() : 더 이상 읽을 데이터가 없으면 -1 을 반환
            while(data!=-1) { // -1 이 아닐때까지 계속 반복한다
                bos.write(data);//읽은 정보를 출력한다
                data=bis.read();
            }
        }finally {
            if(bos!=null)
                bos.close();
            if(bis!=null)
                bis.close();
        }//finally
    }//method
}//class