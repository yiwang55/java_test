package com.tool;

import com.tool.entity.KMobj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class KMCal {
    public static void main(String[] args) {
        KMobj[] arr = new KMobj[]{
                new KMobj(0, 30670, 1),
                new KMobj(1, 30669, 205),
                new KMobj(2, 29881, 199),
                new KMobj(3, 28951, 104),
                new KMobj(4, 28330, 90),
                new KMobj(5, 27849, 74),
                new KMobj(6, 27336, 66),
                new KMobj(7, 26803, 88),
                new KMobj(8, 26355, 83),
                new KMobj(9, 25888, 91),
                new KMobj(10, 25311, 74),
                new KMobj(11, 24608, 79),
                new KMobj(12, 24026, 106),
                new KMobj(13, 23358, 192),
                new KMobj(14, 22609, 215),
                new KMobj(15, 21550, 179),
                new KMobj(16, 20697, 176),
                new KMobj(17, 19811, 162),
                new KMobj(18, 18744, 159),
                new KMobj(19, 17966, 170),
                new KMobj(20, 17265, 169),
                new KMobj(21, 16453, 176),
                new KMobj(22, 15759, 168),
                new KMobj(23, 15041, 123),
                new KMobj(24, 14673, 135),
                new KMobj(25, 14091, 141),
                new KMobj(26, 13384, 130),
                new KMobj(27, 12800, 119),
                new KMobj(28, 12243, 122),
                new KMobj(29, 11776, 99),
                new KMobj(30, 11279, 87),
                new KMobj(31, 10906, 118),
                new KMobj(32, 10359, 109),
                new KMobj(33, 9622, 98),
                new KMobj(34, 9127, 88),
                new KMobj(35, 8535, 90),
                new KMobj(36, 8266, 88),
                new KMobj(37, 7972, 96),
                new KMobj(38, 7538, 100),
                new KMobj(39, 7157, 80),
                new KMobj(40, 6932, 68),
                new KMobj(41, 6782, 73),
                new KMobj(42, 6676, 63),
                new KMobj(43, 6572, 58),
                new KMobj(44, 6392, 58),
                new KMobj(45, 6010, 46),
                new KMobj(46, 5763, 59),
                new KMobj(47, 5452, 44),
                new KMobj(48, 5283, 59),
                new KMobj(49, 5148, 46),
                new KMobj(50, 5038, 64),
                new KMobj(51, 4789, 56),
                new KMobj(52, 4535, 46),
                new KMobj(53, 4335, 46),
                new KMobj(54, 4205, 39),
                new KMobj(55, 3704, 40),
                new KMobj(56, 3546, 30),
                new KMobj(57, 3316, 30),
                new KMobj(58, 3254, 30),
                new KMobj(59, 3208, 34),
                new KMobj(60, 3137, 42),
                new KMobj(61, 2992, 31),
                new KMobj(62, 2853, 38),
                new KMobj(63, 2791, 43),
                new KMobj(64, 2739, 31),
                new KMobj(65, 2583, 39),
                new KMobj(66, 2534, 25),
                new KMobj(67, 2435, 39),
                new KMobj(68, 2275, 33),
                new KMobj(69, 2166, 31),
                new KMobj(70, 2131, 24),
                new KMobj(71, 2096, 22),
                new KMobj(72, 2057, 27),
                new KMobj(73, 1999, 24),
                new KMobj(74, 1877, 25),
                new KMobj(75, 1806, 30),
                new KMobj(76, 1761, 23),
                new KMobj(77, 1697, 18),
                new KMobj(78, 1568, 19),
                new KMobj(79, 1543, 27),
                new KMobj(80, 1410, 20),
                new KMobj(81, 1227, 22),
                new KMobj(82, 1202, 26),
                new KMobj(83, 1161, 21),
                new KMobj(84, 1124, 23),
                new KMobj(85, 1068, 14),
                new KMobj(86, 1008, 22),
                new KMobj(87, 982, 23),
                new KMobj(88, 952, 24),
                new KMobj(89, 923, 17),
                new KMobj(90, 882, 14),
                new KMobj(91, 862, 15),
                new KMobj(92, 839, 17),
                new KMobj(93, 814, 9),
                new KMobj(94, 801, 13),
                new KMobj(95, 782, 14),
                new KMobj(96, 762, 13),
                new KMobj(97, 743, 7),
                new KMobj(98, 733, 13),
                new KMobj(99, 715, 12),
                new KMobj(100, 699, 20),
                new KMobj(101, 674, 7),
                new KMobj(102, 651, 8),
                new KMobj(103, 642, 10),
                new KMobj(104, 628, 12),
                new KMobj(105, 609, 6),
                new KMobj(106, 601, 12),
                new KMobj(107, 587, 7),
                new KMobj(108, 579, 14),
                new KMobj(109, 560, 14),
                new KMobj(110, 544, 14),
                new KMobj(111, 529, 10),
                new KMobj(112, 516, 6),
                new KMobj(113, 507, 9),
                new KMobj(114, 495, 10),
                new KMobj(115, 483, 2),
                new KMobj(116, 475, 11),
                new KMobj(117, 463, 9),
                new KMobj(118, 452, 6),
                new KMobj(119, 441, 5),
                new KMobj(120, 433, 9)};
        List<KMobj> list = Arrays.asList(arr);
        List<String[]> strings = CalKMValue(list);
        System.out.println(strings);

    }

    private static List<String[]> CalKMValue(List<KMobj> list) {
        List<String[]> KMResultList = new LinkedList<>();
        String KMValue = "";
        String[] KMValueArray = new String[]{};
        for (int i = 0; i < list.size(); i++) {
//                for (int j = 0; j < list.get(i).length; j++) {
            if (0 == list.get(i).getSurvivalMonths()) {
                KMResultList.add((i + "," + "1").split(","));
                KMValue = "1";
                continue;
            } else {
                KMValue = 0 == list.get(i).getSurvived() ? "0" : (Double.parseDouble(list.get(i).getSurvived().toString())
                        / ((Double.parseDouble(list.get(i - 1).getSurvived().toString()) - Double.parseDouble(list.get(i - 1).getCensored().toString())) == 0.0
                                ? (Double.parseDouble(list.get(i).getSurvived().toString()))
                                    : (Double.parseDouble(list.get(i - 1).getSurvived().toString()) - Double.parseDouble(list.get(i - 1).getCensored().toString()))))
                                        * Double.parseDouble(KMValue) + "";
                KMResultList.add((i + "," + KMValue).split(","));
            }
        }
//            }
        return KMResultList;
    }

}
