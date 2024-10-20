/*
 * Decompiled with CFR 0.152.
 */
public final class enu {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater");
    public final erx b;
    private final jvb c;

    public enu(erx erx2, jvb jvb2) {
        jse.e(jvb2, "lightweightScope");
        this.b = erx2;
        this.c = jvb2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(efq var1_1, jqb var2_3) {
        block8: {
            block7: {
                block9: {
                    if (!(var2_3 instanceof eno)) ** GOTO lbl-1000
                    var4_4 = (eno)var2_3;
                    var3_5 = var4_4.c;
                    if ((var3_5 & -2147483648) != 0) {
                        var4_4.c = var3_5 + -2147483648;
                        var2_3 = var4_4;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var2_3 = new eno(this, (jqb)var2_3);
                    }
                    var4_4 = var2_3.a;
                    var5_6 = jqh.a;
                    var3_5 = var2_3.c;
                    if (var3_5 == 0) break block9;
                    if (var3_5 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    try {
                        jns.ak(var4_4);
                        var1_1 = var4_4;
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var1_2) {
                        break block7;
                    }
                }
                jns.ak(var4_4);
                {
                    var1_1 = var1_1.a();
                    var2_3.c = 1;
                    var1_1 = var2_3 = jsd.l((hpn)var1_1, (jqb)var2_3);
                    if (var2_3 != var5_6) ** GOTO lbl-1000
                    return var5_6;
                }
lbl-1000:
                // 2 sources

                {
                    var1_1 = (gto)var1_1;
                    break block8;
                }
            }
            var1_1 = jns.aj(var1_2);
        }
        if (joe.a(var1_1) == null) {
            return (gto)var1_1;
        }
        ((heg)enu.a.h().h(hfo.a, "ALT.SessionMicUpdater").j("com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater", "audioRecordIdAwait", 215, "AudioSessionToMicStateUpdater.kt")).r("#audio# unable to retrieve audio record ID");
        return gsl.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b(eaj var1_1, gto var2_4, String var3_5, jqb var4_6) {
        block16: {
            block15: {
                block14: {
                    if (!(var4_6 instanceof enq)) ** GOTO lbl-1000
                    var6_7 = (enq)var4_6;
                    var5_8 = var6_7.d;
                    if ((var5_8 & -2147483648) != 0) {
                        var6_7.d = var5_8 + -2147483648;
                        var4_6 = var6_7;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_6 = new enq(this, (jqb)var4_6);
                    }
                    var8_9 = var4_6.b;
                    var6_7 = jqh.a;
                    var5_8 = var4_6.d;
                    if (var5_8 != 0) {
                        if (var5_8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var3_5 = var4_6.f;
                        var2_4 = var4_6.a;
                        var7_10 = var1_1 = var4_6.e;
                        var6_7 = var2_4;
                        var4_6 = var3_5;
                        try {
                            jns.ak(var8_9);
                            break block14;
                        }
                        catch (Throwable var1_2) {
                            var2_4 = var6_7;
                            var3_5 = var4_6;
                            break block15;
                        }
                    }
                    jns.ak(var8_9);
                    try {
                        var1_1 = ((eai)var1_1.d()).a();
                        var4_6.e = this;
                        var4_6.a = var2_4;
                        var4_6.f = var3_5;
                        var4_6.d = 1;
                        var8_9 = jsd.l((hpn)var1_1, (jqb)var4_6);
                        if (var8_9 == var6_7) {
                            return var6_7;
                        }
                        var1_1 = this;
                    }
                    catch (Throwable var1_3) {
                        var7_10 = this;
                        break block15;
                    }
                }
                var7_10 = var1_1;
                var6_7 = var2_4;
                var4_6 = var3_5;
                {
                    var8_9 = (eas)var8_9;
                    var7_10 = var1_1;
                    var1_1 = var8_9;
                    break block16;
                }
            }
            var1_1 = jns.aj((Throwable)var1_1);
        }
        if (joe.a(var1_1) == null) {
            var1_1 = var4_6 = ((eas)var1_1).c;
            if (var4_6 == null) {
                var1_1 = ebq.a;
            }
            jse.d(var1_1, "getAudioSourceClosingStatus(...)");
        } else {
            ((heg)enu.a.h().h(hfo.a, "ALT.SessionMicUpdater").j("com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater", "reportAudioSourceClose", 140, "AudioSessionToMicStateUpdater.kt")).u("#audio# stop status failed, continue update(%s)", var3_5);
            var1_1 = dww.l(ebq.a.l());
            var1_1.t(ebp.a);
            var1_1 = var1_1.s();
        }
        var6_7 = var7_10.b;
        var4_6 = euf.y(erw.a.l());
        var4_6.S(eqz.b);
        var2_4 = (gto)var2_4;
        if (var2_4.g()) {
            var4_6.R(((Number)var2_4.c()).intValue());
        }
        var4_6.V((String)var3_5);
        var4_6.T((ebq)var1_1);
        var6_7.e(var4_6.Q());
        return jon.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(ecu var1_1, gto var2_4, String var3_5, jqb var4_6) {
        block16: {
            block15: {
                block14: {
                    if (!(var4_6 instanceof enr)) ** GOTO lbl-1000
                    var6_7 = (enr)var4_6;
                    var5_8 = var6_7.d;
                    if ((var5_8 & -2147483648) != 0) {
                        var6_7.d = var5_8 + -2147483648;
                        var4_6 = var6_7;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_6 = new enr(this, (jqb)var4_6);
                    }
                    var8_9 = var4_6.b;
                    var6_7 = jqh.a;
                    var5_8 = var4_6.d;
                    if (var5_8 != 0) {
                        if (var5_8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var3_5 = var4_6.f;
                        var2_4 = var4_6.a;
                        var7_10 = var1_1 = var4_6.e;
                        var6_7 = var2_4;
                        var4_6 = var3_5;
                        try {
                            jns.ak(var8_9);
                            break block14;
                        }
                        catch (Throwable var1_2) {
                            var2_4 = var6_7;
                            var3_5 = var4_6;
                            break block15;
                        }
                    }
                    jns.ak(var8_9);
                    try {
                        var1_1 = var1_1.a().a();
                        var4_6.e = this;
                        var4_6.a = var2_4;
                        var4_6.f = var3_5;
                        var4_6.d = 1;
                        var8_9 = jsd.l((hpn)var1_1, (jqb)var4_6);
                        if (var8_9 == var6_7) {
                            return var6_7;
                        }
                        var1_1 = this;
                    }
                    catch (Throwable var1_3) {
                        var7_10 = this;
                        break block15;
                    }
                }
                var7_10 = var1_1;
                var6_7 = var2_4;
                var4_6 = var3_5;
                {
                    var8_9 = (ecy)var8_9;
                    var7_10 = var1_1;
                    var1_1 = var8_9;
                    break block16;
                }
            }
            var1_1 = jns.aj((Throwable)var1_1);
        }
        if (joe.a(var1_1) == null) {
            var1_1 = var4_6 = ((ecy)var1_1).c;
            if (var4_6 == null) {
                var1_1 = ebq.a;
            }
            jse.d(var1_1, "getAudioSourceClosingStatus(...)");
        } else {
            ((heg)enu.a.h().h(hfo.a, "ALT.SessionMicUpdater").j("com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater", "reportAudioSourceClose", 196, "AudioSessionToMicStateUpdater.kt")).u("#audio# hotword stop status failed, continue update(%s)", var3_5);
            var1_1 = dww.l(ebq.a.l());
            var1_1.t(ebp.a);
            var1_1 = var1_1.s();
        }
        var6_7 = var7_10.b;
        var4_6 = euf.y(erw.a.l());
        var4_6.S(eqz.c);
        var2_4 = (gto)var2_4;
        if (var2_4.g()) {
            var4_6.R(((Number)var2_4.c()).intValue());
        }
        var4_6.V((String)var3_5);
        var4_6.T((ebq)var1_1);
        var6_7.e(var4_6.Q());
        return jon.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object d(eaj var1_1, gto var2_4, String var3_5, jqb var4_6) {
        block16: {
            block15: {
                block14: {
                    if (!(var4_6 instanceof ens)) ** GOTO lbl-1000
                    var6_7 = (ens)var4_6;
                    var5_8 = var6_7.d;
                    if ((var5_8 & -2147483648) != 0) {
                        var6_7.d = var5_8 + -2147483648;
                        var4_6 = var6_7;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_6 = new ens(this, (jqb)var4_6);
                    }
                    var8_9 = var4_6.b;
                    var6_7 = jqh.a;
                    var5_8 = var4_6.d;
                    if (var5_8 != 0) {
                        if (var5_8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var3_5 = var4_6.f;
                        var2_4 = var4_6.a;
                        var7_10 = var1_1 = var4_6.e;
                        var6_7 = var2_4;
                        var4_6 = var3_5;
                        try {
                            jns.ak(var8_9);
                            break block14;
                        }
                        catch (Throwable var1_2) {
                            var2_4 = var6_7;
                            var3_5 = var4_6;
                            break block15;
                        }
                    }
                    jns.ak(var8_9);
                    try {
                        var1_1 = var1_1.c();
                        jse.d(var1_1, "getStartListeningResult(...)");
                        var4_6.e = this;
                        var4_6.a = var2_4;
                        var4_6.f = var3_5;
                        var4_6.d = 1;
                        var8_9 = jsd.l((hpn)var1_1, (jqb)var4_6);
                        if (var8_9 == var6_7) {
                            return var6_7;
                        }
                        var1_1 = this;
                    }
                    catch (Throwable var1_3) {
                        var7_10 = this;
                        break block15;
                    }
                }
                var7_10 = var1_1;
                var6_7 = var2_4;
                var4_6 = var3_5;
                {
                    var8_9 = (eah)var8_9;
                    var7_10 = var1_1;
                    var1_1 = var8_9;
                    break block16;
                }
            }
            var1_1 = jns.aj((Throwable)var1_1);
        }
        if (joe.a(var1_1) == null) {
            var1_1 = var4_6 = ((ear)((eah)var1_1).f()).c;
            if (var4_6 == null) {
                var1_1 = ebt.a;
            }
            jse.d(var1_1, "getAudioSourceOpeningStatus(...)");
        } else {
            ((heg)enu.a.h().h(hfo.a, "ALT.SessionMicUpdater").j("com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater", "reportAudioSourceOpen", 114, "AudioSessionToMicStateUpdater.kt")).u("#audio# start status failed, continue update(%s)", var3_5);
            var1_1 = dww.k(ebt.a.l());
            var1_1.q(ebs.a);
            var1_1 = var1_1.p();
        }
        var6_7 = var7_10.b;
        var4_6 = euf.y(erw.a.l());
        var4_6.S(eqz.b);
        var2_4 = (gto)var2_4;
        if (var2_4.g()) {
            var4_6.R(((Number)var2_4.c()).intValue());
        }
        var4_6.V((String)var3_5);
        var4_6.U((ebt)var1_1);
        var6_7.e(var4_6.Q());
        return true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object e(ecu var1_1, gto var2_4, String var3_5, jqb var4_6) {
        block16: {
            block15: {
                block14: {
                    if (!(var4_6 instanceof ent)) ** GOTO lbl-1000
                    var6_7 = (ent)var4_6;
                    var5_8 = var6_7.d;
                    if ((var5_8 & -2147483648) != 0) {
                        var6_7.d = var5_8 + -2147483648;
                        var4_6 = var6_7;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var4_6 = new ent(this, (jqb)var4_6);
                    }
                    var8_9 = var4_6.b;
                    var6_7 = jqh.a;
                    var5_8 = var4_6.d;
                    if (var5_8 != 0) {
                        if (var5_8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var3_5 = var4_6.f;
                        var2_4 = var4_6.a;
                        var7_10 = var1_1 = var4_6.e;
                        var6_7 = var2_4;
                        var4_6 = var3_5;
                        try {
                            jns.ak(var8_9);
                            break block14;
                        }
                        catch (Throwable var1_2) {
                            var2_4 = var6_7;
                            var3_5 = var4_6;
                            break block15;
                        }
                    }
                    jns.ak(var8_9);
                    try {
                        var1_1 = var1_1.c();
                        var4_6.e = this;
                        var4_6.a = var2_4;
                        var4_6.f = var3_5;
                        var4_6.d = 1;
                        var8_9 = jsd.l((hpn)var1_1, (jqb)var4_6);
                        if (var8_9 == var6_7) {
                            return var6_7;
                        }
                        var1_1 = this;
                    }
                    catch (Throwable var1_3) {
                        var7_10 = this;
                        break block15;
                    }
                }
                var7_10 = var1_1;
                var6_7 = var2_4;
                var4_6 = var3_5;
                {
                    var8_9 = (ecs)var8_9;
                    var7_10 = var1_1;
                    var1_1 = var8_9;
                    break block16;
                }
            }
            var1_1 = jns.aj((Throwable)var1_1);
        }
        if (joe.a(var1_1) == null) {
            var1_1 = var4_6 = ((ecx)((ecs)var1_1).f()).c;
            if (var4_6 == null) {
                var1_1 = ebt.a;
            }
            jse.d(var1_1, "getAudioSourceOpeningStatus(...)");
        } else {
            ((heg)enu.a.h().h(hfo.a, "ALT.SessionMicUpdater").j("com/google/android/libraries/search/audio/microphone/AudioSessionToMicStateUpdater", "reportAudioSourceOpen", 168, "AudioSessionToMicStateUpdater.kt")).u("#audio# hotword start status failed, continue update(%s)", var3_5);
            var1_1 = dww.k(ebt.a.l());
            var1_1.q(ebs.a);
            var1_1 = var1_1.p();
        }
        var6_7 = var7_10.b;
        var4_6 = euf.y(erw.a.l());
        var4_6.S(eqz.c);
        var2_4 = (gto)var2_4;
        if (var2_4.g()) {
            var4_6.R(((Number)var2_4.c()).intValue());
        }
        var4_6.V((String)var3_5);
        var4_6.U((ebt)var1_1);
        var6_7.e(var4_6.Q());
        return true;
    }

    public final String f(int n2) {
        CharSequence charSequence;
        if (n2 == -1) {
            long l2 = this.b.a();
            charSequence = new StringBuilder("arc_inactive:");
            ((StringBuilder)charSequence).append(l2);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = a.af(n2, "arc_active:");
        }
        return charSequence;
    }

    public final String g(int n2) {
        CharSequence charSequence;
        if (n2 == -1) {
            long l2 = this.b.a();
            charSequence = new StringBuilder("hwc_inactive:");
            ((StringBuilder)charSequence).append(l2);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = a.af(n2, "hwc_active:");
        }
        return charSequence;
    }

    public final void h(eaj object, int n2, efq efq2) {
        jse.e(object, "session");
        jse.e(efq2, "sourceMetadata");
        object = new enp(this, n2, efq2, (eaj)object, null, 1);
        jse.ah(this.c, null, null, (jro)object, 3);
    }

    public final void i(ecu object, int n2, efq efq2) {
        jse.e(object, "session");
        jse.e(efq2, "sourceMetadata");
        object = new enp(this, n2, efq2, (ecu)object, null, 0);
        jse.ah(this.c, null, null, (jro)object, 3);
    }
}

