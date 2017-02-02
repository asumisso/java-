import java.io.*;
import java.lang.*;

public class Tikuji{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args){

        int numRead,numFind;
        String strRead,strFind;

        try{
            //何個の数字を読み取るか
            System.out.println("いくつ数字を読み取りますか?");
            strRead = br.readLine();
            numRead = Integer.parseInt(strRead);

            //配列作成
            int[] random = new int[numRead];

            //ファイルの書き込み準備
            FileWriter fw = new FileWriter("Number.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            //書き込み開始!!
            for(int i=0; i<numRead; i++){

                //乱数作成
                int k = (int)(Math.random() * 15) +1;

                //乱数配列に入れる
                random[i] = k;

                //乱数かきこみ
                pw.println("配列" +(i+1) +"番目:" +random[i]);
            }

            //ファイル終了
            pw.close();
            bw.close();
            fw.close();
            System.out.println("数字の書き込みが終了しました。");


            //探し始める

            System.out.println("どの番号を探しますか？");
            System.out.println("1~15の値を入力してください。");

            while(true) {
                strFind = br.readLine();
                numFind = Integer.parseInt(strFind);

                if (numFind > 0 && numFind <= 15) {
                    break;
                }

                System.out.println("数値は1~15までの値をいれてください");
            }


            //投げる
            findNum(numFind,random);

        }catch(IOException e){
            System.out.println("書き込みできなかったよ");
        }
    }	

    //数字探し(numRead:読み取る数 numFind:探したい数 rondom:配列)
    static void findNum(int numFind,int[] random){

        int flag = 0;

        for(int i=0; i<random.length; i++){
            if(random[i] == numFind){
                System.out.println(i+1 +"番目に" +numFind +"があります");
                flag ++;
            }
        }

        if(flag == 0){
            System.out.println("Not Found!");
        }
    }
}
