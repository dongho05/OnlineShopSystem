/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author phung
 */
public class Slider {
    private int sliderID;
    private String title;
    private String sliderContent;
    private String img;
    private boolean status;
    private String link;

    public Slider() {
    }

    public Slider(int sliderID, String title, String sliderContent, String img, boolean status, String link) {
        this.sliderID = sliderID;
        this.title = title;
        this.sliderContent = sliderContent;
        this.img = img;
        this.status = status;
        this.link = link;
    }

    public int getSliderID() {
        return sliderID;
    }

    public void setSliderID(int sliderID) {
        this.sliderID = sliderID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSliderContent() {
        return sliderContent;
    }

    public void setSliderContent(String sliderContent) {
        this.sliderContent = sliderContent;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Slider{" + "sliderID=" + sliderID + ", title=" + title + ", sliderContent=" + sliderContent + ", img=" + img + ", status=" + status + ", link=" + link + '}';
    }
    
}
