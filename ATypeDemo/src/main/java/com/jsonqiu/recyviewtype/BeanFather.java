package com.jsonqiu.recyviewtype;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class BeanFather {
    private String img;
    private String name;

    public BeanFather(String img, String name) {
        this.img = img;
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
