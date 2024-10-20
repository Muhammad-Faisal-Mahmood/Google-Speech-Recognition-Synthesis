/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class ConstraintTrackingWorker
extends CoroutineWorker {
    private final WorkerParameters e;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        jse.e(context, "appContext");
        jse.e(workerParameters, "workerParameters");
        super(context, workerParameters);
        this.e = workerParameters;
    }

    @Override
    public final Object c(jqb jqb2) {
        Executor executor = this.f();
        jse.d(executor, "backgroundExecutor");
        return jse.ae(jvf.k(executor), new aus(this, null, 6), jqb2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object i(jqb var1_1) {
        block19: {
            block18: {
                if (!(var1_1 instanceof bix)) ** GOTO lbl-1000
                var3_4 = (bix)var1_1;
                var2_5 = var3_4.d;
                if ((var2_5 & -2147483648) != 0) {
                    var3_4.d = var2_5 + -2147483648;
                    var1_1 = var3_4;
                } else lbl-1000:
                // 2 sources

                {
                    var1_1 = new bix(this, (jqb)var1_1);
                }
                var6_6 = var1_1.b;
                var5_7 /* !! */  = jqh.a;
                var2_5 = var1_1.d;
                if (var2_5 != 0) {
                    if (var2_5 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    var4_8 = var1_1.a;
                    var5_7 /* !! */  = var1_1.e;
                    var3_4 = var5_7 /* !! */ ;
                    var1_1 = var4_8;
                    try {
                        jns.ak(var6_6);
                        var3_4 = var5_7 /* !! */ ;
                        var1_1 = var4_8;
                        var4_8 = var6_6;
                        return var4_8 = (AmbientLifecycleObserverKt)var4_8;
                    }
                    catch (CancellationException var4_9) {
                        var5_7 /* !! */  = var1_1;
                        var1_1 = var4_9;
                        break block18;
                    }
                }
                jns.ak(var6_6);
                var3_4 = this.d().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (var3_4 != null && var3_4.length() != 0) {
                    var6_6 = bdn.i(this.a);
                    var7_10 = var6_6.d.z();
                    var4_8 = this.e().toString();
                    jse.d(var4_8, "id.toString()");
                    var4_8 = var7_10.b((String)var4_8);
                    if (var4_8 == null) {
                        return new bbe();
                    }
                    var6_6 = new bzb(var6_6.j, null);
                    if (!var6_6.K((bhd)var4_8)) {
                        var1_1 = bjc.a;
                        bbi.a();
                        return new bbf();
                    }
                    var7_10 = bjc.a;
                    bbi.a();
                    try {
                        var8_11 = this.b.f;
                        var7_10 = this.a;
                        jse.d(var7_10, "applicationContext");
                        var3_4 = var8_11.b((Context)var7_10, (String)var3_4, this.e);
                        var7_10 = this.e.h.c;
                    }
                    catch (Throwable var1_3) {
                        bbi.a();
                        return new bbe();
                    }
                    jse.d(var7_10, "workerParameters.taskExecutor.mainThreadExecutor");
                    try {
                        var8_11 = jvf.k((Executor)var7_10);
                        var7_10 = new biv(this, (bbh)var3_4, (bzb)var6_6, (bhd)var4_8, null, 2);
                        var1_1.e = this;
                        var1_1.a = var3_4;
                        var1_1.d = 1;
                        var4_8 = jse.ae((jqf)var8_11, (jro)var7_10, (jqb)var1_1);
                        if (var4_8 == var5_7 /* !! */ ) return var5_7 /* !! */ ;
                        var1_1 = var3_4;
                        var3_4 = this;
                        return var4_8 = (AmbientLifecycleObserverKt)var4_8;
                    }
                    catch (CancellationException var1_2) {
                        var5_7 /* !! */  = var3_4;
                        var3_4 = this;
                    }
                }
                break block19;
            }
            if (var3_4.h() || var1_1 instanceof bit) {
                if (Build.VERSION.SDK_INT < 31) {
                    var2_5 = -512;
                } else if (var3_4.h()) {
                    var2_5 = var3_4.c.get();
                } else {
                    if (var1_1 instanceof bit == false) throw new IllegalStateException("Unreachable");
                    var2_5 = ((bit)var1_1).a;
                }
                ((bbh)var5_7 /* !! */ ).g(var2_5);
            }
            if (var1_1 instanceof bit == false) throw var1_1;
            return new bbf();
        }
        var1_1 = bjc.a;
        bbi.a().c((String)var1_1, "No worker to delegate to.");
        return new bbe();
    }

    /*
     * Unable to fully structure code
     */
    public final Object j(bbh var1_1, bzb var2_2, bhd var3_3, jqb var4_4) {
        if (!(var4_4 instanceof biu)) ** GOTO lbl-1000
        var6_5 = (biu)var4_4;
        var5_6 = var6_5.c;
        if ((var5_6 & -2147483648) != 0) {
            var6_5.c = var5_6 + -2147483648;
            var4_4 = var6_5;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new biu(this, (jqb)var4_4);
        }
        var6_5 = var4_4.a;
        var7_7 = jqh.a;
        var5_6 = var4_4.c;
        if (var5_6 == 0) ** GOTO lbl18
        if (var5_6 == 1) {
            jns.ak(var6_5);
            var1_1 = var6_5;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl18:
            // 1 sources

            jns.ak(var6_5);
            var1_1 = new biw((bbh)var1_1, (bzb)var2_2, var3_3, null);
            var4_4.c = 1;
            var1_1 = var2_2 = jvf.f((jro)var1_1, (jqb)var4_4);
            if (var2_2 == var7_7) {
                return var7_7;
            }
        }
        jse.d(var1_1, "delegate: ListenableWork\u2026.cancel()\n        }\n    }");
        return var1_1;
    }
}

