package com.github.ghazyami.ismyfood.off.entity;

import java.io.Serializable;


public class SelectedImage implements Serializable {

    private SelectedImageItem display;

    private SelectedImageItem small;

    private SelectedImageItem thumb;

    public SelectedImageItem getDisplay() {
        return display;
    }

    public void setDisplay(SelectedImageItem display) {
        this.display = display;
    }

    public SelectedImageItem getSmall() {
        return small;
    }

    public void setSmall(SelectedImageItem small) {
        this.small = small;
    }

    public SelectedImageItem getThumb() {
        return thumb;
    }

    public void setThumb(SelectedImageItem thumb) {
        this.thumb = thumb;
    }
}
