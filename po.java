/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;
import java.util.concurrent.Executor;

public final class po {
    public Object a;
    public ps b;
    public pu c = new pu();
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        pu pu2 = this.c;
        if (pu2 != null) {
            pu2.c(runnable, executor);
        }
    }

    public final void b() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void c(Object object) {
        this.d = true;
        ps ps2 = this.b;
        if (ps2 != null && ps2.b.e(object)) {
            this.b();
        }
    }

    public final void d(Throwable throwable) {
        this.d = true;
        ps ps2 = this.b;
        if (ps2 != null && ps2.a(throwable)) {
            this.b();
        }
    }

    protected final void finalize() {
        hpn hpn2 = this.b;
        if (hpn2 != null && !((ps)hpn2).isDone()) {
            Object object = this.a;
            Objects.toString(object);
            ((ps)hpn2).a(new pp("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(object))));
        }
        if (!this.d && (hpn2 = this.c) != null) {
            ((pn)hpn2).e(null);
        }
    }
}

