/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.List;

public final class js {
    public boolean a = true;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h = 0;
    public int i = 0;
    public boolean j = false;
    public int k;
    public List l = null;
    public boolean m;

    public final View a(kv kv2) {
        Object object = this.l;
        if (object != null) {
            block2: {
                int n2 = object.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    kv2 = ((lg)this.l.get((int)i2)).itemView;
                    object = (kp)kv2.getLayoutParams();
                    if (((kp)((Object)object)).c() || this.d != ((kp)((Object)object)).a()) continue;
                    this.c((View)kv2);
                    break block2;
                }
                kv2 = null;
            }
            return kv2;
        }
        kv2 = kv2.b(this.d);
        this.d += this.e;
        return kv2;
    }

    public final void b() {
        this.c(null);
    }

    public final void c(View view) {
        View view2;
        int n2 = this.l.size();
        int n3 = 0;
        int n4 = Integer.MAX_VALUE;
        View view3 = null;
        while (true) {
            view2 = view3;
            if (n3 >= n2) break;
            view2 = ((lg)this.l.get((int)n3)).itemView;
            kp kp2 = (kp)view2.getLayoutParams();
            int n5 = n4;
            View view4 = view3;
            if (view2 != view) {
                n5 = n4;
                view4 = view3;
                if (!kp2.c()) {
                    int n6 = (kp2.a() - this.d) * this.e;
                    if (n6 < 0) {
                        n5 = n4;
                        view4 = view3;
                    } else {
                        n5 = n4;
                        view4 = view3;
                        if (n6 < n4) {
                            if (n6 == 0) break;
                            n5 = n6;
                            view4 = view2;
                        }
                    }
                }
            }
            ++n3;
            n4 = n5;
            view3 = view4;
        }
        if (view2 == null) {
            this.d = -1;
            return;
        }
        this.d = ((kp)view2.getLayoutParams()).a();
    }

    public final boolean d(ld ld2) {
        int n2 = this.d;
        return n2 >= 0 && n2 < ld2.a();
    }
}

