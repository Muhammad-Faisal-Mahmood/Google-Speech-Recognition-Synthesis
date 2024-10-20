/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.speech.tts.SynthesisCallback
 */
import android.speech.tts.SynthesisCallback;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

public final class bsj
implements SynthesisCallback {
    private static final hei h = hei.m("com/google/android/apps/speech/tts/googletts/dispatch/SynthesisCallbackWrapperImpl");
    public ArrayList a = null;
    public boolean b = false;
    public boolean c = false;
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();
    public Optional f = Optional.empty();
    public ArrayList g = null;
    private boolean i = false;
    private final SynthesisCallback j;

    public bsj(SynthesisCallback synthesisCallback) {
        this.j = synthesisCallback;
        this.b = false;
        this.c = false;
        this.i = false;
    }

    public final int audioAvailable(byte[] object, int n2, int n3) {
        boolean bl2 = this.hasStarted();
        boolean bl3 = true;
        if (bl2 && !this.hasFinished()) {
            int n4 = ((byte[])object).length;
            if (n4 != 0 && n3 > 0) {
                n2 = n4 = this.j.audioAvailable((byte[])object, n2, n3);
                if (n4 == 0) {
                    this.b = true;
                    if (this.a == null) {
                        this.a = new ArrayList();
                    }
                    this.a.add(Arrays.copyOf((byte[])object, n3));
                    n2 = 0;
                }
                if (n2 == 0) {
                    bl3 = false;
                }
                this.c = bl3;
                return n2;
            }
            ((heg)((heg)h.h()).j("com/google/android/apps/speech/tts/googletts/dispatch/SynthesisCallbackWrapperImpl", "audioAvailable", 125, "SynthesisCallbackWrapperImpl.java")).v("Invalid buffer received, buffer size=%d, length=%d", n4, n3);
            return -1;
        }
        object = true != this.hasStarted() ? (Object)"before a call to start() is made." : (Object)"after a call to done() is made.";
        throw new IllegalStateException("audioAvailable() called ".concat((String)object));
    }

    public final int done() {
        if (brt.b() && this.hasFinished()) {
            throw new IllegalStateException("done() already sent");
        }
        boolean bl2 = this.hasStarted();
        boolean bl3 = true;
        if (!bl2 && !this.i) {
            this.j.start(16000, 2, 1);
        }
        if (this.hasStarted() && this.i) {
            ((heg)((heg)h.f()).j("com/google/android/apps/speech/tts/googletts/dispatch/SynthesisCallbackWrapperImpl", "done", 186, "SynthesisCallbackWrapperImpl.java")).r("Skipping done() call due to successful start() and subsequent error()");
            return -1;
        }
        int n2 = this.j.done();
        if (n2 == 0) {
            bl3 = false;
        }
        this.c = bl3;
        return n2;
    }

    public final void error() {
        this.j.error();
        this.i = true;
    }

    public final void error(int n2) {
        this.j.error(n2);
        this.i = true;
    }

    public final int getMaxBufferSize() {
        return this.j.getMaxBufferSize();
    }

    public final boolean hasFinished() {
        return this.j.hasFinished();
    }

    public final boolean hasStarted() {
        return this.j.hasStarted();
    }

    public final void rangeStart(int n2, int n3, int n4) {
        ag$$ExternalSyntheticApiModelOutline0.m(this.j, n2, n3, n4);
        fxf.K(this.g);
        this.g.add(new gov(n2, n3, n4, null));
    }

    public final int start(int n2, int n3, int n4) {
        this.d = Optional.of(n2);
        this.e = Optional.of(n3);
        this.f = Optional.of(n4);
        if (!(this.hasStarted() || this.b || this.hasFinished())) {
            n2 = this.j.start(n2, n3, n4);
            this.a = new ArrayList();
            this.g = new ArrayList();
            return n2;
        }
        String string = !this.hasStarted() ? (this.b ? "audioAvailable() called before a call to start() is made." : "done() called before start()") : "Start called more than once";
        throw new IllegalStateException(string);
    }
}

