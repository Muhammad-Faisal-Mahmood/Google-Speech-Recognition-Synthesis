/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.Log
 */
import android.os.ParcelFileDescriptor;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.libraries.assistant.soda.Soda;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public final class ckr
implements Runnable {
    final Object a;
    final Object b;
    private final int c;

    public ckr(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object2;
        this.b = object;
    }

    public /* synthetic */ ckr(Object object, Object object2, int n2, byte[] byArray) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    public /* synthetic */ ckr(Object object, Object object2, int n2, char[] cArray) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        switch (this.c) {
            default: {
                var4_1 = this.a;
                this.b.a(var4_1);
                return;
            }
            case 19: {
                var2_27 = Thread.currentThread().getId();
                var4_2 = (crb)this.b;
                var4_2.a.d(var2_27);
                var5_28 = this.a;
                try {
                    var5_28.run();
                    return;
                }
                finally {
                    var4_2.a.c(var2_27);
                }
            }
            case 18: {
                var4_3 = this.b;
                var5_30 = this.a;
                ((cqm)var4_3).a((hnx)var5_30);
                return;
            }
            case 17: {
                var5_31 = this.b;
                var6_51 = this.a;
                var4_4 = ((cqf)var6_51).a;
                synchronized (var4_4) {
                    ((cqf)var6_51).c.remove(var5_31);
                    return;
                }
            }
            case 16: {
                var6_52 = this.b;
                var5_32 = this.a;
                var4_5 = ((cqf)var5_32).a;
                synchronized (var4_5) {
                    ((cqf)var5_32).b.remove(var6_52);
                    ((cqf)var5_32).c.add(var6_52);
                    return;
                }
            }
            case 15: {
                var5_33 = this.a;
                var4_6 = this.b;
                try {
                    var5_33.run();
                    return;
                }
                finally {
                    var5_33 = ((cpt)var4_6).a;
                    synchronized (var5_33) {
                        ((cpt)var4_6).a.remove(Thread.currentThread());
                    }
                }
            }
            case 14: {
                var7_59 = (cpq)this.b;
                var4_7 = var7_59.b.d != false ? var7_59.a.toString() : var7_59.a.getClass().toString();
                var8_62 = this.a;
                var9_63 = (Thread)var8_62;
                var5_34 = var6_54 = gqq.b((Thread)var9_63);
                if (var6_54.getStackTrace().length <= 0) {
                    var5_34 = null;
                }
                var10_64 = new cpe((Thread)var9_63, (Throwable)var5_34);
                var5_34 = var10_64.getMessage();
                var7_59.b.c.f();
                var6_54 = String.valueOf((Object)var7_59.b.c.g());
                var9_63 = new StringBuilder("On ");
                var9_63.append((String)var5_34);
                var9_63.append(" task took longer than 1 ");
                var9_63.append((String)var6_54);
                var9_63.append(" so assumed deadlocked: ");
                var9_63.append((String)var4_7);
                var4_7 = new cpx(var9_63.toString(), var10_64.getStackTrace(), var10_64.getCause());
                var5_34 = var7_59.b.a.a();
                var5_34.remove(var8_62);
                cpu.a(var7_59.b.b, (ArrayList)var5_34, (RuntimeException)var4_7);
                return;
            }
            case 13: {
                var4_8 = this.a;
                ((cpi)this.b).a.removeCallbacks((Runnable)var4_8);
                return;
            }
            case 12: {
                var5_35 = this.b;
                var4_9 = this.a;
                var5_35 = var5_35.a();
                try {
                    var4_9.run();
                    return;
                }
                finally {
                    if (var5_35 != null) {
                        var5_35.close();
                    }
                }
            }
            case 11: {
                var4_11 = this.a;
                ((how)this.b).execute((Runnable)var4_11);
                return;
            }
            case 10: {
                var4_12 = this.a;
                ((how)this.b).execute((Runnable)var4_12);
                return;
            }
            case 9: {
                StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)((StrictMode.ThreadPolicy)this.b));
                this.a.run();
                return;
            }
            case 8: {
                var4_13 = cni.a;
                var6_55 = this.b;
                var4_13 = this.a;
                var5_37 = new FileOutputStream(((ParcelFileDescriptor[])var4_13)[1].getFileDescriptor());
                var5_37.write((byte[])var6_55);
                var5_37.close();
                try {
                    ((ParcelFileDescriptor[])var4_13)[1].close();
                    return;
                }
                catch (IOException var4_14) {
                    a.as(cni.a.h(), "Failed to close pipe", "com/google/android/libraries/assistant/soda/aicore/AiCoreTranscriber", "createReadPfdFromBytes", '\u0115', "AiCoreTranscriber.java", var4_14);
                    return;
                }
                catch (Throwable var6_56) {
                    try {
                        var5_37.close();
                        throw var6_56;
                    }
                    catch (Throwable var5_38) {
                        try {
                            var6_56.addSuppressed(var5_38);
                            throw var6_56;
                        }
                        catch (Throwable var5_39) {
                            ** GOTO lbl145
                        }
                        catch (IOException var5_40) {
                            a.as(cni.a.h(), "Failed to write to pipe", "com/google/android/libraries/assistant/soda/aicore/AiCoreTranscriber", "createReadPfdFromBytes", '\u0110', "AiCoreTranscriber.java", var5_40);
                            try {
                                ((ParcelFileDescriptor[])var4_13)[1].close();
                                return;
                            }
                            catch (IOException var4_15) {
                                a.as(cni.a.h(), "Failed to close pipe", "com/google/android/libraries/assistant/soda/aicore/AiCoreTranscriber", "createReadPfdFromBytes", '\u0115', "AiCoreTranscriber.java", var4_15);
                                return;
                            }
                        }
                    }
                }
lbl145:
                // 1 sources

                try {
                    ((ParcelFileDescriptor[])var4_13)[1].close();
                    throw var5_39;
                }
                catch (IOException var4_16) {
                    a.as(cni.a.h(), "Failed to close pipe", "com/google/android/libraries/assistant/soda/aicore/AiCoreTranscriber", "createReadPfdFromBytes", '\u0115', "AiCoreTranscriber.java", var4_16);
                }
                throw var5_39;
            }
            case 7: {
                ((heg)((heg)Soda.a.f()).j("com/google/android/libraries/assistant/soda/Soda", "scheduleLiveTimeout", 1202, "Soda.java")).t("TTL (%d seconds) reached - run scheduled task", ((hwg)this.b).b);
                this.a.run();
                return;
            }
            case 6: {
                ((heg)((heg)Soda.a.f()).j("com/google/android/libraries/assistant/soda/Soda", "updateSharedResourcesTimeout", 1243, "Soda.java")).t("TTL (%d seconds) reached - destroy SodaSharedResources", ((hwg)this.a).b);
                var5_41 = this.b;
                var4_17 = igs.e;
                ((Soda)var5_41).i(var4_17);
                return;
            }
            case 5: {
                var5_42 = ((cku)this.b).a;
                synchronized (var5_42) {
                    ((cku)this.b).b.a(((ckz)this.a).d());
                    return;
                }
            }
            case 4: {
                var4_18 = ((cku)this.b).a;
                synchronized (var4_18) {
                    var5_43 = ((cku)this.b).b;
                    var6_57 = ((ckz)this.a).c();
                    kl.at(var6_57);
                    var5_43.c(var6_57);
                    return;
                }
            }
            case 3: {
                var4_19 = ((cku)this.b).a;
                synchronized (var4_19) {
                    ((cku)this.b).b.a((ckz)this.a);
                    return;
                }
            }
            case 2: {
                try {
                    var4_20 = (ckz)((cks)this.b).a.a((ckz)this.a);
                    if (var4_20 != null) ** GOTO lbl187
                    var4_20 = this.b;
                }
                catch (Exception var4_21) {
                    ((cks)this.b).b.k(var4_21);
                    return;
                }
                catch (cky var5_46) {
                    if (var5_46.getCause() instanceof Exception) {
                        var4_22 = this.b;
                        var5_47 = (Exception)var5_46.getCause();
                        ((cks)var4_22).b.k(var5_47);
                        return;
                    }
                    ((cks)this.b).b.k(var5_46);
                    return;
                }
                var5_44 = new NullPointerException("Continuation returned null");
                ((cks)var4_20).c(var5_44);
                return;
lbl187:
                // 1 sources

                var5_45 = this.b;
                var4_20.i(clc.b, (ckx)var5_45);
                var5_45 = this.b;
                var4_20.h(clc.b, (ckw)var5_45);
                var5_45 = this.b;
                var4_20.f(clc.b, (cks)var5_45);
                return;
            }
            case 1: {
                var5_48 = (cko)this.a;
                var6_58 = var5_48.b;
                var1_65 = var6_58.b();
                var4_23 = this.b;
                if (!var1_65) ** GOTO lbl236
                var6_58 = var5_48.c;
                kl.at(var6_58);
                var5_48 = var6_58.c;
                if (!var5_48.b()) {
                    var6_58 = String.valueOf(String.valueOf(var5_48));
                    var7_60 = new Exception();
                    Log.wtf((String)"SignInCoordinator", (String)"Sign-in succeeded with resolve account failure: ".concat((String)var6_58), (Throwable)var7_60);
                    var4_23 = (cep)var4_23;
                    var4_23.f.b((cbk)var5_48);
                    var4_23.e.u();
                    return;
                }
                var7_61 = (cep)var4_23;
                var5_48 = var7_61.f;
                var6_58 = var6_58.a();
                var7_61 = var7_61.c;
                if (var6_58 != null && var7_61 != null) {
                    var5_48.f = var6_58;
                    var5_48.c = var7_61;
                    var5_48.c();
                } else {
                    Log.wtf((String)"GoogleApiManager", (String)"Received null response from onSignInSuccess", (Throwable)new Exception());
                    var5_48.b(new cbk(4));
                }
                ** GOTO lbl237
lbl236:
                // 1 sources

                ((cep)var4_23).f.b((cbk)var6_58);
lbl237:
                // 3 sources

                ((cep)var4_23).e.u();
                return;
            }
            case 0: 
        }
        if (((cld)this.a).c) {
            ((cld)((cku)this.b).a).m();
            return;
        }
        try {
            var4_24 = ((cku)this.b).b.a((ckz)this.a);
        }
        catch (Exception var4_25) {
            ((cld)((cku)this.b).a).k(var4_25);
            return;
        }
        catch (cky var5_49) {
            if (var5_49.getCause() instanceof Exception) {
                var4_26 = this.b;
                var5_50 = (Exception)var5_49.getCause();
                ((cld)((cku)var4_26).a).k(var5_50);
                return;
            }
            ((cld)((cku)this.b).a).k(var5_49);
            return;
        }
        ((cld)((cku)this.b).a).l(var4_24);
        return;
    }
}

