package step1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import common.DirInfo;

public class TestObjectDeSerialization2 {
    public static void main(String[] args) {
        //객체 역직렬화 : person.obj 에 저장된 정보를 역직렬화하여
        // 자바 메모리 상의 객체로 복원해본다
        String personPath=DirInfo.OUTPUT_DIR2+"person.obj";
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(personPath));
            Person p=(Person)ois.readObject();//Object 타입으로 리턴되므로 Person 타입으로 객체 캐스팅이 필요
            // password는 transient 명시되어 직렬화 되지 않았음, 그러므로 null 이 출력됨
            System.out.println(p.getName()+" "+p.getMoney()+" "+p.getPassword());
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}