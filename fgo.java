/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  hom
 */
import android.content.Context;
import j$.util.Collection$_EL;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

public final class fgo
implements fgq {
    private static final hwg B;
    public static final hei a;
    public final cxt A;
    public final ffj b;
    public final hpr c;
    public final hpr d;
    public final gto e;
    public final gpm f;
    public final hwg g;
    public final boolean h;
    public final int i;
    public final ibs j;
    public final fgu k;
    public final fgr l;
    public final hav m;
    public final gto n;
    public final gto o;
    public final gto p;
    public final gto q;
    public final gto r;
    public final ffk s;
    public final Context t;
    public int u;
    public final AtomicBoolean v = new AtomicBoolean(false);
    public cmz w;
    public final cnu x;
    public final feh y;
    public final fpo z;

    static {
        a = hei.m("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer");
        B = hzu.c(10L, 0);
    }

    public fgo(Context object, feh feh2, ffj ffj2, hpr hpr2, hpr hpr3, fpo fpo2, cnu cnu2, gto gto2, gpm gpm2, Map map, Map map2, gto gto3, gto gto4, gto gto5, gto gto6, fgu fgu2, fgr fgr2, ffk ffk2) {
        this.t = object;
        this.y = feh2;
        this.h = feh2.d;
        object = fgu2.K ? B : feh2.c;
        this.g = object;
        this.i = feh2.e;
        this.j = ibs.a;
        this.b = ffj2;
        this.A = new cxt(null, null);
        this.c = hpr2;
        this.d = hpr3;
        this.z = fpo2;
        this.x = cnu2;
        this.e = gto2;
        this.f = gpm2;
        object = !fgu2.y && !fgo.f(fgu2) ? hdc.a : (hav)Collection$_EL.stream(map.values()).map(new fcx(4)).collect(gye.b);
        this.m = object;
        object = fgo.f(fgu2) ? "smart_dictation" : (fgu2.y ? "ANDROID_SPEECH_API" : "");
        this.n = gto.h((jnu)map2.get(object)).b(new fiz(1));
        this.o = gto3;
        this.p = gto4;
        this.q = gto5;
        this.r = gto6;
        this.k = fgu2;
        this.l = fgr2;
        this.s = ffk2;
    }

    public static idy b(fgu fgu2) {
        if (fgu2.f.equals(fgs.e)) {
            if (fgu2.E.isEmpty()) {
                ((heg)((heg)a.g()).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "getHostAppId", 581, "SodaSpeechRecognizer.java")).r("Google ASR Service did not send a HostAppId.");
            }
            return fgu2.E.orElse(idy.a);
        }
        return idy.u;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void d(hpn hpn2, String string, Object[] objectArray) {
        try {
            hhk.S(hpn2);
            return;
        }
        catch (ExecutionException executionException) {
            ((heg)((heg)((heg)a.g()).i(executionException.getCause())).j("com/google/android/libraries/speech/transcription/recognition/SodaSpeechRecognizer", "logFutureOnFailure", 1032, "SodaSpeechRecognizer.java")).L(string, objectArray);
            return;
        }
        catch (CancellationException cancellationException) {
            return;
        }
    }

    public static void e(hpn hpn2, String string, Object ... objectArray) {
        hpn2.c(new fbx(hpn2, string, objectArray, 3, null), (Executor)hom.a);
    }

    public static boolean f(fgu fgu2) {
        boolean bl2 = fgo.b(fgu2).equals(idy.C);
        boolean bl3 = fgu2.w.equals("smart_dictation");
        return bl2 || bl3;
        {
        }
    }

    @Override
    public final void a() {
        fgm fgm2 = new fgm(this, 1);
        hpr hpr2 = this.c;
        fgo.e(this.A.E(fgm2, hpr2), "Failed call #cancel", new Object[0]);
    }

    @Override
    public final void c(Supplier object, int n2, int n3) {
        fgi fgi2 = new fgi(this, (Supplier)object, n2, n3, 0);
        object = this.c;
        fgo.e(this.A.F(fgi2, (Executor)object), "Failed call #startListening", new Object[0]);
    }
}

