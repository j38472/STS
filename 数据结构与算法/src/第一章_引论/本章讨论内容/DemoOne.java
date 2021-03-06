package 第一章_引论.本章讨论内容;

/**
 * 设有一组随机的N个数而要确定其中第K个最大值 {1,2,3,4,5,6,7,8}的第2大的是6索引的7
 * {84,21,4,5,1,54,68,524,58,454,6584,534,586,} 的第2小的是2索引的4
 * 
 * 思路: 首先找到该数组中的最大数 声明一个长度为这个最大数的的长度的数组 在将该数组中的数依次放入对应索引的位置
 *  该方法缺点: 
 * 		{9999999999999999999,4}等数组
 * 
 * @author Administrator
 *
 */
public class DemoOne {
	public static void main(String[] args) {
		int k = 20;
		int[] is = new int[30000000];
		for (int i = 0; i < is.length; i++) {
			is[i] = RandomNumber(1, 200);
		}
		// for (int i = 0; i < is.length; i++) {
		// if (is[i]==199) {
		// System.out.println("is中的"+i+"座标是200");
		// break;
		// }
		// }
		long i = System.currentTimeMillis();
		System.out.println(Demo(k, is));
		System.out.println(System.currentTimeMillis()-i+"毫秒");
	}

	/**
	 * 
	 * @param k
	 *            第K个大数
	 * @param is
	 *            数组
	 */
	public static int Demo(int k, int[] is) {
		int kNumber = 0;
		// A 找出最大数
		int max = 0;
		for (int j = 0; j < is.length; j++) {
			if (max < is[j])
				max = is[j];
		}
		// A end
		// B 声明一个长度为这个最大数的的长度的数组
		int myIs[] = new int[max];
		for (int i = 0; i < is.length; i++) {
			myIs[is[i] - 1] = is[i];
		}
		// B end
		// C 找到第K个大的数
		for (int i = myIs.length - 1; i >= 0; i--) {
			if (myIs[i] != 0) {
				if (k == 0) {
					kNumber = myIs[i];
					break;
				} else {
					k--;
					continue;
				}
			}
		}
		return kNumber;
	}

	/**
	 * 包含start 不包含end
	 * 
	 * @param start
	 *            初始值
	 * @param end
	 *            结束值
	 * @return 每次产生的随机数
	 */
	public static int RandomNumber(int start, int end) {
		// 首先声明这个是强制转换成int类型的数值
		// 调用lang包内的Math中的random的方法 她可以返回一个为伪随机的带正号的大于等于0.0小于0.1的double数值
		// 最后加上start是为了在Math.random()获取到0 之后 也可以保证return的数值大于等于start
		return (int) (Math.random() * (end - start) + start);
	}
}
