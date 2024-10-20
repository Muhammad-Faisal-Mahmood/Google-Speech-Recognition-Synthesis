/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.KeyEvent
 *  android.view.KeyEvent$DispatcherState
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;

public class SearchView$SearchAutoComplete
extends he {
    private int a = this.getThreshold();

    public SearchView$SearchAutoComplete(Context context) {
        this(context, null);
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968654);
    }

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public final boolean enoughToFilter() {
        return this.a <= 0 || super.enoughToFilter();
        {
        }
    }

    protected final void onFinishInflate() {
        super.onFinishInflate();
        DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        Configuration configuration = this.getResources().getConfiguration();
        int n2 = configuration.screenWidthDp;
        int n3 = configuration.screenHeightDp;
        n2 = n2 >= 960 && n3 >= 720 && configuration.orientation == 2 ? 256 : (n2 < 600 ? 160 : 192);
        this.setMinWidth((int)TypedValue.applyDimension((int)1, (float)n2, (DisplayMetrics)displayMetrics));
    }

    protected final void onFocusChanged(boolean bl2, int n2, Rect rect) {
        super.onFocusChanged(bl2, n2, rect);
        throw null;
    }

    public final boolean onKeyPreIme(int n2, KeyEvent keyEvent) {
        int n3 = n2;
        if (n2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
                if (dispatcherState != null) {
                    dispatcherState.startTracking(keyEvent, (Object)this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
                if (dispatcherState != null) {
                    dispatcherState.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
            n3 = 4;
        }
        return super.onKeyPreIme(n3, keyEvent);
    }

    public final void onWindowFocusChanged(boolean bl2) {
        super.onWindowFocusChanged(bl2);
        if (!bl2) {
            return;
        }
        throw null;
    }

    public final void performCompletion() {
    }

    protected final void replaceText(CharSequence charSequence) {
    }

    public final void setThreshold(int n2) {
        super.setThreshold(n2);
        this.a = n2;
    }
}

