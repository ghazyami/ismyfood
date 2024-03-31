package com.github.ghazyami.ismyfood.off.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;


public class Images implements Serializable {

    Map<String, Object> other = new LinkedHashMap<>();

//    @JsonAnySetter
//    void setDetail(String key, Object value) {
//        other.put(key, value);
//    }


    public Map<String, Object> getOther() {
        return other;
    }

    public void setOther(Map<String, Object> other) {
        this.other = other;
    }
}
