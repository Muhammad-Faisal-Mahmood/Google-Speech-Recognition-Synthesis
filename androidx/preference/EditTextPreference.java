/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;

public class EditTextPreference
extends DialogPreference {
    private asc mOnBindEditTextListener;
    private String mText;

    public EditTextPreference(Context context) {
        this(context, null);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kt.m(context, 2130969117, 16842898));
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        context = context.obtainStyledAttributes(attributeSet, atn.d, n2, n3);
        if (kt.s((TypedArray)context, 0, 0, false)) {
            if (ash.b == null) {
                ash.b = new ash(1);
            }
            this.setSummaryProvider(ash.b);
        }
        context.recycle();
    }

    public asc getOnBindEditTextListener() {
        return this.mOnBindEditTextListener;
    }

    public String getText() {
        return this.mText;
    }

    @Override
    protected Object onGetDefaultValue(TypedArray typedArray, int n2) {
        return typedArray.getString(n2);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable object) {
        if (object != null && object.getClass().equals(asd.class)) {
            object = (asd)((Object)object);
            super.onRestoreInstanceState(object.getSuperState());
            this.setText(object.a);
            return;
        }
        super.onRestoreInstanceState((Parcelable)object);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        Object object = super.onSaveInstanceState();
        if (this.isPersistent()) {
            return object;
        }
        object = new asd((Parcelable)object);
        object.a = this.getText();
        return object;
    }

    @Override
    protected void onSetInitialValue(Object object) {
        this.setText(this.getPersistedString((String)object));
    }

    public void setOnBindEditTextListener(asc asc2) {
        this.mOnBindEditTextListener = asc2;
    }

    public void setText(String string) {
        boolean bl2 = ((Preference)this).shouldDisableDependents();
        this.mText = string;
        this.persistString(string);
        boolean bl3 = ((Preference)this).shouldDisableDependents();
        if (bl3 != bl2) {
            this.notifyDependencyChange(bl3);
        }
        this.notifyChanged();
    }

    @Override
    public boolean shouldDisableDependents() {
        return TextUtils.isEmpty((CharSequence)this.mText) || super.shouldDisableDependents();
        {
        }
    }
}

