/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.Preference;

public abstract class DialogPreference
extends Preference {
    private Drawable mDialogIcon;
    private int mDialogLayoutResId;
    private CharSequence mDialogMessage;
    private CharSequence mDialogTitle;
    private CharSequence mNegativeButtonText;
    private CharSequence mPositiveButtonText;

    public DialogPreference(Context context) {
        this(context, null);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kt.m(context, 2130969071, 0x1010091));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public DialogPreference(Context object, AttributeSet attributeSet, int n2, int n3) {
        super((Context)object, attributeSet, n2, n3);
        TypedArray typedArray = object.obtainStyledAttributes(attributeSet, atn.c, n2, n3);
        object = kt.r(typedArray, 9, 0);
        this.mDialogTitle = object;
        if (object == null) {
            this.mDialogTitle = this.getTitle();
        }
        this.mDialogMessage = kt.r(typedArray, 8, 1);
        attributeSet = typedArray.getDrawable(6);
        object = attributeSet;
        if (attributeSet == null) {
            object = typedArray.getDrawable(2);
        }
        this.mDialogIcon = object;
        this.mPositiveButtonText = kt.r(typedArray, 11, 3);
        this.mNegativeButtonText = kt.r(typedArray, 10, 4);
        this.mDialogLayoutResId = kt.o(typedArray, 7, 5, 0);
        typedArray.recycle();
    }

    public Drawable getDialogIcon() {
        return this.mDialogIcon;
    }

    public int getDialogLayoutResource() {
        return this.mDialogLayoutResId;
    }

    public CharSequence getDialogMessage() {
        return this.mDialogMessage;
    }

    public CharSequence getDialogTitle() {
        return this.mDialogTitle;
    }

    public CharSequence getNegativeButtonText() {
        return this.mNegativeButtonText;
    }

    public CharSequence getPositiveButtonText() {
        return this.mPositiveButtonText;
    }

    @Override
    protected void onClick() {
        this.getPreferenceManager().g(this);
    }

    public void setDialogIcon(int n2) {
        this.mDialogIcon = kh.g(this.getContext(), n2);
    }

    public void setDialogIcon(Drawable drawable) {
        this.mDialogIcon = drawable;
    }

    public void setDialogLayoutResource(int n2) {
        this.mDialogLayoutResId = n2;
    }

    public void setDialogMessage(int n2) {
        this.setDialogMessage(this.getContext().getString(n2));
    }

    public void setDialogMessage(CharSequence charSequence) {
        this.mDialogMessage = charSequence;
    }

    public void setDialogTitle(int n2) {
        this.setDialogTitle(this.getContext().getString(n2));
    }

    public void setDialogTitle(CharSequence charSequence) {
        this.mDialogTitle = charSequence;
    }

    public void setNegativeButtonText(int n2) {
        this.setNegativeButtonText(this.getContext().getString(n2));
    }

    public void setNegativeButtonText(CharSequence charSequence) {
        this.mNegativeButtonText = charSequence;
    }

    public void setPositiveButtonText(int n2) {
        this.setPositiveButtonText(this.getContext().getString(n2));
    }

    public void setPositiveButtonText(CharSequence charSequence) {
        this.mPositiveButtonText = charSequence;
    }
}

