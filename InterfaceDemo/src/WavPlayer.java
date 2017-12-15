
public class WavPlayer implements IPlayer {
	    private String fileName;
	    public WavPlayer(String fileName){
	    	this.fileName=fileName;
	    }
		
		public void play(){
			//播放文件
			System.out.println("播放wav文件："+ fileName);
		}
}
