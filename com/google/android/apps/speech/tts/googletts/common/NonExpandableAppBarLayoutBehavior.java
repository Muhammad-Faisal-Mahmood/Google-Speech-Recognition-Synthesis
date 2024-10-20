/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.apps.speech.tts.googletts.common;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$Behavior;

public final class NonExpandableAppBarLayoutBehavior
extends AppBarLayout$Behavior {
    @Override
    public final boolean G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int n2, int n3) {
        return false;
    }
}

