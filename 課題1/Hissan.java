import java.io.*;
import java.lang.*;

public class Hissan{
    public static void main(String[] args){
        try{
            int maxLength=0;
            String str1,str2;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            //一個目の数字
            System.out.println("一つ目の数字を入力してください");
            str1 = br.readLine();

            //二個目の数字
            System.out.println("二つ目の数字を入力してください");
            str2 = br.readLine();

            //maxLength = ケタん数のでかい方+ 1(くりあがり用)
            if(str1.length()>str2.length()){
                maxLength = str1.length() +1;
            }else{
                maxLength = str2.length() +1;
            }

            //配列に詰める!!
            int[] num1 = bunkatu(str1,maxLength);
            int[] num2 = bunkatu(str2,maxLength);

            //計算結果!!
            System.out.print("計算結果は");
            for(int i:keisan(num1,num2)){
                System.out.print(i);
            }
            System.out.println("です。");

        }catch(IOException e){
            System.out.println("aa");
        }
    }

    //数字を分割して配列に詰め込む
    static int[] bunkatu(String str,int maxLength){

        int[] num = new int[maxLength];
        int y=0;

        //配列に数字を右詰めでつめる
        for(int i=(maxLength-str.length()); i<maxLength; i++){

            String k;
            k = str.substring(y,y+1);
            num[i] = Integer.parseInt(k); 
            y++;

            //確認
            //for(int x:num){
            //    System.out.print(x);
            //}
            //System.out.println("");

        }
        return num;
    }

    //計算
    static int[] keisan(int[] num1, int[] num2){

        int[] sum = new int[num1.length];

        //配列の右側から足し算する
        for(int i=num1.length-1; i>0; i--){
            sum[i] = num1[i] + num2[i];

            //10よりでかくなったらくり上げる
            if(sum[i]>=10){
                sum[i] = sum[i] - 10;
                sum[i-1]++;
            }
        }
        return sum;
    }
}
