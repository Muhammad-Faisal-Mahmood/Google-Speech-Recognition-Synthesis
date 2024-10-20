/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.wear.ambient.AmbientLifecycleObserver$AmbientLifecycleCallback$_CC;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class biv
extends jqs
implements jro {
    int a;
    final Object b;
    final Object c;
    final Object d;
    final Object e;
    private final int f;

    public biv(ConstraintTrackingWorker constraintTrackingWorker, bbh bbh2, bzb bzb2, bhd bhd2, jqb jqb2, int n2) {
        this.f = n2;
        this.d = constraintTrackingWorker;
        this.b = bbh2;
        this.c = bzb2;
        this.e = bhd2;
        super(2, jqb2);
    }

    public biv(bbh bbh2, bhd bhd2, baz baz2, Context context, jqb jqb2, int n2) {
        this.f = n2;
        this.e = bbh2;
        this.d = bhd2;
        this.c = baz2;
        this.b = context;
        super(2, jqb2);
    }

    public biv(bzb bzb2, bhd bhd2, AtomicInteger atomicInteger, hpn hpn2, jqb jqb2, int n2) {
        this.f = n2;
        this.b = bzb2;
        this.c = bhd2;
        this.d = atomicInteger;
        this.e = hpn2;
        super(2, jqb2);
    }

    public biv(gpm gpm2, Object object, jrk jrk2, jrk jrk3, jqb jqb2, int n2) {
        this.f = n2;
        this.b = gpm2;
        this.c = object;
        this.d = jrk2;
        this.e = jrk3;
        super(2, jqb2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final Object a(Object object) {
        void var1_24;
        int n2 = this.f;
        if (n2 != 0) {
            void var1_15;
            void var1_20;
            if (n2 != 1) {
                Object object2;
                void var1_12;
                if (n2 != 2) {
                    void var1_9;
                    Object object3;
                    jqh jqh2 = jqh.a;
                    n2 = this.a;
                    jns.ak(object);
                    if (n2 == 0) {
                        Object object4;
                        object3 = this.b;
                        Object object5 = this.c;
                        object3 = ((gpm)object3).d;
                        n2 = object3.size();
                        object3.add(object5);
                        if (n2 == 0 && ((gpm)this.b).d.size() == 1 && (object4 = this.d) != null) {
                            this.a = 1;
                            if (object4.a(this) == jqh2) {
                                jqh jqh3 = jqh2;
                                return var1_9;
                            }
                        }
                    }
                    Object object6 = this.e;
                    if (object6 != null) {
                        Object object7 = this.b;
                        object3 = this.c;
                        ((gpm)object7).x(object3, (jrk)object6);
                    }
                    jon jon2 = jon.a;
                    return var1_9;
                }
                jqh jqh4 = jqh.a;
                if (this.a != 0) {
                    jns.ak(object);
                    return var1_12;
                }
                jns.ak(object);
                Object object8 = this.d;
                Object object9 = this.b;
                Object object10 = this.c;
                Object object11 = this.e;
                this.a = 1;
                object11 = (bhd)object11;
                object10 = (bzb)object10;
                bbh bbh2 = (bbh)object9;
                Object object12 = object2 = ((ConstraintTrackingWorker)object8).j(bbh2, (bzb)object10, (bhd)object11, this);
                if (object2 != jqh4) return var1_12;
                return jqh4;
            }
            jqh jqh5 = jqh.a;
            n2 = this.a;
            if (n2 != 0) {
                if (n2 != 1) {
                    jns.ak(object);
                    return var1_20;
                }
                jns.ak(object);
            } else {
                jns.ak(object);
                bbh bbh3 = (bbh)this.e;
                hpn hpn2 = bbh3.a();
                this.a = 1;
                Object object13 = bdy.a(hpn2, bbh3, this);
                if (object13 == jqh5) return jqh5;
            }
            bay bay2 = (bay)var1_15;
            if (bay2 != null) {
                Object object14;
                n2 = bim.a;
                bbi.a();
                Object object15 = this.c;
                Object object16 = this.b;
                UUID uUID = ((bbh)this.e).e();
                object16 = (Context)object16;
                object15 = (bio)object15;
                bin bin2 = new bin((bio)object15, uUID, bay2, (Context)object16);
                hpn hpn3 = AmbientLifecycleObserver$AmbientLifecycleCallback$_CC.a((Executor)((bio)object15).c.a, "setForegroundAsync", bin2);
                this.a = 2;
                Object object17 = object14 = kt.f(hpn3, this);
                if (object14 != jqh5) return var1_20;
                return jqh5;
            }
            StringBuilder stringBuilder = new StringBuilder("Worker was marked important (");
            stringBuilder.append(((bhd)this.d).d);
            stringBuilder.append(") but did not provide ForegroundInfo");
            throw new IllegalStateException(stringBuilder.toString());
        }
        jqh jqh6 = jqh.a;
        if (this.a != 0) {
            jns.ak(object);
        } else {
            Object object18;
            jns.ak(object);
            Object object19 = this.b;
            Object object20 = this.c;
            this.a = 1;
            bhd bhd2 = (bhd)object20;
            Object object21 = object18 = bjc.a((bzb)object19, bhd2, this);
            if (object18 == jqh6) {
                return jqh6;
            }
        }
        n2 = ((Number)var1_24).intValue();
        ((AtomicInteger)this.d).set(n2);
        this.e.cancel(true);
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.f;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                    object = jon.a;
                    return ((biv)object2).a(object);
                }
                object = ((jqm)this).c((jvb)object, (jqb)object2);
                object2 = jon.a;
                return ((biv)object).a(object2);
            }
            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
            object = jon.a;
            return ((biv)object2).a(object);
        }
        object = ((jqm)this).c((jvb)object, (jqb)object2);
        object2 = jon.a;
        return ((biv)object).a(object2);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.f;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    Object object2 = this.b;
                    Object object3 = this.c;
                    object = this.d;
                    Object object4 = this.e;
                    return new biv((gpm)object2, object3, (jrk)object, (jrk)object4, jqb2, 3);
                }
                object = this.d;
                Object object5 = this.b;
                Object object6 = this.c;
                bhd bhd2 = (bhd)this.e;
                object6 = (bzb)object6;
                object5 = (bbh)object5;
                return new biv((ConstraintTrackingWorker)object, (bbh)object5, (bzb)object6, bhd2, jqb2, 2);
            }
            object = this.e;
            Object object7 = this.d;
            Object object8 = this.c;
            Context context = (Context)this.b;
            object7 = (bhd)object7;
            return new biv((bbh)object, (bhd)object7, (baz)object8, context, jqb2, 1);
        }
        Object object9 = this.b;
        Object object10 = this.c;
        Object object11 = this.d;
        object = this.e;
        object11 = (AtomicInteger)object11;
        object10 = (bhd)object10;
        return new biv((bzb)object9, (bhd)object10, (AtomicInteger)object11, (hpn)object, jqb2, 0);
    }
}

