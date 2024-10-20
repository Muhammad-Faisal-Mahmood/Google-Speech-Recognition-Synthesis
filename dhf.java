/*
 * Decompiled with CFR 0.152.
 */
final class dhf
extends kgh {
    public static final dhf a = new dhf();

    private dhf() {
    }

    @Override
    public final void a(khp khp2, kgs kgs2) {
        ((hfk)ddd.b.m().j("com/google/android/libraries/micore/superpacks/packs/OkHttpUtil$LoggingEventListener", "requestHeadersEnd", 66, "OkHttpUtil.java")).C("HTTP request headers for %s: %s", khp2.b.a, kgs2.c);
    }

    @Override
    public final void b(khp khp2, kgv kgv2) {
        hfk hfk2 = (hfk)ddd.b.l().j("com/google/android/libraries/micore/superpacks/packs/OkHttpUtil$LoggingEventListener", "responseHeadersEnd", 73, "OkHttpUtil.java");
        int n2 = kgv2.d;
        hfk2.G("HTTP response for %s: code: %d, protocol: %s", khp2.b.a, n2, (Object)kgv2.b);
        ((hfk)ddd.b.m().j("com/google/android/libraries/micore/superpacks/packs/OkHttpUtil$LoggingEventListener", "responseHeadersEnd", 78, "OkHttpUtil.java")).C("HTTP response headers for %s: %s", khp2.b.a, kgv2.f);
    }
}

