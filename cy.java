/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class cy {
    public cx a;
    public cw b;
    public final be c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final List i;
    private final List j;
    private final List k;

    public cy(cx object, cw cw2, be be2) {
        jse.e(object, "finalState");
        jse.e((Object)cw2, "lifecycleImpact");
        jse.e(be2, "fragment");
        this.a = object;
        this.b = cw2;
        this.c = be2;
        this.j = new ArrayList();
        this.h = true;
        object = new ArrayList();
        this.k = object;
        this.i = object;
    }

    public void a() {
        this.g = false;
        if (!this.e) {
            if (by.S(2)) {
                ((Object)this).toString();
            }
            this.e = true;
            Iterator iterator = this.j.iterator();
            while (iterator.hasNext()) {
                ((Runnable)iterator.next()).run();
            }
        }
    }

    public void b() {
        this.g = true;
    }

    public final void c(Runnable runnable) {
        this.j.add(runnable);
    }

    public final void d(cu cu2) {
        this.k.add(cu2);
    }

    public final void e(ViewGroup viewGroup) {
        jse.e(viewGroup, "container");
        this.g = false;
        if (!this.d) {
            this.d = true;
            if (this.k.isEmpty()) {
                this.a();
                return;
            }
            for (cu cu2 : jns.s(this.i)) {
                jse.e(viewGroup, "container");
                if (!cu2.i) {
                    cu2.a(viewGroup);
                }
                cu2.i = true;
            }
        }
    }

    public final void f(cu cu2) {
        if (this.k.remove(cu2) && this.k.isEmpty()) {
            this.a();
        }
    }

    public final void g(cx cx2, cw cw2) {
        jse.e((Object)cx2, "finalState");
        jse.e((Object)cw2, "lifecycleImpact");
        int n2 = cw2.ordinal();
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    if (by.S(2)) {
                        Objects.toString(this.c);
                        Objects.toString((Object)this.a);
                        Objects.toString((Object)this.b);
                    }
                    this.a = cx.a;
                    this.b = cw.c;
                    this.h = true;
                    return;
                }
            } else if (this.a == cx.a) {
                if (by.S(2)) {
                    Objects.toString(this.c);
                    Objects.toString((Object)this.b);
                }
                this.a = cx.b;
                this.b = cw.b;
                this.h = true;
                return;
            }
        } else if (this.a != cx.a) {
            if (by.S(2)) {
                Objects.toString(this.c);
                Objects.toString((Object)this.a);
                Objects.toString((Object)cx2);
            }
            this.a = cx2;
        }
    }

    public final void h() {
        this.h = false;
    }

    public final String toString() {
        String string = Integer.toHexString(System.identityHashCode(this));
        StringBuilder stringBuilder = new StringBuilder("Operation {");
        stringBuilder.append(string);
        stringBuilder.append("} {finalState = ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(" lifecycleImpact = ");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(" fragment = ");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

