/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.SQLException
 */
import android.database.SQLException;
import java.util.Objects;
import java.util.Set;

/*
 * Renamed from aux
 */
public final class aux_
extends jqs
implements jro {
    int a;
    Object b;
    final Object c;
    private final int d;

    public aux_(avc avc2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = avc2;
        super(2, jqb2);
    }

    public aux_(avc avc2, jqb jqb2, int n2, byte[] byArray) {
        this.d = n2;
        this.c = avc2;
        super(2, jqb2);
    }

    public aux_(avc avc2, jqb jqb2, int n2, char[] cArray) {
        this.d = n2;
        this.c = avc2;
        super(2, jqb2);
    }

    public aux_(bfc bfc2, jqb jqb2, int n2) {
        this.d = n2;
        this.c = bfc2;
        super(2, jqb2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        void jpc3;
        block21: {
            void jqh6;
            Object object5;
            int n2 = this.d;
            if (n2 != 0) {
                void object6;
                if (n2 != 1) {
                    void object4;
                    avk jqh2;
                    if (n2 != 2) {
                        jqh jqh3 = jqh.a;
                        n2 = this.a;
                        jns.ak(object);
                        if (n2 != 0) {
                            return jon.a;
                        }
                        jyh jyh2 = (jyh)this.b;
                        bmm bmm2 = new bmm((bfc)this.c, jyh2);
                        bfs bfs2 = ((bfc)this.c).a;
                        Object object2 = bfs2.b;
                        synchronized (object2) {
                            if (bfs2.c.add(bmm2)) {
                                if (bfs2.c.size() == 1) {
                                    bfs2.d = bfs2.b();
                                    bbi.a();
                                    n2 = bft.a;
                                    bfs2.getClass().getSimpleName();
                                    Objects.toString(bfs2.d);
                                    bfs2.d();
                                }
                                bmm2.a(bfs2.d);
                            }
                        }
                        object2 = new bfb(this.c, bmm2, 0);
                        this.a = 1;
                        if (jns.am(jyh2, (jqz)object2, this) != jqh3) return jon.a;
                        return jqh3;
                    }
                    jqh object3 = jqh.a;
                    n2 = this.a;
                    if (n2 != 0) {
                        if (n2 != 1) {
                            jns.ak(object);
                            return jon.a;
                        }
                        jqh2 = (avk)this.b;
                        jns.ak(object);
                    } else {
                        jns.ak(object);
                        jqh2 = (avk)this.b;
                        this.b = jqh2;
                        this.a = 1;
                        Object throwable = jqh2.b();
                        if (throwable == object3) return object3;
                    }
                    if ((Boolean)object4 != false) return jon.a;
                    avb avb2 = new avb((avc)this.c, jqh2, null);
                    this.b = null;
                    this.a = 2;
                    if (jqh2.c(2, avb2, this) != object3) return jon.a;
                    return object3;
                }
                jqh jqh3 = jqh.a;
                if (this.a != 0) {
                    jns.ak(object);
                    return object6;
                }
                jns.ak(object);
                avi avb2 = (avi)this.b;
                Object avk2 = this.c;
                this.a = 1;
                Object avi2 = avk2 = ((avc)avk2).a(avb2, this);
                if (avk2 != jqh3) return object6;
                return jqh3;
            }
            jqh jqh4 = jqh.a;
            n2 = this.a;
            if (n2 != 0) {
                if (n2 != 1) {
                    jns.ak(object);
                    break block21;
                }
                object5 = (avk)this.b;
                jns.ak(object);
            } else {
                Object bmm2;
                jns.ak(object);
                this.b = object5 = (avk)this.b;
                this.a = 1;
                Object object3 = bmm2 = ((avk)object5).b();
                if (bmm2 == jqh4) {
                    jqh object8 = jqh4;
                    return jpc3;
                }
            }
            if (((Boolean)jqh6).booleanValue()) {
                jpc jpc2 = jpc.a;
                return jpc3;
            }
            aux_ jpc2 = new aux_((avc)this.c, null, 1, null);
            this.b = null;
            this.a = 2;
            Object aux_2 = object5 = ((avk)object5).c(2, jpc2, this);
            if (object5 != jqh4) break block21;
            jqh object9 = jqh4;
            return jpc3;
        }
        try {
            void jqh7;
            Set set = (Set)jqh7;
            return jpc3;
        }
        catch (SQLException set) {
            jpc sQLException = jpc.a;
        }
        return jpc3;
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    object = ((jqm)this).c((jyh)object, (jqb)object2);
                    object2 = jon.a;
                    return ((aux_)object).a(object2);
                }
                object2 = ((jqm)this).c((avk)object, (jqb)object2);
                object = jon.a;
                return ((aux_)object2).a(object);
            }
            object = ((jqm)this).c((avi)object, (jqb)object2);
            object2 = jon.a;
            return ((aux_)object).a(object2);
        }
        object2 = ((jqm)this).c((avk)object, (jqb)object2);
        object = jon.a;
        return ((aux_)object2).a(object);
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    jqb2 = new aux_((bfc)this.c, jqb2, 3);
                    ((aux_)jqb2).b = object;
                    return jqb2;
                }
                jqb2 = new aux_((avc)this.c, jqb2, 2, null);
                ((aux_)jqb2).b = object;
                return jqb2;
            }
            jqb2 = new aux_((avc)this.c, jqb2, 1, null);
            ((aux_)jqb2).b = object;
            return jqb2;
        }
        jqb2 = new aux_((avc)this.c, jqb2, 0);
        ((aux_)jqb2).b = object;
        return jqb2;
    }
}

