/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 */
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public final class azy
extends us {
    @Override
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.viewpager.widget.ViewPager");
        accessibilityEvent.setScrollable(false);
        accessibilityEvent.getEventType();
    }

    @Override
    public final void b(View view, xv xv2) {
        super.b(view, xv2);
        xv2.g("androidx.viewpager.widget.ViewPager");
        xv2.i(false);
    }

    @Override
    public final boolean h(View view, int n2, Bundle bundle) {
        return super.h(view, n2, bundle);
    }
}

