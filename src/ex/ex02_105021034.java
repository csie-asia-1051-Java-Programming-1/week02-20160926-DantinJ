package ex;
import java.util.Scanner;
/*
 * Topic: ?‰ä??“å½¢ï¼Œç›´å¾‘ç‚º200ï¼Œä?ä¸­å?åº§æ???0,0)??
 * 	è«‹å¯«ä¸?”¯ç¨‹å??¯ä»¥è¼¸å…¥?Œé??ç?åº§æ?ï¼Œä¸¦?¤æ–·?Œé??æ˜¯?¦åœ¨?“å½¢?„ç??å…§??
 * 	å¦‚æ??Œé??ç?ä½ç½®?›å¥½?¨é??Œç?è©±ä?ç®—æ˜¯?¨å?å½¢ç??å…§(ä¾‹ï?x=100ï¼Œy=0)??
 * Date: 2016/09/26
 * Author: 105021034 ©P¦tÑÔ¾Ç¥Í
 */

public class ex02_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("¿é¤JX®y¼Ğ");
		float x = scn.nextFloat();
		System.out.print("¿é¤JY®y¼Ğ");
		float y = scn.nextFloat();
		float l = (float) Math.sqrt((x*x)+(y*y));
		if(l <= 100)
		{
			System.out.println("ÂI¦b¶é¤º");
		}
		else
		{
			System.out.println("ÂI¦b¶é¥~");
		}
	}

}
