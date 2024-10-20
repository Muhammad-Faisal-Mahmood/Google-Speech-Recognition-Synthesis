/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class bdv
implements Callable {
    public final dhl a;
    public final ass b;

    public /* synthetic */ bdv(ass ass2, dhl dhl2) {
        this.b = ass2;
        this.a = dhl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        boolean bl2;
        block12: {
            Iterator iterator;
            long l2;
            Object object;
            Object object2;
            Object object3;
            dhl dhl2;
            block17: {
                ass ass2;
                block13: {
                    block14: {
                        block15: {
                            block16: {
                                dhl2 = this.a;
                                ass2 = this.b;
                                boolean bl3 = ass2 instanceof bdt;
                                bl2 = true;
                                if (!bl3) break block13;
                                object3 = ((bdt)ass2).a;
                                object2 = dhl2.g;
                                object = dhl2.a;
                                Object object4 = dhl2.d;
                                object = (String)object;
                                object2 = object2.a((String)object);
                                ((WorkDatabase)object4).y().a((String)object);
                                if (object2 == null) break block12;
                                if (object2 != bbv.b) break block14;
                                if (!(object3 instanceof bbg)) break block15;
                                object = dhl2.k;
                                String string = bdy.a;
                                bbi.a().e(string, "Worker result SUCCESS for ".concat((String)object));
                                if (!((bhd)dhl2.b).d()) break block16;
                                dhl2.j();
                                break block12;
                            }
                            object = dhl2.g;
                            Object object5 = dhl2.a;
                            object.m(bbv.c, (String)object5);
                            jse.c(object3, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
                            bas bas2 = ((bbg)object3).a;
                            jse.d(bas2, "success.outputData");
                            dhl2.g.i((String)dhl2.a, bas2);
                            Object object6 = dhl2.f;
                            object3 = dhl2.a;
                            l2 = System.currentTimeMillis();
                            iterator = object6.a((String)object3).iterator();
                            break block17;
                        }
                        if (object3 instanceof bbf) {
                            Object object7 = dhl2.k;
                            object3 = bdy.a;
                            bbi.a().e((String)object3, "Worker result RETRY for ".concat((String)object7));
                            dhl2.i(-256);
                            return bl2;
                        }
                        Object object8 = dhl2.k;
                        object = bdy.a;
                        bbi.a().e((String)object, "Worker result FAILURE for ".concat((String)object8));
                        if (((bhd)dhl2.b).d()) {
                            dhl2.j();
                            break block12;
                        } else {
                            void var6_14;
                            Object object9 = object3;
                            if (object3 == null) {
                                bbe bbe2 = new bbe();
                            }
                            dhl2.k((AmbientLifecycleObserverKt)var6_14);
                        }
                        break block12;
                    }
                    if (!((bbv)((Object)object2)).a()) {
                        dhl2.i(-512);
                        return bl2;
                    }
                    break block12;
                }
                if (ass2 instanceof bds) {
                    dhl2.k(((bds)ass2).a);
                    break block12;
                } else {
                    if (!(ass2 instanceof bdu)) throw new joa();
                    int n2 = ((bdu)ass2).a;
                    bbv bbv2 = dhl2.g.a((String)dhl2.a);
                    if (bbv2 != null && !bbv2.a()) {
                        Object object10 = bdy.a;
                        bbi.a();
                        object10 = (String)dhl2.a;
                        Objects.toString((Object)bbv2);
                        Object object11 = dhl2.g;
                        object10 = dhl2.a;
                        object11.m(bbv.a, (String)object10);
                        dhl2.g.j((String)dhl2.a, n2);
                        dhl2.g.l((String)dhl2.a, -1L);
                        return bl2;
                    }
                    String string = bdy.a;
                    bbi.a();
                    string = (String)dhl2.a;
                    Objects.toString((Object)bbv2);
                }
                break block12;
            }
            while (iterator.hasNext()) {
                int n3;
                object3 = (String)iterator.next();
                if (dhl2.g.a((String)object3) != bbv.e) continue;
                object2 = dhl2.f;
                object = auo.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                ((auo)object).g(1, (String)object3);
                object2 = (bge)object2;
                ((bge)object2).a.j();
                object2 = wf.i(((bge)object2).a, (awr)object, false);
                n3 = object2.moveToFirst() && (n3 = object2.getInt(0)) != 0 ? 1 : 0;
                if (n3 == 0) continue;
                object2 = String.valueOf(object3);
                object = bdy.a;
                object2 = "Setting status to enqueued for ".concat((String)object2);
                bbi.a().e((String)object, (String)object2);
                dhl2.g.m(bbv.a, (String)object3);
                dhl2.g.h((String)object3, l2);
                continue;
                finally {
                    object2.close();
                    ((auo)object).j();
                }
            }
        }
        bl2 = false;
        return bl2;
    }
}

