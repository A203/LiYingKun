package day03;

public class thiss {
	String name;
	int age;
	String address;
	public thiss(String name,int age){
		this.name=name;
		this.age=age;
	}
	public thiss(String name,int age,String address){
		this(name, age);//调用当前类的带两个参数的构造方法，避免程序冗余
		this.address=address;
	}
	void hello(){
		System.out.println("hello......");
	}
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiss li=new thiss("李映鲲",21,"Japan");
		li.introduce();
	}

}

