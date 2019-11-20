package com.company;

public class Footware {

    private String color;
    private String material;
    private String style;
    private String pattern;

    public Footware() {


    }
        public Footware(String color, String material, String style, String pattern){
        this.color = color;
        this.material = material;
        this.style = style;
        this.pattern = pattern;
    }
        public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        return this.color + " " + this.material + " " + this.style + " " + this.pattern;
    }
}
