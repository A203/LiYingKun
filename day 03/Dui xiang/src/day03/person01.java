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
		System.out.println("��Һã����ߴ��һ�����ܣ���ϲ����־�ᡣ");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person02 li=new person02("��ӳ��", "��", 172);
		System.out.println("������"+li.name);
		System.out.println("�Ա�"+li.sex);
		System.out.println("���ȣ�"+li.lg+"cm");
		li.introduce();
	}
}