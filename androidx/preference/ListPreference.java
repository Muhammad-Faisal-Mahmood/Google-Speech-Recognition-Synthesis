/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.util.Log
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.DialogPreference;

public class ListPreference
extends DialogPreference {
    private static final String TAG = "ListPreference";
    private CharSequence[] mEntries;
    private CharSequence[] mEntryValues;
    private String mSummary;
    private String mValue;
    private boolean mValueSet;

    public ListPreference(Context context) {
        this(context, null);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kt.m(context, 2130969071, 0x1010091));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, atn.e, n2, n3);
        this.mEntries = kt.u(typedArray, 2, 0);
        this.mEntryValues = kt.u(typedArray, 3, 1);
        if (kt.s(typedArray, 4, 4, false)) {
            if (ash.a == null) {
                ash.a = new ash(0);
            }
            this.setSummaryProvider(ash.a);
        }
        typedArray.recycle();
        context = context.obtainStyledAttributes(attributeSet, atn.g, n2, n3);
        this.mSummary = kt.r((TypedArray)context, 34, 7);
        context.recycle();
    }

    private int getValueIndex() {
        return this.findIndexOfValue(this.mValue);
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

    public CharSequence getEntry() {
        CharSequence[] charSequenceArray;
        int n2 = this.getValueIndex();
        if (n2 >= 0 && (charSequenceArray = this.mEntries) != null) {
            return charSequenceArray[n2];
        }
        return null;
    }

    public CharSequence[] getEntryValues() {
        return this.mEntryValues;
    }

    @Override
    public CharSequence getSummary() {
        if (this.getSummaryProvider() != null) {
            return this.getSummaryProvider().a(this);
        }
        CharSequence charSequence = this.getEntry();
        CharSequence charSequence2 = super.getSummary();
        String string = this.mSummary;
        if (string != null) {
            CharSequence charSequence3 = charSequence;
            if (charSequence == null) {
                charSequence3 = "";
            }
            if (!TextUtils.equals((CharSequence)(charSequence3 = String.format(string, charSequence3)), (CharSequence)charSequence2)) {
                Log.w((String)TAG, (String)"Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return charSequence3;
            }
        }
        return charSequence2;
    }

    public String getValue() {
        return this.mValue;
    }

    @Override
    protected Object onGetDefaultValue(TypedArray typedArray, int n2) {
        return typedArray.getString(n2);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable object) {
        if (object != null && object.getClass().equals(asg.class)) {
            object = (asg)((Object)object);
            super.onRestoreInstanceState(object.getSuperState());
            this.setValue(object.a);
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
        object = new asg((Parcelable)object);
        object.a = this.getValue();
        return object;
    }

    @Override
    protected void onSetInitialValue(Object object) {
        this.setValue(this.getPersistedString((String)object));
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

    @Override
    public void setSummary(CharSequence charSequence) {
        super.setSummary(charSequence);
        if (charSequence == null) {
            this.mSummary = null;
            return;
        }
        this.mSummary = charSequence.toString();
    }

    public void setValue(String string) {
        boolean bl2 = TextUtils.equals((CharSequence)this.mValue, (CharSequence)string);
        if (!bl2 || !this.mValueSet) {
            this.mValue = string;
            this.mValueSet = true;
            this.persistString(string);
            if (!bl2) {
                this.notifyChanged();
            }
        }
    }

    public void setValueIndex(int n2) {
        CharSequence[] charSequenceArray = this.mEntryValues;
        if (charSequenceArray != null) {
            this.setValue(charSequenceArray[n2].toString());
        }
    }
}

