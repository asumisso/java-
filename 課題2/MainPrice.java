import java.io.*;
import java.lang.*;
import java.util.*;

public class MainPrice {
  public static void main(String[] args) {

    NomalPrice[] productArray = new NomalPrice[50];
    int priceResult = 0;

    try {
      File file = new File("product.txt");
      FileReader fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);

      String line; //読み込み部分
      int count = 0; //配列番号

      //Start:while
      while ((line = br.readLine()) != null) {

        //","で区切って配列に入れる。
        String[] product = line.split(",");

        //(配列の数字 0:通常orタイム 1:商品 2:値段)

        //値段をintに変える
        int price = Integer.parseInt(product[2]);

        //Start:分岐       
        if (product[0].equals("通常")) {
          //オブジェクト作成
          productArray[count] = new NomalPrice(product[1],price);
        } else if(product[0].equals("タイム")) {
          //オブジェクト作成
          productArray[count] = new TimePrice(product[1],price);
        } else {
          System.out.println("おかしす");
        }
        //End:分岐

        //オブジェクトの出力
        productArray[count].productInfo();

        //金額計算
        priceResult = priceResult + productArray[count].productPrice();

        //次の配列へ
        count++;

      }
      //End:while

      br.close();
      fr.close();

      System.out.println("");
      System.out.println("今日１日の売り上げ金額は" + priceResult + "円です。");

    } catch(IOException e) {
      System.out.println(e);
    }
    //ファイルの読み込み終わり


  }
}