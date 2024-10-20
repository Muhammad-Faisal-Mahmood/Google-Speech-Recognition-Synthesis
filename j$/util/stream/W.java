/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.nio.file.attribute.a;
import j$.util.function.Consumer$_CC;
import j$.util.stream.A0;
import j$.util.stream.H;
import j$.util.stream.I;
import j$.util.stream.L;
import j$.util.stream.V;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class W
extends V
implements H,
A0 {
    @Override
    public final void accept(int n2) {
        int n3 = this.b;
        int[] nArray = this.a;
        if (n3 < nArray.length) {
            this.b = 1 + n3;
            nArray[n3] = n2;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", nArray.length));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.nio.file.attribute.a.a(this, intConsumer);
    }

    @Override
    public final void c() {
        int n2 = this.b;
        int[] nArray = this.a;
        if (n2 >= nArray.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", this.b, nArray.length));
    }

    @Override
    public final void e(long l2) {
        int[] nArray = this.a;
        if (l2 == (long)nArray.length) {
            this.b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", l2, nArray.length));
    }

    @Override
    public final /* synthetic */ void f(Integer n2) {
        I.e(this, n2);
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override
    public final L p() {
        int n2 = this.b;
        int[] nArray = this.a;
        if (n2 >= nArray.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", this.b, nArray.length));
    }

    @Override
    public final String toString() {
        int[] nArray = this.a;
        return String.format("IntFixedNodeBuilder[%d][%s]", nArray.length - this.b, Arrays.toString(nArray));
    }
}

