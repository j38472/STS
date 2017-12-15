
public interface IProgress {
	/**
	 * 
	 * @param percent 当期进度百分比
	 * @param amount  任务总数
	 */
    public void progress(double percent,int amount);
}
