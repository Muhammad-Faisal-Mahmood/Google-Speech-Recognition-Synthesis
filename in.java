/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.util.ArrayList;
import java.util.List;

public final class in {
    public final im a;
    public final List b;
    public int c = 0;
    public View d;
    public final AmbientMode$AmbientController e;

    public in(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.e = ambientMode$AmbientController;
        this.a = new im();
        this.b = new ArrayList();
    }

    public final int a() {
        List list = this.b;
        return this.e.q() - list.size();
    }

    public final int b(int n2) {
        int n3;
        if (n2 < 0) {
            return -1;
        }
        int n4 = this.e.q();
        for (int i2 = n2; i2 < n4; i2 += n3) {
            n3 = n2 - (i2 - this.a.a(i2));
            if (n3 != 0) continue;
            while (this.a.f(i2)) {
                ++i2;
            }
            return i2;
        }
        return -1;
    }

    public final int c() {
        return this.e.q();
    }

    final int d(View view) {
        int n2 = this.e.r(view);
        if (n2 != -1 && !this.a.f(n2)) {
            return n2 - this.a.a(n2);
        }
        return -1;
    }

    public final View e(int n2) {
        return this.e.s(this.b(n2));
    }

    public final View f(int n2) {
        return this.e.s(n2);
    }

    public final void g(View view, int n2, boolean bl2) {
        n2 = n2 < 0 ? this.e.q() : this.b(0);
        this.a.c(n2, bl2);
        if (bl2) {
            this.j(view);
        }
        Object object = this.e;
        ((RecyclerView)((AmbientMode$AmbientController)object).a).addView(view, n2);
        Object object2 = RecyclerView.j(view);
        object = (RecyclerView)((AmbientMode$AmbientController)object).a;
        kf kf2 = ((RecyclerView)object).m;
        if (kf2 != null && object2 != null) {
            kf2.onViewAttachedToWindow((lg)object2);
        }
        if ((object2 = ((RecyclerView)object).y) != null) {
            n2 = object2.size();
            while (--n2 >= 0) {
                ((kq)((RecyclerView)object).y.get(n2)).a(view);
            }
        }
    }

    public final void h(View object, int n2, ViewGroup.LayoutParams layoutParams, boolean bl2) {
        n2 = n2 < 0 ? this.e.q() : this.b(n2);
        this.a.c(n2, bl2);
        if (bl2) {
            this.j((View)object);
        }
        AmbientMode$AmbientController ambientMode$AmbientController = this.e;
        lg lg2 = RecyclerView.j((View)object);
        if (lg2 != null) {
            if (!lg2.isTmpDetached() && !lg2.shouldIgnore()) {
                object = new StringBuilder("Called attach on a child which is not detached: ");
                ((StringBuilder)object).append(lg2);
                ((StringBuilder)object).append(((RecyclerView)ambientMode$AmbientController.a).m());
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            lg2.clearTmpDetachFlag();
        }
        RecyclerView.n((RecyclerView)ambientMode$AmbientController.a, (View)object, n2, layoutParams);
    }

    final void i(int n2) {
        Object object = this.a;
        n2 = this.b(n2);
        ((im)object).g(n2);
        object = this.e;
        Object object2 = ((AmbientMode$AmbientController)object).s(n2);
        if (object2 != null) {
            lg lg2 = RecyclerView.j((View)object2);
            if (lg2 != null) {
                if (lg2.isTmpDetached() && !lg2.shouldIgnore()) {
                    object2 = new StringBuilder("called detach on an already detached child ");
                    ((StringBuilder)object2).append(lg2);
                    ((StringBuilder)object2).append(((RecyclerView)((AmbientMode$AmbientController)object).a).m());
                    throw new IllegalArgumentException(((StringBuilder)object2).toString());
                }
                lg2.addFlags(256);
            }
        } else {
            int n3 = RecyclerView.ab;
        }
        RecyclerView.o((RecyclerView)((AmbientMode$AmbientController)object).a, n2);
    }

    public final void j(View object) {
        this.b.add(object);
        object = RecyclerView.j((View)object);
        if (object != null) {
            ((lg)object).onEnteredHiddenState((RecyclerView)this.e.a);
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.t(view);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.toString());
        stringBuilder.append(", hidden list:");
        stringBuilder.append(this.b.size());
        return stringBuilder.toString();
    }
}

