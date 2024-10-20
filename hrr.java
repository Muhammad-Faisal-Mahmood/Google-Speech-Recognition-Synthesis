/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 */
import android.content.pm.PackageManager;
import j$.time.Duration;
import java.util.concurrent.Callable;

public final class hrr
implements Callable {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ hrr(eeb eeb2, dzj dzj2, int n2, eea eea2, int n3) {
        this.e = n3;
        this.d = eeb2;
        this.c = dzj2;
        this.a = n2;
        this.b = eea2;
    }

    public /* synthetic */ hrr(gui gui2, PackageManager packageManager, hav hav2, int n2, int n3) {
        this.e = n3;
        this.b = gui2;
        this.c = packageManager;
        this.d = hav2;
        this.a = n2;
    }

    public final Object call() {
        if (this.e != 0) {
            boolean bl2;
            Object object;
            int n2 = this.a;
            Object object2 = this.d;
            eeb eeb2 = (eeb)object2;
            int n3 = eeb2.e.f - n2;
            Object object3 = eeb2.h;
            int n4 = eeb2.g.e;
            jse.e(object3, "identity");
            Object object4 = eeb2.j;
            ((czh)object4).a.g((String)object3, n3);
            Object object5 = dox.n(ecf.a.l());
            Object object6 = doc.c(ebw.a.l());
            ((cxt)object6).m(ecd.h);
            if (n2 > 0) {
                object = (hwp)((cxt)object6).a;
                if (!((hwp)object).b.B()) {
                    ((hwp)object).u();
                }
                object = (ebw)((hwp)object).b;
                ((ebw)object).b |= 0x10;
                ((ebw)object).g = n2;
            }
            object = this.b;
            Object object7 = this.c;
            object4 = ((czh)object4).d;
            ((cxt)object6).k((String)object3);
            ((cxt)object6).l(n4);
            ((bzo)object5).w(((cxt)object6).j());
            object3 = ((bzo)object5).v();
            ((evo)object4).e((ecf)object3);
            object3 = new eei((dzj)object7);
            object2 = (hpn)dpg.g(dpg.h(object2, eeu.class)).a();
            object4 = eeb2.k;
            object6 = eeb2.b;
            object5 = Duration.ofMillis(0L);
            object5.getClass();
            object4 = (jvb)((bzq)object4).a.b();
            object4.getClass();
            object2 = new eej((hpn)object2, (eae)object6, (eee)object3, (Duration)object5, (jvb)object4);
            if (n3 > 0) {
                ((heg)eeb.a.h().h(hfo.a, "ALT.BytesReceiverBuffer").j("com/google/android/libraries/search/audio/audiobuffer/AudioBytesReceiverAudioBuffer", "registerAudioBytesReceiverInternal", 272, "AudioBytesReceiverAudioBuffer.kt")).G("#audio# registering receiver(%s), disposed(%d), buffer(%s)", crh.K(object7), n3, eeb2.h);
                ((eea)object).a((eee)object2);
                eeb2.h((eee)object);
                bl2 = false;
            } else {
                object7 = new eeh((eee)object2, -n3);
                ((eea)object).a((eee)object7);
                eeb2.h((eee)object);
                bl2 = true;
            }
            return bl2;
        }
        Object object = this.b;
        Object object8 = this.d;
        Object object9 = this.c;
        object = object.a();
        return ((iyx)new hrq((PackageManager)object9, (hav)object8, (cch)object)).a(this.a);
    }
}

