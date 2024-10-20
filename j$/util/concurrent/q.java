/*
 * Decompiled with CFR 0.152.
 */
package j$.util.concurrent;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.g;
import j$.util.concurrent.l;
import j$.util.concurrent.p;
import j$.util.concurrent.r;

class q {
    l[] a;
    l b;
    p c;
    p d;
    int e;
    int f;
    int g;
    final int h;

    q(l[] lArray, int n2, int n3, int n4) {
        this.a = lArray;
        this.h = n2;
        this.e = n3;
        this.f = n3;
        this.g = n4;
        this.b = null;
    }

    final l c() {
        Object object;
        Object object2 = object = this.b;
        if (object != null) {
            object2 = object.d;
        }
        while (true) {
            int n2;
            int n3;
            if (object2 != null) {
                this.b = object2;
                return object2;
            }
            if (this.f >= this.g || (object2 = this.a) == null || (n3 = ((l[])object2).length) <= (n2 = this.e) || n2 < 0) break;
            object = ConcurrentHashMap.k(object2, n2);
            if (object != null && object.a < 0) {
                if (object instanceof g) {
                    this.a = ((g)object).e;
                    object = this.d;
                    if (object != null) {
                        this.d = object.d;
                    } else {
                        object = new Object();
                    }
                    object.c = object2;
                    object.a = n3;
                    object.b = n2;
                    object.d = this.c;
                    this.c = object;
                    object2 = null;
                    continue;
                }
                object = object instanceof r ? ((r)object).f : null;
            }
            if (this.c != null) {
                p p2;
                while ((p2 = this.c) != null) {
                    int n4 = this.e;
                    n2 = p2.a;
                    this.e = n4 += n2;
                    if (n4 < n3) break;
                    this.e = p2.b;
                    this.a = p2.c;
                    p2.c = null;
                    object2 = p2.d;
                    p2.d = this.d;
                    this.c = object2;
                    this.d = p2;
                    n3 = n2;
                }
                object2 = object;
                if (p2 != null) continue;
                this.e = n2 = this.e + this.h;
                object2 = object;
                if (n2 < n3) continue;
                this.f = n3 = this.f + 1;
                this.e = n3;
                object2 = object;
                continue;
            }
            this.e = n2 += this.h;
            object2 = object;
            if (n2 < n3) continue;
            this.f = n3 = this.f + 1;
            this.e = n3;
            object2 = object;
        }
        this.b = null;
        return null;
    }
}

