package com.tool.entity;

public class KMobj {
    private Integer survivalMonths;
    private Integer survived;
    private Integer censored;

    public Integer getSurvivalMonths() {
        return survivalMonths;
    }

    public void setSurvivalMonths(Integer survivalMonths) {
        this.survivalMonths = survivalMonths;
    }

    public Integer getSurvived() {
        return survived;
    }

    public void setSurvived(Integer survived) {
        this.survived = survived;
    }

    public Integer getCensored() {
        return censored;
    }

    public void setCensored(Integer censored) {
        this.censored = censored;
    }

    public KMobj(Integer survivalMonths, Integer survived, Integer censored) {
        this.survivalMonths = survivalMonths;
        this.survived = survived;
        this.censored = censored;
    }
}
