package hw;
import java.util.Scanner;
public class hw01_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("��J��n=");
		int n = scn.nextInt();
		System.out.print("ī�G���ƶq=");
		int a1 = scn.nextInt();
		System.out.print("�h�B���ƶq=");
		int a2 = scn.nextInt();
		System.out.print("��l���ƶq=");
		int a3 = scn.nextInt();
		if (n>=a1*15+a2*20+a3*30)
		{
			int all = 0;
			int x = 0;
			int y = 0;
			int z = 0;
			all = a1*15+a2*20+a3*30;
			System.out.println("�`�@�ݭn="+all+"��");
			int back=n-all;
			while(back>0)
			{
				z = back/50;
				back = back%50;
				y = back/5;
				back = back%5;
				x = back;
			}
			System.out.println("�Ѿl:\n50���w��="+z+"\n5���w��="+y+"\n1���w��="+x);
		}
		else
		{
			System.out.println("0");
		}
	}

}
