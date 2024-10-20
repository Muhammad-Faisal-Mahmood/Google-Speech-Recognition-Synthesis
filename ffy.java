/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Map$_EL;
import j$.util.Optional;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class ffy
implements ffz,
fga {
    private static final hei c = hei.m("com/google/android/libraries/speech/transcription/recognition/RecognitionServiceAppFlowLogger");
    private static final guf d = guf.b(' ').a().d();
    public final HashMap a;
    public final HashMap b;
    private final dxi e;
    private final HashMap f = new HashMap();
    private final HashSet g = new HashSet();
    private final HashSet h = new HashSet();
    private final HashSet i = new HashSet();
    private final HashMap j = new HashMap();

    public ffy(dxi dxi2) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.e = dxi2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void q(String string, String string2) {
        int n2;
        long l2;
        block6: {
            l2 = (Long)Map$_EL.getOrDefault(this.a, string, 0L);
            String string3 = (String)Map$_EL.getOrDefault(this.j, string, "");
            Object object = d;
            List list = ((guf)object).g(string2);
            object = ((guf)object).g(string3);
            int n3 = 0;
            for (n2 = 0; n2 < list.size(); ++n2) {
                if (n2 >= object.size()) {
                    n2 = n3;
                    break block6;
                } else {
                    if (!((String)list.get(n2)).equals(object.get(n2)) && n2 != object.size() - 1) {
                        n3 = object.size();
                    } else {
                        if (n2 != object.size() - 1 || ((String)list.get(n2)).startsWith((String)object.get(n2))) continue;
                        n3 = object.size();
                    }
                    n2 = n3 - n2;
                }
                break block6;
            }
            n2 = n3;
            if (list.size() < object.size()) {
                n2 = object.size() - list.size();
            }
        }
        ((heg)((heg)c.c().h(hfo.a, "RecSrvAppFlowLogger")).j("com/google/android/libraries/speech/transcription/recognition/RecognitionServiceAppFlowLogger", "accumulateWordInstabilityCount", 252, "RecognitionServiceAppFlowLogger.java")).B("current: %s, unstableWords: %d", string2, l2 += (long)n2);
        this.a.put(string, l2);
        this.j.put(string, string2);
    }

    private final void r(String string) {
        if (this.h.contains(string)) {
            ((heg)((heg)c.f().h(hfo.a, "RecSrvAppFlowLogger")).j("com/google/android/libraries/speech/transcription/recognition/RecognitionServiceAppFlowLogger", "logFirstTranscription", 259, "RecognitionServiceAppFlowLogger.java")).r("ignore not first transcription");
            return;
        }
        this.h.add(string);
        this.a(string, dxv.aQ.b("recognition_session", string));
    }

    private final void s(String string, Optional optional) {
        optional.ifPresentOrElse(new fas(this, string, 7, null), new ffe((Object)this, (Object)string, 4, null));
        this.f.remove(string);
        this.g.remove(string);
        this.h.remove(string);
        this.a.remove(string);
        this.b.remove(string);
        this.i.remove(string);
    }

    public final void a(String string, dyk dyk2) {
        if (this.i.contains(string)) {
            ((heg)((heg)c.e().h(hfo.a, "RecSrvAppFlowLogger")).j("com/google/android/libraries/speech/transcription/recognition/RecognitionServiceAppFlowLogger", "maybeLogAppFlowEvent", 358, "RecognitionServiceAppFlowLogger.java")).r("Ignore appflow event in incognito mode");
            return;
        }
        this.e.a(dyk2);
    }

    @Override
    public final void b() {
    }

    @Override
    public final void c(String string) {
        this.s(string, Optional.empty());
    }

    @Override
    public final void d(String string) {
        if (!this.m(string)) {
            this.a(string, dxv.k.b("recognition_session", string));
        }
    }

    @Override
    public final void e(String string, fef object) {
        dyj dyj2 = dxv.t.b("recognition_session", string);
        object = ((fef)object).a;
        dyj2.q(((fdr)object).a, ((fdr)object).b());
        this.a(string, dyj2);
    }

    @Override
    public final void f(String string, fex object) {
        if (!this.m(string)) {
            return;
        }
        this.r(string);
        object = !((fex)object).c.isEmpty() ? (String)((fex)object).c.get(0) : "";
        this.q(string, (String)object);
        long l2 = (Long)Map$_EL.getOrDefault(this.b, string, 0L);
        long l3 = d.g((CharSequence)object).size();
        this.b.put(string, l2 + l3);
        this.j.remove(string);
    }

    @Override
    public final void g(String string) {
        this.a(string, dxv.m.b("recognition_session", string));
    }

    @Override
    public final void h(String string) {
        this.a(string, dxv.r.b("recognition_session", string));
    }

    @Override
    public final void i(String string) {
        this.a(string, dxv.l.b("recognition_session", string));
    }

    @Override
    public final void j(String string, fgd fgd2) {
        if (!this.m(string)) {
            return;
        }
        this.r(string);
        this.q(string, fgd2.c.concat(" ").concat(fgd2.d));
    }

    @Override
    public final void k(String string, fgc fgc2) {
        if (fgc2.d) {
            this.i.add(string);
        }
        this.f.put(string, fgc2.e);
        Object object = this.m(string) ? dxv.aO : dxv.h;
        dyj dyj2 = ((dyo)object).b("recognition_session", string);
        object = hkx.k;
        hwp hwp2 = hkx.a.l();
        Object object2 = fgc2.a;
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        hwv hwv2 = hwp2.b;
        hkx hkx2 = (hkx)hwv2;
        object2.getClass();
        hkx2.b |= 4;
        hkx2.e = object2;
        object2 = fgc2.b;
        if (!hwv2.B()) {
            hwp2.u();
        }
        hwv2 = hwp2.b;
        hkx2 = (hkx)hwv2;
        object2.getClass();
        hkx2.b |= 8;
        hkx2.f = object2;
        int n2 = fgc2.g;
        if (!hwv2.B()) {
            hwp2.u();
        }
        object2 = hwp2.b;
        hwv2 = (hkx)object2;
        if (n2 != 0) {
            ((hkx)hwv2).h = n2 - 1;
            ((hkx)hwv2).b |= 0x20;
            boolean bl2 = fgc2.c;
            if (!((hwv)object2).B()) {
                hwp2.u();
            }
            object2 = (hkx)hwp2.b;
            ((hkx)object2).b |= 0x10;
            ((hkx)object2).g = bl2;
            dyj2.u((gpm)object, (hkx)hwp2.o());
            this.a(string, dyj2);
            if (!this.m(string)) {
                if (fgc2.f) {
                    this.a(string, dxv.n.b("recognition_session", string));
                }
                if (fgc2.c) {
                    this.a(string, dxv.o.b("recognition_session", string));
                }
            }
            return;
        }
        throw null;
    }

    @Override
    public final void l(String string) {
        if (this.m(string)) {
            if (this.g.add(string)) {
                this.a(string, dxv.aP.b("recognition_session", string));
                return;
            }
            ((heg)((heg)c.f().h(hfo.a, "RecSrvAppFlowLogger")).j("com/google/android/libraries/speech/transcription/recognition/RecognitionServiceAppFlowLogger", "onStartSpeech", 279, "RecognitionServiceAppFlowLogger.java")).r("ignore not first start of speech");
            return;
        }
        this.a(string, dxv.j.b("recognition_session", string));
    }

    public final boolean m(String string) {
        return this.f.containsKey(string) && this.f.get(string) == fgs.e;
    }

    @Override
    public final void n(String string, fef fef2) {
        this.s(string, Optional.of(fef2));
    }

    @Override
    public final void o() {
    }

    @Override
    public final void p() {
    }
}

