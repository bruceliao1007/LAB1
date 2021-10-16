package test_P28;

import java.io.*;

public class Sample10 {
	public static void main(String[] args)throws IOException
	{
		System.out.println("輸入一個整數");
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		
		String str1=br1.readLine();
		
		int num = Integer.parseInt(str1);
		System.out.println("你輸入的數字為:"+num);
		
		System.out.println("請輸入字串");
		BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
		
		String str2=br2.readLine();
		System.out.println(str2);
	}
}
