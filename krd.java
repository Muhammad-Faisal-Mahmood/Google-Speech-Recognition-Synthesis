/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
import android.os.SystemClock;

public final class krd {
    public final long a;
    public final Object b;
    public final Object c;

    public krd(dbo dbo2, long l2) {
        this.b = null;
        this.a = l2;
        this.c = dbo2;
    }

    public krd(dbx dbx2, long l2) {
        this.b = dbx2;
        this.a = l2;
        this.c = null;
    }

    public krd(kqx object, long l2, long l3) {
        kqu kqu2 = new kqu();
        this.c = kqu2;
        this.b = object;
        object = kqu2;
        kqu2.a = l2;
        this.a = l3;
    }

    public final int a() {
        return (int)(SystemClock.uptimeMillis() - this.a);
    }

    public final void b() {
        kqu kqu2 = (kqu)this.c;
        if (kqu2.b >= 0 && kqu2.c >= 0) {
            ((kqx)this.b).c(kqu2);
        }
    }
}

