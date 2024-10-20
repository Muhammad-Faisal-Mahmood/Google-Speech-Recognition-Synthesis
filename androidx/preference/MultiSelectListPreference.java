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
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference
extends DialogPreference {
    private CharSequence[] mEntries;
    private CharSequence[] mEntryValues;
    private Set mValues = new HashSet();

    public MultiSelectListPreference(Context context) {
        this(context, null);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kt.m(context, 2130969071, 0x1010091));
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        context = context.obtainStyledAttributes(attributeSet, atn.f, n2, n3);
        this.mEntries = kt.u((TypedArray)context, 2, 0);
        this.mEntryValues = kt.u((TypedArray)context, 3, 1);
        context.recycle();
    }

    public int findIndexOfValue(String string) {
        CharSequence[] charSequenceArray;
        if (string != null && (charSequenceArray = this.mEntryValues) != null) {
            for (int i2 = charSequenceArray.length - 1; i2 >= 0; --i2) {
                if (!TextUtils.equals((CharSequence)this.mEntryValues[i2].toString(), (CharSequence)string)) continue;
                return i2;
            }
        }
        return -1;
    }

    public CharSequence[] getEntries() {
        return this.mEntries;
    }

    public CharSequence[] getEntryValues() {
        return this.mEntryValues;
    }

    protected boolean[] getSelectedItems() {
        CharSequence[] charSequenceArray = this.mEntryValues;
        int n2 = charSequenceArray.length;
        Set set = this.mValues;
        boolean[] blArray = new boolean[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            blArray[i2] = set.contains(charSequenceArray[i2].toString());
        }
        return blArray;
    }

    public Set getValues() {
        return this.mValues;
    }

    @Override
    protected Object onGetDefaultValue(TypedArray object, int n2) {
        CharSequence[] charSequenceArray = object.getTextArray(n2);
        object = new HashSet();
        int n3 = charSequenceArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            object.add(charSequenceArray[n2].toString());
        }
        return object;
    }

    @Override
    protected void onRestoreInstanceState(Parcelable object) {
        if (object != null && object.getClass().equals(asj.class)) {
            object = (asj)((Object)object);
            super.onRestoreInstanceState(object.getSuperState());
            this.setValues(object.a);
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
        object = new asj((Parcelable)object);
        object.a = this.getValues();
        return object;
    }

    @Override
    protected void onSetInitialValue(Object object) {
        this.setValues(this.getPersistedStringSet((Set)object));
    }

    public void setEntries(int n2) {
        this.setEntries(this.getContext().getResources().getTextArray(n2));
    }

    public void setEntries(CharSequence[] charSequenceArray) {
        this.mEntries = charSequenceArray;
    }

    public void setEntryValues(int n2) {
        this.setEntryValues(this.getContext().getResources().getTextArray(n2));
    }

    public void setEntryValues(CharSequence[] charSequenceArray) {
        this.mEntryValues = charSequenceArray;
    }

    public void setValues(Set set) {
        this.mValues.clear();
        this.mValues.addAll(set);
        this.persistStringSet(set);
        this.notifyChanged();
    }
}

