
import java.lang.Math;
/**
*athar:linsx
*2017
*test
*/
public class TestJavaDoc 
{
	public static void main(String[] args) 
	{
		int binVal1 = 0b11010100;
		byte binVal2 = (byte)212;
		binVal2 = (byte)( binVal2 + 2);
		int binVal3 = 0B10000000000000000000000000000011;
		System.out.println(binVal1);
		System.out.println(binVal2);
		System.out.println(binVal3);
		
		System.out.println(Integer.toBinaryString(0xFFffFA34));
		System.out.println(Integer.toString((short)0xFFffFA34));
		System.out.println("-------------------------------------");

		int nVal1 = 23;
		float fVal1 = 23.9f;
		nVal1 =(int)(fVal1);
		System.out.println(nVal1);
		System.out.println("-------------------------------------");


		char chrVal1 = 't';
		char chrVal2 = '\r';
		char chrVal3 = '\u9999';
		char chrVal4 = 'ท่';
		System.out.println(chrVal1);
		System.out.println(chrVal2);
		System.out.println(chrVal3);
		System.out.println(chrVal4);
		RadonStr r = new RadonStr();
		System.out.println(r.getRadon());

	}
}


class RadonStr
{
	
	public String getRadon(){
		String result = "";
		for (int i = 0; i< 6; i++)
		{
			int intVal= (int)(Math.random() *26 +97);
			result = result+(char)intVal+",";
		}
		return result;
	}
}
