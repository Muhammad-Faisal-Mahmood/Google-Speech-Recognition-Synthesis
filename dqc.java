/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  hom
 */
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public final class dqc
implements hnx {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    private final int e;

    public /* synthetic */ dqc(btj btj2, buc buc2, dbx dbx2, int n2, int n3) {
        this.e = n3;
        this.b = btj2;
        this.c = buc2;
        this.d = dbx2;
        this.a = n2;
    }

    public /* synthetic */ dqc(dqf dqf2, int n2, String string, String string2, int n3) {
        this.e = n3;
        this.b = dqf2;
        this.a = n2;
        this.c = string;
        this.d = string2;
    }

    public /* synthetic */ dqc(frf frf2, hyf hyf2, int n2, List list, int n3) {
        this.e = n3;
        this.b = frf2;
        this.c = hyf2;
        this.a = n2;
        this.d = list;
    }

    @Override
    public final hpn a() {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                hpn hpn2 = hhk.K(this.c);
                for (n2 = 0; n2 < this.a; ++n2) {
                    hpn hpn3 = hpn2;
                    if (((Boolean)hhk.S((Future)this.d.get(n2))).booleanValue()) {
                        hpn3 = hno.g(hpn2, gqk.d(new ezz((frd)((frf)this.b).a.get(n2), 19)), (Executor)hom.a);
                    }
                    hpn2 = hpn3;
                }
                return hpn2;
            }
            buc buc2 = (buc)this.c;
            String string = buc2.c;
            Object object = (btj)this.b;
            ((btj)object).q.g(string, ((btj)object).m);
            ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "getVoicepackManifest", 724, "VoiceDataDownloader.java")).u("Registered slicing strategy for %s", string);
            dbw dbw2 = dbx.f();
            dbw2.d(string);
            dbw2.e(buc2.e);
            Iterator iterator = buc2.g.iterator();
            Object object2 = this.d;
            n2 = this.a;
            while (iterator.hasNext()) {
                bub bub2 = (bub)iterator.next();
                String string2 = bub2.f;
                Enum enum_ = bua.b(bub2.d);
                object = enum_;
                if (enum_ == null) {
                    object = bua.a;
                }
                btz btz2 = btz.b(bub2.e);
                enum_ = btz2;
                if (btz2 == null) {
                    enum_ = btz.b;
                }
                object = btj.e(buc2, string2, (bua)object, (btz)enum_);
                ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "getVoicepackManifest", 735, "VoiceDataDownloader.java")).u("Getting pack name %s", object);
                if (((String)object).isEmpty()) continue;
                try {
                    object = ((dbx)object2).g((String)object).f();
                    ((dem)object).l(string);
                    ((dem)object).h(n2);
                    object = ((dem)object).a();
                    dbw2.b((den)object);
                    ((heg)((heg)btj.a.f()).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "getVoicepackManifest", 749, "VoiceDataDownloader.java")).u("Adding pack %s to superpack.", ((def)object).c);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    ((heg)((heg)((heg)btj.a.g()).i(illegalArgumentException)).j("com/google/android/apps/speech/tts/googletts/local/voicepack/VoiceDataDownloader", "getVoicepackManifest", 751, "VoiceDataDownloader.java")).u("Failed to get manifest for voice %s", bub2.f);
                }
            }
            return hhk.K(dbw2.a());
        }
        dqf dqf2 = (dqf)this.b;
        Object object = (dpt)dqf2.b.b();
        Object object3 = this.c;
        n2 = this.a;
        long l2 = dqf.c(n2) ? (!((dpt)object).b() ? -1L : 1000L) : dqf2.c.a((String)object3);
        if (l2 == -1L) {
            object3 = hpj.a;
        } else {
            Object object4 = this.d;
            object = ((dpt)object).a;
            object = hmv.f(hph.q(hhk.K(null)), RuntimeException.class, new cxc(18), dqf2.a);
            object4 = (String)object4;
            object3 = hno.g((hpn)object, new dqe(dqf2, (String)object3, l2, n2, (String)object4), dqf2.a);
        }
        return object3;
    }
}

