/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public final class ee {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public fs h;
    fo i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    Bundle p;

    public ee(int n2) {
        this.a = n2;
        this.n = false;
    }

    final void a(fs fs2) {
        Object object = this.h;
        if (fs2 != object) {
            if (object != null) {
                ((fs)object).m(this.i);
            }
            this.h = fs2;
            if (fs2 != null && (object = this.i) != null) {
                fs2.g((ge)object);
            }
        }
    }
}

