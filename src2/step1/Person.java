package src2.step1;

import java.io.Serializable;
/*
 	-  java.io.Serializable    
    객체 직렬화가 되기 위해서는 직렬화 대상 클래스는 
    반드시 java.io.Serializable 인터페이스 계층구조 하에 있어야 한다  
    : 만약 이 계층구조 하에 있지 않은 상태에서 직렬화를 시도할 경우에는 
      java.io.NotSerializableException 이 발생된다 
      ( 기본적으로 객체 정보는 외부로 직렬화되지 않도록 설계 ) 		
 */
public class Person implements Serializable{
	/**
	 * 직렬화시 이용되는 클래스의 유일한 식별자 : 직접 명시할 것을 권장 
	 */
	private static final long serialVersionUID = 7930306273870214891L;
	private String name;
	private int money;
	// 직렬화 대상에서 제외 
	private transient String password;
	public Person(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public Person(String name, int money, String password) {
		super();
		this.name = name;
		this.money = money;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
