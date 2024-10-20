/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ewd
extends jqs
implements jro {
    int a;
    final ewg b;
    Object c;
    Object d;
    Object e;
    private Object f;

    public ewd(jqb jqb2, ewg ewg2) {
        this.b = ewg2;
        super(2, jqb2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        Object object2;
        block41: {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            jqh jqh2;
            block40: {
                block39: {
                    block32: {
                        block31: {
                            Object object7;
                            Object object8;
                            block38: {
                                block34: {
                                    Object object9;
                                    Object object10;
                                    block33: {
                                        block37: {
                                            Throwable throwable4;
                                            block36: {
                                                block35: {
                                                    jqh2 = jqh.a;
                                                    int n2 = this.a;
                                                    if (n2 != 0) {
                                                        if (n2 != 1) {
                                                            if (n2 != 2) {
                                                                if (n2 != 3) {
                                                                    jns.ak(object);
                                                                    return jon.a;
                                                                }
                                                                object6 = (List)this.c;
                                                                object5 = (jvb)this.f;
                                                                object4 = object6;
                                                                object3 = object5;
                                                                try {
                                                                    jns.ak(object);
                                                                    object2 = object;
                                                                    object = object5;
                                                                    break block31;
                                                                }
                                                                catch (Throwable throwable2) {
                                                                    object = object3;
                                                                    break block32;
                                                                }
                                                            }
                                                            object4 = this.e;
                                                            object6 = this.d;
                                                            object3 = (eaj)this.c;
                                                            object10 = (jvb)this.f;
                                                            object8 = object4;
                                                            object7 = object6;
                                                            object2 = object3;
                                                            object5 = object10;
                                                            try {
                                                                jns.ak(object);
                                                                object9 = object;
                                                                object = object10;
                                                                break block33;
                                                            }
                                                            catch (Throwable throwable3) {
                                                                object6 = object7;
                                                                object3 = object2;
                                                                object = object5;
                                                                break block34;
                                                            }
                                                        }
                                                        object2 = this.d;
                                                        object5 = (eaj)this.c;
                                                        object7 = (jvb)this.f;
                                                        object6 = object2;
                                                        object3 = object5;
                                                        object4 = object7;
                                                        try {
                                                            jns.ak(object);
                                                            object8 = object;
                                                            object = object7;
                                                            break block35;
                                                        }
                                                        catch (Throwable throwable4) {
                                                            break block36;
                                                        }
                                                    }
                                                    jns.ak(object);
                                                    object = (jvb)this.f;
                                                    object4 = this.b;
                                                    if (((ewg)object4).d < 0L) {
                                                        object5 = null;
                                                    } else {
                                                        object6 = ((ewg)object4).i;
                                                        object3 = dww.m(efx.a.l());
                                                        object2 = ((ewg)object4).g;
                                                        object5 = (hwp)((hwv)object2).C(5);
                                                        ((hwp)object5).x((hwv)object2);
                                                        object5 = dpf.k((hwp)object5);
                                                        ((dlm)object5).l(true);
                                                        ((dlm)object5).k(9);
                                                        ((cxt)object3).o(((dlm)object5).i());
                                                        long l2 = ((ewg)object4).d;
                                                        object4 = (hwp)((cxt)object3).a;
                                                        if (!((hwp)object4).b.B()) {
                                                            ((hwp)object4).u();
                                                        }
                                                        n2 = (int)l2;
                                                        object4 = (efx)((hwp)object4).b;
                                                        ((efx)object4).b |= 0x40;
                                                        ((efx)object4).k = n2;
                                                        object5 = ((emg)object6).a(((cxt)object3).n(), null);
                                                    }
                                                    object6 = object2 = new eop(object5, 15);
                                                    object3 = object5;
                                                    object4 = object;
                                                    {
                                                        object7 = this.b.f;
                                                        object6 = object2;
                                                        object3 = object5;
                                                        object4 = object;
                                                        this.f = object;
                                                        object6 = object2;
                                                        object3 = object5;
                                                        object4 = object;
                                                        this.c = object5;
                                                        object6 = object2;
                                                        object3 = object5;
                                                        object4 = object;
                                                        this.d = object2;
                                                        object6 = object2;
                                                        object3 = object5;
                                                        object4 = object;
                                                        this.a = 1;
                                                        object6 = object2;
                                                        object3 = object5;
                                                        object4 = object;
                                                        object8 = jsd.l((hpn)object7, this);
                                                        if (object8 == jqh2) return jqh2;
                                                    }
                                                }
                                                object6 = object2;
                                                object3 = object5;
                                                object4 = object;
                                                {
                                                    object4 = object7 = (ecp)object8;
                                                    object6 = object2;
                                                    object3 = object5;
                                                    break block37;
                                                }
                                            }
                                            object5 = jns.aj(throwable4);
                                            object = object4;
                                            object4 = object5;
                                        }
                                        object5 = object4;
                                        if (object4 instanceof jod) {
                                            object5 = null;
                                        }
                                        object8 = (ecp)object5;
                                        {
                                            object4 = this.b.e;
                                            this.f = object;
                                            this.c = object3;
                                            this.d = object6;
                                            this.e = object8;
                                            this.a = 2;
                                            object9 = jsd.l((hpn)object4, this);
                                            if (object9 == jqh2) {
                                                return jqh2;
                                            }
                                            object4 = object8;
                                        }
                                    }
                                    object8 = object4;
                                    object7 = object6;
                                    object2 = object3;
                                    object5 = object;
                                    {
                                        object5 = object10 = (efs)object9;
                                        object2 = object6;
                                        break block38;
                                    }
                                }
                                object5 = jns.aj((Throwable)object4);
                                object2 = object6;
                                object4 = object8;
                            }
                            object6 = object5;
                            if (object5 instanceof jod) {
                                object6 = null;
                            }
                            object5 = (efs)object6;
                            if (object4 == null || object5 == null) break block41;
                            object6 = new ArrayList<jwi>();
                            if (object4.b().g()) {
                                object7 = jqg.a;
                                object8 = jvc.a;
                                object6.add(jse.af((jvb)object, fxf.ay((jqf)object7), (jvc)((Object)object8), new ewe(null, this.b, (efs)object5, (ecp)object4, (jqz)object2, 0)));
                            } else if (object4.a().g()) {
                                object7 = jqg.a;
                                object8 = jvc.a;
                                object6.add(jse.af((jvb)object, fxf.ay((jqf)object7), (jvc)((Object)object8), new ewe(null, this.b, (jqz)object2, (efs)object5, (ecp)object4, 2)));
                            }
                            if (object4.d().g()) {
                                object5 = jqg.a;
                                object2 = jvc.a;
                                object6.add(jse.af((jvb)object, fxf.ay((jqf)object5), (jvc)((Object)object2), new eof(null, this.b, (ecp)object4, 5)));
                            }
                            if (object3 != null) {
                                try {
                                    object3 = object3.c();
                                    if (object3 == null) break block39;
                                    this.f = object;
                                    this.c = object6;
                                    this.d = null;
                                    this.e = null;
                                    this.a = 3;
                                    object2 = jsd.l((hpn)object3, this);
                                    if (object2 == jqh2) return jqh2;
                                }
                                catch (Throwable throwable) {
                                    object4 = object6;
                                    object6 = throwable;
                                    break block32;
                                }
                            }
                            break block39;
                        }
                        object4 = object6;
                        object3 = object;
                        {
                            object3 = object5 = (eah)object2;
                            break block40;
                        }
                    }
                    object3 = jns.aj((Throwable)object6);
                    object6 = object4;
                    break block40;
                }
                object3 = null;
            }
            object4 = object3;
            if (object3 instanceof jod) {
                object4 = null;
            }
            if ((object3 = (eah)object4) != null && object3.b().g()) {
                object4 = jqg.a;
                object5 = jvc.a;
                object6.add(jse.af((jvb)object, fxf.ay((jqf)object4), (jvc)((Object)object5), new eof(null, this.b, (eah)object3, 6)));
            }
            this.f = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.a = 4;
            if (jse.ai((Collection)object6, this) != jqh2) return jon.a;
            return jqh2;
        }
        object2.a();
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new ewd(jqb2, this.b);
        ((ewd)jqb2).f = object;
        return jqb2;
    }
}

