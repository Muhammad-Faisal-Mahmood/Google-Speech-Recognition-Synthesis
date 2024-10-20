/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import java.util.Collection;
import java.util.concurrent.Executor;

public final class fjc {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper");
    public final fcf b;
    public final ffj c;
    public final Executor d;

    public fjc(fcf fcf2, ffj ffj2, Executor executor) {
        this.b = fcf2;
        this.c = ffj2;
        this.d = executor;
    }

    public static gzx a(hav object, fhv fhv2) {
        object = Collection$_EL.stream((Collection)object).map(new fja(fhv2, 0));
        int n2 = gzx.d;
        return (gzx)object.collect(gye.a);
    }
}

