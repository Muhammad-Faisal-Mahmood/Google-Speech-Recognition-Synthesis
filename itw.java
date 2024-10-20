/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public final class itw {
    public static final itw a;
    public final iut b;
    public final Executor c;
    public final List d;
    public final Integer e;
    public final Integer f;
    private final Object[][] g;
    private final Boolean h;

    static {
        itu itu2 = new itu();
        itu2.c = new Object[0][2];
        itu2.d = Collections.emptyList();
        a = new itw(itu2);
    }

    public itw(itu itu2) {
        this.b = (iut)itu2.a;
        this.c = itu2.b;
        this.g = (Object[][])itu2.c;
        this.d = itu2.d;
        this.h = (Boolean)itu2.e;
        this.e = (Integer)itu2.f;
        this.f = (Integer)itu2.g;
    }

    public static itu a(itw itw2) {
        itu itu2 = new itu();
        itu2.a = itw2.b;
        itu2.b = itw2.c;
        itu2.c = itw2.g;
        itu2.d = itw2.d;
        itu2.e = itw2.h;
        itu2.f = itw2.e;
        itu2.g = itw2.f;
        return itu2;
    }

    public final itw b(iut iut2) {
        itu itu2 = itw.a(this);
        itu2.a = iut2;
        return new itw(itu2);
    }

    public final itw c(Executor executor) {
        itu itu2 = itw.a(this);
        itu2.b = executor;
        return new itw(itu2);
    }

    public final itw d(int n2) {
        boolean bl2 = n2 >= 0;
        fxf.t(bl2, "invalid maxsize %s", n2);
        itu itu2 = itw.a(this);
        itu2.f = n2;
        return new itw(itu2);
    }

    public final itw e(int n2) {
        boolean bl2 = n2 >= 0;
        fxf.t(bl2, "invalid maxsize %s", n2);
        itu itu2 = itw.a(this);
        itu2.g = n2;
        return new itw(itu2);
    }

    public final itw f(itv itv2, Object object) {
        Object object2;
        int n2;
        itu itu2;
        block4: {
            a.s(itv2, "key");
            a.s(object, "value");
            itu2 = itw.a(this);
            for (n2 = 0; n2 < ((Object[][])(object2 = this.g)).length; ++n2) {
                if (!itv2.equals(object2[n2][0])) {
                    continue;
                }
                break block4;
            }
            n2 = -1;
        }
        object2 = this.g;
        int n3 = n2 == -1 ? 1 : 0;
        itu2.c = new Object[((Object[][])object2).length + n3][2];
        object2 = this.g;
        System.arraycopy(object2, 0, itu2.c, 0, ((Object[][])object2).length);
        if (n2 == -1) {
            object2 = itu2.c;
            n2 = this.g.length;
            object2[n2] = new Object[]{itv2, object};
        } else {
            ((Object[][])itu2.c)[n2] = new Object[]{itv2, object};
        }
        return new itw(itu2);
    }

    public final Object g(itv itv2) {
        Object[][] objectArray;
        a.s(itv2, "key");
        for (int i2 = 0; i2 < (objectArray = this.g).length; ++i2) {
            if (!itv2.equals(objectArray[i2][0])) continue;
            return this.g[i2][1];
        }
        return itv2.a;
    }

    public final boolean h() {
        return Boolean.TRUE.equals(this.h);
    }

    public final itw i(fvc object) {
        ArrayList<fvc> arrayList = new ArrayList<fvc>(this.d.size() + 1);
        arrayList.addAll(this.d);
        arrayList.add((fvc)object);
        object = itw.a(this);
        ((itu)object).d = DesugarCollections.unmodifiableList(arrayList);
        return new itw((itu)object);
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("deadline", this.b);
        gtn2.b("authority", null);
        gtn2.b("callCredentials", null);
        Class<Object> clazz = this.c;
        clazz = clazz != null ? clazz.getClass() : null;
        gtn2.b("executor", clazz);
        gtn2.b("compressorName", null);
        gtn2.b("customOptions", Arrays.deepToString((Object[])this.g));
        gtn2.g("waitForReady", this.h());
        gtn2.b("maxInboundMessageSize", this.e);
        gtn2.b("maxOutboundMessageSize", this.f);
        gtn2.b("onReadyThreshold", null);
        gtn2.b("streamTracerFactories", this.d);
        return gtn2.toString();
    }
}

