package com.tool;

import com.alibaba.fastjson.JSONObject;
import com.tool.entity.CohortFilterDTO;

import java.util.List;

public class FiltersJsonToSql {
    public static void main(String[] args) {
        String s2 = "{\n" +
                "\t\"name\": \"a.1\",\n" +
                "\t\"value\": \"xx\",\n" +
                "\t\"operator\": \"=\",\n" +
                "\t\"relationship\": \"\",\n" +
                "\t\"childRelationship\": \"and\",\n" +
                "\t\"childCohortFilters\": [{\n" +
                "\t\t\"name\": \"a.2\",\n" +
                "\t\t\"value\": \"xx\",\n" +
                "\t\t\"operator\": \"=\",\n" +
                "\t\t\"relationship\": \"\",\n" +
                "\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\"childCohortFilters\": null\n" +
                "\t}]\n" +
                "}";
        String s1 = "{\n" +
                "\t\"name\": \"a.1\",\n" +
                "\t\"value\": \"xx\",\n" +
                "\t\"operator\": \"=\",\n" +
                "\t\"relationship\": \"\",\n" +
                "\t\"childRelationship\": \"and\",\n" +
                "\t\"childCohortFilters\": null\n" +
                "}";
        String s3 = "{\n" +
                "\t\"name\": \"a.1\",\n" +
                "\t\"value\": \"xx\",\n" +
                "\t\"operator\": \"=\",\n" +
                "\t\"relationship\": \"\",\n" +
                "\t\"childRelationship\": \"and\",\n" +
                "\t\"childCohortFilters\": [{\n" +
                "\t\t\"name\": \"a.2\",\n" +
                "\t\t\"value\": \"xx\",\n" +
                "\t\t\"operator\": \"=\",\n" +
                "\t\t\"relationship\": \"\",\n" +
                "\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\"childCohortFilters\": [{\n" +
                "\t\t\t\"name\": \"a.3\",\n" +
                "\t\t\t\"value\": \"xx\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"a.4\",\n" +
                "\t\t\t\"value\": \"xx\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"and\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}]\n" +
                "\t}]\n" +
                "}";
        String s4="{\n" +
                "\t\"name\": \"gender\",\n" +
                "\t\"value\": \"女\",\n" +
                "\t\"operator\": \"=\",\n" +
                "\t\"relationship\": \"\",\n" +
                "\t\"childRelationship\": \"and\",\n" +
                "\t\"childCohortFilters\": [{\n" +
                "\t\t\"name\": \"clinical_stage\",\n" +
                "\t\t\"value\": \"III\",\n" +
                "\t\t\"operator\": \"=\",\n" +
                "\t\t\"relationship\": \"\",\n" +
                "\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\"childCohortFilters\": [{\n" +
                "\t\t\t\"name\": \"cancer_type\",\n" +
                "\t\t\t\"value\": \"乳腺癌\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"race\",\n" +
                "\t\t\t\"value\": \"汉族\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"and\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}]\n" +
                "\t},\n" +
                "    {\n" +
                "\t\t\"name\": \"treatment_type\",\n" +
                "\t\t\"value\": \"放疗\",\n" +
                "\t\t\"operator\": \"=\",\n" +
                "\t\t\"relationship\": \"and\",\n" +
                "\t\t\"childRelationship\": \"and\",\n" +
                "\t\t\"childCohortFilters\": [{\n" +
                "\t\t\t\"name\": \"survival_month\",\n" +
                "\t\t\t\"value\": \"71\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"age\",\n" +
                "\t\t\t\"value\": \"76\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"or\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}]\n" +
                "\t}\n" +
                "    ]\n" +
                "}";
        String s5="[{\n" +
                "\t\"name\": \"gender\",\n" +
                "\t\"value\": \"女\",\n" +
                "\t\"operator\": \"=\",\n" +
                "\t\"relationship\": \"\",\n" +
                "\t\"childRelationship\": \"and\",\n" +
                "\t\"childCohortFilters\": [{\n" +
                "\t\t\"name\": \"clinical_stage\",\n" +
                "\t\t\"value\": \"III\",\n" +
                "\t\t\"operator\": \"=\",\n" +
                "\t\t\"relationship\": \"\",\n" +
                "\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\"childCohortFilters\": [{\n" +
                "\t\t\t\"name\": \"cancer_type\",\n" +
                "\t\t\t\"value\": \"乳腺癌\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"race\",\n" +
                "\t\t\t\"value\": \"汉族\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"and\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}]\n" +
                "\t}]\n" +
                "},\n" +
                "{\n" +
                "\t\"name\": \"gender\",\n" +
                "\t\"value\": \"男\",\n" +
                "\t\"operator\": \"=\",\n" +
                "\t\"relationship\": \"\",\n" +
                "\t\"childRelationship\": \"and\",\n" +
                "\t\"childCohortFilters\": [{\n" +
                "\t\t\"name\": \"clinical_stage\",\n" +
                "\t\t\"value\": \"III\",\n" +
                "\t\t\"operator\": \"=\",\n" +
                "\t\t\"relationship\": \"\",\n" +
                "\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\"childCohortFilters\": [{\n" +
                "\t\t\t\"name\": \"cancer_type\",\n" +
                "\t\t\t\"value\": \"乳腺癌\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}, {\n" +
                "\t\t\t\"name\": \"race\",\n" +
                "\t\t\t\"value\": \"汉族\",\n" +
                "\t\t\t\"operator\": \"=\",\n" +
                "\t\t\t\"relationship\": \"and\",\n" +
                "\t\t\t\"childRelationship\": \"or\",\n" +
                "\t\t\t\"childCohortFilters\": null\n" +
                "\t\t}]\n" +
                "\t}]\n" +
                "}\n" +
                "]";

//        CohortFilterDTO obj = JSONObject.parseObject(s1, CohortFilterDTO.class);
//        CohortFilterDTO obj = JSONObject.parseObject(s2, CohortFilterDTO.class);
//        CohortFilterDTO obj = JSONObject.parseObject(s3, CohortFilterDTO.class);
//        CohortFilterDTO obj = JSONObject.parseObject(s4, CohortFilterDTO.class);
        List<CohortFilterDTO> obj = JSONObject.parseArray(s5, CohortFilterDTO.class);

//        System.out.println(object);

//        String sql = ;
//        String sql1 = getSQL(object1);
//        System.out.println(sql1);
        StringBuilder returnSql = new StringBuilder("select * from zhiyi_patient where 1=1 and ");
        String sql2 = getSQL(obj, returnSql);
        System.out.println(sql2);
    }

    public static String getSQL(List<CohortFilterDTO> obj, StringBuilder returnSql) {
        if (obj != null && obj.size() > 0) {
            for (CohortFilterDTO o : obj) {
                returnSql.append(" " + o.getRelationship() + " ");
                returnSql.append(o.getName()).append(o.getOperator()).append("'" + o.getValue() + "'");
                if (o.getChildCohortFilters() != null && o.getChildCohortFilters().size() > 0) {
                    returnSql.append(" ").append(o.getChildRelationship()).append(" ");
                    returnSql.append("(");
                        getSQL(o.getChildCohortFilters(), returnSql);
                    returnSql.append(")");
                }
            }
        }
        return returnSql.toString();
    }
}

