/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class qf {
    public HashSet a = null;
    public int b;
    public boolean c;
    public final qg d;
    public qf e;
    public int f = 0;
    int g = Integer.MIN_VALUE;
    public qb h;
    public final int i;

    public qf(qg qg2, int n2) {
        this.d = qg2;
        this.i = n2;
    }

    public final int a() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int b() {
        qf qf2;
        if (this.d.ah == 8) {
            return 0;
        }
        int n2 = this.g;
        if (n2 != Integer.MIN_VALUE && (qf2 = this.e) != null && qf2.d.ah == 8) {
            return n2;
        }
        return this.f;
    }

    public final void c(int n2, ArrayList arrayList, qz qz2) {
        Object object = this.a;
        if (object != null) {
            object = ((HashSet)object).iterator();
            while (object.hasNext()) {
                ki.h(((qf)object.next()).d, n2, arrayList, qz2);
            }
        }
    }

    public final void d() {
        Object object = this.e;
        if (object != null && (object = ((qf)object).a) != null) {
            ((HashSet)object).remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void e(int n2) {
        this.b = n2;
        this.c = true;
    }

    public final boolean f() {
        Object object = this.a;
        if (object == null) {
            return false;
        }
        Iterator iterator = ((HashSet)object).iterator();
        while (iterator.hasNext()) {
            object = (qf)iterator.next();
            int n2 = ((qf)object).i - 1;
            object = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? null : ((qf)object).d.K) : ((qf)object).d.J) : ((qf)object).d.M) : ((qf)object).d.L;
            if (!((qf)object).h()) continue;
            return true;
        }
        return false;
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        return hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i() {
        qb qb2 = this.h;
        if (qb2 == null) {
            this.h = new qb(1);
            return;
        }
        qb2.c();
    }

    public final void j(qf object, int n2, int n3) {
        if (object == null) {
            this.d();
            return;
        }
        this.e = object;
        if (((qf)object).a == null) {
            ((qf)object).a = new HashSet();
        }
        if ((object = this.e.a) != null) {
            ((HashSet)object).add(this);
        }
        this.f = n2;
        this.g = n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d.ai);
        stringBuilder.append(":");
        stringBuilder.append(a.a(this.i));
        return stringBuilder.toString();
    }
}

