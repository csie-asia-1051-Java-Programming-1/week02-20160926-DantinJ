package hw;
import java.util.Scanner;
public class hw02_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("��J����/�ʧO(1=�k��,2=�k��)");
		float a = scn.nextFloat();
		int b = scn.nextInt();
		if (b==1)
		{
			System.out.println((a-80)*0.7);
		}
		else if(b==2)
		{
			System.out.println((a-70)*0.6);
		}
		else
		{
			System.out.println("���~");
		}
	}

}
