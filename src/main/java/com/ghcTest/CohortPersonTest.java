package com.ghcTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class CohortPerson{
    private Long cohortId;
    private Long personId;

    public CohortPerson(Long cohortId, Long personId) {
        this.cohortId = cohortId;
        this.personId = personId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CohortPerson that = (CohortPerson) o;
        return Objects.equals(cohortId, that.cohortId) &&
                Objects.equals(personId, that.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cohortId, personId);
    }
}

public class CohortPersonTest {
    public static void main(String[] args) {
        List<CohortPerson> list = new ArrayList<>();
        Long i= 0L;
        while(i < 1000000){
            list.add(new CohortPerson(1L, i));
            i++;
        }

        CohortPerson cohortPerson = new CohortPerson(1L, 890000L);
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(list.contains(cohortPerson));
        System.out.println(end);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println((start-end));
    }
}
