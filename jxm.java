/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

public final class jxm
extends jxn
implements jvj {
    public final Handler a;
    private final String d;
    private final boolean e;
    private final jxm f;

    public jxm(Handler handler, String string) {
        this(handler, string, false);
    }

    private jxm(Handler object, String string, boolean bl2) {
        this.a = object;
        this.d = string;
        this.e = bl2;
        object = bl2 ? this : new jxm((Handler)object, string, true);
        this.f = object;
    }

    private final void i(jqf jqf2, Runnable runnable) {
        jns.as(jqf2, new CancellationException(a.ak(this, "The task was rejected, the handler underlying the dispatcher '", "' was closed")));
        juy juy2 = jvo.a;
        ((juy)kcc.a).a(jqf2, runnable);
    }

    @Override
    public final void a(jqf jqf2, Runnable runnable) {
        if (!this.a.post(runnable)) {
            this.i(jqf2, runnable);
        }
    }

    @Override
    public final boolean b(jqf jqf2) {
        if (this.e) {
            jqf2 = this.a;
            if (jse.i(Looper.myLooper(), jqf2.getLooper())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final void c(long l2, jul jul2) {
        kot kot2 = new kot(jul2, this, 1);
        if (this.a.postDelayed((Runnable)kot2, l2 = jse.n(l2, 0x3FFFFFFFFFFFFFFFL))) {
            jul2.s(new ezq(this, kot2, 8, null));
            return;
        }
        this.i(jul2.b, kot2);
    }

    public final boolean equals(Object object) {
        if (object instanceof jxm) {
            object = (jxm)object;
            if (((jxm)object).a == this.a && ((jxm)object).e == this.e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final jvq g(long l2, Runnable runnable, jqf jqf2) {
        if (this.a.postDelayed(runnable, l2 = jse.n(l2, 0x3FFFFFFFFFFFFFFFL))) {
            return new jxl(this, runnable);
        }
        this.i(jqf2, runnable);
        return jwv.a;
    }

    @Override
    public final /* synthetic */ jwt h() {
        return this.f;
    }

    public final int hashCode() {
        boolean bl2 = this.e;
        int n2 = System.identityHashCode(this.a);
        int n3 = true != bl2 ? 1237 : 1231;
        return n3 ^ n2;
    }

    @Override
    public final String toString() {
        String string;
        String string2 = string = this.e();
        if (string == null) {
            string = string2 = this.d;
            if (string2 == null) {
                string = this.a.toString();
            }
            string2 = string;
            if (this.e) {
                string2 = String.valueOf(string).concat(".immediate");
            }
        }
        return string2;
    }
}

