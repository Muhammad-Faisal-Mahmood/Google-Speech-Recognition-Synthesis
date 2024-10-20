/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentProvider
 *  android.content.ContentUris
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.MatrixCursor
 *  android.net.Uri
 */
package com.android.car.ui.core;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public class SearchResultsProvider
extends ContentProvider {
    private final List a = new ArrayList();

    public static Uri a(Context object) {
        object = object.getPackageName();
        StringBuilder stringBuilder = new StringBuilder("content://");
        stringBuilder.append((String)object);
        stringBuilder.append(".SearchResultsProvider");
        return Uri.parse((String)stringBuilder.toString().concat("/search_results"));
    }

    public final int delete(Uri uri, String string, String[] stringArray) {
        this.a.clear();
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        this.a.add(contentValues);
        uri = ContentUris.withAppendedId((Uri)SearchResultsProvider.a(this.getContext()), (long)(this.a.size() - 1));
        this.getContext().getContentResolver().notifyChange(uri, null);
        return uri;
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] object, String string3, String[] stringArray, String string2) {
        uri = new MatrixCursor(new String[]{"primaryId", "secondary", "primary_image", "secondary_image", "title", "subtitle"});
        for (String string3 : this.a) {
            uri.addRow(new Object[]{string3.get("primaryId"), string3.get("secondary"), string3.get("primary_image"), string3.get("secondary_image"), string3.get("title"), string3.get("subtitle")});
        }
        return uri;
    }

    public final int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        return 0;
    }
}

