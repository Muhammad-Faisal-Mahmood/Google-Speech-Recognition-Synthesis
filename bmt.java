/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bmt {
    public Object a;
    public Object b;
    public Object c;

    public bmt() {
    }

    public bmt(byte[] byArray) {
        this.c = null;
    }

    public bmt(char[] cArray) {
        this.c = Collections.emptyList();
        this.b = its.a;
    }

    public final bmu a() {
        if (this.a != null && this.c != null) {
            throw new RuntimeException("Both searchResultItems and searchResultsView can't be set at the same time");
        }
        return new bmu(this);
    }

    public final void b(List list) {
        if (list != null && list.size() != 0) {
            this.c = DesugarCollections.unmodifiableList(new ArrayList(list));
            return;
        }
        this.c = null;
    }

    public final ixg c() {
        Object object = this.c;
        Object object2 = this.b;
        ixd ixd2 = (ixd)this.a;
        return new ixg((List)object, (its)object2, ixd2);
    }
}

