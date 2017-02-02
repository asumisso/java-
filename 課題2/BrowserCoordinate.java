import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*; //レイアウトマネージャに必要なパッケージ

public class BrowserCoordinate extends JFrame {

  //メニューバー
  JMenuBar menuBar = new JMenuBar();
  JMenu file,edit,show,favorite,tool,help;

  //ボタン
  JButton back,go,cancel,renewal,home;

  //アドレスバー
  JLabel label;
  JTextField text;
  JButton move;

  //テキストフィールド
  JTextArea area = new JTextArea();

  public BrowserCoordinate() {

    getContentPane().setLayout(null);

    //メニューバー
    setJMenuBar(menuBar);
    file = new JMenu("ファイル");
    menuBar.add(file);
    edit = new JMenu("編集");
    menuBar.add(edit);
    show = new JMenu("表示");
    menuBar.add(show);
    favorite = new JMenu("お気に入り");
    menuBar.add(favorite);
    tool = new JMenu("ツール");
    menuBar.add(tool);
    help = new JMenu("ヘルプ");
    menuBar.add(help);

    //ボタンバー(JPanel使用)
    back = new JButton("戻る"); //ボタン作成
    go = new JButton("進む");
    cancel = new JButton("キャンセル");
    renewal = new JButton("更新");
    home = new JButton("ホーム");
    back.setIcon(new ImageIcon("back.png"));
    go.setIcon(new ImageIcon("go.png"));
    cancel.setIcon(new ImageIcon("cancel.png"));
    renewal.setIcon(new ImageIcon("renewal.png"));
    home.setIcon(new ImageIcon("home.png"));
    back.setBounds(0,5,100,25); //座標指定
    go.setBounds(100,5,100,25);
    cancel.setBounds(200,5,100,25);
    renewal.setBounds(300,5,100,25);
    home.setBounds(400,5,100,25);
    getContentPane().add(back); //ボタンを置く
    getContentPane().add(go);
    getContentPane().add(cancel);
    getContentPane().add(renewal);
    getContentPane().add(home);

    //アドレスバー
    label = new JLabel("アドレス:"); //要素作成
    text = new JTextField(); 
    move = new JButton("移動");
    label.setBounds(5,30,80,25);
    text.setBounds(70,30,360,25);
    move.setBounds(440,30,60,25);
    getContentPane().add(label);
    getContentPane().add(text);
    getContentPane().add(move);

    //テキストエリア
    area.setBounds(5,60,490,435);
    getContentPane().add(area);

    setTitle("ブラウザ");
    setSize(500,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

  }

  public static void main(String[] args) {
    new BrowserCoordinate();
  }




}