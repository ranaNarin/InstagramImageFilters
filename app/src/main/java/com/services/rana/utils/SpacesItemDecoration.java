package com.services.rana.utils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by narinder on 12/12/17.
 */

public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public SpacesItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        if (parent.getChildAdapterPosition(view) == state.getItemCount() - 1) {
            outRect.left = space;
            outRect.right = 0;
        } else {
            outRect.right = space;
            outRect.left = 0;
        }
    }
}