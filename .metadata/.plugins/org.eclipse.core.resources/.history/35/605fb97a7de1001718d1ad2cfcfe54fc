package doudizhu;

public class Card  implements Comparable<Card>{
	private static final String[] texts = { "3", "4", "5", "6", "7", "8", "9",
			"10", "J", "Q", "K", "A", "2", "小王", "大王" };
	private static final String[] colors = { "红桃", "方块", "黑桃", "梅花" };

	// 牌的大小 3---10 11 12 13 14 15 16 17
	//               J Q  K   A  2    小 大王
	private int value;
	// 花色 1 2 3 4 5 6
	//    红 方 黑 花 小 大王
	private int type;
	public Card(int value, int type) {
		setValue(value);
		setType ( type);
	}
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		if (value < 3 || value > 17)
			throw new IllegalArgumentException("值必须在3到17之间。2为15,小王16， 大王17");
		this.value = value;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		if(type<1||type>6)
			throw new IllegalArgumentException("值1--6之间");
		this.type = type;
	}

	
	public void DrawCard() {

		System.out.print(toString());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return texts[value - 3]
				+ (type < 5 ? ("[" + colors[type - 1] + "]") : "   ");
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(! ( obj instanceof Card))
			return false;
			
		return  value-((Card)obj).value==0 ;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return value ;
	}
	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return o.value- value;
	}
}
