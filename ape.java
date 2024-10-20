/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 */
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class ape
extends Handler
implements Runnable {
    public IOException a;
    public int b;
    final aph c;
    private apd d;
    private Thread e;
    private boolean f;
    private volatile boolean g;
    private final ank h;

    public ape(aph aph2, Looper looper, ank ank2, apd apd2) {
        this.c = aph2;
        super(looper);
        this.h = ank2;
        this.d = apd2;
    }

    private final void c() {
        SystemClock.elapsedRealtime();
        abr.i(this.d);
        this.a = null;
        aph aph2 = this.c;
        ape ape2 = aph2.c;
        abr.i(ape2);
        aph2.a.execute(ape2);
    }

    private final void d() {
        this.c.c = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl2) {
        Object object;
        this.g = bl2;
        this.a = null;
        if (this.hasMessages(1)) {
            this.f = true;
            this.removeMessages(1);
            if (!bl2) {
                this.sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                this.f = true;
                this.h.g = true;
                object = this.e;
                if (object != null) {
                    ((Thread)object).interrupt();
                }
            }
        }
        if (bl2) {
            this.d();
            SystemClock.elapsedRealtime();
            apd apd2 = this.d;
            abr.i(apd2);
            object = this.h;
            ((ann)apd2).x((ank)object, true);
            this.d = null;
        }
    }

    public final void b(long l2) {
        boolean bl2 = this.c.c == null;
        abr.f(bl2);
        this.c.c = this;
        if (l2 > 0L) {
            this.sendEmptyMessageDelayed(1, l2);
            return;
        }
        this.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMessage(Message object) {
        long l2;
        amv amv2;
        ank ank2;
        IOException iOException;
        long l3;
        int n2;
        Object object2;
        block20: {
            block23: {
                int n3;
                block21: {
                    boolean bl2;
                    ann ann2;
                    block22: {
                        block19: {
                            block18: {
                                block15: {
                                    block17: {
                                        block16: {
                                            if (this.g) {
                                                return;
                                            }
                                            if (((Message)object).what == 1) {
                                                this.c();
                                                return;
                                            }
                                            if (((Message)object).what == 4) throw (Error)((Message)object).obj;
                                            this.d();
                                            SystemClock.elapsedRealtime();
                                            object2 = this.d;
                                            abr.i(object2);
                                            if (this.f) {
                                                object = this.h;
                                                ((ann)object2).x((ank)object, false);
                                                return;
                                            }
                                            n2 = ((Message)object).what;
                                            l3 = 0L;
                                            if (n2 == 2) break block16;
                                            if (n2 != 3) {
                                                return;
                                            }
                                            this.a = iOException = (IOException)((Message)object).obj;
                                            n3 = this.b;
                                            this.b = n3 + 1;
                                            ank2 = this.h;
                                            object = ank2.c;
                                            l3 = ank2.a;
                                            object = ank2.j;
                                            amv2 = new amv();
                                            l3 = ank2.i;
                                            n2 = agf.a;
                                            if (iOException instanceof aem || iOException instanceof FileNotFoundException || iOException instanceof ahc || iOException instanceof apg) break block15;
                                            break block17;
                                        }
                                        try {
                                            Object object3;
                                            object = this.h;
                                            if (((ann)object2).l == -9223372036854775807L && (object3 = ((ann)object2).k) != null) {
                                                boolean bl3 = object3.d();
                                                long l4 = ((ann)object2).c(true);
                                                if (l4 != Long.MIN_VALUE) {
                                                    l3 = l4 + 10000L;
                                                }
                                                ((ann)object2).l = l3;
                                                ((ann)object2).v.u(l3, bl3, ((ann)object2).m);
                                            }
                                            object3 = ((ank)object).c;
                                            l3 = ((ank)object).a;
                                            Object object4 = ((ank)object).j;
                                            object3 = new amv();
                                            object4 = ((ann)object2).w;
                                            l3 = ((ank)object).i;
                                            n2 = agf.a;
                                            object = new hti(-1, null);
                                            ((dvy)object4).l((amv)object3, (hti)object);
                                            ((ann)object2).t = true;
                                            object = ((ann)object2).g;
                                            abr.i(object);
                                            object.b((anx)object2);
                                            return;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            afx.c("LoadTask", "Unexpected exception handling load completed", runtimeException);
                                            this.c.d = new apg(runtimeException);
                                            return;
                                        }
                                    }
                                    for (object = iOException; object != null; object = ((Throwable)object).getCause()) {
                                        if (!(object instanceof ags) || ((ags)object).a != 2008) {
                                            continue;
                                        }
                                        break block15;
                                    }
                                    l3 = Math.min(n3 * 1000, 5000);
                                    break block18;
                                }
                                l3 = -9223372036854775807L;
                            }
                            if (l3 != -9223372036854775807L) break block19;
                            object = aph.f;
                            break block20;
                        }
                        ann2 = (ann)object2;
                        n3 = ann2.b();
                        n2 = n3 > ann2.s ? 1 : 0;
                        if (ann2.p || (object = ann2.k) != null && object.a() != -9223372036854775807L) break block21;
                        bl2 = ann2.j;
                        if (!bl2 || ann2.w()) break block22;
                        ann2.r = true;
                        object = aph.e;
                        break block20;
                    }
                    ann2.o = bl2;
                    ann2.q = 0L;
                    ann2.s = 0;
                    object = ann2.i;
                    int n4 = ((Object)object).length;
                    for (n3 = 0; n3 < n4; ++n3) {
                        ((anu)object[n3]).j();
                    }
                    ank2.b(0L, 0L);
                    break block23;
                }
                ann2.s = n3;
            }
            object = new bea(n2, l3);
        }
        n2 = ((bea)object).a;
        n2 = n2 != 0 && n2 != 1 ? 0 : 1;
        object2 = ((ann)object2).w;
        l3 = ank2.i;
        ((dvy)object2).m(amv2, new hti(-1, null), iOException, (n2 ^ 1) != 0);
        if (n2 == 0) {
            l3 = ank2.a;
        }
        if ((n2 = ((bea)object).a) == 3) {
            this.c.d = this.a;
            return;
        }
        if (n2 == 2) return;
        if (n2 == 1) {
            this.b = 1;
        }
        l3 = l2 = ((bea)object).b;
        if (l2 == -9223372036854775807L) {
            l3 = Math.min((this.b - 1) * 1000, 5000);
        }
        this.b(l3);
    }

    /*
     * Exception decompiling
     */
    @Override
    public final void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 53[TRYBLOCK] [82 : 1244->1246)] java.lang.Throwable
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

