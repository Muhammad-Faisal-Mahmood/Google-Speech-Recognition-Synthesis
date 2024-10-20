/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

final class flm
implements hpb {
    final fdl a;
    final String b;
    final List c;
    final flr d;
    final AmbientModeSupport$AmbientController e;

    public flm(flr flr2, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController, fdl fdl2, String string, List list) {
        this.e = ambientModeSupport$AmbientController;
        this.a = fdl2;
        this.b = string;
        this.c = list;
        this.d = flr2;
    }

    @Override
    public final void a(Throwable throwable) {
        a.as(flr.b.g(), "Failed to get settings", "com/google/android/libraries/speech/transcription/voiceime/VoiceInputMethodDataService$1", "onFailure", '\u008d', "VoiceInputMethodDataService.java", throwable);
    }

    @Override
    public final /* synthetic */ void b(Object object) {
        Object object2;
        fdl fdl2 = this.a;
        Object object3 = (fmg)object;
        String string = fdl2.c;
        object = !((fmg)object3).d.isEmpty() ? ((fmg)object3).d : (!(object = this.c).isEmpty() ? ((Locale)object.get(0)).toLanguageTag() : Locale.getDefault().toLanguageTag());
        Object object4 = this.b;
        flr flr2 = this.d;
        Object object5 = flr2.j;
        Object object6 = (flh)((AtomicReference)((gpm)object5).a).get();
        if (object6 != null && !((fli)DesugarAtomicReference.updateAndGet((AtomicReference)((flh)object6).b, object2 = new flg(3))).a()) {
            ((ConcurrentHashMap)((gpm)object5).b).put(string, object6);
            object2 = ((gpm)object5).c;
            object6 = ((flh)object6).a;
            object6 = dxv.x.b("inputViewSessionId", (String)object6);
            ((dyj)object6).r("recognitionSessionId", string);
            gpm gpm2 = hkx.k;
            object5 = hkx.a.l();
            if (!((hwp)object5).b.B()) {
                ((hwp)object5).u();
            }
            hwv hwv2 = ((hwp)object5).b;
            hkx hkx2 = (hkx)hwv2;
            object.getClass();
            hkx2.b |= 8;
            hkx2.f = object;
            if (!hwv2.B()) {
                ((hwp)object5).u();
            }
            hkx2 = (hkx)((hwp)object5).b;
            hkx2.b |= 4;
            hkx2.e = object4;
            ((dyj)object6).u(gpm2, (hkx)((hwp)object5).o());
            object2.a((dyk)object6);
        }
        object2 = new flz((fma)this.e.a, fdl2);
        object6 = fgu.a();
        ((fgt)object6).t((String)object);
        ((fgt)object6).b(gzx.o(((fmg)object3).e));
        ((fgt)object6).u(1);
        ((fgt)object6).K((String)object4);
        ((fgt)object6).B((String)object4);
        ((fgt)object6).o(fgs.d);
        ((fgt)object6).m(true);
        ((fgt)object6).w(true);
        ((fgt)object6).J(5000);
        ((fgt)object6).E(((fmg)object3).c);
        ((fgt)object6).z(true);
        ((fgt)object6).d(fhq.j(((fgt)object6).a(), flr2.f.a));
        object = ((fgt)object6).a();
        object3 = new flo(flr2, string);
        object4 = new flp(flr2, string, (fgr)object2);
        object = flr2.l.k((fgu)object, (ffk)object3, (fgr)object4);
        flr2.d.put(fdl2.c, new hth(fhd.a().a(), object));
        fxf.al(flr2.g.a(), new ena((Object)flr2, (Object)string, 10, null), flr2.c);
        ((ffv)object).b();
    }
}

