/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class jhy {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    public final int e;
    final jib f;
    final boolean g;
    final boolean h;

    public jhy(List list, Collection collection, Collection collection2, jib jib2, boolean bl2, boolean bl3, boolean bl4, int n2) {
        block4: {
            block3: {
                this.b = list;
                a.s(collection, "drainedSubstreams");
                this.c = collection;
                this.f = jib2;
                this.d = collection2;
                this.g = bl2;
                this.a = bl3;
                this.h = bl4;
                this.e = n2;
                boolean bl5 = false;
                bl4 = !bl3 || list == null;
                fxf.B(bl4, "passThrough should imply buffer is null");
                bl4 = !bl3 || jib2 != null;
                fxf.B(bl4, "passThrough should imply winningSubstream != null");
                bl3 = !bl3 || collection.size() == 1 && collection.contains(jib2) || collection.size() == 0 && jib2.b;
                fxf.B(bl3, "passThrough should imply winningSubstream is drained");
                if (!bl2) break block3;
                bl2 = bl5;
                if (jib2 == null) break block4;
            }
            bl2 = true;
        }
        fxf.B(bl2, "cancelled should imply committed");
    }

    final jhy a(jib collection) {
        fxf.B(this.h ^ true, "hedging frozen");
        boolean bl2 = this.f == null;
        fxf.B(bl2, "already committed");
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            collection = Collections.singleton(collection);
        } else {
            arrayList = new ArrayList(arrayList);
            arrayList.add(collection);
            collection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        int n2 = this.e;
        return new jhy(this.b, this.c, collection, this.f, this.g, this.a, this.h, n2 + 1);
    }

    final jhy b() {
        if (this.h) {
            return this;
        }
        return new jhy(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    final jhy c(jib jib2) {
        Collection<jib> collection;
        boolean bl2 = this.a;
        boolean bl3 = true;
        fxf.B(bl2 ^ true, "Already passThrough");
        if (jib2.b) {
            collection = this.c;
        } else if (this.c.isEmpty()) {
            collection = Collections.singletonList(jib2);
        } else {
            collection = new ArrayList<jib>(this.c);
            collection.add(jib2);
            collection = DesugarCollections.unmodifiableCollection(collection);
        }
        jib jib3 = this.f;
        bl2 = jib3 != null;
        List list = this.b;
        if (bl2) {
            if (jib3 != jib2) {
                bl3 = false;
            }
            fxf.B(bl3, "Another RPC attempt has already committed");
            list = null;
        }
        return new jhy(list, collection, this.d, this.f, this.g, bl2, this.h, this.e);
    }
}

