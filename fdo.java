/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class fdo {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/beeps/AudioPlayer");
    public final Context b;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final hpq e;

    public fdo(Context context, hpr hpr2) {
        this.b = context;
        this.e = hpr2;
    }

    public final void a(int n2) {
        this.c.add(n2);
        this.b();
    }

    public final void b() {
        if (!this.c.isEmpty() && this.d.compareAndSet(false, true)) {
            this.e.be(gqk.i(new dqv(this, 19)));
        }
    }
}

