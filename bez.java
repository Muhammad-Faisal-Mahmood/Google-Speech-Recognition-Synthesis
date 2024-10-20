/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

public final class bez
extends jqs
implements jro {
    int a;
    final Object b;
    final Object c;
    final Object d;
    private final int e;

    public bez(bzb bzb2, bhd bhd2, bew bew2, jqb jqb2, int n2) {
        this.e = n2;
        this.b = bzb2;
        this.c = bhd2;
        this.d = bew2;
        super(2, jqb2);
    }

    public bez(dhl dhl2, bbh bbh2, baz baz2, jqb jqb2, int n2) {
        this.e = n2;
        this.c = dhl2;
        this.b = bbh2;
        this.d = baz2;
        super(2, jqb2);
    }

    public bez(gpm gpm2, Object object, jrk jrk2, jqb jqb2, int n2) {
        this.e = n2;
        this.d = gpm2;
        this.b = object;
        this.c = jrk2;
        super(2, jqb2);
    }

    @Override
    public final Object a(Object object) {
        block14: {
            block17: {
                jqh jqh2;
                block19: {
                    Object object2;
                    block18: {
                        int n2;
                        block15: {
                            block16: {
                                n2 = this.e;
                                if (n2 == 0) break block14;
                                if (n2 != 1) {
                                    jqh jqh3 = jqh.a;
                                    n2 = this.a;
                                    jns.ak(object);
                                    if (n2 == 0) {
                                        Object object3 = this.d;
                                        object = this.b;
                                        object3 = ((gpm)object3).d;
                                        n2 = object3.size();
                                        object3.remove(object);
                                        object = this.d;
                                        object3 = this.b;
                                        ((gpm)object).b.remove(object3);
                                        if (n2 == 1 && ((gpm)this.d).d.isEmpty() && (object = this.c) != null) {
                                            this.a = 1;
                                            if (object.a(this) == jqh3) {
                                                return jqh3;
                                            }
                                        }
                                    }
                                    return jon.a;
                                }
                                jqh2 = jqh.a;
                                n2 = this.a;
                                if (n2 == 0) break block15;
                                if (n2 == 1) break block16;
                                jns.ak(object);
                                break block17;
                            }
                            jns.ak(object);
                            break block18;
                        }
                        jns.ak(object);
                        Object object4 = this.c;
                        object = this.b;
                        object2 = this.d;
                        this.a = 1;
                        Object object5 = (dhl)object4;
                        object4 = ((dhl)object5).b;
                        n2 = bim.a;
                        object4 = (bhd)object4;
                        if (((bhd)object4).r && Build.VERSION.SDK_INT < 31) {
                            Object object6 = ((dhl)object5).j;
                            object5 = ((dhl)object5).l;
                            object6 = ((czh)object6).c;
                            jse.d(object6, "taskExecutor.mainThreadExecutor");
                            object6 = jvf.k((Executor)object6);
                            object5 = (Context)object5;
                            object = object2 = jse.ae((jqf)object6, new biv((bbh)object, (bhd)object4, (baz)object2, (Context)object5, null, 1), this);
                            if (object2 != jqh.a) {
                                object = jon.a;
                            }
                        } else {
                            object = jon.a;
                        }
                        if (object == jqh2) break block19;
                    }
                    object = bdy.a;
                    bbi.a();
                    object = (bbh)this.b;
                    object2 = ((bbh)object).b();
                    this.a = 2;
                    object = object2 = bdy.a((hpn)object2, (bbh)object, this);
                    if (object2 != jqh2) break block17;
                }
                return jqh2;
            }
            return object;
        }
        jqh jqh4 = jqh.a;
        if (this.a != 0) {
            jns.ak(object);
        } else {
            jns.ak(object);
            Object object7 = this.b;
            Object object8 = this.c;
            object = this.d;
            object8 = (bhd)object8;
            object7 = ((bzb)object7).J((bhd)object8);
            object = new bey((bew)object, (bhd)object8);
            this.a = 1;
            if (object7.a((jyy)object, this) == jqh4) {
                return jqh4;
            }
        }
        return jon.a;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                object2 = ((jqm)this).c((jvb)object, (jqb)object2);
                object = jon.a;
                return ((bez)object2).a(object);
            }
            object2 = ((jqm)this).c((jvb)object, (jqb)object2);
            object = jon.a;
            return ((bez)object2).a(object);
        }
        object2 = ((jqm)this).c((jvb)object, (jqb)object2);
        object = jon.a;
        return ((bez)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.e;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object2 = this.d;
                Object object3 = this.b;
                object = this.c;
                return new bez((gpm)object2, object3, (jrk)object, jqb2, 2);
            }
            object = this.c;
            Object object4 = this.b;
            Object object5 = this.d;
            object4 = (bbh)object4;
            return new bez((dhl)object, (bbh)object4, (baz)object5, jqb2, 1);
        }
        object = this.b;
        Object object6 = this.c;
        Object object7 = this.d;
        object6 = (bhd)object6;
        return new bez((bzb)object, (bhd)object6, (bew)object7, jqb2, 0);
    }
}

