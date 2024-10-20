/*
 * Decompiled with CFR 0.152.
 */
final class dcs
extends ddu {
    private final dds a;
    private final boolean b;
    private volatile transient String c;

    public dcs(dds dds2, boolean bl2) {
        this.a = dds2;
        this.b = bl2;
    }

    @Override
    public final dds a() {
        return this.a;
    }

    @Override
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof ddu && this.a.equals(((ddu)(object = (ddu)object)).a()) && this.b == ((ddu)object).b();
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = true != this.b ? 1237 : 1231;
        return (n2 ^ 0xF4243) * 1000003 ^ n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final String toString() {
        if (this.c != null) return this.c;
        synchronized (this) {
            if (this.c != null) return this.c;
            String string = ((Object)this.a).toString();
            boolean bl2 = this.b;
            Object object = "fg";
            if (!bl2) {
                object = "bg";
            }
            this.c = a.aq((String)object, string, "{", ", ", "}");
            if (this.c != null) {
                return this.c;
            }
            object = new NullPointerException("toString() cannot return null");
            throw object;
        }
    }
}

