/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public final class bmh {
    public final WeakReference a;
    public String b;
    public String c;
    public Drawable d;
    public Drawable e;
    public int f = -1;
    public CharSequence g;
    public Drawable h;
    public bmk i;
    public bmi j = bmi.a;
    public boolean k = true;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public boolean o = true;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public int t = 0;

    public bmh(Context context) {
        this.a = new WeakReference<Context>(context);
    }

    public final bml a() {
        boolean bl2 = this.p;
        if (bl2 && (this.l || this.h == null)) {
            throw new IllegalStateException("Only simple icons can be activatable");
        }
        if (this.m && (this.l || bl2)) {
            throw new IllegalStateException("Unsupported options for a checkable MenuItem");
        }
        boolean bl3 = this.r;
        if (bl3 && this.s) {
            throw new IllegalStateException("Can't have both a search and settings MenuItem");
        }
        if (bl2 && this.j == bmi.b) {
            throw new IllegalStateException("Activatable MenuItems not supported as Overflow");
        }
        if (bl3 && (!this.b.contentEquals(this.g) || !this.d.equals(this.h) || this.m || this.p || !this.k || this.l || this.j != bmi.a)) {
            throw new IllegalStateException("Invalid search MenuItem");
        }
        if (this.s && (!this.c.contentEquals(this.g) || !this.e.equals(this.h) || this.m || this.p || !this.k || this.l || this.j != bmi.a)) {
            throw new IllegalStateException("Invalid settings MenuItem");
        }
        return new bml(this);
    }
}

