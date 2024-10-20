/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class ahk
implements agr {
    public long a;
    private final agr b;

    public ahk(agr agr2) {
        abr.i(agr2);
        this.b = agr2;
        Collections.emptyMap();
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        if ((n2 = this.b.a(byArray, n2, n3)) != -1) {
            this.a += (long)n2;
        }
        return n2;
    }

    @Override
    public final long b(agt agt2) {
        Uri uri = agt2.a;
        Collections.emptyMap();
        long l2 = this.b.b(agt2);
        abr.i(this.c());
        this.e();
        return l2;
    }

    @Override
    public final Uri c() {
        return this.b.c();
    }

    @Override
    public final void d() {
        this.b.d();
    }

    @Override
    public final Map e() {
        return this.b.e();
    }

    @Override
    public final void f(ahl ahl2) {
        abr.i(ahl2);
        this.b.f(ahl2);
    }
}

