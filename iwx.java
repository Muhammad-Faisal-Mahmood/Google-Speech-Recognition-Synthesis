/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public final class iwx {
    public static final Logger a = Logger.getLogger(iwx.class.getName());
    public static final iwn b;
    static final hjd c;
    public static final kmp f;
    public Object[] d;
    public int e;

    static {
        f = new kmp();
        b = new jea(1);
        hjd hjd2 = hjd.d;
        hjc hjc2 = (hjc)hjd2;
        if (hjc2.c != null) {
            hjd2 = new hja(hjc2.b, null);
        }
        c = hjd2;
    }

    public iwx() {
    }

    public iwx(int n2, Object[] objectArray) {
        this.e = n2;
        this.d = objectArray;
    }

    public iwx(byte[] ... byArray) {
        this(byArray.length >> 1, (Object[])byArray);
    }

    public static byte[] k(InputStream object) {
        try {
            object = hjg.b((InputStream)object);
            return object;
        }
        catch (IOException iOException) {
            throw new RuntimeException("failure reading serialized stream", iOException);
        }
    }

    private final int n() {
        Object[] objectArray = this.d;
        if (objectArray != null) {
            return objectArray.length;
        }
        return 0;
    }

    private final void o(int n2) {
        Object[] objectArray = new Object[n2];
        if (!this.i()) {
            System.arraycopy(this.d, 0, objectArray, 0, this.a());
        }
        this.d = objectArray;
    }

    private final void p(int n2, byte[] byArray) {
        this.d[n2 + n2] = byArray;
    }

    private final void q(int n2, Object object) {
        if (this.d instanceof byte[][]) {
            this.o(this.n());
        }
        this.d[n2 + n2 + 1] = object;
    }

    public final int a() {
        int n2 = this.e;
        return n2 + n2;
    }

    public final Object b(iws iws2) {
        int n2;
        int n3 = this.e;
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (!Arrays.equals(iws2.b, this.j(n2))) continue;
            return this.d(n2, iws2);
        }
        return null;
    }

    public final Object c(int n2) {
        return this.d[n2 + n2 + 1];
    }

    public final Object d(int n2, iws object) {
        iwp iwp2;
        Object object2 = this.c(n2);
        if (object2 instanceof byte[]) {
            return ((iws)object).a((byte[])object2);
        }
        object2 = (iwu)object2;
        object = ((iws)object).c() && (iwp2 = iwu.a((iws)object)) != null ? iwp2.b(((iwu)object2).b()) : ((iws)object).a(((iwu)object2).c());
        return object;
    }

    public final void e(iws iws2) {
        if (!this.i()) {
            int n2 = 0;
            for (int i2 = 0; i2 < this.e; ++i2) {
                int n3 = n2;
                if (!Arrays.equals(iws2.b, this.j(i2))) {
                    this.p(n2, this.j(i2));
                    this.q(n2, this.c(i2));
                    n3 = n2 + 1;
                }
                n2 = n3;
            }
            Arrays.fill(this.d, n2 + n2, this.a(), null);
            this.e = n2;
        }
    }

    public final void f(iwx iwx2) {
        if (iwx2.i()) {
            return;
        }
        int n2 = this.n();
        int n3 = this.a();
        if (this.i() || n2 - n3 < iwx2.a()) {
            this.o(this.a() + iwx2.a());
        }
        System.arraycopy(iwx2.d, 0, this.d, this.a(), iwx2.a());
        this.e += iwx2.e;
    }

    public final void g(iws object, Object object2) {
        int n2;
        a.s(object, "key");
        a.s(object2, "value");
        if (this.a() == 0 || this.a() == this.n()) {
            n2 = this.a();
            this.o(Math.max(n2 + n2, 8));
        }
        this.p(this.e, ((iws)object).b);
        if (((iws)object).c()) {
            n2 = this.e;
            object = iwu.a((iws)object);
            fxf.K(object);
            this.q(n2, new iwu((iwp)object, object2));
        } else {
            n2 = this.e;
            this.d[n2 + n2 + 1] = object = (Object)((iws)object).b(object2);
        }
        ++this.e;
    }

    public final boolean h(iws iws2) {
        for (int i2 = 0; i2 < this.e; ++i2) {
            if (!Arrays.equals(iws2.b, this.j(i2))) continue;
            return true;
        }
        return false;
    }

    public final boolean i() {
        return this.e == 0;
    }

    public final byte[] j(int n2) {
        return (byte[])this.d[n2 + n2];
    }

    public final byte[] l(int n2) {
        Object object = this.c(n2);
        if (object instanceof byte[]) {
            return (byte[])object;
        }
        return ((iwu)object).c();
    }

    public final void m(iws iws2) {
        if (!this.i()) {
            int n2 = 0;
            ArrayList<Object> arrayList = null;
            for (int i2 = 0; i2 < this.e; ++i2) {
                if (Arrays.equals(iws2.b, this.j(i2))) {
                    ArrayList<Object> arrayList2 = arrayList;
                    if (arrayList == null) {
                        arrayList2 = new ArrayList<Object>();
                    }
                    arrayList2.add(this.d(i2, iws2));
                    arrayList = arrayList2;
                    continue;
                }
                this.p(n2, this.j(i2));
                this.q(n2, this.c(i2));
                ++n2;
            }
            Arrays.fill(this.d, n2 + n2, this.a(), null);
            this.e = n2;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metadata(");
        for (int i2 = 0; i2 < this.e; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            String string = new String(this.j(i2), StandardCharsets.US_ASCII);
            stringBuilder.append(string);
            stringBuilder.append('=');
            if (string.endsWith("-bin")) {
                stringBuilder.append(c.g(this.l(i2)));
                continue;
            }
            stringBuilder.append(new String(this.l(i2), StandardCharsets.US_ASCII));
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

