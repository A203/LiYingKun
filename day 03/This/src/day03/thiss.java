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
		this(name, age);//���õ�ǰ��Ĵ����������Ĺ��췽���������������
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
		thiss li=new thiss("��ӳ��",21,"Japan");
		li.introduce();
	}

}

