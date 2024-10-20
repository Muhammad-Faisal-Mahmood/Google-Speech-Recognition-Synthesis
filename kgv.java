/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;

public final class kgv
implements Closeable {
    public final kgs a;
    public final kgq b;
    public final String c;
    public final int d;
    public final kgj e;
    public final kgk f;
    public final kgx g;
    public final kgv h;
    public final kgv i;
    public final kgv j;
    public final long k;
    public final long l;
    public final kmb m;

    public kgv(kgs kgs2, kgq kgq2, String string, int n2, kgj kgj2, kgk kgk2, kgx kgx2, kgv kgv2, kgv kgv3, kgv kgv4, long l2, long l3, kmb kmb2) {
        this.a = kgs2;
        this.b = kgq2;
        this.c = string;
        this.d = n2;
        this.e = kgj2;
        this.f = kgk2;
        this.g = kgx2;
        this.h = kgv2;
        this.i = kgv3;
        this.j = kgv4;
        this.k = l2;
        this.l = l3;
        this.m = kmb2;
    }

    public static /* synthetic */ String a(kgv object, String string) {
        string = ((kgv)object).f.b(string);
        object = string;
        if (string == null) {
            object = null;
        }
        return object;
    }

    @Override
    public final void close() {
        kgx kgx2 = this.g;
        if (kgx2 != null) {
            kgx2.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Response{protocol=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", code=");
        stringBuilder.append(this.d);
        stringBuilder.append(", message=");
        stringBuilder.append(this.c);
        stringBuilder.append(", url=");
        stringBuilder.append(this.a.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

