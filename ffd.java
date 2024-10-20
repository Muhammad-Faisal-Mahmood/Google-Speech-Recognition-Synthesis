/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.database.sqlite.SQLiteDatabase
 *  android.os.PowerManager$WakeLock
 *  gqv
 */
import android.content.ComponentCallbacks;
import android.database.sqlite.SQLiteDatabase;
import android.os.PowerManager;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import androidx.wear.ambient.SharedLibraryVersion;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

public final class ffd
implements Runnable {
    public final Object a;
    private final int b;

    public ffd(fuk fuk2, int n2) {
        this.b = n2;
        this.a = fuk2;
    }

    public /* synthetic */ ffd(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        var1_1 = this.b;
        var2_2 = true;
        switch (var1_1) {
            default: {
                gjh.g((hpn)this.a);
                return;
            }
            case 19: {
                var2_2 = fxf.aw(gqv.a);
                var4_3 = this.a;
                if (var2_2) {
                    ((ghe)var4_3).a(false);
                    return;
                }
                var3_13 = ((gpm)((ghe)var4_3).e.b()).d("StartupAfterPackageReplacedUnlock");
                try {
                    ((ghe)var4_3).a(false);
                }
                catch (Throwable var5_24) {
                    try {
                        throw var5_24;
                    }
                    catch (Throwable var4_4) {
                        jsd.f(var3_13, var5_24);
                        throw var4_4;
                    }
                }
                jsd.f(var3_13, null);
                return;
            }
            case 18: {
                ((ggv)this.a).a = false;
                return;
            }
            case 17: {
                var3_14 = ((ggv)this.a).d.values().iterator();
                block35: while (true) {
                    if (!var3_14.hasNext()) {
                        return;
                    }
                    var4_5 = (gpm)var3_14.next();
                    if (!var4_5.s()) continue;
                    fpk.c();
                    var4_5 = var4_5.b.values().iterator();
                    while (true) {
                        if (var4_5.hasNext()) ** break;
                        continue block35;
                        var5_25 = (gfv)var4_5.next();
                        if (!var5_25.b()) continue;
                        try {
                            var6_28 = (gfo)hhk.S(var5_25.n.c());
                            var6_28.c();
                            var6_28 = var6_28.b();
                            var5_25 = var5_25.j.b();
                            var7_31 = var6_28.a;
                            var6_28 = var6_28.c;
                        }
                        catch (ExecutionException var3_15) {
                            throw new RuntimeException(var3_15.getCause());
                        }
                        fvc.v(((gpm)var5_25).o(var7_31, (dup)var6_28), "Failed to commit to config");
                    }
                    break;
                }
            }
            case 16: {
                var6_29 = (AmbientModeSupport$AmbientController)this.a;
                var4_6 = ((gem)var6_29.a).c.getAndSet(null);
                var7_32 = (gem)var6_29.a;
                var5_26 = var7_32.e;
                if (var5_26.c == 0x7FFFFFFFFFFFFFFFL) {
                    var2_2 = false;
                }
                var8_33 = cgw.p();
                fxf.B(var2_2, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
                var3_16 = var5_26.f;
                var7_32.e = new ged((gds)var3_16, var5_26.a, var5_26.b, var5_26.c, var5_26.e, var5_26.d.c((gds)var3_16, var8_33));
                if (gdz.a.equals((Object)var4_6)) {
                    var3_16 = (gem)var6_29.a;
                    var3_16.d(var3_16.e.d);
                    return;
                }
                if (gdz.b.equals((Object)var4_6)) {
                    var3_16 = (gem)var6_29.a;
                    var3_16.c(var3_16.e.d);
                    return;
                }
                throw new IllegalStateException("Invalidation was ".concat(String.valueOf(String.valueOf((Object)var4_6))));
            }
            case 15: {
                throw (Throwable)this.a;
            }
            case 14: {
                throw (Throwable)this.a;
            }
            case 13: {
                gbr.d((hpn)this.a);
                return;
            }
            case 12: {
                ((PowerManager.WakeLock)this.a).release();
                return;
            }
            case 11: {
                var3_17 = (fuk)this.a;
                var3_17.b = false;
                var3_17 = var3_17.c.x;
                if (var3_17 != null && var3_17.l()) {
                    var3_17 = (fuk)this.a;
                    var3_17.a(var3_17.a);
                    return;
                }
                var4_7 = (fuk)this.a;
                var3_17 = var4_7.c;
                if (var3_17.w == 2) {
                    var3_17.M(var4_7.a);
                }
                return;
            }
            case 10: {
                ((fte)this.a).d();
                return;
            }
            case 9: {
                var5_27 = this.a;
                var3_18 = (fsi)var5_27;
                var4_8 = var3_18.h;
                synchronized (var4_8) {
                    var6_30 = ((fsi)var5_27).j;
                    if (((fsi)var5_27).k == 0 && var6_30 != null) {
                        ((fsi)var5_27).j = null;
                        // MONITOREXIT @DISABLED, blocks:[21, 8, 9, 45] lbl108 : MonitorExitStatement: MONITOREXIT : var4_8
                        if (!var6_30.cancel(true)) {
                            ((SQLiteDatabase)hhk.S(var6_30)).close();
                        }
lbl112:
                        // 4 sources

                        while (true) {
                            var3_18.b.unregisterComponentCallbacks((ComponentCallbacks)var5_27);
                            var3_18 = var3_18.g.iterator();
                            while (true) {
                                if (!var3_18.hasNext()) {
                                    return;
                                }
                                if (((WeakReference)var3_18.next()).get() != null) continue;
                                var3_18.remove();
                            }
                            break;
                        }
                        catch (ExecutionException var4_12) {
                            ** continue;
                        }
                    }
                    return;
                }
            }
            case 8: {
                var4_9 = this.a;
                var3_19 = ((fsi)var4_9).h;
                synchronized (var3_19) {
                    if (((fsi)var4_9).k == 0) {
                        ((fsi)var4_9).d();
                    }
                    return;
                }
            }
            case 7: {
                var4_10 = (flz)this.a;
                var3_20 = var4_10.b.k;
                if (var4_10.a.equals(var3_20)) {
                    var4_10.b.g();
                }
                return;
            }
            case 6: {
                var3_21 = (fgw)this.a;
                if (var3_21.e.compareAndSet(false, true)) {
                    ((heg)((heg)fgw.a.h()).j("com/google/android/libraries/speech/transcription/recognition/audio/impl/AudioLibraryAudioController", "initializeAsync", 211, "AudioLibraryAudioController.java")).r("Transcription audio client deactivated before explicit mic close requested");
                    var3_21.c.o();
                    var3_21.c.n();
                }
                return;
            }
            case 5: {
                var3_22 = (ffu)this.a;
                if (!var3_22.a.get()) {
                    var3_22.b.f.e();
                }
                return;
            }
            case 4: {
                SharedLibraryVersion.e(new eza(0)).q(((ffo)this.a).c, "ogg_opus_encoder", null);
                ezb.b = true;
                return;
            }
            case 3: {
                this.a.h();
                return;
            }
            case 2: {
                this.a.b();
                return;
            }
            case 1: {
                var3_23 = this.a;
                var4_11 = gqk.i(new dqv(var3_23, 20));
                ((ffg)var3_23).b.execute(var4_11);
                return;
            }
            case 0: 
        }
        this.a.k();
    }
}

