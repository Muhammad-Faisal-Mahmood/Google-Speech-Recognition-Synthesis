/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;

public final class jq {
    public kc a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public jq() {
        this.d();
    }

    public final void a() {
        int n2 = this.d ? this.a.f() : this.a.j();
        this.c = n2;
    }

    public final void b(View view, int n2) {
        this.c = this.d ? this.a.a(view) + this.a.o() : this.a.d(view);
        this.b = n2;
    }

    public final void c(View view, int n2) {
        int n3 = this.a.o();
        if (n3 >= 0) {
            this.b(view, n2);
            return;
        }
        this.b = n2;
        if (this.d) {
            n2 = this.a.f() - n3 - this.a.a(view);
            this.c = this.a.f() - n2;
            if (n2 > 0) {
                n3 = this.a.b(view);
                int n4 = this.c;
                int n5 = this.a.j();
                if ((n3 = n4 - n3 - (n5 + Math.min(this.a.d(view) - n5, 0))) < 0) {
                    this.c += Math.min(n2, -n3);
                    return;
                }
            }
        } else {
            int n6 = this.a.d(view);
            n2 = n6 - this.a.j();
            this.c = n6;
            if (n2 > 0) {
                int n7 = this.a.b(view);
                int n8 = this.a.f();
                int n9 = this.a.a(view);
                n3 = this.a.f() - Math.min(0, n8 - n3 - n9) - (n6 + n7);
                if (n3 < 0) {
                    this.c -= Math.min(n2, -n3);
                }
            }
        }
    }

    public final void d() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnchorInfo{mPosition=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mCoordinate=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mLayoutFromEnd=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mValid=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

