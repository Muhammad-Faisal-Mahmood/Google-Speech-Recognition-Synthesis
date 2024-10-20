/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.function.Consumer$_CC;
import j$.util.stream.B0;
import j$.util.stream.I;
import j$.util.stream.J0;
import java.util.function.Consumer;

public final class S0
implements B0 {
    public final int a;
    public final Consumer b;

    public /* synthetic */ S0(Consumer consumer, int n2) {
        this.a = n2;
        this.b = consumer;
    }

    private final /* synthetic */ void a(long l2) {
    }

    private final /* synthetic */ void b(long l2) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void g() {
    }

    @Override
    public final /* synthetic */ void accept(int n2) {
        switch (this.a) {
            default: {
                I.c();
                throw null;
            }
            case 0: 
        }
        I.c();
        throw null;
    }

    public final void accept(Object object) {
        switch (this.a) {
            default: {
                this.b.accept(object);
                return;
            }
            case 0: 
        }
        ((J0)this.b).accept(object);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            default: {
                return Consumer$_CC.$default$andThen(this, consumer);
            }
            case 0: 
        }
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final /* synthetic */ void c() {
        int n2 = this.a;
    }

    @Override
    public final /* synthetic */ void e(long l2) {
        int n2 = this.a;
    }

    @Override
    public final /* synthetic */ boolean j() {
        switch (this.a) {
            default: {
                return false;
            }
            case 0: 
        }
        return false;
    }
}

