import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GreetingWindow extends JFrame implements ActionListener,KeyListener {

  //部品の変数宣言

  //ラジオボタン
  JRadioButton morning = new JRadioButton("朝");
  JRadioButton evening = new JRadioButton("昼");
  JRadioButton night = new JRadioButton("夜");
  ButtonGroup group = new ButtonGroup();

  //名前
  JLabel tag = new JLabel("名前:");
  JTextField name = new JTextField();

  //挨拶ボタン
  JButton greeting = new JButton("挨拶");

  //表示部分
  JLabel asa = new JLabel("");
  JLabel hiru = new JLabel("");
  JLabel yoru = new JLabel("");

  //JPanel
  JPanel namePanel = new JPanel();
  JPanel south = new JPanel();
  JPanel east = new JPanel();
  JPanel center = new JPanel();

  public GreetingWindow() {

    //ラジオボタン
    group.add(morning);
    group.add(evening);
    group.add(night);
    east.setLayout(new GridLayout(3,1));
    east.add(morning);
    east.add(evening);
    east.add(night);

    //名前
    namePanel.setLayout(new BorderLayout());
    namePanel.add(tag, BorderLayout.WEST);
    namePanel.add(name, BorderLayout.CENTER);

    //名前+挨拶
    south.setLayout(new GridLayout(2,1));
    south.add(namePanel);
    south.add(greeting);

    //表示部分
    center.setLayout(new GridLayout(3,1));
    center.add(asa);
    center.add(hiru);
    center.add(yoru);

    //main
    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(south, BorderLayout.SOUTH);
    getContentPane().add(east, BorderLayout.EAST);
    getContentPane().add(center, BorderLayout.CENTER);

    //アクションリスナー:決定ボタン
    greeting.addActionListener(this);
    //アクションリスナー:名前取得
    name.addActionListener(this);
    //アクションリスナー:ラジオボタン
    morning.addActionListener(this);
    evening.addActionListener(this);
    night.addActionListener(this);
    //アドキーリスナー:エンター
    name.addKeyListener(this);

    //基本設定
    setTitle("Greeting Window");
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  //アクションリスナー

  //ボタン押した時
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == greeting) {
        process();
    }
  }

  //キーおしたとき
  public void keyReleased(KeyEvent e) {
    if(KeyEvent.VK_ENTER == e.getKeyCode()) {
      process();
    }
  }
  public void keyTyped(KeyEvent e) {}
  public void keyPressed(KeyEvent e) {}

  //やること
  public void process() {

    //名前とる
    String string = name.getText();

    //条件分岐
    if (morning.isSelected() == true) {

      asa.setText("おはよう," + string + "!");

    } else if(evening.isSelected() == true) {

      hiru.setText("こんちゃ," + string + "!");

    } else if(night.isSelected() == true) {

      yoru.setText("こんばんは," + string + "!");

    } else {

      System.out.println("名前がちゃんと入力されてないかボタンが選択されてない可能性があります。");

    }

  }

  public static void main(String[] args) {
    new GreetingWindow();  
  }

}