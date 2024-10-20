/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.wear.ambient.AmbientMode$AmbientController;

public final class agm
extends agl {
    private Uri a;
    private byte[] b;
    private int c;
    private int d;
    private boolean e;
    private final AmbientMode$AmbientController f;

    public agm(byte[] byArray) {
        AmbientMode$AmbientController ambientMode$AmbientController = new AmbientMode$AmbientController(byArray, null);
        boolean bl2 = false;
        super(false);
        this.f = ambientMode$AmbientController;
        if (byArray.length > 0) {
            bl2 = true;
        }
        abr.d(bl2);
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        int n4 = this.d;
        if (n4 == 0) {
            return -1;
        }
        n3 = Math.min(n3, n4);
        byte[] byArray2 = this.b;
        abr.j(byArray2);
        System.arraycopy(byArray2, this.c, byArray, n2, n3);
        this.c += n3;
        this.d -= n3;
        this.g(n3);
        return n3;
    }

    @Override
    public final long b(agt agt2) {
        this.j();
        this.a = agt2.a;
        this.b = (byte[])this.f.a;
        long l2 = agt2.e;
        int n2 = this.b.length;
        if (l2 <= (long)n2) {
            int n3;
            this.c = n3 = (int)l2;
            this.d = n2 - n3;
            l2 = agt2.f;
            this.e = true;
            this.i(agt2);
            l2 = agt2.f;
            return this.d;
        }
        throw new ags(2008);
    }

    @Override
    public final Uri c() {
        return this.a;
    }

    @Override
    public final void d() {
        if (this.e) {
            this.e = false;
            this.h();
        }
        this.a = null;
        this.b = null;
    }
}

