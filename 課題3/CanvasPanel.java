import java.awt.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;

public class CanvasPanel extends JPanel {
  public void paintComponent(Graphics g) {
    //白
    g.setColor(new Color(255, 255, 255));
    g.fillRect(0, 0, 500, 500);
    //背景四角
    g.setColor(new Color(255,153,204));
    g.drawRoundRect(10, 10, 460, 460, 10, 10);
    //背景丸
    g.fillOval(20,20,30,30);
    g.fillOval(20,430,30,30);
    g.fillOval(430,20,30,30);
    g.fillOval(430,430,30,30);
    //黒い四角
    g.setColor(new Color(0,0,0));
    g.drawRect(100, 230, 300, 40);
    //ぷかぷか
    g.drawOval(380,200,10,10);
    g.drawOval(340,180,20,20);
    g.drawOval(387,160,30,30);
    //赤い四角
    g.setColor(new Color(255,0,0));
    g.fillRect(361,231,39,39);
    //赤い丸
    g.drawOval(30, 30, 400, 400);
    //線
    g.drawLine(340, 68, 90, 370);
    //文字
    g.setColor(new Color(100,100,100));
    g.drawString("東京女子大学内全面禁煙！！！！！！！！", 120, 450);

  }
}