import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*; //レイアウトマネージャに必要なパッケージ

public class ColorChoice extends JFrame {

  //nameBar素材
  JLabel text,name;
  JTextField field;

  //colorList
  JList colorList;
  JScrollPane scroll;

  //button
  JButton ok,cancel,help;

  //JPanel
  JPanel nameBar = new JPanel();
  JPanel northBar = new JPanel();
  JPanel buttonBar = new JPanel();


  public ColorChoice() {

    //テキストとnameBarの素材とbuttonBarの素材
    text = new JLabel("名前を入力し、好きな色を選択してください。");
    name = new JLabel("名前:");
    field = new JTextField();
    ok = new JButton("OK");
    cancel = new JButton("キャンセル");
    help = new JButton("ヘルプ");

    //nameBar
    nameBar.setLayout(new BorderLayout());
    nameBar.add(name, BorderLayout.WEST);
    nameBar.add(field, BorderLayout.CENTER);

    //northBar(テキスト+nameBar)
    northBar.setLayout(new GridLayout(2,1));
    northBar.add(text);
    northBar.add(nameBar);

    //colorBar
    //JListを作成
    String[] colors = new String[]{"red","blue","green","yellow","pink","white","black","brown","purple","violet"};
    colorList = new JList(colors);
    //JScrollPaneを作成
    scroll = new JScrollPane(colorList);


    //buttonBar
    buttonBar.setLayout(new FlowLayout());
    buttonBar.add(ok);
    buttonBar.add(cancel);
    buttonBar.add(help);

    getContentPane().setLayout(new BorderLayout());
    getContentPane().add(northBar, BorderLayout.NORTH);
    getContentPane().add(scroll, BorderLayout.CENTER);
    getContentPane().add(buttonBar, BorderLayout.SOUTH);

    setTitle("色選択");
    setSize(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
    new ColorChoice();
  }

}