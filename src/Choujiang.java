import java.util.Scanner;


public class Choujiang {
	public static void main(String[] args) {
		System.out.println("请输入五位数字：");
		Scanner one = new Scanner(System.in);
		int a = one.nextInt();
		int b = a%10; //个位
		int c = a%1000/100; //百位
		int d = b+c;//个位和百位相加的结果
		int e = a%10000/1000;//千位
		int f = a/10000;//万位
		int g = e+f;//千位加万位
		int h = a%100/10;//十位
		System.out.println((d%h==0 && g%d==0)?"恭喜中奖":"很遗憾，没有中奖");
//		if(d%h==0){
//			if(g%d ==0){
//				System.out.println("恭喜中奖");
//			}
//			else{
//				System.out.println("很遗憾，没有中奖");
//			}
//			}
//		else{
//			System.out.println("很遗憾，没有中奖");
//		}
//			
	}

	}
