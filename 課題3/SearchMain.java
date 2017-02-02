import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SearchMain extends JFrame implements ActionListener {

  JMenuBar bar = new JMenuBar();
  JMenu file = new JMenu("ファイル");
  JMenu edit = new JMenu("編集");
  JMenuItem open = new JMenuItem("開く");
  JMenuItem search = new JMenuItem("検索");

  public SearchMain() {

    //メニュー作成
    setJMenuBar(bar);
    //メニュー1
    bar.add(file);
    bar.add(edit);
    //メニュー2
    file.add(open);
    edit.add(search);

    //アクションリスナー
    open.addActionListener(this);
    search.addActionListener(this);

    //基本設定
    setTitle("メニューバー");
    setSize(350,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    if (e.getSource() == open) {
      new SearchOpen();
    } else if(e.getSource() == search) {
      new SearchSearch();
    }

   } 
  public static void main(String[] args) {
    new SearchMain();
  }
}