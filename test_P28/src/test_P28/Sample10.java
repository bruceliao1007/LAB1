package test_P28;

import java.io.*;

public class Sample10 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("��J�@�Ӿ��");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br1.readLine();
		
		int num = Integer.parseInt(str1);
		System.out.println("�A��J���Ʀr��:"+num);
		
		System.out.println("�п�J�r��");
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		
		String str2=br2.readLine();
		System.out.println(str2);
	}
}
