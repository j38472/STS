package doudizhu;

public class DouDiZhu {

	public static void main(String[] args) {
		Cards cards = new Cards();
		System.out.println(cards.toString());
		cards.shuffle();
		System.out.println(cards.toString());
		Player[] players = new Player[3];
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player("���" + (i + 1));
		}
		Card[] tmp = cards.getCards();

		for (int n = 0; n < 3; n++)
			players[n].addCard(tmp, n * 17, 17);

		players[0].addCard(tmp, 51, 3);

		for (int n = 0; n < 3; n++)
			System.out.println(players[n].toString());
	}

}
