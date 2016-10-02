package hw;
import java.util.Scanner;
public class hw01_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入錢n=");
		int n = scn.nextInt();
		System.out.print("蘋果的數量=");
		int a1 = scn.nextInt();
		System.out.print("柳丁的數量=");
		int a2 = scn.nextInt();
		System.out.print("桃子的數量=");
		int a3 = scn.nextInt();
		if (n>=a1*15+a2*20+a3*30)
		{
			int all = 0;
			int x = 0;
			int y = 0;
			int z = 0;
			all = a1*15+a2*20+a3*30;
			System.out.println("總共需要="+all+"元");
			int back=n-all;
			while(back>0)
			{
				z = back/50;
				back = back%50;
				y = back/5;
				back = back%5;
				x = back;
			}
			System.out.println("剩餘:\n50元硬幣="+z+"\n5元硬幣="+y+"\n1元硬幣="+x);
		}
		else
		{
			System.out.println("0");
		}
	}

}
