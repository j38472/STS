import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
	     // IPlayer     
		 // play( )   mp3  wav mid   		 
		 // 工厂方法    传文件名 获取对应的播放器
        System.out.println("请输入播放文件");
        Scanner in =new Scanner(System.in);
        String file=in.next();
        IPlayer player=PlayerFactory.getPlayer(file); //使用简单工厂模式获取播放器
        if(player!=null ){
            player.play();
        }
        else
        	System.out.println("无法播放此文件，不能识别的格式");
		
		
	}

}
