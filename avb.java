/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.ReentrantLock;

final class avb
extends jqs
implements jro {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    int f;
    int g;
    final avc h;
    final avk i;

    public avb(avc avc2, avk avk2, jqb jqb2) {
        this.h = avc2;
        this.i = avk2;
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
        block20: {
            int n2;
            Object object2;
            int n3;
            int n4;
            jqh jqh2 = jqh.a;
            int n5 = this.g;
            if (n5 != 0) {
                void var8_30;
                void var9_23;
                if (n5 != 1) {
                    n4 = this.f;
                    n5 = this.e;
                    n3 = this.d;
                    object2 = this.c;
                    Object object3 = this.b;
                    Object object4 = this.a;
                } else {
                    n4 = this.f;
                    n5 = this.e;
                    n3 = this.d;
                    object2 = this.c;
                    Object object5 = this.b;
                    Object object6 = this.a;
                }
                jns.ak(object);
                n2 = n3;
                n3 = n4;
                n4 = n2;
                void var1_2 = var9_23;
                void var9_24 = var8_30;
                Object object7 = object2;
            } else {
                jns.ak(object);
                avc avc2 = this.h;
                n5 = avc.g;
                object2 = avc2.e;
                ReentrantLock reentrantLock = (ReentrantLock)((ggv)object2).d;
                reentrantLock.lock();
                try {
                    void var1_12;
                    boolean bl2 = ((ggv)object2).a;
                    n4 = 0;
                    if (!bl2) {
                        reentrantLock.unlock();
                        Object var1_4 = null;
                    } else {
                        ((ggv)object2).a = false;
                        aug[] augArray = new aug[7];
                        for (n5 = 0; n5 < 7; ++n5) {
                            void var1_10;
                            Object object8;
                            bl2 = ((long[])((ggv)object2).b)[n5] > 0L;
                            if (bl2 != ((boolean[])(object8 = ((ggv)object2).c))[n5]) {
                                ((boolean[])object8)[n5] = bl2;
                                if (bl2) {
                                    aug aug2 = aug.b;
                                } else {
                                    aug aug3 = aug.c;
                                }
                            } else {
                                aug aug4 = aug.a;
                            }
                            augArray[n5] = var1_10;
                        }
                        reentrantLock.unlock();
                        aug[] augArray2 = augArray;
                    }
                    if (var1_12 == null) break block20;
                    object2 = this.h;
                    avk avk2 = this.i;
                    void var9_26 = var1_12;
                    Object object9 = object2;
                    n3 = 7;
                }
                catch (Throwable throwable) {
                    reentrantLock.unlock();
                    throw throwable;
                }
            }
            for (n5 = 0; n5 < n3; ++n5) {
                block23: {
                    block22: {
                        void var8_34;
                        void var1_14;
                        int n6;
                        void var9_27;
                        block21: {
                            object2 = ((aug[])var9_27)[n5];
                            n2 = n4 + 1;
                            n6 = ((Enum)object2).ordinal();
                            if (n6 == 1) break block21;
                            if (n6 != 2) break block22;
                            this.a = var9_27;
                            this.b = var1_14;
                            this.c = var8_34;
                            this.d = n2;
                            this.e = n5;
                            this.f = n3;
                            this.g = 2;
                            n6 = avc.g;
                            if (((avc)var1_14).d((aui)var8_34, n4, this) == jqh2) break block23;
                            break block22;
                        }
                        this.a = var9_27;
                        this.b = var1_14;
                        this.c = var8_34;
                        this.d = n2;
                        this.e = n5;
                        this.f = n3;
                        this.g = 1;
                        n6 = avc.g;
                        if (((avc)var1_14).c((aui)var8_34, n4, this) == jqh2) break block23;
                    }
                    n4 = n2;
                    continue;
                }
                return jqh2;
            }
        }
        return jon.a;
    }

    @Override
    public final jqb c(Object object, jqb jqb2) {
        return new avb(this.h, this.i, jqb2);
    }
}

