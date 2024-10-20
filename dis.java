/*
 * Decompiled with CFR 0.152.
 */
import java.util.Set;

final class dis {
    public static final Set a = hav.s(dis.b(false, false, false, false), dis.b(false, false, false, true), dis.b(false, false, true, false), dis.b(false, false, true, true), dis.b(false, true, false, false), dis.b(false, true, false, true), dis.b(false, true, true, false), dis.b(false, true, true, true), dis.b(true, false, false, false), dis.b(true, false, false, true), dis.b(true, false, true, false), dis.b(true, false, true, true), dis.b(true, true, false, false), dis.b(true, true, false, true), dis.b(true, true, true, false), dis.b(true, true, true, true), did.a);

    static ddu a(dfd object) {
        if (dec.p(((dfd)object).b())) {
            object = did.a;
        } else {
            ddt ddt2 = ddu.c();
            ddt2.b(false);
            dya dya2 = dds.e();
            dya2.h(((dfd)object).l());
            dya2.j(((dfd)object).n());
            dya2.i(((dfd)object).m());
            dya2.g(((dfd)object).k());
            ddt2.a = dya2.f();
            object = ddt2.a();
        }
        return object;
    }

    private static ddu b(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        ddt ddt2 = ddu.c();
        dya dya2 = dds.e();
        dya2.j(bl2);
        dya2.h(bl3);
        dya2.i(bl4);
        dya2.g(bl5);
        ddt2.a = dya2.f();
        ddt2.b(false);
        return ddt2.a();
    }
}

