package day03;
public class student {
	String name;
	String sex;
	int lg;
	void movement(){
		System.out.println("看小说");
	}
	void sleep(){
		System.out.println("睡觉");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student l=new student();
		l.name="李映鲲";
		l.sex="男";
		l.lg=172;
		System.out.println("姓名："+l.name);
		System.out.println("性别："+l.sex);
		System.out.println("身高："+l.lg+"cm");
		l.movement();
		l.sleep();
	}

}

