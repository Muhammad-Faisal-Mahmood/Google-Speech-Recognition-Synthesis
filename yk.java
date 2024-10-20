/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 *  android.widget.ScrollView
 */
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

public final class yk
extends us {
    @Override
    public final void a(View object, AccessibilityEvent accessibilityEvent) {
        super.a((View)object, accessibilityEvent);
        object = (NestedScrollView)object;
        accessibilityEvent.setClassName((CharSequence)ScrollView.class.getName());
        boolean bl2 = ((NestedScrollView)object).c() > 0;
        accessibilityEvent.setScrollable(bl2);
        accessibilityEvent.setScrollX(object.getScrollX());
        accessibilityEvent.setScrollY(object.getScrollY());
        accessibilityEvent.setMaxScrollX(object.getScrollX());
        accessibilityEvent.setMaxScrollY(((NestedScrollView)object).c());
    }

    @Override
    public final void b(View object, xv xv2) {
        int n2;
        super.b((View)object, xv2);
        object = (NestedScrollView)object;
        xv2.g(ScrollView.class.getName());
        if (object.isEnabled() && (n2 = ((NestedScrollView)object).c()) > 0) {
            xv2.i(true);
            if (object.getScrollY() > 0) {
                xv2.d(xu.b);
                xv2.d(xu.g);
            }
            if (object.getScrollY() < n2) {
                xv2.d(xu.a);
                xv2.d(xu.h);
            }
        }
    }

    @Override
    public final boolean h(View view, int n2, Bundle object) {
        if (super.h(view, n2, (Bundle)object)) {
            return true;
        }
        object = (NestedScrollView)view;
        if (!object.isEnabled()) {
            return false;
        }
        int n3 = object.getHeight();
        view = new Rect();
        int n4 = n3;
        if (object.getMatrix().isIdentity()) {
            n4 = n3;
            if (object.getGlobalVisibleRect((Rect)view)) {
                n4 = view.height();
            }
        }
        if (n2 != 4096) {
            if (n2 != 8192 && n2 != 16908344) {
                if (n2 != 16908346) {
                    return false;
                }
            } else {
                n3 = object.getPaddingBottom();
                n2 = object.getPaddingTop();
                n2 = Math.max(object.getScrollY() - (n4 - n3 - n2), 0);
                if (n2 != object.getScrollY()) {
                    ((NestedScrollView)object).v(n2);
                    return true;
                }
                return false;
            }
        }
        n3 = object.getPaddingBottom();
        n2 = object.getPaddingTop();
        n2 = Math.min(object.getScrollY() + (n4 - n3 - n2), ((NestedScrollView)object).c());
        if (n2 != object.getScrollY()) {
            ((NestedScrollView)object).v(n2);
            return true;
        }
        return false;
    }
}

