/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ixb {
    public final ixa a;
    public final String b;
    public final String c;
    public final iwz d;
    public final iwz e;
    public final boolean f;

    public ixb(ixa object, String string, iwz iwz2, iwz iwz3, boolean bl2) {
        new AtomicReferenceArray(2);
        a.s(object, "type");
        this.a = object;
        a.s(string, "fullMethodName");
        this.b = string;
        a.s(string, "fullMethodName");
        int n2 = string.lastIndexOf(47);
        object = n2 == -1 ? null : string.substring(0, n2);
        this.c = object;
        a.s(iwz2, "requestMarshaller");
        this.d = iwz2;
        a.s(iwz3, "responseMarshaller");
        this.e = iwz3;
        this.f = bl2;
    }

    public static iwy a() {
        iwy iwy2 = new iwy();
        iwy2.a = null;
        iwy2.b = null;
        return iwy2;
    }

    public static String c(String string, String string2) {
        a.s(string, "fullServiceName");
        a.s(string2, "methodName");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("/");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final InputStream b(Object object) {
        return this.d.a(object);
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("fullMethodName", this.b);
        gtn2.b("type", (Object)this.a);
        gtn2.g("idempotent", false);
        gtn2.g("safe", false);
        gtn2.g("sampledToLocalTracing", this.f);
        gtn2.b("requestMarshaller", this.d);
        gtn2.b("responseMarshaller", this.e);
        gtn2.b("schemaDescriptor", null);
        gtn2.d();
        return gtn2.toString();
    }
}

