import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
	     // IPlayer     
		 // play( )   mp3  wav mid   		 
		 // ��������    ���ļ��� ��ȡ��Ӧ�Ĳ�����
        System.out.println("�����벥���ļ�");
        Scanner in =new Scanner(System.in);
        String file=in.next();
        IPlayer player=PlayerFactory.getPlayer(file); //ʹ�ü򵥹���ģʽ��ȡ������
        if(player!=null ){
            player.play();
        }
        else
        	System.out.println("�޷����Ŵ��ļ�������ʶ��ĸ�ʽ");
		
		
	}

}
