/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ArrayAdapter
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 */
package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.preference.ListPreference;

public class DropDownPreference
extends ListPreference {
    private final ArrayAdapter mAdapter;
    private final Context mContext;
    private final AdapterView.OnItemSelectedListener mItemSelectedListener = new asb(this, 0);
    private Spinner mSpinner;

    public DropDownPreference(Context context) {
        this(context, null);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969111);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int n2, int n3) {
        super(context, attributeSet, n2, n3);
        this.mContext = context;
        this.mAdapter = this.createAdapter();
        this.updateEntries();
    }

    private int findSpinnerIndexOfValue(String string) {
        CharSequence[] charSequenceArray = this.getEntryValues();
        if (string != null && charSequenceArray != null) {
            for (int i2 = charSequenceArray.length - 1; i2 >= 0; --i2) {
                if (!TextUtils.equals((CharSequence)charSequenceArray[i2].toString(), (CharSequence)string)) continue;
                return i2;
            }
        }
        return -1;
    }

    private void updateEntries() {
        this.mAdapter.clear();
        if (this.getEntries() != null) {
            for (CharSequence charSequence : this.getEntries()) {
                this.mAdapter.add((Object)charSequence.toString());
            }
        }
    }

    protected ArrayAdapter createAdapter() {
        return new ArrayAdapter(this.mContext, 0x1090009);
    }

    @Override
    public void notifyChanged() {
        super.notifyChanged();
        ArrayAdapter arrayAdapter = this.mAdapter;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onBindViewHolder(atm atm2) {
        Spinner spinner;
        this.mSpinner = spinner = (Spinner)atm2.itemView.findViewById(2131427888);
        spinner.setAdapter((SpinnerAdapter)this.mAdapter);
        this.mSpinner.setOnItemSelectedListener(this.mItemSelectedListener);
        this.mSpinner.setSelection(this.findSpinnerIndexOfValue(this.getValue()));
        super.onBindViewHolder(atm2);
    }

    @Override
    protected void onClick() {
        this.mSpinner.performClick();
    }

    @Override
    public void setEntries(CharSequence[] charSequenceArray) {
        super.setEntries(charSequenceArray);
        this.updateEntries();
    }

    @Override
    public void setValueIndex(int n2) {
        this.setValue(this.getEntryValues()[n2].toString());
    }
}

