package com.yiwang.javalearningbasic;

public class Sql {

    public static void main(String[] args) {
        String str= "";
        for (int i= 0;i<121;i++){
            str+="    select "+ i+" as survival_month, sum(case when survival_months >="+i+" then 1 else 0 end ) as survived, sum(case when survival_months+ 1 = "+i+" and dead = false then 1 else 0 end) as censored from jh_patient_KMTest\n" +
                    "    UNION";
        }
        System.out.println(str);
    }
}
