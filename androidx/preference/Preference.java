/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Preference
implements Comparable {
    private static final String CLIPBOARD_ID = "Preference";
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    private boolean mAllowDividerAbove = true;
    private boolean mAllowDividerBelow = true;
    private boolean mBaseMethodCalled;
    private final View.OnClickListener mClickListener;
    private final Context mContext;
    private boolean mCopyingEnabled;
    private Object mDefaultValue;
    private String mDependencyKey;
    private boolean mDependencyMet = true;
    private List mDependents;
    private boolean mEnabled = true;
    private Bundle mExtras;
    private String mFragment;
    private boolean mHasId;
    private boolean mHasSingleLineTitleAttr;
    private Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private Intent mIntent;
    private String mKey;
    private int mLayoutResId = 2131624096;
    private asn mListener;
    private aso mOnChangeListener;
    private asp mOnClickListener;
    private asq mOnCopyListener;
    private int mOrder = Integer.MAX_VALUE;
    private boolean mParentDependencyMet = true;
    private PreferenceGroup mParentGroup;
    private boolean mPersistent = true;
    private ass mPreferenceDataStore;
    private atj mPreferenceManager;
    private boolean mRequiresKey;
    private boolean mSelectable = true;
    private boolean mShouldDisableView = true;
    private boolean mSingleLineTitle = true;
    private CharSequence mSummary;
    private asr mSummaryProvider;
    private CharSequence mTitle;
    private int mViewId = 0;
    private boolean mVisible = true;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    public Preference(Context context) {
        this(context, null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, kt.m(context, 2130969731, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int n2) {
        this(context, attributeSet, n2, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int n2, int n3) {
        boolean bl2;
        this.mClickListener = new gp(this, 3);
        this.mContext = context;
        context = context.obtainStyledAttributes(attributeSet, atn.g, n2, n3);
        this.mIconResId = kt.o((TypedArray)context, 24, 0, 0);
        this.mKey = kt.r((TypedArray)context, 27, 6);
        this.mTitle = kt.q((TypedArray)context, 35, 4);
        this.mSummary = kt.q((TypedArray)context, 34, 7);
        this.mOrder = kt.v((TypedArray)context, 29, 8);
        this.mFragment = kt.r((TypedArray)context, 23, 13);
        this.mLayoutResId = kt.o((TypedArray)context, 28, 3, 2131624096);
        this.mWidgetLayoutResId = kt.o((TypedArray)context, 36, 9, 0);
        this.mEnabled = kt.s((TypedArray)context, 22, 2, true);
        this.mSelectable = kt.s((TypedArray)context, 31, 5, true);
        this.mPersistent = kt.s((TypedArray)context, 30, 1, true);
        this.mDependencyKey = kt.r((TypedArray)context, 20, 10);
        this.mAllowDividerAbove = kt.s((TypedArray)context, 16, 16, this.mSelectable);
        this.mAllowDividerBelow = kt.s((TypedArray)context, 17, 17, this.mSelectable);
        if (context.hasValue(19)) {
            this.mDefaultValue = this.onGetDefaultValue((TypedArray)context, 19);
        } else if (context.hasValue(11)) {
            this.mDefaultValue = this.onGetDefaultValue((TypedArray)context, 11);
        }
        this.mShouldDisableView = kt.s((TypedArray)context, 32, 12, true);
        this.mHasSingleLineTitleAttr = bl2 = context.hasValue(33);
        if (bl2) {
            this.mSingleLineTitle = kt.s((TypedArray)context, 33, 14, true);
        }
        this.mIconSpaceReserved = kt.s((TypedArray)context, 25, 15, false);
        this.mVisible = kt.s((TypedArray)context, 26, 26, true);
        this.mCopyingEnabled = kt.s((TypedArray)context, 21, 21, false);
        context.recycle();
    }

    private void dispatchSetInitialValue() {
        if (this.getPreferenceDataStore() != null) {
            this.onSetInitialValue(true, this.mDefaultValue);
            return;
        }
        if (this.shouldPersist() && this.getSharedPreferences().contains(this.mKey)) {
            this.onSetInitialValue(true, null);
            return;
        }
        Object object = this.mDefaultValue;
        if (object != null) {
            this.onSetInitialValue(false, object);
        }
    }

    private void registerDependency() {
        if (TextUtils.isEmpty((CharSequence)this.mDependencyKey)) {
            return;
        }
        Comparable comparable = this.findPreferenceInHierarchy(this.mDependencyKey);
        if (comparable != null) {
            ((Preference)comparable).registerDependent(this);
            return;
        }
        comparable = new StringBuilder("Dependency \"");
        ((StringBuilder)comparable).append(this.mDependencyKey);
        ((StringBuilder)comparable).append("\" not found for preference \"");
        ((StringBuilder)comparable).append(this.mKey);
        ((StringBuilder)comparable).append("\" (title: \"");
        ((StringBuilder)comparable).append((Object)this.mTitle);
        ((StringBuilder)comparable).append("\"");
        throw new IllegalStateException(((StringBuilder)comparable).toString());
    }

    private void registerDependent(Preference preference) {
        if (this.mDependents == null) {
            this.mDependents = new ArrayList();
        }
        this.mDependents.add(preference);
        preference.onDependencyChanged(this, this.shouldDisableDependents());
    }

    private void setEnabledStateOnViews(View view, boolean bl2) {
        view.setEnabled(bl2);
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            int n2 = view.getChildCount();
            while (--n2 >= 0) {
                this.setEnabledStateOnViews(view.getChildAt(n2), bl2);
            }
        }
    }

    private void tryCommit(SharedPreferences.Editor editor) {
        if (!this.mPreferenceManager.a) {
            editor.apply();
        }
    }

    private void unregisterDependency() {
        Object object = this.mDependencyKey;
        if (object != null && (object = this.findPreferenceInHierarchy((String)object)) != null) {
            super.unregisterDependent(this);
        }
    }

    private void unregisterDependent(Preference preference) {
        List list = this.mDependents;
        if (list != null) {
            list.remove(preference);
        }
    }

    public void assignParent(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.mParentGroup != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.mParentGroup = preferenceGroup;
    }

    public boolean callChangeListener(Object object) {
        aso aso2 = this.mOnChangeListener;
        return aso2 == null || aso2.a(this, object);
        {
        }
    }

    public final void clearWasDetached() {
        this.mWasDetached = false;
    }

    public int compareTo(Preference preference) {
        int n2 = this.mOrder;
        int n3 = preference.mOrder;
        if (n2 != n3) {
            return n2 - n3;
        }
        CharSequence charSequence = this.mTitle;
        CharSequence charSequence2 = preference.mTitle;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.mTitle.toString());
    }

    public void dispatchRestoreInstanceState(Bundle bundle) {
        if (this.hasKey() && (bundle = bundle.getParcelable(this.mKey)) != null) {
            this.mBaseMethodCalled = false;
            this.onRestoreInstanceState((Parcelable)bundle);
            if (!this.mBaseMethodCalled) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void dispatchSaveInstanceState(Bundle bundle) {
        if (this.hasKey()) {
            this.mBaseMethodCalled = false;
            Parcelable parcelable = this.onSaveInstanceState();
            if (this.mBaseMethodCalled) {
                if (parcelable != null) {
                    bundle.putParcelable(this.mKey, parcelable);
                    return;
                }
            } else {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
        }
    }

    protected Preference findPreferenceInHierarchy(String string) {
        atj atj2 = this.mPreferenceManager;
        if (atj2 == null) {
            return null;
        }
        return atj2.d(string);
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDependency() {
        return this.mDependencyKey;
    }

    public Bundle getExtras() {
        if (this.mExtras == null) {
            this.mExtras = new Bundle();
        }
        return this.mExtras;
    }

    public StringBuilder getFilterableStringBuilder() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = this.getTitle();
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            stringBuilder.append(charSequence);
            stringBuilder.append(' ');
        }
        if (!TextUtils.isEmpty((CharSequence)(charSequence = this.getSummary()))) {
            stringBuilder.append(charSequence);
            stringBuilder.append(' ');
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder;
    }

    public String getFragment() {
        return this.mFragment;
    }

    public Drawable getIcon() {
        int n2;
        if (this.mIcon == null && (n2 = this.mIconResId) != 0) {
            this.mIcon = kh.g(this.mContext, n2);
        }
        return this.mIcon;
    }

    public long getId() {
        return this.mId;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public String getKey() {
        return this.mKey;
    }

    public final int getLayoutResource() {
        return this.mLayoutResId;
    }

    public aso getOnPreferenceChangeListener() {
        return this.mOnChangeListener;
    }

    public asp getOnPreferenceClickListener() {
        return this.mOnClickListener;
    }

    public int getOrder() {
        return this.mOrder;
    }

    public PreferenceGroup getParent() {
        return this.mParentGroup;
    }

    protected boolean getPersistedBoolean(boolean bl2) {
        if (!this.shouldPersist()) {
            return bl2;
        }
        if (this.getPreferenceDataStore() == null) {
            return this.mPreferenceManager.c().getBoolean(this.mKey, bl2);
        }
        throw null;
    }

    protected float getPersistedFloat(float f2) {
        if (!this.shouldPersist()) {
            return f2;
        }
        if (this.getPreferenceDataStore() == null) {
            return this.mPreferenceManager.c().getFloat(this.mKey, f2);
        }
        throw null;
    }

    protected int getPersistedInt(int n2) {
        if (!this.shouldPersist()) {
            return n2;
        }
        if (this.getPreferenceDataStore() == null) {
            return this.mPreferenceManager.c().getInt(this.mKey, n2);
        }
        throw null;
    }

    protected long getPersistedLong(long l2) {
        if (!this.shouldPersist()) {
            return l2;
        }
        if (this.getPreferenceDataStore() == null) {
            return this.mPreferenceManager.c().getLong(this.mKey, l2);
        }
        throw null;
    }

    protected String getPersistedString(String string) {
        if (!this.shouldPersist()) {
            return string;
        }
        if (this.getPreferenceDataStore() == null) {
            return this.mPreferenceManager.c().getString(this.mKey, string);
        }
        throw null;
    }

    public Set getPersistedStringSet(Set set) {
        if (!this.shouldPersist()) {
            return set;
        }
        if (this.getPreferenceDataStore() == null) {
            return this.mPreferenceManager.c().getStringSet(this.mKey, set);
        }
        throw null;
    }

    public ass getPreferenceDataStore() {
        ass ass2 = this.mPreferenceDataStore;
        if (ass2 != null) {
            return ass2;
        }
        return null;
    }

    public atj getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public SharedPreferences getSharedPreferences() {
        if (this.mPreferenceManager != null && this.getPreferenceDataStore() == null) {
            return this.mPreferenceManager.c();
        }
        return null;
    }

    public boolean getShouldDisableView() {
        return this.mShouldDisableView;
    }

    public CharSequence getSummary() {
        if (this.getSummaryProvider() != null) {
            return this.getSummaryProvider().a(this);
        }
        return this.mSummary;
    }

    public final asr getSummaryProvider() {
        return this.mSummaryProvider;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public final int getWidgetLayoutResource() {
        return this.mWidgetLayoutResId;
    }

    public boolean hasKey() {
        return !TextUtils.isEmpty((CharSequence)this.mKey);
    }

    public boolean isCopyingEnabled() {
        return this.mCopyingEnabled;
    }

    public boolean isEnabled() {
        return this.mEnabled && this.mDependencyMet && this.mParentDependencyMet;
    }

    public boolean isIconSpaceReserved() {
        return this.mIconSpaceReserved;
    }

    public boolean isPersistent() {
        return this.mPersistent;
    }

    public boolean isSelectable() {
        return this.mSelectable;
    }

    public final boolean isShown() {
        if (!this.isVisible()) {
            return false;
        }
        if (this.getPreferenceManager() == null) {
            return false;
        }
        if (this == this.getPreferenceManager().b) {
            return true;
        }
        PreferenceGroup preferenceGroup = this.getParent();
        if (preferenceGroup == null) {
            return false;
        }
        return preferenceGroup.isShown();
    }

    public boolean isSingleLineTitle() {
        return this.mSingleLineTitle;
    }

    public final boolean isVisible() {
        return this.mVisible;
    }

    public void notifyChanged() {
        asn asn2 = this.mListener;
        if (asn2 != null) {
            asn2.a(this);
        }
    }

    public void notifyDependencyChange(boolean bl2) {
        List list = this.mDependents;
        if (list != null) {
            int n2 = list.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((Preference)list.get(i2)).onDependencyChanged(this, bl2);
            }
        }
    }

    protected void notifyHierarchyChanged() {
        asn asn2 = this.mListener;
        if (asn2 != null) {
            asn2.b();
        }
    }

    public void onAttached() {
        this.registerDependency();
    }

    public void onAttachedToHierarchy(atj atj2) {
        this.mPreferenceManager = atj2;
        if (!this.mHasId) {
            this.mId = atj2.a();
        }
        this.dispatchSetInitialValue();
    }

    protected void onAttachedToHierarchy(atj atj2, long l2) {
        this.mId = l2;
        this.mHasId = true;
        try {
            this.onAttachedToHierarchy(atj2);
            return;
        }
        finally {
            this.mHasId = false;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void onBindViewHolder(atm var1_1) {
        block23: {
            block25: {
                block24: {
                    var9_2 = var1_1.itemView;
                    var9_2.setOnClickListener(this.mClickListener);
                    var9_2.setId(this.mViewId);
                    var8_3 = (TextView)var1_1.a(0x1020010);
                    var3_4 = 8;
                    if (var8_3 == null) ** GOTO lbl14
                    var7_5 = this.getSummary();
                    if (!TextUtils.isEmpty((CharSequence)var7_5)) {
                        var8_3.setText((CharSequence)var7_5);
                        var8_3.setVisibility(0);
                        var7_5 = var8_3.getCurrentTextColor();
                    } else {
                        var8_3.setVisibility(8);
lbl14:
                        // 2 sources

                        var7_5 = null;
                    }
                    var8_3 = (TextView)var1_1.a(16908310);
                    if (var8_3 != null) {
                        var10_6 = this.getTitle();
                        if (!TextUtils.isEmpty((CharSequence)var10_6)) {
                            var8_3.setText(var10_6);
                            var8_3.setVisibility(0);
                            if (this.mHasSingleLineTitleAttr) {
                                var8_3.setSingleLine(this.mSingleLineTitle);
                            }
                            if (!this.isSelectable() && this.isEnabled() && var7_5 != null) {
                                var8_3.setTextColor(var7_5.intValue());
                            }
                        } else {
                            var8_3.setVisibility(8);
                        }
                    }
                    if ((var7_5 = (ImageView)var1_1.a(16908294)) == null) break block23;
                    var2_8 = var4_7 = this.mIconResId;
                    if (var4_7 != 0) break block24;
                    if (this.mIcon == null) break block25;
                    var2_8 = 0;
                }
                if (this.mIcon == null) {
                    this.mIcon = kh.g(this.mContext, var2_8);
                }
                if ((var8_3 = this.mIcon) != null) {
                    var7_5.setImageDrawable((Drawable)var8_3);
                }
            }
            if (this.mIcon != null) {
                var7_5.setVisibility(0);
            } else {
                var2_8 = true != this.mIconSpaceReserved ? 8 : 4;
                var7_5.setVisibility(var2_8);
            }
        }
        var8_3 = var1_1.a(2131427682);
        var7_5 = var8_3;
        if (var8_3 == null) {
            var7_5 = var1_1.a(16908350);
        }
        if (var7_5 != null) {
            if (this.mIcon != null) {
                var7_5.setVisibility(0);
            } else {
                var2_8 = true != this.mIconSpaceReserved ? var3_4 : 4;
                var7_5.setVisibility(var2_8);
            }
        }
        if (this.mShouldDisableView) {
            this.setEnabledStateOnViews(var9_2, this.isEnabled());
        } else {
            this.setEnabledStateOnViews(var9_2, true);
        }
        var5_9 = this.isSelectable();
        var9_2.setFocusable(var5_9);
        var9_2.setClickable(var5_9);
        var1_1.c = this.mAllowDividerAbove;
        var1_1.d = this.mAllowDividerBelow;
        var6_10 = this.isCopyingEnabled();
        if (var6_10 && this.mOnCopyListener == null) {
            this.mOnCopyListener = new asq(this);
        }
        var1_1 = var6_10 != false ? this.mOnCopyListener : null;
        var9_2.setOnCreateContextMenuListener((View.OnCreateContextMenuListener)var1_1);
        var9_2.setLongClickable(var6_10);
        if (var6_10 && !var5_9) {
            var9_2.setBackground(null);
        }
    }

    protected void onClick() {
    }

    public void onDependencyChanged(Preference preference, boolean bl2) {
        if (this.mDependencyMet == bl2) {
            this.mDependencyMet = bl2 ^ true;
            this.notifyDependencyChange(this.shouldDisableDependents());
            this.notifyChanged();
        }
    }

    public void onDetached() {
        this.unregisterDependency();
        this.mWasDetached = true;
    }

    protected Object onGetDefaultValue(TypedArray typedArray, int n2) {
        return null;
    }

    @Deprecated
    public void onInitializeAccessibilityNodeInfo(xv xv2) {
    }

    public void onParentChanged(Preference preference, boolean bl2) {
        if (this.mParentDependencyMet == bl2) {
            this.mParentDependencyMet = bl2 ^ true;
            this.notifyDependencyChange(this.shouldDisableDependents());
            this.notifyChanged();
        }
    }

    protected void onPrepareForRemoval() {
        this.unregisterDependency();
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        this.mBaseMethodCalled = true;
        if (parcelable != asm.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    protected Parcelable onSaveInstanceState() {
        this.mBaseMethodCalled = true;
        return asm.EMPTY_STATE;
    }

    protected void onSetInitialValue(Object object) {
    }

    @Deprecated
    protected void onSetInitialValue(boolean bl2, Object object) {
        this.onSetInitialValue(object);
    }

    public Bundle peekExtras() {
        return this.mExtras;
    }

    public void performClick() {
        if (this.isEnabled() && this.isSelectable()) {
            this.onClick();
            Object object = this.mOnClickListener;
            if (object == null) {
                object = this.getPreferenceManager();
                if (!(object != null && (object = ((atj)object).c) != null && object.F(this) || this.mIntent == null)) {
                    this.getContext().startActivity(this.mIntent);
                    return;
                }
            } else {
                object.a(this);
            }
        }
    }

    public void performClick(View view) {
        this.performClick();
    }

    protected boolean persistBoolean(boolean bl2) {
        if (!this.shouldPersist()) {
            return false;
        }
        if (bl2 == this.getPersistedBoolean(bl2 ^ true)) {
            return true;
        }
        if (this.getPreferenceDataStore() == null) {
            SharedPreferences.Editor editor = this.mPreferenceManager.b();
            editor.putBoolean(this.mKey, bl2);
            this.tryCommit(editor);
            return true;
        }
        throw null;
    }

    protected boolean persistFloat(float f2) {
        if (!this.shouldPersist()) {
            return false;
        }
        if (f2 == this.getPersistedFloat(Float.NaN)) {
            return true;
        }
        if (this.getPreferenceDataStore() == null) {
            SharedPreferences.Editor editor = this.mPreferenceManager.b();
            editor.putFloat(this.mKey, f2);
            this.tryCommit(editor);
            return true;
        }
        throw null;
    }

    public boolean persistInt(int n2) {
        if (!this.shouldPersist()) {
            return false;
        }
        if (n2 == this.getPersistedInt(~n2)) {
            return true;
        }
        if (this.getPreferenceDataStore() == null) {
            SharedPreferences.Editor editor = this.mPreferenceManager.b();
            editor.putInt(this.mKey, n2);
            this.tryCommit(editor);
            return true;
        }
        throw null;
    }

    protected boolean persistLong(long l2) {
        if (!this.shouldPersist()) {
            return false;
        }
        if (l2 == this.getPersistedLong(l2 ^ 0xFFFFFFFFFFFFFFFFL)) {
            return true;
        }
        if (this.getPreferenceDataStore() == null) {
            SharedPreferences.Editor editor = this.mPreferenceManager.b();
            editor.putLong(this.mKey, l2);
            this.tryCommit(editor);
            return true;
        }
        throw null;
    }

    protected boolean persistString(String string) {
        if (!this.shouldPersist()) {
            return false;
        }
        if (TextUtils.equals((CharSequence)string, (CharSequence)this.getPersistedString(null))) {
            return true;
        }
        if (this.getPreferenceDataStore() == null) {
            SharedPreferences.Editor editor = this.mPreferenceManager.b();
            editor.putString(this.mKey, string);
            this.tryCommit(editor);
            return true;
        }
        throw null;
    }

    public boolean persistStringSet(Set set) {
        if (!this.shouldPersist()) {
            return false;
        }
        if (set.equals(this.getPersistedStringSet(null))) {
            return true;
        }
        if (this.getPreferenceDataStore() == null) {
            SharedPreferences.Editor editor = this.mPreferenceManager.b();
            editor.putStringSet(this.mKey, set);
            this.tryCommit(editor);
            return true;
        }
        throw null;
    }

    public void requireKey() {
        if (!TextUtils.isEmpty((CharSequence)this.mKey)) {
            this.mRequiresKey = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }

    public void restoreHierarchyState(Bundle bundle) {
        this.dispatchRestoreInstanceState(bundle);
    }

    public void saveHierarchyState(Bundle bundle) {
        this.dispatchSaveInstanceState(bundle);
    }

    public void setCopyingEnabled(boolean bl2) {
        if (this.mCopyingEnabled != bl2) {
            this.mCopyingEnabled = bl2;
            this.notifyChanged();
        }
    }

    public void setDefaultValue(Object object) {
        this.mDefaultValue = object;
    }

    public void setDependency(String string) {
        this.unregisterDependency();
        this.mDependencyKey = string;
        this.registerDependency();
    }

    public void setEnabled(boolean bl2) {
        if (this.mEnabled != bl2) {
            this.mEnabled = bl2;
            this.notifyDependencyChange(this.shouldDisableDependents());
            this.notifyChanged();
        }
    }

    public void setFragment(String string) {
        this.mFragment = string;
    }

    public void setIcon(int n2) {
        this.setIcon(kh.g(this.mContext, n2));
        this.mIconResId = n2;
    }

    public void setIcon(Drawable drawable) {
        if (this.mIcon != drawable) {
            this.mIcon = drawable;
            this.mIconResId = 0;
            this.notifyChanged();
        }
    }

    public void setIconSpaceReserved(boolean bl2) {
        if (this.mIconSpaceReserved != bl2) {
            this.mIconSpaceReserved = bl2;
            this.notifyChanged();
        }
    }

    public void setIntent(Intent intent) {
        this.mIntent = intent;
    }

    public void setKey(String string) {
        this.mKey = string;
        if (this.mRequiresKey && !this.hasKey()) {
            this.requireKey();
        }
    }

    public void setLayoutResource(int n2) {
        this.mLayoutResId = n2;
    }

    public final void setOnPreferenceChangeInternalListener(asn asn2) {
        this.mListener = asn2;
    }

    public void setOnPreferenceChangeListener(aso aso2) {
        this.mOnChangeListener = aso2;
    }

    public void setOnPreferenceClickListener(asp asp2) {
        this.mOnClickListener = asp2;
    }

    public void setOrder(int n2) {
        if (n2 != this.mOrder) {
            this.mOrder = n2;
            this.notifyHierarchyChanged();
        }
    }

    public void setPersistent(boolean bl2) {
        this.mPersistent = bl2;
    }

    public void setPreferenceDataStore(ass ass2) {
        this.mPreferenceDataStore = ass2;
    }

    public void setSelectable(boolean bl2) {
        if (this.mSelectable != bl2) {
            this.mSelectable = bl2;
            this.notifyChanged();
        }
    }

    public void setShouldDisableView(boolean bl2) {
        if (this.mShouldDisableView != bl2) {
            this.mShouldDisableView = bl2;
            this.notifyChanged();
        }
    }

    public void setSingleLineTitle(boolean bl2) {
        this.mHasSingleLineTitleAttr = true;
        this.mSingleLineTitle = bl2;
    }

    public void setSummary(int n2) {
        this.setSummary(this.mContext.getString(n2));
    }

    public void setSummary(CharSequence charSequence) {
        if (this.getSummaryProvider() == null) {
            if (!TextUtils.equals((CharSequence)this.mSummary, (CharSequence)charSequence)) {
                this.mSummary = charSequence;
                this.notifyChanged();
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public final void setSummaryProvider(asr asr2) {
        this.mSummaryProvider = asr2;
        this.notifyChanged();
    }

    public void setTitle(int n2) {
        this.setTitle(this.mContext.getString(n2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.equals((CharSequence)charSequence, (CharSequence)this.mTitle)) {
            this.mTitle = charSequence;
            this.notifyChanged();
        }
    }

    public void setViewId(int n2) {
        this.mViewId = n2;
    }

    public final void setVisible(boolean bl2) {
        if (this.mVisible != bl2) {
            this.mVisible = bl2;
            asn asn2 = this.mListener;
            if (asn2 != null) {
                asn2.c();
            }
        }
    }

    public void setWidgetLayoutResource(int n2) {
        this.mWidgetLayoutResId = n2;
    }

    public boolean shouldDisableDependents() {
        return !this.isEnabled();
    }

    protected boolean shouldPersist() {
        return this.mPreferenceManager != null && this.isPersistent() && this.hasKey();
    }

    public String toString() {
        return this.getFilterableStringBuilder().toString();
    }

    final boolean wasDetached() {
        return this.mWasDetached;
    }
}

