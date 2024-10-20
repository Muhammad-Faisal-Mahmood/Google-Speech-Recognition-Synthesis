/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.apps.speech.tts.googletts.audio.AndroidDecoder;
import java.util.concurrent.ExecutorService;

public final class brm
implements imb {
    private final jnu a;
    private final jnu b;

    public brm(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    public final AndroidDecoder a() {
        brq brq2 = ((brr)this.a).a();
        buj.c().intValue();
        return new AndroidDecoder(brq2, (ExecutorService)this.b.b());
    }
}

