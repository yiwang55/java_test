package com.tool.entity;

import java.util.List;

public class CohortFilterDTO {
    private String name;
    private String value;
    private String operator;
    private String relationship;
    private String childRelationship;
    private List<CohortFilterDTO> childCohortFilters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getChildRelationship() {
        return childRelationship;
    }

    public void setChildRelationship(String childRelationship) {
        this.childRelationship = childRelationship;
    }

    public List<CohortFilterDTO> getChildCohortFilters() {
        return childCohortFilters;
    }

    public void setChildCohortFilters(List<CohortFilterDTO> childCohortFilters) {
        this.childCohortFilters = childCohortFilters;
    }
}

