package com.github.ghazyami.ismyfood.off.entity;

import java.io.Serializable;



public class LanguagesCodes implements Serializable  {

    private String en;

    private String fr;

    private String pl;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getPl() {
        return pl;
    }

    public void setPl(String pl) {
        this.pl = pl;
    }
}
