package ex;
import java.util.Scanner;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021034 周宇晟學生
 */

public class ex01_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入分鐘");
		int min = scn.nextInt();
		float n = (float)0.5;
		if (min <= 600)
		{
			System.out.println((int)(min*n));
		}else if(min >=600 && min <=1200)
		{
			System.out.println((int)(min*n*0.9));
		}else if(min >= 1200)
		{
			System.out.println((int)(min*n*0.79));
		}
	}

}
