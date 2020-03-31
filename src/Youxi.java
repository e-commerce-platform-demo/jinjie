import java.util.Scanner;


public class Youxi {
	public static void main(String[] args) {
		System.out.println("请玩家1输入数字：");
		Scanner one = new Scanner(System.in);
		int a = one.nextInt();
		System.out.println("请玩家2输入数字：");
		Scanner two = new Scanner(System.in);
		int b = two.nextInt();
		System.out.println(!(a==b)?(a>b?"玩家1获胜":"玩家2获胜"):"平局");
//		if (a>b){
//			System.out.println("玩家1获胜");
//		}
//		if(a<b){
//			System.out.println("玩家2获胜");
//		}
//		else{
//			System.out.println("平局");
//		}
	}
}
