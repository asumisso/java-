import java.io.*;
import java.lang.*;
import java.util.*;

public class TimePrice extends NomalPrice {

  //コンストラクタ
  public TimePrice(String productName,int productPrice) {
    super(productName,productPrice);

  }

  //文字列の標準出力メソッド
  public void productInfo() {
    System.out.println(this.productName + "はタイムセール品で通常価格" + this.productPrice + "円の所" + (int)(this.productPrice*0.5) + "円です。");

  }

  //商品の値段を返すメソッド
  public int productPrice() {
    int timeProductPrice = (int)(this.productPrice*0.5);
    return timeProductPrice;
  }

}