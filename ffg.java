/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public final class ffg
implements fgq {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/HybridSpeechRecognizer");
    public final Executor b;
    public final fgr c;
    public final fgo d;
    public final ffo e;
    public final fff f;
    public final HashSet g;
    public final List h;
    public boolean i;
    public boolean j;
    public hpn k;
    private final hpr l;
    private final fgu m;
    private final fff n;

    public ffg(cya object, gfw object2, hpr object3, fgu fgu2, fgr object4, ffk ffk2) {
        fff fff2;
        fff fff3;
        this.n = fff3 = new fff(this);
        this.f = fff2 = new fff(this);
        this.g = new HashSet();
        this.h = new ArrayList();
        this.i = false;
        this.j = false;
        this.k = null;
        this.l = object3;
        this.m = fgu2;
        this.c = object4;
        this.b = new hpz((Executor)object3);
        this.d = ((gfw)object2).a(fgu2, fff3, ffk2);
        object4 = (hpr)((cya)object).a.b();
        object4.getClass();
        object2 = (hpr)((cya)object).d.b();
        object2.getClass();
        object3 = ((cya)object).e.b();
        ffk2 = ((ilt)((cya)object).b).a();
        object = ((fei)((cya)object).c).a();
        this.e = new ffo((hpr)object4, (hpr)object2, (idh)object3, (Context)ffk2, (feh)object, fgu2, fff2);
    }

    @Override
    public final void a() {
        this.e.a();
        this.d.a();
    }

    public final void b() {
        Runnable runnable = gqk.i(new ffd(this, 1));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.k = this.l.b(runnable, 5000L, timeUnit);
    }

    @Override
    public final void c(Supplier supplier, int n2, int n3) {
        this.b();
        this.e.c(supplier, n2, n3);
        this.d.c(supplier, n2, n3);
    }

    public final void d(fef object2) {
        if (!(this.i || this.j || this.m.o && !this.g.isEmpty())) {
            a.as(a.c(), "#tryToFallback", "com/google/android/libraries/speech/transcription/recognition/HybridSpeechRecognizer", "tryToFallback", '\u00bb', "HybridSpeechRecognizer.java", (Throwable)object2);
            this.i = true;
            this.e.a();
            this.c.d((fef)object2);
            for (Object object2 : this.h) {
                if (this.g.contains(((bmu)object2).a)) continue;
                ((bmu)object2).c.run();
            }
        }
    }
}

