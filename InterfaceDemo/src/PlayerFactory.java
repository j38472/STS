
public class PlayerFactory {
	
    public static IPlayer getPlayer(String fileName){
    	//根据文件扩展名返回对应的播放器
       	String extName= 
    			fileName.substring(fileName.lastIndexOf('.')+1);
    	switch(extName.toLowerCase()){
    	case "mp3":
    		return new Mp3Player(fileName);
    	case "wav":
    		return new WavPlayer(fileName);
    		
    	}
       	return null;
       	
    }
	
}
