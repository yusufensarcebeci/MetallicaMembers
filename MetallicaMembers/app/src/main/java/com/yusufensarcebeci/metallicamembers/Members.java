package com.yusufensarcebeci.metallicamembers;

import java.io.Serializable;

public class Members implements Serializable {

    String name;
    String position;
    String born;
    String info;
    int image;

    public Members(String name, String position, String born, String info, int image) {
        this.name = name;
        this.position = position;
        this.born = born;
        this.info = info;
        this.image = image;
    }
}
