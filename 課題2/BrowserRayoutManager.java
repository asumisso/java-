import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*; //レイアウトマネージャに必要なパッケージ

public class BrowserRayoutManager extends JFrame {

  //メニューバー
  JMenuBar menuBar = new JMenuBar();
  JMenu file,edit,show,favorite,tool,help;

  //ボタン
  JPanel buttonBar = new JPanel();
  JButton back,go,cancel,renewal,home;

  //アドレスバー
  JPanel addressBar = new JPanel();
  JLabel label;
  JTextField text;
  JButton move;

  //テキストフィールド
  JTextArea area = new JTextArea();

  //ノースバー
  JPanel northBar = new JPanel();

  public BrowserRayoutManager() {

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
    buttonBar.setLayout(new GridLayout(1,5));
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
    buttonBar.add(back); //ボタンをJPanelに貼り付け
    buttonBar.add(go);
    buttonBar.add(cancel);
    buttonBar.add(renewal);
    buttonBar.add(home);

    //アドレスバー
    addressBar.setLayout(new BorderLayout());
    label = new JLabel("アドレス:"); ///要素作成
    text = new JTextField(); 
    move = new JButton("移動");
    addressBar.add(label, BorderLayout.WEST);
    addressBar.add(text, BorderLayout.CENTER);
    addressBar.add(move, BorderLayout.EAST);

    //ノースバー(ボタンとアドレスバー)
    northBar.setLayout(new GridLayout(2,1));
    northBar.add(buttonBar);
    northBar.add(addressBar);

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(northBar, BorderLayout.NORTH);
    getContentPane().add(area, BorderLayout.CENTER);



    setTitle("ブラウザ");
    setSize(500,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

  }

  public static void main(String[] args) {
    new BrowserRayoutManager();
  }




}