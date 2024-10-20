/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.stream.B0;
import j$.util.stream.b_0;
import j$.util.stream.u0_0;
import j$.util.stream.w_0;
import j$.util.stream.x_0;
import j$.util.stream.z0;
import java.util.HashSet;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/*
 * Renamed from j$.util.stream.l
 */
final class l_0
extends z0 {
    public final int b;
    Object c;

    public /* synthetic */ l_0(B0 b0) {
        this.b = 0;
        super(b0);
    }

    public /* synthetic */ l_0(b_0 b_02, B0 b0, int n2) {
        this.b = n2;
        this.c = b_02;
        super(b0);
    }

    public final void accept(Object object) {
        switch (this.b) {
            default: {
                int n2 = ((ToIntFunction)((x_0)this.c).l).applyAsInt(object);
                this.a.accept(n2);
                return;
            }
            case 2: {
                object = ((u0_0)this.c).m.apply(object);
                this.a.accept(object);
                return;
            }
            case 1: {
                if (((Predicate)((w_0)this.c).m).test(object)) {
                    this.a.accept(object);
                }
                return;
            }
            case 0: 
        }
        if (!((HashSet)this.c).contains(object)) {
            ((HashSet)this.c).add(object);
            this.a.accept(object);
        }
    }

    @Override
    public void c() {
        switch (this.b) {
            default: {
                super.c();
                return;
            }
            case 0: 
        }
        this.c = null;
        this.a.c();
    }

    @Override
    public void e(long l2) {
        switch (this.b) {
            default: {
                super.e(l2);
                return;
            }
            case 1: {
                this.a.e(-1L);
                return;
            }
            case 0: 
        }
        this.c = new HashSet();
        this.a.e(-1L);
    }
}

