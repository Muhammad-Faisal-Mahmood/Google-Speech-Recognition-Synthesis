/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.view.View
 */
package com.android.car.ui.core;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.android.car.ui.baselayout.Insets;
import java.util.Map;
import java.util.WeakHashMap;

public final class BaseLayoutController {
    private static final Map sBaseLayoutMap = new WeakHashMap();
    private bjv mInsetsUpdater;
    private bnq mToolbarController;

    private BaseLayoutController(Activity activity) {
        this.installBaseLayout(activity);
    }

    static void build(Activity activity) {
        if (bnv.p(activity, 2130968769)) {
            sBaseLayoutMap.put(activity, new BaseLayoutController(activity));
        }
    }

    static void destroy(Activity activity) {
        sBaseLayoutMap.remove(activity);
    }

    public static BaseLayoutController getBaseLayoutController(Activity activity) {
        return (BaseLayoutController)sBaseLayoutMap.get(activity);
    }

    private void installBaseLayout(Activity activity) {
        boolean bl2 = bnv.p(activity, 2130968783);
        View view = bnv.i(activity.getWindow().getDecorView(), 0x1020002);
        this.mInsetsUpdater = new bjv(activity, view);
        this.mToolbarController = bkd.a((Context)activity).installBaseLayoutAround((Context)activity, view, this.mInsetsUpdater, bl2, true);
    }

    void dispatchNewInsets(Insets insets) {
        this.mInsetsUpdater.a(insets);
    }

    public Insets getInsets() {
        return this.mInsetsUpdater.b;
    }

    public bnq getToolbarController() {
        return this.mToolbarController;
    }

    void replaceInsetsChangedListenerWith(bju bju2) {
        this.mInsetsUpdater.a = bju2;
    }
}

