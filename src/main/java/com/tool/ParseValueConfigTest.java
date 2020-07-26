package com.tool;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class ParseValueConfigTest {

    public static void main(String[] args) {
    String s = "[\n" +
            "        {\n" +
            "            \"column\":\"count(distinct \\\"PERSON_ID\\\" )\",\n" +
            "            \"aggType\":\"exp\",\n" +
            "            \"alias\":\"# of Cases\",\n" +
            "            \"id\":\"a99e2924-98ac-4f3d-a3b9-f1abaf1a7a45\",\n" +
            "            \"customTypeID\":-1,\n" +
            "            \"hideTotal\":false\n" +
//            "            \"sort\":\"desc\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"column\":\"avg(\\\"survival_month\\\")\",\n" +
            "            \"aggType\":\"avg\",\n" +
            "            \"alias\":\"Average Survival Time (in Month)\",\n" +
            "            \"customTypeID\":-1,\n" +
            "            \"hideTotal\":false\n" +
//            "            \"sort\":\"asc\"\n" +
            "        }]";

        List<ValueConfig> valueConfigs = JSON.parseArray(s, ValueConfig.class);

        String measureSortConfig = getMeasureSortConfig(valueConfigs);
        System.out.println(measureSortConfig);
    }

    private static String getMeasureSortConfig(List<ValueConfig> values) {
        StringBuilder stringBuilder = new StringBuilder();
        for (ValueConfig valueConfig : values) {
            if (valueConfig.getSort() != null && valueConfig.getSort() != "") {
                stringBuilder.append(" \"" + valueConfig.getAlias() + "-" + valueConfig.getId() + "\" " + valueConfig.getSort() + ",");
            }
        }
        if (stringBuilder.length() > 0) {
            return stringBuilder.substring(0, stringBuilder.lastIndexOf(","));
        }
        return "";
    }

}
class ValueConfig {
    private String column;
    private String aggType;
    private boolean primaryKey;
    private String totalAggType;
    private String alias;
    private String id;
    private boolean colFlag;
    /**
     * 方案Id null代表没有方案，1代表生存率方案 ，2代表 total of cancer
     */
    private String customTypeId;
    /**
     * 方案依赖的指标
     */
    private List<ValueConfig> customValue;
    private boolean hideTotal;
    private String sort;


    public String getColumn() {
        return column;
    }
    public void setColumn(String column) {
        this.column = column;
    }

    public String getAggType() {
        return aggType;
    }

    public void setAggType(String aggType) {
        this.aggType = aggType;
    }

    public boolean isPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getTotalAggType() {
        return totalAggType;
    }

    public void setTotalAggType(String totalAggType) {
        this.totalAggType = totalAggType;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomTypeId() {
        return customTypeId;
    }

    public void setCustomTypeId(String customTypeId) {
        this.customTypeId = customTypeId;
    }

    public List<ValueConfig> getCustomValue() {
        return customValue;
    }

    public void setCustomValue(List<ValueConfig> customValue) {
        this.customValue = customValue;
    }

    public boolean isHideTotal() {
        return hideTotal;
    }

    public void setHideTotal(boolean hideTotal) {
        this.hideTotal = hideTotal;
    }

    public boolean getColFlag() {
        return colFlag;
    }

    public void setColFlag(boolean colFlag) {
        this.colFlag = colFlag;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}


