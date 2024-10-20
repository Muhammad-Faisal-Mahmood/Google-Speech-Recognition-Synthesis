/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.TextView
 */
package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;

public abstract class TwoStatePreference
extends Preference {
    protected boolean mChecked;
    private boolean mCheckedSet;
    private boolean mDisableDependentsState;
    private CharSequence mSummaryOff;
    private CharSequence mSummaryOn;

    public TwoStatePreference(Context context) {
        this(context, null);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
    }

    public boolean getDisableDependentsState() {
        return this.mDisableDependentsState;
    }

    public CharSequence getSummaryOff() {
        return this.mSummaryOff;
    }

    public CharSequence getSummaryOn() {
        return this.mSummaryOn;
    }

    public boolean isChecked() {
        return this.mChecked;
    }

    @Override
    protected void onClick() {
        boolean bl2 = this.isChecked() ^ true;
        if (this.callChangeListener(bl2)) {
            this.setChecked(bl2);
        }
    }

    @Override
    protected Object onGetDefaultValue(TypedArray typedArray, int n2) {
        return typedArray.getBoolean(n2, false);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable object) {
        if (object != null && object.getClass().equals(ats.class)) {
            object = (ats)((Object)object);
            super.onRestoreInstanceState(object.getSuperState());
            this.setChecked(object.a);
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
        object = new ats((Parcelable)object);
        object.a = this.isChecked();
        return object;
    }

    @Override
    protected void onSetInitialValue(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = false;
        }
        this.setChecked(this.getPersistedBoolean((Boolean)object2));
    }

    public void setChecked(boolean bl2) {
        boolean bl3 = this.mChecked != bl2;
        if (bl3 || !this.mCheckedSet) {
            this.mChecked = bl2;
            this.mCheckedSet = true;
            this.persistBoolean(bl2);
            if (bl3) {
                this.notifyDependencyChange(((Preference)this).shouldDisableDependents());
                this.notifyChanged();
            }
        }
    }

    public void setDisableDependentsState(boolean bl2) {
        this.mDisableDependentsState = bl2;
    }

    public void setSummaryOff(int n2) {
        this.setSummaryOff(this.getContext().getString(n2));
    }

    public void setSummaryOff(CharSequence charSequence) {
        this.mSummaryOff = charSequence;
        if (!this.isChecked()) {
            this.notifyChanged();
        }
    }

    public void setSummaryOn(int n2) {
        this.setSummaryOn(this.getContext().getString(n2));
    }

    public void setSummaryOn(CharSequence charSequence) {
        this.mSummaryOn = charSequence;
        if (this.isChecked()) {
            this.notifyChanged();
        }
    }

    @Override
    public boolean shouldDisableDependents() {
        return !(this.mDisableDependentsState ? !this.mChecked : this.mChecked) || super.shouldDisableDependents();
    }

    protected void syncSummaryView(View object) {
        if (object instanceof TextView) {
            TextView textView = (TextView)object;
            boolean bl2 = this.mChecked;
            int n2 = 0;
            if (bl2 && !TextUtils.isEmpty((CharSequence)this.mSummaryOn)) {
                textView.setText(this.mSummaryOn);
            } else if (!this.mChecked && !TextUtils.isEmpty((CharSequence)this.mSummaryOff)) {
                textView.setText(this.mSummaryOff);
            } else {
                object = this.getSummary();
                if (!TextUtils.isEmpty((CharSequence)object)) {
                    textView.setText((CharSequence)object);
                } else {
                    n2 = 8;
                }
            }
            if (n2 != textView.getVisibility()) {
                textView.setVisibility(n2);
            }
        }
    }

    protected void syncSummaryView(atm atm2) {
        this.syncSummaryView(atm2.a(0x1020010));
    }
}

