
public class Mp3Player implements IPlayer {
    private String fileName;
    public Mp3Player(String fileName){
    	this.fileName=fileName;
    }
	
	public void play(){
		//播放文件
		System.out.println("播放mp3文件:"+ fileName);
	}
}
