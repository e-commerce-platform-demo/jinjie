import java.util.Scanner;


public class Weishu {
	public static void main(String[] args) {
		System.out.println("请输入四位数字：");
		Scanner one = new Scanner(System.in);
		int a = one.nextInt();
		int b=a/1000;
		int c=a%1000/100;
		System.out.println("第一次的结果为"+(b+c));
		int d=a%100/10;
		int e=a%10;
		System.out.println("第二次的结果为"+(d+e));
		int f = b+c+d+e;
		System.out.println("最终结果为"+f);
}
}
