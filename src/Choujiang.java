import java.util.Scanner;


public class Choujiang {
	public static void main(String[] args) {
		System.out.println("��������λ���֣�");
		Scanner one = new Scanner(System.in);
		int a = one.nextInt();
		int b = a%10; //��λ
		int c = a%1000/100; //��λ
		int d = b+c;//��λ�Ͱ�λ��ӵĽ��
		int e = a%10000/1000;//ǧλ
		int f = a/10000;//��λ
		int g = e+f;//ǧλ����λ
		int h = a%100/10;//ʮλ
		System.out.println((d%h==0 && g%d==0)?"��ϲ�н�":"���ź���û���н�");
//		if(d%h==0){
//			if(g%d ==0){
//				System.out.println("��ϲ�н�");
//			}
//			else{
//				System.out.println("���ź���û���н�");
//			}
//			}
//		else{
//			System.out.println("���ź���û���н�");
//		}
//			
	}

	}
