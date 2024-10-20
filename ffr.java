/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;
import java.util.function.Supplier;

public final class ffr
implements fgq {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/OnDevicePrimaryRecognizer");
    public final fgu b;
    public final fgr c;
    public final ffk d;
    public final Executor e;
    public final ffj f;
    public fgq g;
    public final gfw h;
    public final bmu i;
    private final cxt j;

    public ffr(fgu fgu2, fgr fgr2, ffk ffk2, Executor executor, ffj ffj2, gfw gfw2, bmu bmu2) {
        this.b = fgu2;
        this.c = fgr2;
        this.d = ffk2;
        this.h = gfw2;
        this.i = bmu2;
        this.f = ffj2;
        this.e = executor;
        this.j = new cxt(null, null);
    }

    @Override
    public final void a() {
        bdr bdr2 = new bdr(this, 20);
        Executor executor = this.e;
        gax.c(this.j.E(bdr2, executor), "Call OnDevicePrimaryRecognizer#cancel failed.", new Object[0]);
    }

    @Override
    public final void c(Supplier object, int n2, int n3) {
        fgi fgi2 = new fgi(this, (Supplier)object, n2, n3, 1);
        object = this.e;
        gax.c(this.j.F(fgi2, (Executor)object), "Call OnDevicePrimaryRecognizer#startListening failed.", new Object[0]);
    }
}

