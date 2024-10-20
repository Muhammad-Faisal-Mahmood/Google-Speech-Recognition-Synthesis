/*
 * Decompiled with CFR 0.152.
 */
final class jkn
extends jbg {
    public static final klm a = new klm();
    public final ixb b;
    public final String c;
    public final jjo d;
    public final String e;
    public final jkm f;
    public final boolean g;
    private final jkl h = new jkl(this);
    private final its i;

    public jkn(ixb object, iwx iwx2, jkd jkd2, jks jks2, jle jle2, Object object2, int n2, int n3, String string, String string2, jjo jjo2, jjv jjv2, itw itw2) {
        super(new jkz(0), jjo2, jjv2, iwx2, itw2);
        this.g = false;
        this.d = jjo2;
        this.b = object;
        this.e = string;
        this.c = string2;
        this.i = jks2.o;
        object = ((ixb)object).b;
        this.f = new jkm(this, n2, jjo2, object2, jkd2, jle2, jks2, n3);
    }

    @Override
    public final its a() {
        return this.i;
    }

    @Override
    protected final /* synthetic */ jbf p() {
        return this.h;
    }

    @Override
    protected final /* synthetic */ jbi q() {
        return this.f;
    }

    public final ixa r() {
        return this.b.a;
    }

    @Override
    protected final /* synthetic */ jbi t() {
        return this.f;
    }
}

