package com.yiwang.javalearningbasic.collections;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void lookPoker(String name,ArrayList<String> list){
        System.out.println(name+"的牌是："+ list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int i =0; i< colors.length;i++){
            for (int j =0 ;j<numbers.length;j++){
                list.add(colors[i]+numbers[j]);
            }
        }
        list.add("大王");
        list.add("小王");
        //54张扑克牌
        Collections.shuffle(list);//洗牌

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();

        for (int x = 0; x < list.size();x++){
            if (x >= list.size() - 3){
                diPai.add(list.get(x));
            }else if (x % 3 == 1){
                player1.add(list.get(x));
            }else if (x % 3 == 2){
                player2.add(list.get(x));
            }else if (x % 3 == 0){
                player3.add(list.get(x));
            }
        }
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
        lookPoker("diPai",diPai);
    }
}
