/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eli
implements ecp {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult");
    public final ecp b;
    public final String c;
    public final List d;
    public final jua e;
    public final jtz f;
    private final jqz g;
    private final hpn h;
    private final jvb i;
    private final jny j;
    private final jny k;
    private final gto l;
    private final gto m;
    private final hpn n;
    private final Object o;
    private final jur p;
    private final jur q;

    public eli(ecp ecp2, jqz object, hpn object2, jvb jvb2) {
        this.b = ecp2;
        this.g = object;
        this.h = object2;
        this.i = jvb2;
        this.c = crh.K(this);
        this.d = new ArrayList();
        this.e = new jua(Integer.MAX_VALUE, jud.a);
        this.f = new jtz(false, jud.a);
        this.p = object = new jur();
        this.q = object2 = new jur();
        jse.ah(jvb2, null, null, new elc(this, null, 0), 3);
        this.j = new jog(new mq(this, 16));
        this.k = new jog(new mq(this, 17));
        this.l = ecp2.d();
        this.m = gto.h(jsd.k((jvi)object2));
        this.n = jsd.k((jvi)object);
        this.o = ecp2.f();
    }

    @Override
    public final gto a() {
        return (gto)this.j.a();
    }

    @Override
    public final gto b() {
        return (gto)this.k.a();
    }

    @Override
    public final gto c() {
        return this.m;
    }

    @Override
    public final gto d() {
        return this.l;
    }

    @Override
    public final hpn e() {
        return this.n;
    }

    @Override
    public final Object f() {
        return this.o;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object g(jqb var1_1) {
        block14: {
            block12: {
                block13: {
                    block11: {
                        if (!(var1_1 instanceof elf)) ** GOTO lbl-1000
                        var3_3 = (elf)var1_1;
                        var2_5 = var3_3.c;
                        if ((var2_5 & -2147483648) != 0) {
                            var3_3.c = var2_5 + -2147483648;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_3 = new elf(this, (jqb)var1_1);
                        }
                        var6_6 = var3_3.a;
                        var4_7 = jqh.a;
                        var2_5 = var3_3.c;
                        if (var2_5 != 0) {
                            if (var2_5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            var1_1 = var3_3.e;
                            var5_8 = var3_3 = var3_3.d;
                            var4_7 = var1_1;
                            try {
                                jns.ak(var6_6);
                                break block11;
                            }
                            catch (Throwable var1_2) {
                                var3_3 = var1_2;
                                break block12;
                            }
                        }
                        jns.ak(var6_6);
                        var1_1 = this.p;
                        try {
                            var5_8 = this.b.e();
                            var3_3.d = this;
                            var3_3.e = var1_1;
                            var3_3.c = 1;
                            var6_6 = jsd.l((hpn)var5_8, (jqb)var3_3);
                            if (var6_6 == var4_7) break block13;
                            var3_3 = this;
                        }
                        catch (Throwable var3_4) {
                            var5_8 = this;
                            var4_7 = var1_1;
                            break block12;
                        }
                    }
                    var5_8 = var3_3;
                    var4_7 = var1_1;
                    {
                        var6_6 = (eaf)var6_6;
                        var4_7 = var1_1;
                        var1_1 = var6_6;
                        break block14;
                    }
                }
                return var4_7;
            }
            var1_1 = jns.aj((Throwable)var3_3);
            var3_3 = var5_8;
        }
        var5_8 = var1_1;
        if (joe.a(var1_1) != null) {
            var5_8 = doc.m((hwr)eaf.a.l()).n();
        }
        if (var4_7.O(var5_8)) {
            ((heg)eli.a.f().h(hfo.a, "ALT.StopAwareStartRslt").j("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult", "awaitAudioStartTime", 161, "StopAwareStartListeningResult.kt")).u("#audio# result(%s) synced audio-start-time", var3_3.c);
        }
        return jon.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object h(jqb var1_1) {
        if (!(var1_1 instanceof elg)) ** GOTO lbl-1000
        var4_3 = (elg)var1_1;
        var2_5 = var4_3.c;
        if ((var2_5 & -2147483648) != 0) {
            var4_3.c = var2_5 + -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            var4_3 = new elg(this, (jqb)var1_1);
        }
        var7_6 = var4_3.a;
        var5_7 = jqh.a;
        var2_5 = var4_3.c;
        if (var2_5 != 0) {
            if (var2_5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            var1_1 = var4_3.e;
            var6_8 = var4_3 = var4_3.d;
            var5_7 = var1_1;
            try {
                jns.ak(var7_6);
                break block13;
            }
            catch (Throwable var1_2) {
                var4_3 = var1_2;
                break block14;
            }
        }
        jns.ak(var7_6);
        if (!this.b.c().g()) {
            var3_9 = this.q.O(dox.j(eag.a.l()).r());
            var4_3 = this;
        } else {
            block16: {
                block14: {
                    block15: {
                        block13: {
                            var1_1 = this.q;
                            try {
                                var6_8 = (hpn)this.b.c().c();
                                var4_3.d = this;
                                var4_3.e = var1_1;
                                var4_3.c = 1;
                                var7_6 = jsd.l((hpn)var6_8, (jqb)var4_3);
                                if (var7_6 == var5_7) break block15;
                                var4_3 = this;
                            }
                            catch (Throwable var4_4) {
                                var6_8 = this;
                                var5_7 = var1_1;
                                break block14;
                            }
                        }
                        var6_8 = var4_3;
                        var5_7 = var1_1;
                        {
                            var7_6 = (eag)var7_6;
                            var5_7 = var1_1;
                            var1_1 = var7_6;
                            break block16;
                        }
                    }
                    return var5_7;
                }
                var1_1 = jns.aj((Throwable)var4_3);
                var4_3 = var6_8;
            }
            var6_8 = var1_1;
            if (joe.a(var1_1) != null) {
                var6_8 = dox.j(eag.a.l()).r();
            }
            var3_9 = var5_7.O(var6_8);
        }
        if (var3_9) {
            ((heg)eli.a.f().h(hfo.a, "ALT.StopAwareStartRslt").j("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult", "awaitFirstByte", 151, "StopAwareStartListeningResult.kt")).u("#audio# result(%s) synced first-byte-read", var4_3.c);
        }
        return jon.a;
    }

    /*
     * Unable to fully structure code
     */
    public final Object i(jqb var1_1) {
        block20: {
            block19: {
                if (!(var1_1 instanceof elh)) ** GOTO lbl-1000
                var3_3 = (elh)var1_1;
                var2_7 = var3_3.c;
                if ((var2_7 & -2147483648) != 0) {
                    var3_3.c = var2_7 + -2147483648;
                    var1_1 = var3_3;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = new elh(this, (jqb)var1_1);
                }
                var3_3 = var1_1.a;
                var4_8 = jqh.a;
                var2_7 = var1_1.c;
                if (var2_7 != 0) {
                    if (var2_7 == 1) {
                        var1_1 = var1_1.d;
                        try {
                            jns.ak(var3_3);
                        }
                        catch (Throwable var3_4) {
                            break block19;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jns.ak(var3_3);
                try {
                    var3_3 = this.h;
                    var1_1.d = this;
                    var1_1.c = 1;
                    var3_3 = jsd.l((hpn)var3_3, (jqb)var1_1);
                    if (var3_3 == var4_8) {
                        return var4_8;
                    }
                    var1_1 = this;
                    break block20;
                }
                catch (Throwable var3_5) {
                    var1_1 = this;
                }
            }
            var3_3 = jns.aj((Throwable)var3_3);
        }
        if (joe.a(var3_3) != null) {
            ((heg)eli.a.h().h(hfo.a, "ALT.StopAwareStartRslt").j("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult", "awaitStopped", 167, "StopAwareStartListeningResult.kt")).u("#audio# result(%s) stop signal failed", var1_1.c);
        }
        if (joe.b(var3_3)) {
            ((heg)eli.a.f().h(hfo.a, "ALT.StopAwareStartRslt").j("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult", "awaitStopped", 168, "StopAwareStartListeningResult.kt")).u("#audio# result(%s) stop signal completed", var1_1.c);
        }
        try {
            var2_7 = ((Number)var1_1.g.a()).intValue();
            var3_3 = new Integer(var2_7);
        }
        catch (Throwable var3_6) {
            var3_3 = jns.aj(var3_6);
        }
        if (joe.a(var3_3) != null) {
            ((heg)eli.a.h().h(hfo.a, "ALT.StopAwareStartRslt").j("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult", "awaitStopped", 170, "StopAwareStartListeningResult.kt")).u("#audio# no result(%s) processed bytes", var1_1.c);
        }
        if (joe.b(var3_3)) {
            var1_1.e.b = var2_7 = ((Number)var3_3).intValue();
            ((heg)eli.a.f().h(hfo.a, "ALT.StopAwareStartRslt").j("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult", "awaitStopped", 173, "StopAwareStartListeningResult.kt")).A("#audio# result(%s) stopped, processed %d bytes", var1_1.c, var2_7);
        }
        var1_1.q.O(dox.j(eag.a.l()).r());
        var1_1.p.O(doc.m((hwr)eaf.a.l()).n());
        var3_3 = var1_1.d;
        synchronized (var3_3) {
            ((heg)eli.a.f().h(hfo.a, "ALT.StopAwareStartRslt").j("com/google/android/libraries/search/audio/core/common/StopAwareStartListeningResult", "completeUnregistrations", 184, "StopAwareStartListeningResult.kt")).A("#audio# result(%s) removing %d receivers", var1_1.c, var1_1.d.size());
            var4_8 = var1_1.d.iterator();
            while (var4_8.hasNext()) {
                ((jqz)var4_8.next()).a();
            }
            var1_1.d.clear();
            var1_1.f.a = 1;
            return jon.a;
        }
    }
}

