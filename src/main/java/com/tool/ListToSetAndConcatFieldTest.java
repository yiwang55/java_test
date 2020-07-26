package com.tool;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.*;
import java.util.stream.Collectors;

public class ListToSetAndConcatFieldTest {
    public static void main(String[] args) {
        RelevantAlterationsData relevantAlterationsData1 = new RelevantAlterationsData("gene1", "test", null, "1", null);
        RelevantAlterationsData relevantAlterationsData2 = new RelevantAlterationsData("gene1", "test", null, "1", null);
        RelevantAlterationsData relevantAlterationsData3 = new RelevantAlterationsData("gene1", "test", null, "3", null);
        RelevantAlterationsData relevantAlterationsData4 = new RelevantAlterationsData("gene1", "test", null, null, null);
        RelevantAlterationsData relevantAlterationsData5 = new RelevantAlterationsData("gene2", "test2", null, "1", null);
        RelevantAlterationsData relevantAlterationsData6 = new RelevantAlterationsData("gene2", "test2", null, "1", null);

        ArrayList<RelevantAlterationsData> relevantAlterationsData = new ArrayList<>();
        relevantAlterationsData.add(relevantAlterationsData1);
        relevantAlterationsData.add(relevantAlterationsData2);
        relevantAlterationsData.add(relevantAlterationsData3);
        relevantAlterationsData.add(relevantAlterationsData4);
        relevantAlterationsData.add(relevantAlterationsData5);
        relevantAlterationsData.add(relevantAlterationsData6);

        HashSet<RelevantAlterationsData> relevantAlterationsDataHashSet = new HashSet<>(relevantAlterationsData);
        ArrayList<RelevantAlterationsData> arrayList = new ArrayList<>(relevantAlterationsDataHashSet);

        Map<String, List<RelevantAlterationsData>> map = new HashMap<>();
        groupByGeneAndAlteration(relevantAlterationsData, map);

        for (Map.Entry me : map.entrySet()){
            List<RelevantAlterationsData> mapList = map.get(me.getKey());
            Set<String> offlabelStrings = mapList.stream().map(e -> e.getFdaApprovedOutsideIndication()).filter(v -> v !=null).collect(Collectors.toSet());
            Set<String> onlabelStrings = mapList.stream().map(e -> e.getFdaApprovedWithinIndication()).filter(v -> v !=null).collect(Collectors.toSet());
            Set<String> resistanceStrings = mapList.stream().map(e -> e.getIndicatedResistance()).filter(v -> v !=null).collect(Collectors.toSet());
            String joinOfflabelStrings = String.join(",", offlabelStrings);
            String joinOnlabelStrings = String.join(",", onlabelStrings);
            String joinResistanceStrings = String.join(",", resistanceStrings);
            mapList.forEach(o -> o.setFdaApprovedOutsideIndication(joinOfflabelStrings));
            mapList.forEach(o -> o.setFdaApprovedWithinIndication(joinOnlabelStrings));
            mapList.forEach(o -> o.setIndicatedResistance(joinResistanceStrings));
            arrayList.addAll(mapList);
        }
        HashSet<RelevantAlterationsData> dataHashSet = new HashSet<>(arrayList);
        System.out.println(dataHashSet);

    }

    public static void groupByGeneAndAlteration(List<RelevantAlterationsData> list, Map<String, List<RelevantAlterationsData>> map) {//map是用来接收分好的组的
        if (null == list || null == map) {
            return;
        }
        String key;
        List<RelevantAlterationsData> listTmp;
        for (RelevantAlterationsData val : list) {
            key = val.getGene() + "," + val.getAlteration();//按这个属性分组，map的Key
            listTmp = map.get(key);
            if (null == listTmp) {
                listTmp = new ArrayList<RelevantAlterationsData>();
                map.put(key, listTmp);
            }
            listTmp.add(val);
        }
    }
}

class RelevantAlterationsData {
    private String gene;
    private String alteration;
    private String fdaApprovedWithinIndication;
    private String fdaApprovedOutsideIndication;
    private String indicatedResistance;

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getAlteration() {
        return alteration;
    }

    public void setAlteration(String alteration) {
        this.alteration = alteration;
    }

    public String getFdaApprovedWithinIndication() {
        return fdaApprovedWithinIndication;
    }

    public void setFdaApprovedWithinIndication(String fdaApprovedWithinIndication) {
        this.fdaApprovedWithinIndication = fdaApprovedWithinIndication;
    }

    public String getFdaApprovedOutsideIndication() {
        return fdaApprovedOutsideIndication;
    }

    public void setFdaApprovedOutsideIndication(String fdaApprovedOutsideIndication) {
        this.fdaApprovedOutsideIndication = fdaApprovedOutsideIndication;
    }

    public String getIndicatedResistance() {
        return indicatedResistance;
    }

    public void setIndicatedResistance(String indicatedResistance) {
        this.indicatedResistance = indicatedResistance;
    }

    public RelevantAlterationsData(String gene, String alteration, String fdaApprovedWithinIndication, String fdaApprovedOutsideIndication, String indicatedResistance) {
        this.gene = gene;
        this.alteration = alteration;
        this.fdaApprovedWithinIndication = fdaApprovedWithinIndication;
        this.fdaApprovedOutsideIndication = fdaApprovedOutsideIndication;
        this.indicatedResistance = indicatedResistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RelevantAlterationsData)) return false;

        RelevantAlterationsData that = (RelevantAlterationsData) o;

        if (gene != null ? !gene.equals(that.gene) : that.gene != null) return false;
        if (alteration != null ? !alteration.equals(that.alteration) : that.alteration != null) return false;
        if (fdaApprovedWithinIndication != null ? !fdaApprovedWithinIndication.equals(that.fdaApprovedWithinIndication) : that.fdaApprovedWithinIndication != null)
            return false;
        if (fdaApprovedOutsideIndication != null ? !fdaApprovedOutsideIndication.equals(that.fdaApprovedOutsideIndication) : that.fdaApprovedOutsideIndication != null)
            return false;
        return indicatedResistance != null ? indicatedResistance.equals(that.indicatedResistance) : that.indicatedResistance == null;
    }

    @Override
    public int hashCode() {
        int result = gene != null ? gene.hashCode() : 0;
        result = 31 * result + (alteration != null ? alteration.hashCode() : 0);
        result = 31 * result + (fdaApprovedWithinIndication != null ? fdaApprovedWithinIndication.hashCode() : 0);
        result = 31 * result + (fdaApprovedOutsideIndication != null ? fdaApprovedOutsideIndication.hashCode() : 0);
        result = 31 * result + (indicatedResistance != null ? indicatedResistance.hashCode() : 0);
        return result;
    }
}
