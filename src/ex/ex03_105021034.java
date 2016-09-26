package ex;
import java.util.Scanner;
/*
 * Topic: ?┤Х╗╜?░Е??°Х??╢Г?Х╡╩Г??╞Е?Х╩?Е╟▐Ф?Д╩╔Е┘╖О╪▄Ф??┼Е???0?┐О?Х╤┘И?2Е╟▐Ф?О╪▄Д??╙Ф╩©4Е╟▐Ф??└И┐╗Д╩╫О?
 * 	Ф╞▐Е?Е╟▐Ф?40?┐О?Х╤┘И?4Е╟▐Ф?Д╩╔Д??└И┐╗Д╩╫О?Ф╞▐Е?Е╟▐Ф?60?┐О??╙Ф╩©?┼Е??┌И┐╗?├Д?Х╗┬Х╡╩??
 * 	Е╕┌Ф??╗Е??╘Д?10И╩?3?├Е??╟Д???И╩?0?├О?Х╚▀Ф▓╟Е╞╚Г?Е╪▐Х?Г╝≈Е┘╠??╧ЁД╨╓Г??°Х?Х╡╩Ц?
 * Date: 2016/09/26
 * Author: 105021034 ╘P╕tят╬г╔м
 */

public class ex03_105021034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float n = scn.nextInt();
		float a = n;
		int n2 = 0;
		int n3 = 0;
		n=(int)(n/30);
		if(120 < a)
		{
			n2= (int) (n-4);
			n = n - n2;
		}
		if(240 <= a)
		{
			n3 = (int)(n2-3);
			n2 = n2 - n3;
		}
		System.out.println(n*30+n2*40+n3*60);
	}

}
