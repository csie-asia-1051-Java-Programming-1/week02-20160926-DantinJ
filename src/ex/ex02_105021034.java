package ex;
import java.util.Scanner;
/*
 * Topic: ?��??�形，直徑為200，�?中�?座�???0,0)??
 * 	請寫�?��程�??�以輸入?��??��?座�?，並?�斷?��??�是?�在?�形?��??�內??
 * 	如�??��??��?位置?�好?��??��?話�?算是?��?形�??�內(例�?x=100，y=0)??
 * Date: 2016/09/26
 * Author: 105021034 �P�t�Ծǥ�
 */

public class ex02_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("��JX�y��");
		float x = scn.nextFloat();
		System.out.print("��JY�y��");
		float y = scn.nextFloat();
		float l = (float) Math.sqrt((x*x)+(y*y));
		if(l <= 100)
		{
			System.out.println("�I�b�餺");
		}
		else
		{
			System.out.println("�I�b��~");
		}
	}

}
