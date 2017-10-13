package com.jsonqiu.recyviewtype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jsonqiu.recycleviewtype.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<MySection> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mData = DataServer.getSampleData();

        SectionAdapter sectionAdapter = new SectionAdapter(R.layout.item_section_content, R.layout.def_section_head, mData);

        sectionAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

                MySection mySection = mData.get(position);
                if (mySection.isHeader)
                    Toast.makeText(MainActivity.this, mySection.header, Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, mySection.t.getName(), Toast.LENGTH_LONG).show();
            }
        });
        sectionAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(MainActivity.this, "onItemChildClick" + position, Toast.LENGTH_LONG).show();
            }
        });
        mRecyclerView.setAdapter(sectionAdapter);
    }
}
