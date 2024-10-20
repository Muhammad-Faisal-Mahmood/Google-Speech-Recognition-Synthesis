/*
 * Decompiled with CFR 0.152.
 */
public final class gex {
    public final ger a;
    public final hyf b;
    private final jqz c;

    static {
        new gex(get.a, ger.b);
        new gex(get.b, ger.b);
    }

    public /* synthetic */ gex(jqz jqz2, ger ger2) {
        this(jqz2, ger2, null);
    }

    public gex(jqz jqz2, ger ger2, hyf hyf2) {
        jse.e((Object)ger2, "type");
        this.c = jqz2;
        this.a = ger2;
        this.b = hyf2;
    }

    public static final gex e() {
        return fvc.A(0.0);
    }

    public final long a() {
        Object object = this.c.a();
        jse.c(object, "null cannot be cast to non-null type kotlin.Long");
        return (Long)object;
    }

    public final hyf b() {
        Object object = this.c.a();
        jse.c(object, "null cannot be cast to non-null type T of com.google.apps.tiktok.experiments.FlagValueHolder.getProtoValue");
        return (hyf)object;
    }

    public final String c() {
        Object object = this.c.a();
        jse.c(object, "null cannot be cast to non-null type kotlin.String");
        return (String)object;
    }

    public final boolean d() {
        Object object = this.c.a();
        jse.c(object, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean)object;
    }
}

