/*
 * Decompiled with CFR 0.152.
 */
package j$.util.stream;

import j$.util.function.Consumer$_CC;
import j$.util.stream.H;
import j$.util.stream.I;
import j$.util.stream.L;
import j$.util.stream.N;
import java.util.Arrays;
import java.util.function.Consumer;

final class U
extends N
implements H {
    @Override
    public final /* synthetic */ void accept(int n2) {
        I.c();
        throw null;
    }

    public final void accept(Object object) {
        int n2 = this.b;
        Object[] objectArray = this.a;
        if (n2 < objectArray.length) {
            this.b = 1 + n2;
            objectArray[n2] = object;
            return;
        }
        throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", objectArray.length));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$_CC.$default$andThen(this, consumer);
    }

    @Override
    public final void c() {
        int n2 = this.b;
        Object[] objectArray = this.a;
        if (n2 >= objectArray.length) {
            return;
        }
        throw new IllegalStateException(String.format("End size %d is less than fixed size %d", this.b, objectArray.length));
    }

    @Override
    public final void e(long l2) {
        Object[] objectArray = this.a;
        if (l2 == (long)objectArray.length) {
            this.b = 0;
            return;
        }
        throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", l2, objectArray.length));
    }

    @Override
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override
    public final L p() {
        int n2 = this.b;
        Object[] objectArray = this.a;
        if (n2 >= objectArray.length) {
            return this;
        }
        throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", this.b, objectArray.length));
    }

    @Override
    public final String toString() {
        Object[] objectArray = this.a;
        return String.format("FixedNodeBuilder[%d][%s]", objectArray.length - this.b, Arrays.toString(objectArray));
    }
}

