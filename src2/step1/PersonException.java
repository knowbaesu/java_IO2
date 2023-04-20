package src2.step1;
// 부모 클래스 super class 인 Exception 이 implements Serializable 하고 있음 
public class PersonException  extends Exception{
	/**
	 * PersonException class 유일 식별자를 직접 명시 
	 * why?  jdk 또는 클래스의 멤버가 변경될 때는 자동 생성된 id 는 변경되어
	 * 		  직렬화 된 정보를 역직렬화 할 수 없는 상황이 오기 때문에 
	 * 		  직접 명시할 것을 권장한다 
	 */
	private static final long serialVersionUID = 6233926752371947159L;

}
