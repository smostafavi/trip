package com.company;

public class Shirt {

    private String color;
    private String texture;
    private String style;
    private String pattern;
    private String sleeve;

    public Shirt() {
    }

    public Shirt(String color, String texture, String style, String pattern, String sleeve) {

        this.color = color;
        this.texture = texture;
        this.style = style;
        this.pattern = pattern;
        this.sleeve = sleeve;
    }

//    public Shirt(String color, String texture, String style, String sleeve) {
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getSleeve() {
        return sleeve;
    }

    public void setSleeve(String sleeve) {
        this.sleeve = sleeve;
    }


    @Override
    public String toString() {
        return this.color + " " + this.texture + " " + this.style + " " + this.pattern + " " + this.sleeve;
    }

}