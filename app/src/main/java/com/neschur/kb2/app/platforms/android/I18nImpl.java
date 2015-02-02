package com.neschur.kb2.app.platforms.android;

import android.content.res.Resources;

import com.neschur.kb2.app.I18n;
import com.neschur.kb2.app.R;

class I18nImpl implements I18n {
    private Resources resources;

    I18nImpl(Resources resources) {
        this.resources = resources;
    }

    public String translate(String key) {
        try {
            return resources.getString(R.string.class.getField(key).getInt(new R.string()));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            return key;
        }
    }

    public String translate(int key) {
        return resources.getString(key);
    }
}
