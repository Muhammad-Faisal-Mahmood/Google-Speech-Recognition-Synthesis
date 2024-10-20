/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothHeadset
 *  android.content.Context
 *  android.media.AudioDeviceInfo
 */
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.media.AudioDeviceInfo;
import androidx.wear.ambient.AmbientMode$AmbientController;
import j$.time.Duration;
import j$.util.Optional;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

public final class ehq
implements esx {
    public static final hei a = hei.m("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute");
    private static final Duration q;
    public final emm b;
    public final jvb c;
    public final eie d;
    public final Optional e;
    public final hwg f;
    public eim g;
    public final AtomicBoolean h;
    public final ReentrantLock i;
    public final ekk j;
    public final jur k;
    public final jur l;
    public final jur m;
    public final jur n;
    public final ehi o;
    public final czh p;
    private final Executor r;
    private final Context s;
    private final hwg t;
    private final hou u;
    private final int v;
    private final AmbientMode$AmbientController w;
    private final AmbientMode$AmbientController x;
    private bmu y;

    static {
        Duration duration = Duration.ofMillis(500L);
        jse.d(duration, "ofMillis(...)");
        q = duration;
    }

    public ehq(emm object, ebd object2, int n2, Executor object3, jvb jvb2, Context context, eie eie2, czh czh2, Optional optional, hwg hwg2, hwg hwg3) {
        this.b = object;
        this.v = n2;
        this.r = object3;
        this.c = jvb2;
        this.s = context;
        this.d = eie2;
        this.p = czh2;
        this.e = optional;
        this.f = hwg2;
        this.t = hwg3;
        this.k = new jur();
        this.l = object = new jur();
        this.m = new jur();
        this.n = new jur();
        this.g = new eim(null);
        this.h = new AtomicBoolean();
        this.u = new hou();
        this.i = new ReentrantLock();
        object = jsd.k((jvi)object);
        object3 = dww.e(eaz.a.l());
        ((dml)object3).e((ebd)object2);
        object3 = ((dml)object3).d();
        object2 = gsl.a;
        this.j = new ekk((hpn)object, (eaz)object3, (gto)object2, (gto)object2);
        this.x = new AmbientMode$AmbientController(this);
        this.w = new AmbientMode$AmbientController(this);
        this.o = new ehi(this);
    }

    @Override
    public final ekk a() {
        return this.j;
    }

    @Override
    public final hpn b() {
        throw null;
    }

    @Override
    public final hpn c(ebg ebg2) {
        jse.e(ebg2, "disconnectReason");
        this.h.set(true);
        return this.d(new bes(this, ebg2, null, 2));
    }

    public final hpn d(jro object) {
        ctz ctz2 = new ctz(this, object, 16, null);
        object = this.r;
        object = this.u.b(ctz2, (Executor)object);
        jse.d(object, "submitAsync(...)");
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object e(jqb var1_1) {
        block11: {
            block12: {
                block9: {
                    block10: {
                        block6: {
                            block7: {
                                block8: {
                                    if (!(var1_1 instanceof ehj)) ** GOTO lbl-1000
                                    var5_2 = (ehj)var1_1;
                                    var2_3 = var5_2.c;
                                    if ((var2_3 & -2147483648) != 0) {
                                        var5_2.c = var2_3 + -2147483648;
                                        var1_1 = var5_2;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var1_1 = new ehj(this, var1_1);
                                    }
                                    var6_4 = var1_1.a;
                                    var7_5 = jqh.a;
                                    var2_3 = var1_1.c;
                                    if (var2_3 == 0) break block6;
                                    if (var2_3 == 1) break block7;
                                    if (var2_3 != 2) break block8;
                                    jns.ak(var6_4);
                                    break block9;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            var5_2 = var1_1.d;
                            jns.ak(var6_4);
                            break block10;
                        }
                        jns.ak(var6_4);
                        if (!this.e.isPresent()) {
                            return false;
                        }
                        var3_6 = idi.c(this.t).toMillis();
                        var5_2 = new aus(this, null, 11, null);
                        var1_1.d = this;
                        var1_1.c = 1;
                        var6_4 = jns.aq(var3_6, (jro)var5_2, var1_1);
                        if (var6_4 == var7_5) break block11;
                        var5_2 = this;
                    }
                    var6_4 = (Boolean)var6_4;
                    if (var6_4 == null) {
                        ((heg)ehq.a.h().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "disconnectIfAapConnected", 284, "BluetoothAudioRoute.kt")).u("#audio# carConnectionChecker timed out for route(%s)", var5_2.b.b);
                        return false;
                    }
                    if (!var6_4.booleanValue()) break block12;
                    ((heg)ehq.a.f().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "disconnectIfAapConnected", 288, "BluetoothAudioRoute.kt")).u("#audio# AAP is connected for route(%s)", var5_2.b.b);
                    var8_7 = ebo.w;
                    var6_4 = ebg.C;
                    var1_1.d = null;
                    var1_1.c = 2;
                    if (var5_2.h(var8_7, (ebg)var6_4, var1_1) == var7_5) break block11;
                }
                return true;
            }
            return false;
        }
        return var7_5;
    }

    /*
     * Unable to fully structure code
     */
    public final Object f(jqb var1_1) {
        block7: {
            block5: {
                block8: {
                    block6: {
                        block2: {
                            block3: {
                                block4: {
                                    if (!(var1_1 instanceof ehk)) ** GOTO lbl-1000
                                    var4_2 = (ehk)var1_1;
                                    var2_3 = var4_2.c;
                                    if ((var2_3 & -2147483648) != 0) {
                                        var4_2.c = var2_3 + -2147483648;
                                        var1_1 = var4_2;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var1_1 = new ehk(this, var1_1);
                                    }
                                    var5_4 = var1_1.a;
                                    var6_5 = jqh.a;
                                    var2_3 = var1_1.c;
                                    var3_6 = true;
                                    if (var2_3 == 0) break block2;
                                    if (var2_3 == 1) break block3;
                                    if (var2_3 != 2) break block4;
                                    jns.ak(var5_4);
                                    break block5;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            var4_2 = var1_1.d;
                            jns.ak(var5_4);
                            break block6;
                        }
                        jns.ak(var5_4);
                        var4_2 = this.d;
                        var4_2 = var4_2.b(new elc((eie)var4_2, null, 1));
                        var1_1.d = this;
                        var1_1.c = 1;
                        var5_4 = jsd.l((hpn)var4_2, var1_1);
                        if (var5_4 == var6_5) break block7;
                        var4_2 = this;
                    }
                    if (((Boolean)var5_4).booleanValue()) break block8;
                    ((heg)ehq.a.h().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "disconnectIfBluetoothUnavailableForUse", 261, "BluetoothAudioRoute.kt")).u("#audio# BT is not available for route(%s)", var4_2.b.b);
                    var5_4 = ebo.l;
                    var7_7 = ebg.o;
                    var1_1.d = null;
                    var1_1.c = 2;
                    if (var4_2.h((ebo)var5_4, var7_7, var1_1) == var6_5) break block7;
                    break block5;
                }
                var3_6 = false;
            }
            return var3_6;
        }
        return var6_5;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object g(jqb var1_1) {
        if (!(var1_1 instanceof ehl)) ** GOTO lbl-1000
        var4_2 /* !! */  = (ehl)var1_1;
        var2_3 = var4_2 /* !! */ .c;
        if ((var2_3 & -2147483648) != 0) {
            var4_2 /* !! */ .c = var2_3 + -2147483648;
            var1_1 = var4_2 /* !! */ ;
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = new ehl(this, var1_1);
        }
        var5_4 = var1_1.a;
        var4_2 /* !! */  = jqh.a;
        var2_3 = var1_1.c;
        var3_5 = true;
        if (var2_3 == 0) ** GOTO lbl18
        if (var2_3 == 1) {
            jns.ak(var5_4);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
            // 1 sources

            jns.ak(var5_4);
            if (!euf.r(this.s)) {
                ((heg)ehq.a.h().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "disconnectIfNoPermission", 247, "BluetoothAudioRoute.kt")).u("#audio# no BT permissions for route(%s)", this.b.b);
                var5_4 = ebo.p;
                var6_6 = ebg.p;
                var1_1.c = 1;
                if (this.h((ebo)var5_4, var6_6, var1_1) == var4_2 /* !! */ ) {
                    return var4_2 /* !! */ ;
                }
            } else {
                var3_5 = false;
            }
        }
        return var3_5;
    }

    /*
     * Unable to fully structure code
     */
    public final Object h(ebo var1_1, ebg var2_3, jqb var3_4) {
        block20: {
            block25: {
                block26: {
                    block27: {
                        block28: {
                            block30: {
                                block29: {
                                    block21: {
                                        block22: {
                                            block23: {
                                                block24: {
                                                    if (!(var3_4 instanceof ehm)) ** GOTO lbl-1000
                                                    var6_6 = (ehm)var3_4;
                                                    var4_7 = var6_6.c;
                                                    if ((var4_7 & -2147483648) != 0) {
                                                        var6_6.c = var4_7 + -2147483648;
                                                    } else lbl-1000:
                                                    // 2 sources

                                                    {
                                                        var6_6 = new ehm(this, (jqb)var3_4);
                                                    }
                                                    var7_8 = var6_6.a;
                                                    var8_9 = jqh.a;
                                                    var4_7 = var6_6.c;
                                                    if (var4_7 == 0) break block21;
                                                    if (var4_7 == 1) break block22;
                                                    if (var4_7 == 2) break block23;
                                                    if (var4_7 != 3) break block24;
                                                    var3_4 = var6_6.g;
                                                    var5_10 = var6_6.f;
                                                    var2_3 = var6_6.e;
                                                    var1_1 = var6_6.d;
                                                    jns.ak(var7_8);
                                                    break block25;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            var1_1 = var6_6.g;
                                            var3_4 = var6_6.f;
                                            var5_10 = var6_6.e;
                                            var2_3 = var6_6.d;
                                            jns.ak(var7_8);
                                            break block26;
                                        }
                                        var1_1 = var6_6.g;
                                        var3_4 = var6_6.f;
                                        var5_10 = var6_6.e;
                                        var2_3 = var6_6.d;
                                        jns.ak(var7_8);
                                        break block27;
                                    }
                                    jns.ak(var7_8);
                                    if (this.l.bH()) break block20;
                                    this.h.set(true);
                                    ((heg)ehq.a.f().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "disconnectInternal", 376, "BluetoothAudioRoute.kt")).C("#audio# disconnect(%s) BT-route(%s)", var2_3.name(), this.b.b);
                                    try {
                                        var3_4 = (eih)this.m.A();
                                    }
                                    catch (Throwable var3_5) {
                                        var3_4 = jns.aj(var3_5);
                                    }
                                    var5_10 = var3_4;
                                    if (var3_4 instanceof jod) {
                                        var5_10 = null;
                                    }
                                    var7_8 = (eih)var5_10;
                                    var5_10 = this.y;
                                    if (var5_10 == null) break block28;
                                    var3_4 = this.w;
                                    var6_6.d = this;
                                    var6_6.e = var1_1;
                                    var6_6.f = var2_3;
                                    var6_6.g = var7_8;
                                    var6_6.c = 1;
                                    var5_10 = var5_10.b;
                                    if (var5_10 == null) break block29;
                                    var3_4 = var5_10 = var5_10.d((AmbientMode$AmbientController)var3_4, (jqb)var6_6);
                                    if (var5_10 == jqh.a) break block30;
                                }
                                var3_4 = jon.a;
                            }
                            if (var3_4 == var8_9) ** GOTO lbl-1000
                        }
                        var3_4 = var2_3;
                        var2_3 = this;
                        var5_10 = var1_1;
                        var1_1 = var7_8;
                    }
                    var7_8 = var2_3.d;
                    var9_11 = var2_3.x;
                    jse.e(var9_11, "listener");
                    var7_8 = var7_8.b(new bes((eie)var7_8, (AmbientMode$AmbientController)var9_11, null, 8, null, null));
                    var6_6.d = var2_3;
                    var6_6.e = var5_10;
                    var6_6.f = var3_4;
                    var6_6.g = var1_1;
                    var6_6.c = 2;
                    if (jsd.l((hpn)var7_8, (jqb)var6_6) == var8_9) ** GOTO lbl-1000
                }
                var7_8 = var2_3.d;
                var9_11 = var2_3.o;
                jse.e(var9_11, "listener");
                var7_8 = var7_8.b(new bes((eie)var7_8, (ehi)var9_11, null, 7, null));
                var6_6.d = var2_3;
                var6_6.e = var5_10;
                var6_6.f = var3_4;
                var6_6.g = var1_1;
                var6_6.c = 3;
                if (jsd.l((hpn)var7_8, (jqb)var6_6) == var8_9) lbl-1000:
                // 3 sources

                {
                    return var8_9;
                }
                var6_6 = var2_3;
                var2_3 = var5_10;
                var5_10 = var3_4;
                var3_4 = var1_1;
                var1_1 = var6_6;
            }
            var1_1.m.O(null);
            var1_1.n.O(null);
            var6_6 = var1_1.l;
            var7_8 = dpg.e(eav.a.l());
            var7_8.k((ebg)var5_10);
            var6_6.O(var7_8.j());
            var5_10 = var1_1.k;
            var6_6 = dww.f(eax.a.l());
            var6_6.g((ebo)var2_3);
            var5_10.O(var6_6.f());
            if (var3_4 != null) {
                block19: {
                    var3_4 = var1_1.i;
                    var3_4.lock();
                    var2_3 = var1_1.g;
                    var2_3 = var2_3.b != false ? var2_3.a : null;
                    if (var2_3 != null) break block19;
                    var3_4.unlock();
                }
                var1_1.g = var5_10 = new eim(null);
                var5_10 = var1_1.y;
                ** if (var5_10 != null && (var3_4 = var5_10.b) != null && var3_4.b((BluetoothHeadset)((BluetoothHeadset)var5_10.c), (egz)var2_3)) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    ((heg)ehq.a.h().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "disconnectInternal", 397, "BluetoothAudioRoute.kt")).u("#audio# route(%s) cannot stop BT-audio", var1_1.b.b);
                }
lbl-1000:
                // 2 sources

                {
                    break block20;
                }
                finally {
                    var3_4.unlock();
                }
            }
        }
        return jon.a;
    }

    /*
     * Unable to fully structure code
     */
    public final Object i(jqb var1_1) {
        block9: {
            block10: {
                block7: {
                    block8: {
                        block4: {
                            block5: {
                                block6: {
                                    if (!(var1_1 instanceof ehn)) ** GOTO lbl-1000
                                    var3_2 = (ehn)var1_1;
                                    var2_3 = var3_2.c;
                                    if ((var2_3 & -2147483648) != 0) {
                                        var3_2.c = var2_3 + -2147483648;
                                        var1_1 = var3_2;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var1_1 = new ehn(this, var1_1);
                                    }
                                    var4_4 = var1_1.a;
                                    var5_5 = jqh.a;
                                    var2_3 = var1_1.c;
                                    if (var2_3 == 0) break block4;
                                    if (var2_3 == 1) break block5;
                                    if (var2_3 != 2) break block6;
                                    jns.ak(var4_4);
                                    break block7;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            var3_2 = var1_1.d;
                            jns.ak(var4_4);
                            break block8;
                        }
                        jns.ak(var4_4);
                        var3_2 = this.d.a();
                        var1_1.d = this;
                        var1_1.c = 1;
                        var4_4 = jsd.l((hpn)var3_2, var1_1);
                        if (var4_4 == var5_5) break block9;
                        var3_2 = this;
                    }
                    var4_4 = (List)var4_4;
                    if (var4_4.isEmpty()) {
                        ((heg)ehq.a.h().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "getDeviceListOrDisconnect", 301, "BluetoothAudioRoute.kt")).u("#audio# route(%s) has no BT-device", var3_2.b.b);
                        var4_4 = ebo.m;
                        var6_6 = ebg.l;
                        var1_1.d = null;
                        var1_1.c = 2;
                        if (var3_2.h((ebo)var4_4, var6_6, var1_1) == var5_5) {
                            return var5_5;
                        } else {
                            ** GOTO lbl42
                        }
                    }
                    break block10;
                }
                return null;
            }
            return var4_4;
        }
        return var5_5;
    }

    /*
     * Unable to fully structure code
     */
    public final Object j(jqb var1_1) {
        block11: {
            block8: {
                block9: {
                    block10: {
                        block4: {
                            block5: {
                                block6: {
                                    block7: {
                                        if (!(var1_1 instanceof eho)) ** GOTO lbl-1000
                                        var3_2 = (eho)var1_1;
                                        var2_3 = var3_2.c;
                                        if ((var2_3 & -2147483648) != 0) {
                                            var3_2.c = var2_3 + -2147483648;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var3_2 = new eho(this, (jqb)var1_1);
                                        }
                                        var4_4 = var3_2.a;
                                        var6_5 = jqh.a;
                                        var2_3 = var3_2.c;
                                        var5_6 = null;
                                        if (var2_3 == 0) break block4;
                                        if (var2_3 == 1) break block5;
                                        if (var2_3 == 2) break block6;
                                        if (var2_3 != 3) break block7;
                                        jns.ak(var4_4);
                                        var1_1 = var5_6;
                                        break block8;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                var1_1 = var3_2.d;
                                jns.ak(var4_4);
                                break block9;
                            }
                            var1_1 = var3_2.d;
                            jns.ak(var4_4);
                            break block10;
                        }
                        jns.ak(var4_4);
                        var1_1 = this.d;
                        var4_4 = this.x;
                        jse.e(var4_4, "listener");
                        var1_1 = var1_1.b(new bes((eie)var1_1, (AmbientMode$AmbientController)var4_4, null, 5, null));
                        var3_2.d = this;
                        var3_2.c = 1;
                        if (jsd.l((hpn)var1_1, var3_2) == var6_5) break block11;
                        var1_1 = this;
                    }
                    var3_2.d = var1_1;
                    var3_2.c = 2;
                    var4_4 = jns.aq(ehq.q.toMillis(), new aus((ehq)var1_1, null, 10, null), var3_2);
                    if (var4_4 == var6_5) break block11;
                }
                var4_4 = (eih)var4_4;
                if (var4_4 != null) ** GOTO lbl56
                ((heg)ehq.a.h().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "getHeadsetProfileOrDisconnect", 317, "BluetoothAudioRoute.kt")).u("#audio# route(%s) found no BT-headset-profile", var1_1.b.b);
                var7_7 = ebo.n;
                var4_4 = ebg.m;
                var3_2.d = null;
                var3_2.c = 3;
                if (var1_1.h(var7_7, (ebg)var4_4, var3_2) != var6_5) {
                    var1_1 = var5_6;
                } else {
                    return var6_5;
lbl56:
                    // 1 sources

                    var1_1 = var4_4;
                }
            }
            return var1_1;
        }
        return var6_5;
    }

    /*
     * Unable to fully structure code
     */
    public final Object k(eih var1_1, List var2_3, jqb var3_4) {
        block27: {
            block37: {
                block32: {
                    block28: {
                        block38: {
                            block33: {
                                block34: {
                                    block36: {
                                        block35: {
                                            block29: {
                                                block30: {
                                                    block31: {
                                                        if (!(var3_4 instanceof ehp)) ** GOTO lbl-1000
                                                        var6_5 = (ehp)var3_4;
                                                        var4_6 = var6_5.d;
                                                        if ((var4_6 & -2147483648) != 0) {
                                                            var6_5.d = var4_6 + -2147483648;
                                                        } else lbl-1000:
                                                        // 2 sources

                                                        {
                                                            var6_5 = new ehp(this, (jqb)var3_4);
                                                        }
                                                        var3_4 = var6_5.b;
                                                        var7_7 = jqh.a;
                                                        var4_6 = var6_5.d;
                                                        if (var4_6 == 0) break block29;
                                                        if (var4_6 == 1) break block30;
                                                        if (var4_6 != 2) break block31;
                                                        var1_1 = (jsj)var6_5.a;
                                                        jns.ak(var3_4);
                                                        break block32;
                                                    }
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                var2_3 = (ehq)var6_5.a;
                                                jns.ak(var3_4);
                                                break block33;
                                            }
                                            jns.ak(var3_4);
                                            var4_6 = this.v;
                                            jse.e(var2_3, "devices");
                                            var5_8 = var2_3 instanceof Collection;
                                            if (!var5_8 || !var2_3.isEmpty()) {
                                                var8_9 = var2_3.iterator();
                                                while (var8_9.hasNext()) {
                                                    var3_4 = ((egz)var8_9.next()).a;
                                                    if (var3_4 == null || !eha.f((AudioDeviceInfo)var3_4)) continue;
                                                    if (var1_1.h) {
                                                        ((heg)eih.a.f().h(hfo.a, "ALT.BtProfileShim").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetProfileShimImpl", "getAudioController", 85, "BluetoothHeadsetProfileShimImpl.kt")).r("#audio# Using VC AudioController with BLE support");
                                                        var3_4 = var1_1.g;
                                                    } else {
                                                        ((heg)eih.a.f().h(hfo.a, "ALT.BtProfileShim").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetProfileShimImpl", "getAudioController", 88, "BluetoothHeadsetProfileShimImpl.kt")).r("#audio# BLE audio is not enabled");
                                                        var3_4 = null;
                                                    }
                                                    break;
                                                }
                                            } else if (var4_6 == 2) {
                                                ((heg)eih.a.f().h(hfo.a, "ALT.BtProfileShim").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetProfileShimImpl", "getAudioController", 92, "BluetoothHeadsetProfileShimImpl.kt")).r("#audio# Using SCO AudioController");
                                                var3_4 = var1_1.e;
                                            } else if (var1_1.c.isVoiceCapable()) {
                                                ((heg)eih.a.f().h(hfo.a, "ALT.BtProfileShim").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetProfileShimImpl", "getAudioController", 95, "BluetoothHeadsetProfileShimImpl.kt")).r("#audio# Using VoiceRecognition AudioController");
                                                var3_4 = var1_1.d;
                                            } else {
                                                ((heg)eih.a.f().h(hfo.a, "ALT.BtProfileShim").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothHeadsetProfileShimImpl", "getAudioController", 98, "BluetoothHeadsetProfileShimImpl.kt")).r("#audio# Using VirtualCall AudioController");
                                                var3_4 = var1_1.f;
                                            }
                                            this.y = new bmu(var1_1.b, (ehe)var3_4, (List)var2_3);
                                            jse.e(var2_3, "<this>");
                                            if (!var5_8 || !var2_3.isEmpty()) {
                                                var1_1 = var2_3.iterator();
                                                while (var1_1.hasNext()) {
                                                    var2_3 = ((egz)var1_1.next()).a;
                                                    if (var2_3 == null || !eha.f((AudioDeviceInfo)var2_3)) continue;
                                                    ((heg)ehq.a.f().h(hfo.a, "ALT.BtAudioRoute").j("com/google/android/libraries/search/audio/bluetooth/impl/BluetoothAudioRoute", "tryConnectDeviceAudio", 333, "BluetoothAudioRoute.kt")).r("#audio# BLE headset is connected");
                                                    var2_3 = this.p;
                                                    var1_1 = this.b.a;
                                                    jse.e(var1_1, "clientInfo");
                                                    var2_3.a.k((eip)var1_1);
                                                    break;
                                                }
                                            }
                                            var2_3 = this.y;
                                            if (var2_3 == null) break block34;
                                            var1_1 = this.w;
                                            var6_5.a = this;
                                            var6_5.d = 1;
                                            var2_3 = var2_3.b;
                                            if (var2_3 == null) break block35;
                                            var1_1 = var2_3 = var2_3.c((AmbientMode$AmbientController)var1_1, var6_5);
                                            if (var2_3 == jqh.a) break block36;
                                        }
                                        var1_1 = jon.a;
                                    }
                                    if (var1_1 == var7_7) break block37;
                                }
                                var2_3 = this;
                            }
                            var2_3.p.t(var2_3.b.b, new egz(null, null), ecb.b);
                            var3_4 = new jsj();
                            var8_9 = var2_3.i;
                            var8_9.lock();
                            var10_10 = var2_3.y;
                            if (var10_10 == null) ** GOTO lbl98
                            var9_11 = var10_10.b;
                            if (var9_11 == null) ** GOTO lbl96
                            var1_1 = var10_10.c;
                            var10_10 = var10_10.a;
                            var1_1 = var9_11.a((BluetoothHeadset)var1_1, (List)var10_10);
                            break block38;
lbl96:
                            // 1 sources

                            var1_1 = new ehd(null, ehc.b);
                            break block38;
lbl98:
                            // 1 sources

                            var1_1 = new ehd(null, ehc.b);
                        }
                        if (var1_1.b != ehc.a) break block27;
                        var3_4.a = var1_1.a;
                        var2_3.g = eim.b(var2_3.g, (egz)var3_4.a, true, false, 4);
                        var1_1 = var3_4.a;
                        if (var1_1 == null) break block28;
                        var2_3.p.t(var2_3.b.b, (egz)var1_1, ecb.c);
                        if (!((egz)var3_4.a).e) break block28;
                        var1_1 = var2_3.p;
                        var9_11 = var2_3.b.a;
                        jse.e(var9_11, "clientInfo");
                        var1_1.a.j((eip)var9_11);
                    }
                    var1_1 = var2_3.d;
                    var2_3 = var2_3.w;
                    var6_5.a = var3_4;
                    var6_5.d = 2;
                    if (var1_1.h((AmbientMode$AmbientController)var2_3, var6_5) == var7_7) break block37;
                    var1_1 = var3_4;
                }
                return new ehd((egz)var1_1.a, ehc.a);
            }
            return var7_7;
        }
        var8_9.unlock();
        return var1_1;
        finally {
            var8_9.unlock();
        }
    }
}

