/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  hom
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Collection$_EL;
import j$.util.Objects;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class gjh
extends BroadcastReceiver
implements gje {
    public static final hei a = hei.m("com/google/apps/tiktok/receiver/IntentFilterAcledReceiver");
    private final Class b;
    private long c;
    private hpr d;
    private jnu e;

    protected gjh(Class clazz) {
        this.b = clazz;
    }

    protected static hpn f(Context object, Class clazz) {
        try {
            object = hhk.K(fvd.l(object, clazz));
            return object;
        }
        catch (IllegalStateException illegalStateException) {
            return hhk.J(new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", illegalStateException));
        }
    }

    public static final void g(hpn hpn2) {
        if (!hpn2.isCancelled()) {
            fpk.e(gqk.i(new gjf(hpn2, 0)));
        }
    }

    private final hpn h(Context object, Intent object2, gop object3) {
        Object object4;
        block13: {
            block12: {
                object4 = fxf.aq("getEntryPoint");
                object = gjh.f((Context)object, this.b);
                ((gol)object4).a((hpn)object);
                object4 = new gji(this.getResultCode(), this.getResultData(), this.getResultExtras(false));
                object3 = fxf.ar("handleBroadcast", (gop)object3);
                Object object5 = (Set)((imc)this.e).a;
                fbw fbw2 = new fbw(13);
                Collection$_EL.forEach((Collection)object5, fbw2);
                object5 = new cxe((Object)this, object2, object4, 15, null);
                object = hno.g((hpn)object, gqk.d((hny)object5), (Executor)hom.a);
                ((gol)object3).a((hpn)object);
                if (!object.isDone()) break block12;
                try {
                    object2 = (gji)a.h((Future)object);
                }
                catch (ExecutionException executionException) {
                    return hhk.J(executionException);
                }
                this.setResult(object2.a, object2.b, object2.c);
                break block13;
            }
            hhk.T((hpn)object, gqk.g(new cmr(this.goAsync(), 14)), (Executor)hom.a);
        }
        return object;
        finally {
            ((gol)object3).close();
        }
        finally {
            ((gol)object4).close();
        }
    }

    private final hpn i(Context object, Intent intent, gop object2) {
        Object object3;
        block10: {
            object3 = fxf.aq("getEntryPoint");
            object = gjh.f((Context)object, this.b);
            ((gol)object3).a((hpn)object);
            this.getResultCode();
            object2 = fxf.ar("handleBroadcast", (gop)object2);
            object3 = (Set)((imc)this.e).a;
            fbw fbw2 = new fbw(14);
            Collection$_EL.forEach((Collection)object3, fbw2);
            object3 = new fbk(this, intent, 9);
            object = hno.g((hpn)object, gqk.d((hny)object3), (Executor)hom.a);
            ((gol)object2).a((hpn)object);
            if (object.isDone()) break block10;
            intent = this.goAsync();
            Objects.requireNonNull(intent);
            object.c(gqk.i(new gjf(intent, 2)), (Executor)hom.a);
        }
        return object;
        finally {
            ((gol)object2).close();
        }
        finally {
            ((gol)object3).close();
        }
    }

    public gjj a(Object object) {
        return null;
    }

    @Override
    public final /* synthetic */ long b() {
        return -1L;
    }

    @Override
    public final /* synthetic */ long ba() {
        return -1L;
    }

    protected boolean c() {
        return false;
    }

    public fcy d(Object object) {
        return null;
    }

    public final hpn e(hpn hpn2, Object object, Intent intent) {
        long l2;
        if (object instanceof gje) {
            object = (gje)object;
            l2 = (intent.getFlags() & 0x10000000) != 0 ? object.b() : object.ba();
        } else {
            l2 = -1L;
        }
        if (l2 <= 0L) {
            return hpn2;
        }
        return fxf.af(hhk.R(hpn2, l2 - (cgw.q().toMillis() - this.c), TimeUnit.MILLISECONDS, this.d), TimeoutException.class, new gcx(4), (Executor)hom.a);
    }

    /*
     * Exception decompiling
     */
    public final void onReceive(Context var1_1, Intent var2_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [20 : 749->752)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

