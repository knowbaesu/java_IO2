package src2.step1;
interface Flyer{}
class Bird implements Flyer{}
class Eagle extends Bird{}
public class TestInterfaceReview {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Flyer f1=new Bird();
		Flyer f2=new Eagle();// Eagle 은 Bird를 상속받았으므로 자동으로 Flyer 계층구조에 속한다
	}
}
