
public class WavPlayer implements IPlayer {
	    private String fileName;
	    public WavPlayer(String fileName){
	    	this.fileName=fileName;
	    }
		
		public void play(){
			//�����ļ�
			System.out.println("����wav�ļ���"+ fileName);
		}
}
