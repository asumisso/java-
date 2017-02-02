import java.io.*;
import java.lang.*;

public class Atm{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //main
    public static void main(String[] args){
	
		int yokin = 9999;
		int pass = 1013;

        System.out.println("残高は" + yokin + "です。");
		System.out.println("引き出しは1を、預け入れは2を入力してください");

		try{
			
			String str = br.readLine();
			int num = Integer.parseInt(str);

			if((num == 1) || (num == 2)){
				password(num,pass,yokin);
			}else{
				System.out.println("ha-i");
			}

		}
		catch(IOException e){
			System.out.println("main string miss");
		}

	}
    
    //引き出し
	static void hikidashi(int yokin){

        
        try{
                //一回目に必ず聞く
		        System.out.println("いくら引き出しますか？");
                String str = br.readLine();
                int num = Integer.parseInt(str);
            while(yokin<num){

                //預金が引き出す量を超えるまで
                System.out.println("残額が足りません。" );
                System.out.println("もう一度入力してください。");
                str = br.readLine();
                num = Integer.parseInt(str);
            }

            //超えたら
            System.out.println(num + "円引き出しました。");
            System.out.println("残高は" + (yokin - num) +"円です。") ;
          

        }catch(IOException e){
            System.out.println("hikidasi miss");
        }
	}

    //預け入れ
	static void azukeire(int yokin){
        

        try{
            System.out.println("いくら預けますか？");
            String str = br.readLine();
            int num = Integer.parseInt(str);
            System.out.println("残高は" +yokin +num +"円です");

        }catch(IOException e){
            System.out.println("azukeire miss");    
        }

	}

    //パスワード。dousa:1 or 2。pass:1013
	static void password(int dousa,int pass,int yokin){
        
        //カウント用
        int missPass = 0;

        try{  
            //四回
            for(int i=0; i<4; i++){
    
                System.out.println("パスワードを入力してください。");
		        String str = br.readLine();
                int num = Integer.parseInt(str);
                
                //合ってたらbreak
                if (num == pass){break;}
                
                //カウント
                missPass++;
            }
            
            //条件分岐
            if(missPass==4){
                System.out.println("パスワード再入力が上限を達しました。");
            }else if(dousa == 1){
                hikidashi(yokin);
            }else if(dousa == 2){
                azukeire(yokin);
            }
        }catch(IOException e){
            System.out.println("pass miss");
        }
    }
}

