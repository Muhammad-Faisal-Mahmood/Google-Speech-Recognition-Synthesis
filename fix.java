/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Optional;
import java.util.Locale;
import java.util.concurrent.Executor;

public final class fix
extends fhp {
    public static final hei a = hei.m("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl");
    public static final hav b = hav.q("com.google.android.inputmethod.latin", "com.google.android.inputmethod.latin.canary", "com.google.android.inputmethod.latin.dev");
    public final fjc c;
    public final long d;
    public final boolean e;
    public final fpo f;
    private final hav g;
    private final hpr h;
    private final fpo i;

    public fix(fpo fpo2, fjc fjc2, fpo fpo3, iah iah2, long l2, boolean bl2, hpr hpr2) {
        this.i = fpo2;
        this.c = fjc2;
        this.f = fpo3;
        this.g = hav.n(iah2.b);
        this.d = l2;
        this.e = bl2;
        this.h = hpr2;
    }

    @Override
    public final jnf a(jnf jnf2) {
        String string = fhq.k().c;
        Object object = new AmbientModeSupport$AmbientController(jnf2);
        string.getClass();
        Object object2 = this.i;
        Object object3 = ((fpo)object2).a;
        Object object4 = ((fpo)object2).f.b();
        cya cya2 = ((ffw)object3).a();
        object3 = (Executor)((fpo)object2).d.b();
        object3.getClass();
        fju fju2 = (fju)((fpo)object2).e.b();
        fju2.getClass();
        ffz ffz2 = (ffz)((fpo)object2).c.b();
        ffz2.getClass();
        object2 = (fga)((fpo)object2).b.b();
        object2.getClass();
        object = new fjj(string, (AmbientModeSupport$AmbientController)object, (fje)object4, cya2, (Executor)object3, fju2, ffz2, (fga)object2);
        object4 = new ffe(string, object, 5);
        ((jmy)jnf2).e((Runnable)object4);
        return new fiw(this, string, jnf2, (fjj)object);
    }

    @Override
    public final void b(fhv fhv2, jnf object) {
        ((heg)((heg)a.f().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "checkModelAvailability", 152, "GoogleAsrServiceImpl.java")).r("#checkModelAvailability");
        Object object2 = new bpw(17);
        ((jmy)object).e((Runnable)object2);
        AmbientMode$AmbientController ambientMode$AmbientController = new AmbientMode$AmbientController(object);
        int n2 = fhv2.d;
        object = object2 = idq.b(n2);
        if (object2 == null) {
            object = idq.a;
        }
        if (object != (object2 = idq.a)) {
            object = idq.b(n2);
            if (object == null) {
                object = object2;
            }
            object2 = this.c;
            hav hav2 = hav.n(new hxd(fhv2.e, fhv.a));
            fxf.al(fxf.aj(((fjc)object2).b.b("", (idq)object, hav2), new ezt(fhv2, 19), ((fjc)object2).d), new ena(object, (Object)ambientMode$AmbientController, 8, null), ((fjc)object2).d);
            return;
        }
        ((heg)((heg)fjc.a.h().h(hfo.a, "ModelManagerWrapper")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper", "checkModelAvailability", 77, "ModelManagerWrapper.java")).r("Can't check model availability without application domain.");
        new IllegalArgumentException("Invalid application domain");
        ambientMode$AmbientController.c();
    }

    @Override
    public final void c(fhy object, jnf object2) {
        Optional<Object> optional;
        Object object3;
        Object object4;
        block10: {
            ((heg)((heg)a.f().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "downloadModel", 184, "GoogleAsrServiceImpl.java")).r("#downloadModel");
            object4 = new bpw(16);
            ((jmy)object2).e((Runnable)object4);
            if (((fhy)object).e) {
                int n2;
                object4 = object3 = ((fhy)object).g;
                if (object3 == null) {
                    object4 = fhi.a;
                }
                object4 = ((fhi)object4).b;
                int n3 = ((String)object4).length();
                for (int i2 = 0; i2 < n3; i2 += Character.charCount(n2)) {
                    n2 = ((String)object4).codePointAt(i2);
                    if (Character.isWhitespace(n2)) continue;
                    optional = this.g;
                    object4 = object3 = ((fhy)object).g;
                    if (object3 == null) {
                        object4 = fhi.a;
                    }
                    if (!((gzm)((Object)optional)).contains(((fhi)object4).b)) {
                        break;
                    }
                    break block10;
                }
                ((heg)((heg)a.g().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "downloadModel", 193, "GoogleAsrServiceImpl.java")).r("Can't silent download model if not in allowlist.");
                object = fib.a.l();
                object3 = fhz.a.l();
                if (!((hwp)object3).b.B()) {
                    ((hwp)object3).u();
                }
                object4 = (fhz)((hwp)object3).b;
                ((fhz)object4).c = 4;
                ((fhz)object4).b |= 1;
                object4 = (fhz)((hwp)object3).o();
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object3 = (fib)((hwp)object).b;
                object4.getClass();
                ((fib)object3).c = object4;
                ((fib)object3).b = 1;
                object2.c((fib)((hwp)object).o());
                object2.a();
                return;
            }
        }
        object3 = this.c;
        optional = new AmbientMode$AmbientController(object2);
        object2 = object4 = idq.b(((fhy)object).d);
        if (object4 == null) {
            object2 = idq.a;
        }
        if (object2 == idq.a) {
            ((heg)((heg)fjc.a.h().h(hfo.a, "ModelManagerWrapper")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/ModelManagerWrapper", "downloadModel", 127, "ModelManagerWrapper.java")).r("Can't download model without application domain.");
            ((AmbientMode$AmbientController)((Object)optional)).b(5);
            return;
        }
        object2 = new fjb((fhy)object, (AmbientMode$AmbientController)((Object)optional));
        object4 = ((fjc)object3).b;
        object3 = Locale.forLanguageTag(((fhy)object).c);
        boolean bl2 = ((fhy)object).e;
        optional = Optional.of(object2);
        object = object2 = idq.b(((fhy)object).d);
        if (object2 == null) {
            object = idq.a;
        }
        ((fcf)object4).d("", (Locale)object3, bl2, optional, (idq)object);
    }

    @Override
    public final void d(jnf jnf2) {
        ((heg)((heg)a.f().h(hfo.a, "GoogleAsrService")).j("com/google/android/libraries/speech/transcription/recognition/grpc/impl/GoogleAsrServiceImpl", "queryServiceStatus", 112, "GoogleAsrServiceImpl.java")).r("#queryServiceStatus");
        bpw bpw2 = new bpw(15);
        ((jmy)jnf2).e(bpw2);
        gax.c(fxf.ag(new ffe((Object)this, (Object)jnf2, 6, null), this.h), "query service status failed", new Object[0]);
    }
}

