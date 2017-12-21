package doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
    private ArrayList<Card> cards=new ArrayList<Card>();
    private String name;
    public Player(String name){
    	this.name=name;
    }
    
	public ArrayList<Card> getCards() {
		return cards;
	}
	 
	public String getName() {
		return name;
	}
	public void addCard(Card card){
		cards.add(card);
		Collections.sort(cards);
	}
    public void addCard(Card[] cards,int begin,int count ){
    	count +=begin;
    	for(int n=begin;n<count;n++){
    		this.cards.add(cards[n]);
    	}
    	Collections.sort(this.cards);     	
    }
	
	public void outCard(int[] indexs){
		for (int i = cards.size()-1; i >=0 ; i--) {
			for (int j = 0; j < indexs.length; j++) {
				if(i==indexs[j]){
					cards.remove(i);
					break;
				}
					
			}
		} 
	}
    
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sbd =new StringBuilder(cards.size()*6+name.length()+2);
		sbd.append(name);
		sbd.append(":");
		for (int i = 0; i < cards.size(); i++) {
			sbd.append(cards.get(i));
		}
		return sbd.toString();
	}
    
}
