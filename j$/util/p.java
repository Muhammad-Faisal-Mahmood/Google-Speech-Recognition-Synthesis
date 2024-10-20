/*
 * Decompiled with CFR 0.152.
 */
package j$.util;

import j$.util.Collection$_EL;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.i_0;
import j$.util.m_0;
import j$.util.n;
import j$.util.o;
import j$.util.s;
import j$.util.stream.I;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

final class p
extends s {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        object = new n((Map.Entry)object);
        return this.a.contains(object);
    }

    @Override
    public final boolean containsAll(Collection object) {
        object = object.iterator();
        while (object.hasNext()) {
            if (this.contains(object.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        if ((object = (Set)object).size() != this.a.size()) {
            return false;
        }
        return this.containsAll((Collection)object);
    }

    @Override
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        consumer = new m_0(consumer);
        Collection$_EL.forEach(this.a, consumer);
    }

    @Override
    public final Iterator iterator() {
        return new i_0(this);
    }

    @Override
    public final Stream parallelStream() {
        return I.o(this.spliterator(), true);
    }

    @Override
    public final Spliterator spliterator() {
        return new o(Collection$_EL.b(this.a));
    }

    @Override
    public final Stream stream() {
        return I.o(this.spliterator(), false);
    }

    @Override
    public final Object[] toArray() {
        Object[] objectArray = this.a.toArray();
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            objectArray[i2] = new n((Map.Entry)objectArray[i2]);
        }
        return objectArray;
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        Object[] objectArray2 = objectArray.length == 0 ? objectArray : Arrays.copyOf(objectArray, 0);
        objectArray2 = this.a.toArray(objectArray2);
        for (int i2 = 0; i2 < objectArray2.length; ++i2) {
            objectArray2[i2] = new n((Map.Entry)objectArray2[i2]);
        }
        if (objectArray2.length > objectArray.length) {
            return objectArray2;
        }
        System.arraycopy(objectArray2, 0, objectArray, 0, objectArray2.length);
        if (objectArray.length > objectArray2.length) {
            objectArray[objectArray2.length] = null;
        }
        return objectArray;
    }
}

