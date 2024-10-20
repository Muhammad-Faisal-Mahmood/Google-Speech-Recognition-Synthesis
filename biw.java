/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

public final class biw
extends jqs
implements jro {
    Object a;
    Object b;
    int c;
    final bbh d;
    final bhd e;
    final bzb f;
    private Object g;

    public biw(bbh bbh2, bzb bzb2, bhd bhd2, jqb jqb2) {
        this.d = bbh2;
        this.f = bzb2;
        this.e = bhd2;
        super(2, jqb2);
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        Throwable throwable422;
        block15: {
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            block14: {
                block13: {
                    block12: {
                        block11: {
                            object6 = jqh.a;
                            if (this.c != 0) {
                                object5 = this.b;
                                Object object7 = this.a;
                                AtomicInteger atomicInteger = (AtomicInteger)this.g;
                                object6 = object5;
                                object4 = object5;
                                object3 = object7;
                                object2 = atomicInteger;
                                jns.ak(object /* !! */ );
                                object3 = object7;
                                object2 = atomicInteger;
                                break block11;
                            }
                            jns.ak(object /* !! */ );
                            object4 = (jvb)this.g;
                            object3 = new AtomicInteger(-256);
                            object5 = this.d;
                            object /* !! */  = this.f;
                            object2 = this.e;
                            object5 = ((bbh)object5).b();
                            object /* !! */  = jse.ah((jvb)object4, null, null, new biv((bzb)object /* !! */ , (bhd)object2, (AtomicInteger)object3, (hpn)object5, null, 0), 3);
                            this.g = object3;
                            this.a = object5;
                            this.b = object /* !! */ ;
                            this.c = 1;
                            object2 = kt.f((hpn)object5, this);
                            if (object2 == object6) break block12;
                            object6 = object /* !! */ ;
                            object /* !! */  = object2;
                            object2 = object3;
                            object3 = object5;
                            object5 = object6;
                        }
                        object6 = object5;
                        object4 = object5;
                        try {
                            object /* !! */  = (AmbientLifecycleObserverKt)object /* !! */ ;
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                        catch (CancellationException cancellationException) {
                            break block14;
                        }
                        jvf.j((jwi)object5);
                        return object /* !! */ ;
                    }
                    return object6;
                    catch (Throwable throwable3) {
                        object6 = object /* !! */ ;
                    }
                }
                object /* !! */  = object6;
                try {
                    void var3_8;
                    object3 = bjc.a;
                    object /* !! */  = object6;
                    object3 = this.d;
                    object /* !! */  = object6;
                    bbi.a();
                    object /* !! */  = object6;
                    Objects.toString(object3.getClass());
                    object /* !! */  = object6;
                    throw var3_8;
                }
                catch (Throwable throwable422) {}
                break block15;
                catch (CancellationException cancellationException) {
                    object2 = object3;
                    object3 = object5;
                    object5 = cancellationException;
                    object4 = object /* !! */ ;
                }
            }
            object /* !! */  = object4;
            object6 = bjc.a;
            object /* !! */  = object4;
            object6 = this.d;
            object /* !! */  = object4;
            bbi.a();
            object /* !! */  = object4;
            Objects.toString(object6.getClass());
            object /* !! */  = object4;
            int n2 = ((AtomicInteger)object2).get();
            object /* !! */  = object4;
            if (object3.isCancelled() && n2 != -256) {
                object /* !! */  = object4;
                object /* !! */  = object4;
                object5 = new bit(((AtomicInteger)object2).get());
                object /* !! */  = object4;
                throw object5;
            }
            object /* !! */  = object4;
            throw object5;
        }
        jvf.j((jwi)object /* !! */ );
        throw throwable422;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        jqb2 = new biw(this.d, this.f, this.e, jqb2);
        ((biw)jqb2).g = object;
        return jqb2;
    }
}

