
public class Mp3Player implements IPlayer {
    private String fileName;
    public Mp3Player(String fileName){
    	this.fileName=fileName;
    }
	
	public void play(){
		//�����ļ�
		System.out.println("����mp3�ļ�:"+ fileName);
	}
}
