/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.util.function.Function;

public final class fgy
implements ffk {
    final fha a;

    public fgy(fha fha2) {
        this.a = fha2;
    }

    @Override
    public final void l(Uri object) {
        if (this.a.g((Function)(object = new bof(object, 20)))) {
            this.a.e();
        }
    }

    @Override
    public final void m() {
        dyj dyj2 = dxv.g.b("requestId", this.a.e);
        this.a.b.a(dyj2);
    }

    @Override
    public final void n() {
        fcx fcx2 = new fcx(6);
        this.a.f(fcx2);
    }

    @Override
    public final void o() {
        dyj dyj2 = dxv.s.b("requestId", this.a.e);
        this.a.b.a(dyj2);
    }

    @Override
    public final void p() {
        Object object = new fcx(5);
        this.a.f((Function)object);
        object = dxv.f.b("requestId", this.a.e);
        this.a.b.a((dyk)object);
    }

    @Override
    public final void q(int n2) {
        fgx fgx2 = new fgx(n2);
        this.a.f(fgx2);
    }
}

