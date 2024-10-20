/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.os.Build$VERSION
 *  android.os.Process
 */
import android.app.AppOpsManager;
import android.os.Build;
import android.os.Process;

public final class eut
implements hpb {
    final int a;
    final Object b;
    final Object c;
    public final Object d;
    private final int e;

    public eut(enx enx2, int n2, String string, hpn hpn2, int n3) {
        this.e = n3;
        this.a = n2;
        this.b = string;
        this.c = hpn2;
        this.d = enx2;
    }

    public eut(euu euu2, eky eky2, jnf jnf2, int n2, int n3) {
        this.e = n3;
        this.d = eky2;
        this.b = jnf2;
        this.a = n2;
        this.c = euu2;
    }

    @Override
    public final void a(Throwable throwable) {
        if (this.e != 0) {
            a.as(enx.a.h().h(hfo.a, "ALT.AudioOpChecker"), "#audio# Failed getting startListening future", "com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker$1", "onFailure", '\u009f', "RecordAudioOpChecker.java", throwable);
            return;
        }
        ((heg)((heg)euu.a.h().h(hfo.a, "ALT.AudioService")).j("com/google/android/libraries/search/audio/service/impl/AudioServiceImpl$3", "onFailure", 335, "AudioServiceImpl.java")).s("#audio# Failed to get HotwordStopListeningStatus. sessionToken: %d", this.a);
        hwp hwp2 = eui.a.l();
        hwv hwv2 = elb.g(ebp.l, ebv.b);
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        Object object = (eui)hwp2.b;
        hwv2.getClass();
        ((eui)object).c = hwv2;
        ((eui)object).b |= 1;
        hwv2 = eda.a;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        object = this.b;
        eui eui2 = (eui)hwp2.b;
        hwv2.getClass();
        eui2.d = hwv2;
        eui2.b |= 2;
        object.c((eui)hwp2.o());
        this.b.b(throwable);
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        if (this.e != 0) {
            object = (eah)object;
            heg heg2 = (heg)((heg)enx.a.c().h(hfo.a, "ALT.AudioOpChecker")).j("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker$1", "onSuccess", 131, "RecordAudioOpChecker.java");
            object = this.b;
            heg2.x("#audio# startOp, session=%d, tag=%s", this.a, object);
            if (Build.VERSION.SDK_INT >= 30) {
                enx enx2 = (enx)this.d;
                heg2 = (AppOpsManager)enx2.b.getSystemService("appops");
                if (heg2 == null) {
                    ((heg)((heg)enx.a.h().h(hfo.a, "ALT.AudioOpChecker")).j("com/google/android/libraries/search/audio/microphone/accountability/RecordAudioOpChecker", "startOp", 82, "RecordAudioOpChecker.java")).r("#audio# unable to get access to app ops manager for startOp");
                } else {
                    object = this.b;
                    enx2 = enx2.b;
                    sk$$ExternalSyntheticApiModelOutline1.m$1((AppOpsManager)heg2, "android:record_audio", Process.myUid(), enx2.getPackageName(), (String)object, null);
                }
            }
            hhk.T((hpn)this.c, gqk.g(new enw(this, this.a, this.b, 0)), ((enx)this.d).c);
            return;
        }
        Object object2 = ((eky)this.d).a;
        object = (ecy)object;
        hhk.T(hhk.K(object2), gqk.g(new ena(this.b, object, 5, null)), ((euu)this.c).b);
    }
}

