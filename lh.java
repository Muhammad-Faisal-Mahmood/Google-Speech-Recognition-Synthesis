/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 */
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

public final class lh
extends us {
    final li a;
    public final Map b = new WeakHashMap();

    public lh(li li2) {
        this.a = li2;
    }

    @Override
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        us us2 = (us)this.b.get(view);
        if (us2 != null) {
            us2.a(view, accessibilityEvent);
            return;
        }
        super.a(view, accessibilityEvent);
    }

    @Override
    public final void b(View view, xv xv2) {
        Object object;
        if (!this.a.k() && (object = this.a.a.n) != null) {
            ((ko)object).aL(view, xv2);
            object = (us)this.b.get(view);
            if (object != null) {
                ((us)object).b(view, xv2);
                return;
            }
            super.b(view, xv2);
            return;
        }
        super.b(view, xv2);
    }

    @Override
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        us us2 = (us)this.b.get(view);
        if (us2 != null) {
            us2.c(view, accessibilityEvent);
            return;
        }
        super.c(view, accessibilityEvent);
    }

    @Override
    public final void d(View view, int n2) {
        us us2 = (us)this.b.get(view);
        if (us2 != null) {
            us2.d(view, n2);
            return;
        }
        super.d(view, n2);
    }

    @Override
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        us us2 = (us)this.b.get(view);
        if (us2 != null) {
            us2.e(view, accessibilityEvent);
            return;
        }
        super.e(view, accessibilityEvent);
    }

    @Override
    public final boolean f(View view, AccessibilityEvent accessibilityEvent) {
        us us2 = (us)this.b.get(view);
        if (us2 != null) {
            return us2.f(view, accessibilityEvent);
        }
        return super.f(view, accessibilityEvent);
    }

    @Override
    public final boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        us us2 = (us)this.b.get(viewGroup);
        if (us2 != null) {
            return us2.g(viewGroup, view, accessibilityEvent);
        }
        return super.g(viewGroup, view, accessibilityEvent);
    }

    @Override
    public final boolean h(View object, int n2, Bundle object2) {
        if (!this.a.k() && this.a.a.n != null) {
            us us2 = (us)this.b.get(object);
            if (us2 != null ? us2.h((View)object, n2, (Bundle)object2) : super.h((View)object, n2, (Bundle)object2)) {
                return true;
            }
            object = this.a.a.n.t;
            object2 = object.e;
            object = object.O;
            return false;
        }
        return super.h((View)object, n2, (Bundle)object2);
    }

    @Override
    public final bzb i(View view) {
        us us2 = (us)this.b.get(view);
        if (us2 != null) {
            return us2.i(view);
        }
        return super.i(view);
    }
}

