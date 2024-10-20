/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.nio.file.attribute.a;
import j$.util.function.Consumer$_CC;
import j$.util.stream.A0;
import j$.util.stream.I;
import j$.util.stream.I0;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public final class Q0
implements A0 {
    public final int a;
    public final IntConsumer b;

    public /* synthetic */ Q0(IntConsumer intConsumer, int n2) {
        this.a = n2;
        this.b = intConsumer;
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
    public final void accept(int n2) {
        switch (this.a) {
            default: {
                this.b.accept(n2);
                return;
            }
            case 0: 
        }
        ((I0)this.b).accept(n2);
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

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
            default: {
                return j$.nio.file.attribute.a.a(this, intConsumer);
            }
            case 0: 
        }
        return j$.nio.file.attribute.a.a(this, intConsumer);
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
    public final /* synthetic */ void f(Integer n2) {
        switch (this.a) {
            default: {
                I.e(this, n2);
                return;
            }
            case 0: 
        }
        I.e(this, n2);
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

