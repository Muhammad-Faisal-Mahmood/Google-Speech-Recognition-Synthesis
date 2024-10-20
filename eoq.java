/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public final class eoq
implements eot {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/microphone/impl/audiosourcedataaccessor/AudioSourceDataAccessorImpl");
    public final eip b;
    public final efo c;
    public final egw d;
    public final eae e;
    public final gto f;
    public joe g;
    public final String h;
    public dzl i;
    public final jur j;
    public final jur k;
    public final bzb l;
    private final jvb m;
    private final jny n;
    private final jny o;
    private final gto p;
    private final gto q;
    private final hpn r;
    private final efq s;
    private final dtu t;

    public eoq(eip object, efo efo2, egw object2, eae eae2, gto gto2, bzb bzb2, jvb jvb2, dml dml2, dml dml3) {
        this.b = object;
        this.c = efo2;
        this.d = object2;
        this.e = eae2;
        this.f = gto2;
        this.l = bzb2;
        this.m = jvb2;
        this.t = cqq.av(jvb2);
        this.j = new jur();
        this.k = object = new jur();
        this.h = crh.K(efo2);
        this.n = object2 = new jog(new eop(this, 0));
        this.o = new jog(new al((Object)this, (Object)dml3, (Object)dml2, 5, null));
        this.p = this.m(eez.class);
        this.q = this.m(eeu.class);
        this.r = jsd.k((jvi)object);
        object = (gto)object2.a();
        object = efo2.b();
        jse.d(object, "getAudioSourceMetadata(...)");
        this.s = object;
    }

    private final gto m(Class serializable) {
        block3: {
            Iterator iterator = this.d;
            Object object = jns.f(((egw)((Object)iterator)).d, ((egw)((Object)iterator)).c);
            jse.e(object, "<this>");
            iterator = new ArrayList(jns.B((Iterable)object));
            object = object.iterator();
            while (object.hasNext()) {
                iterator.add((gto)dpg.h(((gto)object.next()).f(), serializable));
            }
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                serializable = iterator.next();
                if (!((gto)serializable).g()) continue;
                break block3;
            }
            serializable = null;
        }
        serializable = (gto)serializable;
        if (serializable == null) {
            return gsl.a;
        }
        return serializable;
    }

    @Override
    public final int a() {
        block4: {
            int n2;
            block3: {
                Object object;
                block2: {
                    this.l(ebs.b);
                    object = this.d;
                    edv edv2 = (edv)((egw)object).d.f();
                    if (edv2 == null) break block2;
                    n2 = edv2.b();
                    break block3;
                }
                object = (eeb)((egw)object).c.f();
                if (object == null) break block4;
                n2 = ((eeb)object).b();
            }
            return n2;
        }
        throw new IllegalStateException("Source was expected to be opened by this time");
    }

    @Override
    public final eae b() {
        return this.e;
    }

    public final eah c(ebu ebu2, eom object) {
        Object object2 = this.d;
        Object object3 = (edv)((egw)object2).d.f();
        object3 = object3 != null ? dpg.l((edx)object3, object.a()) : null;
        gto gto2 = ((egw)object2).c;
        object2 = gto.h(object3);
        gto2 = dpg.k((eeb)gto2.f(), object.a());
        gto gto3 = gto.h(this.i);
        object3 = ebu2 == ebu.d ? dww.j(this.p).b(new eex(wl.u, 8)) : this.p.b(new eex(ero.a, 9));
        hpn hpn2 = (hpn)dpg.f(this.q, object.a(), this.e).a();
        jse.e(ebu2, "success");
        object = dww.k(ebt.a.l());
        ((bzb)object).r(ebu2);
        return ekr.c((gto)object2, gto2, gto3, ((bzb)object).p(), (gto)object3, hpn2);
    }

    @Override
    public final efq d() {
        return this.s;
    }

    @Override
    public final /* synthetic */ eln e() {
        return null;
    }

    public final enh f() {
        return (enh)this.o.a();
    }

    @Override
    public final /* synthetic */ eot g() {
        return this;
    }

    @Override
    public final hpn h(ebv object) {
        jse.e(object, "stopListeningReason");
        object = new eof(this, (ebv)object, null, 3);
        return this.t.j((jro)object);
    }

    @Override
    public final hpn i(ebu object, eom eom2) {
        jse.e(object, "success");
        object = new eoo(this, eom2, (ebu)object, null, 0);
        return this.t.j((jro)object);
    }

    @Override
    public final hpn j() {
        return this.r;
    }

    @Override
    public final hpn k(eom object) {
        object = new eof(this, (eom)object, null, 4);
        return this.t.j((jro)object);
    }

    public final void l(ebs ebs2) {
        Object object;
        try {
            object = (ebt)this.j.A();
        }
        catch (Throwable throwable) {
            object = jns.aj(throwable);
        }
        Object object2 = object;
        if (object instanceof jod) {
            object2 = null;
        }
        if ((object = (ebt)object2) != null && ((ebt)object).b == 1) {
            return;
        }
        throw new elx(ekr.g(ebs2));
    }
}

