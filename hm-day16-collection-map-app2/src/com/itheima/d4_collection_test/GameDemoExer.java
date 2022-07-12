package com.itheima.d4_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author liyuan_start
 * @create 2022-07-09 20:41
 */
public class GameDemoExer {
    public static List<Card> allCards = new ArrayList<>();

    static {

        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] colors = {"♠", "♥", "♣", "♦"};

        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                Card card = new Card(size, color, index);
                allCards.add(card);
            }
        }

        Card smallCard = new Card("", "🃏", ++index);
        Card bigCard = new Card("", "👲", ++index);
        Collections.addAll(allCards, smallCard, bigCard);
        System.out.println("新牌： " + allCards);

    }

    public static void main(String[] args) {
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        List<Card> playerOne = new ArrayList<>();
        List<Card> playerTwo = new ArrayList<>();
        List<Card> playerThree = new ArrayList<>();
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card card = allCards.get(i);
            if (i % 3 == 0) {
                playerOne.add(card);
            } else if (i % 3 == 1) {
                playerTwo.add(card);
            } else if (i % 3 == 2) {
                playerThree.add(card);
            }
        }
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());

        sortCards(playerOne);
        sortCards(playerTwo);
        sortCards(playerThree);

        System.out.println("玩家1的牌是：" + playerOne);
        System.out.println("玩家2的牌是：" + playerTwo);
        System.out.println("玩家3的牌是：" + playerThree);
        System.out.println("三张底牌：" + lastThreeCards);

    }

    private static void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {

                return o2.getIndex() - o1.getIndex();
            }
        });

    }

}
