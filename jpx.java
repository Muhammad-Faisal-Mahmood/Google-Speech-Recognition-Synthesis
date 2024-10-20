/*
 * Decompiled with CFR 0.152.
 */
public final class jpx
implements jqe {
    private final jrk a;
    private final jqe b;

    public jpx() {
        this(jqc.b, ero.r);
    }

    public jpx(jqe jqe2, jrk object) {
        jse.e(jqe2, "baseKey");
        this.a = object;
        object = jqe2;
        if (jqe2 instanceof jpx) {
            object = ((jpx)jqe2).b;
        }
        this.b = object;
    }

    public final jqd a(jqd jqd2) {
        return (jqd)this.a.a(jqd2);
    }

    public final boolean b(jqe jqe2) {
        jse.e(jqe2, "key");
        return jqe2 == this || this.b == jqe2;
        {
        }
    }
}

