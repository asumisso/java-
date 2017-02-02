import java.io.*;
import java.lang.*;
import java.util.*;

public class NomalPrice {
  String productName;
  int productPrice;

  //コンストラクタ
  public NomalPrice(String productName,int productPrice) {
    this.productName = productName;
    this.productPrice = productPrice;
  }

  //文字列の標準出力メソッド
  public void productInfo() {
    System.out.println(this.productName + "は通常価格商品で" + this.productPrice + "円です。");
  }

  //商品の値段を返すメソッド
  public int productPrice() {
    return productPrice;
  }

}