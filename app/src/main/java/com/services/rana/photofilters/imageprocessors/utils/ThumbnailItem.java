package com.services.rana.photofilters.imageprocessors.utils;

import android.graphics.Bitmap;

import com.services.rana.photofilters.imageprocessors.Filter;


/**
 * @author Varun on 01/07/15.
 */
public class ThumbnailItem {
    public String filterName;
    public Bitmap image;
    public Filter filter;

    public ThumbnailItem() {
        image = null;
        filter = new Filter();
    }
}
