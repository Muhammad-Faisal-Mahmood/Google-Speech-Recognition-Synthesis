/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

public final class dhh
implements hny {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ dhh(Object object, Object object2, Object object3, int n2, int n3) {
        this.e = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
        this.a = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        if (this.e == 0) {
            object = (Void)object;
            object = (dhl)this.b;
            Object object2 = ((dhl)object).l;
            String string = (String)this.c;
            ((dcj)object2).f(string);
            int n2 = this.a;
            ((dhl)object).f(string, (dfh)this.d, n2);
            return hhk.K(null);
        }
        Object object3 = (dbx)object;
        int n3 = this.a;
        Object object4 = this.d;
        object = this.c;
        Object object5 = this.b;
        if (object3 == null) {
            ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "fetchVoiceInternal", 282, "VoiceDataDownloader.java")).r("Megapack Manifest Not Initialized");
            return hhk.J(new bta());
        }
        Set set = ((btj)object5).j;
        synchronized (set) {
            ((btj)object5).j.add(((buc)object).c);
            if (object4 != null) {
                object4.b(((buc)object).c);
            }
            ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "fetchVoiceInternal", 292, "VoiceDataDownloader.java")).u("Download of %s started.", ((buc)object).c);
            fxf.K(((btj)object5).q);
            object4 = new dqc((btj)object5, (buc)object, (dbx)object3, n3, 1);
            object4 = hph.q(hhk.P(gqk.c((hnx)object4), btj.b));
            object3 = new bps(object5, 3);
            object3 = hno.g((hpn)object4, (hny)object3, btj.b);
            object4 = new bte(object5, object, 0);
            return hno.f((hpn)object3, (gte)object4, btj.b);
        }
    }
}

