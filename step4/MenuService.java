package step4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MenuService {
	public void orderMenu(String filePath) throws IOException {
		Scanner scanner=null;
		PrintWriter pw=null;
		try {
			scanner=new Scanner(System.in);
			//FileWriter 의 true : append( 추가하기 )  , PrintWriter 의 true : autoflush => 즉시 출력 
			pw=new PrintWriter(new FileWriter(filePath,true),true);
			while(true) {
				System.out.print("저녁메뉴를 입력하세요:");
				String menu=scanner.nextLine();
				if(menu.equals("종료"))
					break;
				pw.println(menu);
				System.out.println(menu+" 주문되었습니다");
			}
			System.out.println("모든 주문이 완료되었습니다");
		}finally {
			if(pw!=null)
				pw.close();// 스트림(파이프라인,빨대) 을 닫아준다 ( flush - 버퍼에 있는 정보를 출력 ) 
			if(scanner!=null)
				scanner.close();
		}		
	}
}
/*
 		점심메뉴를 입력하세요: 김밥
 		김밥 주문되었습니다 
 		점심메뉴를 입력하세요: 라면
 		라면 주문되었습니다
 		점심메뉴를 입력하세요: 종료
 		모든 주문이 완료되었습니다 =>  iotest1 디렉토리 아래  점심메뉴.txt 에 가보면
 		김밥
 		라면이 기록 되어 있어야 한다 
 */



