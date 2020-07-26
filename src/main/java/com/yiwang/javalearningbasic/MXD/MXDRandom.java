package com.yiwang.javalearningbasic.MXD;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MXDRandom {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(0,"冒险家-英雄");map.put(1,"冒险家-圣骑士");map.put(2,"冒险家-黑骑士");map.put(3,"冒险家-火毒");map.put(4,"冒险家-冰雷");map.put(5,"冒险家-主教");
        map.put(6,"冒险家-神射手");map.put(7,"冒险家-箭神");map.put(8,"冒险家-隐士");map.put(9,"冒险家-侠盗");map.put(10,"冒险家-暗影双刀");
        map.put(11,"冒险家-冲锋队长");map.put(12,"冒险家-船长");map.put(13,"冒险家-火炮手");

        map.put(14,"反抗者-恶魔猎手");map.put(15,"反抗者-恶魔复仇者");map.put(16,"反抗者-爆破手");map.put(17,"反抗者-唤灵斗师");map.put(18,"反抗者-豹弩游侠");
        map.put(19,"反抗者-机械师");map.put(20,"反抗者-尖兵");

        map.put(21,"英雄-战神");map.put(22,"英雄-龙神");map.put(23,"英雄-夜光法师");map.put(24,"英雄-双弩精灵");map.put(25,"英雄-幻影");map.put(26,"英雄-隐月");

        map.put(27,"骑士团-米哈尔");map.put(28,"骑士团-魂骑士");map.put(29,"骑士团-炎术士");map.put(30,"骑士团-风灵使者");map.put(31,"骑士团-夜行者");map.put(32,"骑士团-奇袭者");

        map.put(33,"诺巴-狂龙战士");map.put(34,"诺巴-爆莉萌天使");map.put(35,"诺巴-凯德纳");

        map.put(36,"其他-超能力者");map.put(37,"其他-神之子");

        map.put(38,"达恩维尔-林之灵");map.put(39,"晓之阵-阴阳师");map.put(40,"晓之阵-剑豪");
        map.put(41,"龙的传人");map.put(42,"Jett");

        Random random = new Random();
        int i = random.nextInt(43);

        System.out.println(i);
        System.out.println(map.get(i));
    }
}
