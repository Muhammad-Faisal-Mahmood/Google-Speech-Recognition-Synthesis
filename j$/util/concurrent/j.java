/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.Spliterator;
import j$.util.concurrent.l;
import j$.util.concurrent.q;
import j$.util.z;
import java.util.Comparator;
import java.util.function.Consumer;

final class j
extends q
implements Spliterator {
    public final int i;
    long j;

    public /* synthetic */ j(l[] lArray, int n2, int n3, int n4, long l2, int n5) {
        this.i = n5;
        super(lArray, n2, n3, n4);
        this.j = l2;
    }

    @Override
    public final int a() {
        switch (this.i) {
            default: {
                return 4352;
            }
            case 0: 
        }
        return 4353;
    }

    @Override
    public final Spliterator b() {
        Object object;
        switch (this.i) {
            default: {
                Object object2;
                int n2 = this.f;
                int n3 = this.g;
                int n4 = n2 + n3 >>> 1;
                if (n4 <= n2) {
                    object2 = null;
                } else {
                    long l2;
                    object2 = this.a;
                    this.g = n4;
                    this.j = l2 = this.j >>> 1;
                    object2 = new j((l[])object2, this.h, n4, n3, l2, 1);
                }
                return object2;
            }
            case 0: 
        }
        int n5 = this.f;
        int n6 = this.g;
        int n7 = n5 + n6 >>> 1;
        if (n7 <= n5) {
            object = null;
        } else {
            long l3;
            object = this.a;
            this.g = n7;
            this.j = l3 = this.j >>> 1;
            object = new j((l[])object, this.h, n7, n6, l3, 0);
        }
        return object;
    }

    @Override
    public final long d() {
        switch (this.i) {
            default: {
                return this.j;
            }
            case 0: 
        }
        return this.j;
    }

    @Override
    public final void forEachRemaining(Consumer consumer) {
        l l2;
        switch (this.i) {
            default: {
                l l3;
                consumer.getClass();
                while ((l3 = this.c()) != null) {
                    consumer.accept(l3.c);
                }
                return;
            }
            case 0: 
        }
        consumer.getClass();
        while ((l2 = this.c()) != null) {
            consumer.accept(l2.b);
        }
    }

    @Override
    public final /* synthetic */ boolean k(int n2) {
        switch (this.i) {
            default: {
                return z.f(this, n2);
            }
            case 0: 
        }
        return z.f(this, n2);
    }

    @Override
    public final /* synthetic */ long l() {
        switch (this.i) {
            default: {
                return z.e(this);
            }
            case 0: 
        }
        return z.e(this);
    }

    @Override
    public final Comparator m() {
        switch (this.i) {
            default: {
                throw new IllegalStateException();
            }
            case 0: 
        }
        throw new IllegalStateException();
    }

    @Override
    public final boolean o(Consumer consumer) {
        boolean bl2;
        switch (this.i) {
            default: {
                boolean bl3;
                consumer.getClass();
                l l2 = this.c();
                if (l2 == null) {
                    bl3 = false;
                } else {
                    consumer.accept(l2.c);
                    bl3 = true;
                }
                return bl3;
            }
            case 0: 
        }
        consumer.getClass();
        l l3 = this.c();
        if (l3 == null) {
            bl2 = false;
        } else {
            consumer.accept(l3.b);
            bl2 = true;
        }
        return bl2;
    }
}

