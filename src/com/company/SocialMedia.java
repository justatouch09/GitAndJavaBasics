package com.company;

/**
 * Created by jaradtouchberry on 3/28/17.
 */
public class SocialMedia {
    String style;
    String font;
    int pictures;
    int characters;
    boolean webpage;

    public boolean isWebpage() {
        return webpage;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setStyle(String style) {
        if (this.style.contains("Bold")) {
            System.out.println("This is the right font");
            this.style = style;
        }

        }
    }




