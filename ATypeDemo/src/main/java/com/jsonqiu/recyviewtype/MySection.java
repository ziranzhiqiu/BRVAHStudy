package com.jsonqiu.recyviewtype;

import com.chad.library.adapter.base.entity.SectionEntity;

public class MySection extends SectionEntity<BeanFather> {
    private boolean isMore;
    public MySection(boolean isHeader, String header, boolean isMroe) {
        super(isHeader, header);
        this.isMore = isMroe;
    }

    public MySection(BeanFather t) {
        super(t);
    }

    public boolean isMore() {
        return isMore;
    }

    public void setMore(boolean mroe) {
        isMore = mroe;
    }
}
