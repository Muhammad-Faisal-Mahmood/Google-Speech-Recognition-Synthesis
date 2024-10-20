/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.CollapsibleActionView
 *  android.view.View
 *  android.widget.FrameLayout
 */
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

public final class fw
extends FrameLayout {
    public final CollapsibleActionView a;

    public fw(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView)view;
        this.addView(view);
    }
}

