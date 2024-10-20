/*
 * Decompiled with CFR 0.152.
 */
final class jep
extends jdu {
    public final jby a;
    private final jcu b;

    public jep(jcu jcu2, jby jby2) {
        this.b = jcu2;
        this.a = jby2;
    }

    @Override
    protected final jcu a() {
        return this.b;
    }

    @Override
    public final jcj b(ixb ixb2, iwx iwx2, itw itw2, iuc[] iucArray) {
        return new jeo(this, this.b.b(ixb2, iwx2, itw2, iucArray));
    }
}

