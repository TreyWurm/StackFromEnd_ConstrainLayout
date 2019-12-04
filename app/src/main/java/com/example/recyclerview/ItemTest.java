package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractFlexibleItem;
import eu.davidea.flexibleadapter.items.IFlexible;
import eu.davidea.viewholders.FlexibleViewHolder;

class ItemTest extends AbstractFlexibleItem<ItemTest.VHTest> {
    private String title;

    public ItemTest(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        return o == this;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item_test;
    }

    @Override
    public VHTest createViewHolder(View view, FlexibleAdapter<IFlexible> adapter) {
        return new VHTest(view, adapter);
    }

    @Override
    public void bindViewHolder(FlexibleAdapter<IFlexible> adapter, VHTest holder, int position, List<Object> payloads) {
        holder.update(title);
    }

    static class VHTest extends FlexibleViewHolder {

        private TextView tvTitle;

        public VHTest(View view, FlexibleAdapter<IFlexible> adapter) {
            super(view, adapter);
            tvTitle = view.findViewById(R.id.tv_title);
        }

        public void update(String title) {
            tvTitle.setText(title);
        }
    }
}
