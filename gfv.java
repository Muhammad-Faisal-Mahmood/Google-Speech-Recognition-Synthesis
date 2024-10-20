/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class gfv {
    public final int a;
    public final hpq b;
    public final Set c;
    public final String d;
    public final cqm e;
    public final jro f;
    public final jnu g;
    public final Executor h;
    public final gui i;
    public final jnu j;
    public final hnx k;
    public final jqz l;
    public final boolean m;
    public final gbq n;
    public final String o;
    public final jny p;
    public final frr q;
    public final bzo r;

    public gfv(int n2, gto object, hpq hpq2, cgw cgw2, Set set, jnu jnu2, jnu jnu3, cya cya2, dua dua2, jnu jnu4, bzo bzo2, String string, cqm cqm2, jro jro2, jnu jnu5, Executor executor, gui gui2, frr frr2, jnu jnu6, hnx hnx2, jqz jqz2) {
        jse.e(object, "shouldThrowOnDirectBoot");
        jse.e(hpq2, "blockingExecutor");
        jse.e(cgw2, "clock");
        jse.e(set, "disableCommitOnBroadcastPackages");
        jse.e(jnu2, "synchronousFileStorage");
        jse.e(jnu3, "applicationInfoProvider");
        jse.e(cya2, "storageInfoProvider");
        jse.e(dua2, "phenotypeContext");
        jse.e(jnu4, "processReaper");
        jse.e(bzo2, "observedPackages");
        jse.e(string, "subpackaged");
        jse.e(executor, "snapshotExecutor");
        jse.e(gui2, "fallbackExperimentCache");
        this.a = n2;
        this.b = hpq2;
        this.c = set;
        this.r = bzo2;
        this.d = string;
        this.e = cqm2;
        this.f = jro2;
        this.g = jnu5;
        this.h = executor;
        this.i = gui2;
        this.q = frr2;
        this.j = jnu6;
        this.k = hnx2;
        this.l = jqz2;
        this.m = (Boolean)((gto)object).e(true);
        this.n = new gbq(new frn(this, 13), new cdv(cqm2, 4));
        object = dtx.b(string);
        jse.d(object, "getStaticConfigPackage(...)");
        this.o = object;
        this.p = new jog(new gfu(this, 1));
    }

    public final hac a(geq object) {
        Object object2;
        Serializable serializable = new LinkedHashMap<Object, Object>();
        Object object3 = this.g.b();
        jse.d(object3, "get(...)");
        object3 = (gey)object3;
        for (Object object4 : ((geq)object).f) {
            object = ((gey)object3).a(((ges)object4).e);
            if (object == null) continue;
            int n2 = ((ges)object4).c;
            if (ger.a(n2) == ((gex)object).a) {
                object2 = ((ges)object4).e;
                jse.b(object4);
                n2 = ger.a(((ges)object4).c).ordinal();
                boolean bl2 = false;
                switch (n2) {
                    default: {
                        throw new joa();
                    }
                    case 6: {
                        throw new IllegalStateException("No known flag type");
                    }
                    case 5: {
                        object4 = new bfb(object, object4, 7);
                        object = ((gex)object).b;
                        jse.b(object);
                        object = fvc.C((jqz)object4, (hyf)object);
                        break;
                    }
                    case 4: {
                        object = new gex(new gfu(object4, 0), ger.e);
                        break;
                    }
                    case 3: {
                        object = ((ges)object4).c == 4 ? (String)((ges)object4).d : "";
                        jse.d(object, "getStringValue(...)");
                        object = fvc.D((String)object);
                        break;
                    }
                    case 2: {
                        double d2 = ((ges)object4).c == 3 ? (Double)((ges)object4).d : 0.0;
                        object = fvc.A(d2);
                        break;
                    }
                    case 1: {
                        if (((ges)object4).c == 2) {
                            bl2 = (Boolean)((ges)object4).d;
                        }
                        object = fvc.z(bl2);
                        break;
                    }
                    case 0: {
                        long l2 = ((ges)object4).c == 1 ? (Long)((ges)object4).d : 0L;
                        object = fvc.B(l2);
                    }
                }
                serializable.put(object2, object);
                continue;
            }
            object3 = ger.a(n2);
            serializable = new StringBuilder("Attempting to set a ");
            ((StringBuilder)serializable).append(object);
            ((StringBuilder)serializable).append(" type flag with a ");
            ((StringBuilder)serializable).append(object3);
            ((StringBuilder)serializable).append(" value");
            throw new IllegalStateException(((StringBuilder)serializable).toString());
        }
        hdx hdx2 = ((gey)object3).b().k();
        jse.d(hdx2, "iterator(...)");
        while (hdx2.hasNext()) {
            object = (String)hdx2.next();
            if (serializable.containsKey(object)) continue;
            object2 = ((gey)object3).a((String)object);
            jse.b(object2);
            serializable.put(object, object2);
        }
        return fvd.U(serializable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        boolean bl2;
        boolean bl3 = bl2 = false;
        try {
            if (!this.n.e()) return bl3;
            boolean bl4 = ((gfo)hhk.S(this.n.c())).d();
            bl3 = bl2;
            if (!bl4) return bl3;
            return true;
        }
        catch (ExecutionException executionException) {
            return bl2;
        }
    }
}

