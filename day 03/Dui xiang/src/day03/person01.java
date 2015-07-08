package day03;


public class person01{
	String name;
	String sex;
	int lg;
	person01(String n,String s,int h){
		name=n;
		sex=s;
		lg=h;
	}
	void introduce(){
		System.out.println("大家好，告诉大家一个秘密，我喜欢林志玲。");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person02 li=new person02("李映鲲", "男", 172);
		System.out.println("姓名："+li.name);
		System.out.println("性别："+li.sex);
		System.out.println("长度："+li.lg+"cm");
		li.introduce();
	}
}