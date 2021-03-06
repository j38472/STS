package com.zgcxueyuan.day3;

import java.util.*;

/**
 * 模拟斗地主洗牌和发牌，同时对牌进行排序的代码实现
 * 
 * @author Administrator
 *
 */
public class Figure {
	private static String pokerShape[] = { "方块", "梅花", "红心", "黑桃" };
	private static String pokercoder[] = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };

	public static void main(String[] args) {
		ArrayList<Poker> al = new ArrayList<>();
		al.add(new Poker(160, "大王" ));
		al.add(new Poker(150, "小王" ));
		for (int i = 0; i < pokerShape.length; i++) {
			int count = 2; // 指针
			for (int j = 0; j < pokercoder.length; j++) {
				al.add(new Poker(count++, pokerShape[i] + pokercoder[j] ));
			}
		}
		
		
		
		Collections.shuffle(al);//洗牌
		
		ArrayList< Poker>cards = new ArrayList<>();
		ArrayList< Poker>playerOne = new ArrayList<>();
		ArrayList< Poker>playerTwo = new ArrayList<>();
		ArrayList< Poker>playerThree = new ArrayList<>();
		
		//判断谁当地主  用随机数
		for (int j = 0; j<54; j++) {
			if (j<3) {
				cards.add(al.get(j));
			}else if (j%3==0) {
				playerOne.add(al.get(j));
			}else if (j%3==1) {
				playerTwo.add(al.get(j));
			}else {
				playerThree.add(al.get(j));
			}
		}
		
		//给地主牌
		ArrayList<Poker> player;
		if (randomNumber()==0) {
			player=playerOne;
		}else if (randomNumber()==1) {
			player=playerTwo;
		}else  {
			player=playerThree;
		}
		landlordPoker(player,cards);
		
		
		
		getPoker(cards);
		getPoker(playerOne);
		getPoker(playerTwo);
		getPoker(playerThree);
		
		TreeSet<Poker> cardsTS = new TreeSet<Poker>(new MyCompare());// cards 底牌
		TreeSet<Poker> playerOneTS = new TreeSet<>(new MyCompare());// playerOne 玩家1
		TreeSet<Poker> playerTwoTS = new TreeSet<>(new MyCompare());// playerTwo 玩家2
		TreeSet<Poker> playerThreeTS = new TreeSet<>(new MyCompare());// playerThree 玩家3
		

		cardsTS.addAll(cards);
		playerOneTS.addAll(playerOne);
		playerTwoTS.addAll(playerTwo);
		playerThreeTS.addAll(playerThree);
		
		System.out.println("-------------------------------------------------------");
		
		getPoker(cardsTS);
		getPoker(playerOneTS);
		getPoker(playerTwoTS);
		getPoker(playerThreeTS);
		
//		for (int i = 0; i < al.size(); i++) {
//			for (int j = i+1; j < al.size(); j++) {
//				if (al.get(i).hashCode()==al.get(j).hashCode()||al.get(i).equals(al.get(j))) {
//					System.out.println(i+"   "+j);
//				}
//			}
//			
//		}
		
//		for (int i = 0; i < 54; i++) {
//			if (i < 3) {// cards 底牌
//				cards.add(al.get(i));
//				
//			} else if (i>=3&&i<20) {// playerOne 玩家1
//			  if(	!playerOne.add(al.get(i)))
//				System.out.println(al.get(i));  
//
//			} else if (i>=20&&i<37) {// playerTwo 玩家2
//				playerTwo.add(al.get(i));
//
//			} else if(i>=37&&i<54){// playerThree 玩家3
//				playerThree.add(al.get(i));
//			}
//		}
		// int landlord = randomNumber();
		// if (landlord==0) {
		// for (Iterator<Poker> card = cards.iterator(); cards.isEmpty();) {
		// playerOne.add(card.next());
		// }
		// System.out.println("1是地主");
		// }else if (landlord==1) {
		// for (Iterator<Poker> card = cards.iterator(); cards.isEmpty();) {
		// playerTwo.add(card.next());
		// }
		// System.out.println("2是地主");
		// }else {
		// for (Iterator<Poker> card = cards.iterator(); cards.isEmpty();) {
		// playerThree.add(card.next());
		// }
		// System.out.println("3是地主");
		// }
//		System.out.print("cards:");
//		getPoker(cards);
//		System.out.print("playerOne:");
//		getPoker(playerOne);
//		System.out.print("playerTwo:");
//		getPoker(playerTwo);
//		System.out.print("playerThree:");
//		getPoker(playerThree);
		
		System.out.println();
	}
	/**
	 * 把底牌给地主
	 * @param landlord 地主
	 * @param cards 底牌牌
	 */
	private static void landlordPoker(ArrayList<Poker> landlord , ArrayList<Poker> cards) {
		for (Iterator<Poker> iterator = cards.iterator(); iterator.hasNext();) {
			Poker poker = (Poker) iterator.next();
			landlord.add(poker);
		}
	}
	/**
	 * 看牌
	 * @param pokers 要看的牌
	 */
	private static void getPoker(ArrayList<Poker> pokers){
		for (Iterator<Poker> iterator = pokers.iterator();iterator.hasNext();) {
			Poker poker = iterator.next();
			System.out.print(poker.getName() + " ");
		}
		System.out.print("	"	);
		System.out.println("共有"+pokers.size()+"张牌");
	}

	private static void getPoker(TreeSet<Poker> pokes) {
		for (Iterator<Poker> iterator = pokes.iterator(); iterator.hasNext();) {
			Poker poke = iterator.next();
			System.out.print(poke.getName() + " ");
		}
		System.out.print("	"	);
		System.out.println("共有"+pokes.size()+"张牌");
	}

	/**
	 * 随机数用来产出地主的
	 * 
	 * @return 0——one 1——two ?——Three
	 */
	private static int randomNumber() {
		return (int) (Math.random() * 2);
	}

}
