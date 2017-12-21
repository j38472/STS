package doudizhu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cards {
	private Card[] cards;

	
	public Cards() {
		init();
	}
	/**
	 * 初始化牌
	 */
	private void init(){
		cards = new Card[54];
		int n=cards.length/4 ;
		for(int m=0;m<4;m++){
		for (int i = 0; i <n ; i++) {
           cards[m*n+ i]=new Card(i+3,m+1);
		}}
		cards[52]=new Card(16,5); //小王
		cards[53]=new Card(17,6); //大王
	}
	
	public void shuffle(){
		List<Card> lst=Arrays.asList(cards);
	    Collections.shuffle(lst);
	    lst.toArray(cards);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sbd=new StringBuilder(300);
		for (int i = 0; i < cards.length; i++) {
			sbd.append(cards[i]+" ");
		}
		return sbd.toString();
	}
	public Card[] getCards() {
		return cards;
	}
	public void setCards(Card[] cards) {
		this.cards = cards;
	}
}
