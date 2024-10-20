/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.function.Function;

public final class fha {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService");
    public final dxi b;
    public final hpq c;
    public final fdl d;
    public final String e;
    public final Context f;
    public hpn g;
    public ffv h;
    public final feh i;
    public final cya j;
    private fhd k = fhd.a().a();
    private final bmu l;

    public fha(bmu bmu2, hpq hpq2, dxi dxi2, cya cya2, feh feh2, Context context, fdl fdl2) {
        this.l = bmu2;
        this.c = hpq2;
        this.b = dxi2;
        this.j = cya2;
        this.i = feh2;
        this.d = fdl2;
        this.e = fdl2.c;
        this.f = context;
    }

    public static String b(String string) {
        return "Transcription:transcriptionState:".concat(String.valueOf(string));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean h() {
        synchronized (this) {
            fhd fhd2 = this.k;
            fdr fdr2 = fhd2.f;
            if (fdr2 != null) {
                return false;
            }
            return fhd2.c != null && (fdr2 = fhd2.h) != null;
            {
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final fhd a() {
        synchronized (this) {
            return this.k;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(fef object) {
        synchronized (this) {
            if (!this.h()) {
                Object object2 = new bof(object, 18);
                this.f((Function)object2);
                object2 = this.b;
                Object object3 = this.e;
                object3 = dxv.c.b("requestId", (String)object3);
                object = ((fef)object).a;
                object2.a(((dyp)object3).i(((fdr)object).a, ((fdr)object).b()));
                return;
            }
            return;
        }
    }

    public final void d(String string, hpn hpn2) {
        fxf.al(hpn2, new ena((Object)this, (Object)string, 7, null), this.c);
    }

    public final void e() {
        dyj dyj2 = dxv.c.b("requestId", this.e).j();
        this.b.a(dyj2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(Function object) {
        synchronized (this) {
            fhd fhd2 = (fhd)ag$$ExternalSyntheticApiModelOutline1.m((Function)object, (Object)this.k);
            if (!((Object)fhd2).equals(this.k)) {
                this.k = fhd2;
                bmu bmu2 = this.l;
                object = this.e;
                bmu2.P(hhk.K(null), fha.b((String)object));
                ((heg)((heg)a.f()).j("com/google/android/libraries/speech/transcription/recognition/dataservice/TranscriptionDataService", "updateTranscriptionState", 426, "TranscriptionDataService.java")).C("updated TranscriptionState: %s for request-id %s", fhd2, this.e);
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean g(Function function) {
        synchronized (this) {
            this.f(function);
            return this.h();
        }
    }
}

