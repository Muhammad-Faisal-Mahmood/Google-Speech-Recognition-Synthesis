/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

public final class fki {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/service/RecognitionServiceWrapper");
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final fjz c;
    private final Set d;

    public fki(fjz fjz2, Set set) {
        this.c = fjz2;
        this.d = set;
    }

    public final void a() {
        Collection$_EL.stream(this.d).filter(new fay(13)).forEach(new fbw(12));
    }
}

