/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.a_0;
import j$.util.concurrent.l;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class h
extends a_0
implements Iterator,
Enumeration {
    public final int k;

    public /* synthetic */ h(l[] lArray, int n2, int n3, ConcurrentHashMap concurrentHashMap, int n4) {
        this.k = n4;
        super(lArray, n2, n3, concurrentHashMap);
    }

    public final Object next() {
        switch (this.k) {
            default: {
                l l2 = this.b;
                if (l2 != null) {
                    Object object = l2.c;
                    this.j = l2;
                    this.c();
                    return object;
                }
                throw new NoSuchElementException();
            }
            case 0: 
        }
        l l3 = this.b;
        if (l3 != null) {
            this.j = l3;
            this.c();
            return l3.b;
        }
        throw new NoSuchElementException();
    }

    public final Object nextElement() {
        switch (this.k) {
            default: {
                return this.next();
            }
            case 0: 
        }
        return this.next();
    }
}

