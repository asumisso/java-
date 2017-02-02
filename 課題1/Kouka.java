import java.io.*;
import java.lang.*;
import java.util.*;

public class Kouka{
	public static void main(String[] args){

		//定義
		int num1;
		String str1;
		System.out.println("いくらですか");

		//標準入力
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		str1 = br.readLine();
		num1 = Integer.parseInt(str1);

		//変える
		System.out.println(changeCoin(num1));

		}catch(IOException e){}
	}

	//変える
	public static String changeCoin(int num){

		//500,100,50,10,5,1
		int[] kouka = {0,0,0,0,0,0};
		String result;		

		while(num>499){
			num = num - 500;
			kouka[0] ++;
		}while(num>99){
			num = num -100;
			kouka[1] ++;		
		}while(num>49){
			num = num - 50;
			kouka[2] ++;
		}while(num>9){
			num = num - 10;
			kouka[3] ++;
		}while(num>4){
			num = num - 5;
			kouka[4] ++;
		}
        
        kouka[5] = num;


		
		//結果
		result = "500円玉:" +kouka[0] +"\n100円玉:" +kouka[1] +"\n50円玉:" +kouka[2] +"\n10円玉:" +kouka[3] +"\n5円玉:" +kouka[4] + "\n1円玉:" + kouka[5];
		return result;
	}


}
