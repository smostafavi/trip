package com.company;

public class Jacket {
    private String color;
    private String texture;
    private String style;
    private String pattern;

    public Jacket() {
    }
 public Jacket(String color,String texture,String style,String pattern) {

     this.color = color;
     this.texture = texture;
     this.style = style;
     this.pattern = pattern;
 }
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
    public String toString() {
        return this.color + " " + this.texture + " " + this.style + " " + this.pattern;
    }
    }
