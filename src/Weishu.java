import java.util.Scanner;


public class Weishu {
	public static void main(String[] args) {
		System.out.println("��������λ���֣�");
		Scanner one = new Scanner(System.in);
		int a = one.nextInt();
		int b=a/1000;
		int c=a%1000/100;
		System.out.println("��һ�εĽ��Ϊ"+(b+c));
		int d=a%100/10;
		int e=a%10;
		System.out.println("�ڶ��εĽ��Ϊ"+(d+e));
		int f = b+c+d+e;
		System.out.println("���ս��Ϊ"+f);
}
}
