/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public final class els {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/core/timestamp/TimestampProvider");
    public final int b;
    public final int c;
    public final AtomicReference d;
    private final int e;

    public els(eae object) {
        int n2;
        jse.e(object, "audioLibInputParams");
        this.e = n2 = Integer.bitCount(((eae)object).e);
        this.b = ewj.a(((eae)object).f) * n2;
        this.c = 1000000000 / ((eae)object).d;
        object = doc.l(dzs.a.l());
        ((bzb)object).l(doc.k(dzo.a.l()).j());
        this.d = new AtomicReference<dzs>(((bzb)object).k());
    }

    public final void a(dzs dzs2) {
        jse.e(dzs2, "audioTimestamp");
        this.d.set(dzs2);
    }
}

