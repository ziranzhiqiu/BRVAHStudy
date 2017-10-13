package com.jsonqiu.recyviewtype;

import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jsonqiu.recycleviewtype.R;

import java.util.List;

public class SectionAdapter extends BaseSectionQuickAdapter<MySection, BaseViewHolder> {
    public SectionAdapter(int layoutResId, int sectionHeadResId, List data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder helper, final MySection item) {
        helper.setText(R.id.header, item.header);
        helper.setVisible(R.id.more, item.isMore());
        helper.addOnClickListener(R.id.more);
    }


    @Override
    protected void convert(BaseViewHolder helper, MySection item) {
        BeanFather video = (BeanFather) item.t;
        switch (helper.getLayoutPosition() % 2) {
            case 0:
                helper.setImageResource(R.id.iv, R.mipmap.ic_launcher);
                break;
            case 1:
                helper.setImageResource(R.id.iv, R.mipmap.ic_launcher);
                break;
        }
        helper.setText(R.id.tv, video.getName());
    }
}
