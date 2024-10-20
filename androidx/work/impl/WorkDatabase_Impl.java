/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WorkDatabase_Impl
extends WorkDatabase {
    private volatile bhe j;
    private volatile bgc k;
    private volatile bhx l;
    private volatile bgn m;
    private volatile bgt n;
    private volatile bgw o;
    private volatile bgg p;
    private volatile bgj q;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bhx A() {
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l != null) return this.l;
            bhx bhx2 = new bia(this);
            this.l = bhx2;
            return this.l;
        }
    }

    @Override
    public final aue a() {
        return new aue(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override
    public final awp c(att att2) {
        Object object = new awm(att2, new bdl(this));
        awn awn2 = yi.h(att2.a);
        awn2.a = att2.b;
        awn2.b = object;
        object = awn2.a();
        return att2.c.a((duj)object);
    }

    @Override
    public final Map f() {
        HashMap hashMap = new HashMap();
        hashMap.put(bhe.class, Collections.emptyList());
        hashMap.put(bgc.class, Collections.emptyList());
        hashMap.put(bhx.class, Collections.emptyList());
        hashMap.put(bgn.class, Collections.emptyList());
        hashMap.put(bgt.class, Collections.emptyList());
        hashMap.put(bgw.class, Collections.emptyList());
        hashMap.put(bgg.class, Collections.emptyList());
        hashMap.put(bgj.class, Collections.emptyList());
        return hashMap;
    }

    @Override
    public final Set g() {
        return new HashSet();
    }

    @Override
    public final List r() {
        ArrayList<avp> arrayList = new ArrayList<avp>();
        arrayList.add(new bdd());
        arrayList.add(new bde());
        arrayList.add(new bdf());
        arrayList.add(new bdg());
        arrayList.add(new bdh());
        arrayList.add(new bdi());
        arrayList.add(new bdj());
        arrayList.add(new bdk());
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bgc t() {
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k != null) return this.k;
            bgc bgc2 = new bge(this);
            this.k = bgc2;
            return this.k;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bgg u() {
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p != null) return this.p;
            bgg bgg2 = new bgi(this);
            this.p = bgg2;
            return this.p;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bgj v() {
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            if (this.q != null) return this.q;
            bgj bgj2 = new bgl(this);
            this.q = bgj2;
            return this.q;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bgn w() {
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m != null) return this.m;
            bgn bgn2 = new bgr(this);
            this.m = bgn2;
            return this.m;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bgt x() {
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n != null) return this.n;
            bgt bgt2 = new bgv(this);
            this.n = bgt2;
            return this.n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bgw y() {
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o != null) return this.o;
            bgw bgw2 = new bha(this);
            this.o = bgw2;
            return this.o;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final bhe z() {
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j != null) return this.j;
            bhe bhe2 = new bhw(this);
            this.j = bhe2;
            return this.j;
        }
    }
}

