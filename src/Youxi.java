import java.util.Scanner;


public class Youxi {
	public static void main(String[] args) {
		System.out.println("�����1�������֣�");
		Scanner one = new Scanner(System.in);
		int a = one.nextInt();
		System.out.println("�����2�������֣�");
		Scanner two = new Scanner(System.in);
		int b = two.nextInt();
		System.out.println(!(a==b)?(a>b?"���1��ʤ":"���2��ʤ"):"ƽ��");
//		if (a>b){
//			System.out.println("���1��ʤ");
//		}
//		if(a<b){
//			System.out.println("���2��ʤ");
//		}
//		else{
//			System.out.println("ƽ��");
//		}
	}
}
