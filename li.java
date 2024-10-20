/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.accessibility.AccessibilityEvent
 */
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class li
extends us {
    final RecyclerView a;
    public final lh b;

    public li(RecyclerView object) {
        this.a = object;
        object = this.j();
        if (object != null && object instanceof lh) {
            this.b = (lh)object;
            return;
        }
        this.b = new lh(this);
    }

    @Override
    public final void a(View object, AccessibilityEvent accessibilityEvent) {
        super.a((View)object, accessibilityEvent);
        if (object instanceof RecyclerView && !this.k() && (object = ((RecyclerView)object).n) != null) {
            ((ko)object).T(accessibilityEvent);
        }
    }

    @Override
    public final void b(View object, xv xv2) {
        ko ko2;
        super.b((View)object, xv2);
        if (!this.k() && (ko2 = this.a.n) != null) {
            object = ko2.t;
            ko2.m(object.e, object.O, xv2);
        }
    }

    @Override
    public final boolean h(View object, int n2, Bundle bundle) {
        if (super.h((View)object, n2, bundle)) {
            return true;
        }
        if (!this.k() && (object = this.a.n) != null) {
            return ((ko)object).u(n2, bundle);
        }
        return false;
    }

    public us j() {
        return this.b;
    }

    final boolean k() {
        return this.a.an();
    }
}

