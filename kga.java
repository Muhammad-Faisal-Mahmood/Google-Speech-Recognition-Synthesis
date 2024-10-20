/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class kga {
    public static final kga a;
    public static final kga b;
    private static final kfy[] g;
    private static final kfy[] h;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final String[] f;

    static {
        kfy kfy2;
        kfy kfy3;
        kfy kfy4;
        kfy kfy5;
        kfy kfy6;
        kfy kfy7;
        kfy kfy8;
        Object object = new kfy[9];
        object[0] = kfy.p;
        object[1] = kfy8 = kfy.q;
        object[2] = kfy7 = kfy.r;
        object[3] = kfy6 = kfy.j;
        Object object2 = kfy.l;
        object[4] = object2;
        object[5] = kfy5 = kfy.k;
        object[6] = kfy4 = kfy.m;
        object[7] = kfy3 = kfy.o;
        object[8] = kfy2 = kfy.n;
        g = object;
        kfy[] kfyArray = new kfy[]{kfy.p, kfy8, kfy7, kfy6, object2, kfy5, kfy4, kfy3, kfy2, kfy.h, kfy.i, kfy.f, kfy.g, kfy.d, kfy.e, kfy.c};
        h = kfyArray;
        object2 = new kfz(true);
        ((kfz)object2).e(Arrays.copyOf(object, 9));
        ((kfz)object2).f(kgz.a, kgz.b);
        ((kfz)object2).c();
        ((kfz)object2).a();
        object = new kfz(true);
        ((kfz)object).e(Arrays.copyOf(kfyArray, 16));
        ((kfz)object).f(kgz.a, kgz.b);
        ((kfz)object).c();
        a = ((kfz)object).a();
        object = new kfz(true);
        ((kfz)object).e(Arrays.copyOf(kfyArray, 16));
        ((kfz)object).f(kgz.a, kgz.b, kgz.c, kgz.d);
        ((kfz)object).c();
        ((kfz)object).a();
        b = new kfz(false).a();
    }

    public kga(boolean bl2, boolean bl3, String[] stringArray, String[] stringArray2) {
        this.c = bl2;
        this.d = bl3;
        this.e = stringArray;
        this.f = stringArray2;
    }

    public final List a() {
        List<kfy> list;
        String[] stringArray = this.e;
        if (stringArray != null) {
            list = new ArrayList(stringArray.length);
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string = stringArray[i2];
                list.add(kfy.t.t(string));
            }
            list = jns.s(list);
        } else {
            list = null;
        }
        return list;
    }

    public final List b() {
        Object object;
        String[] stringArray = this.f;
        if (stringArray != null) {
            ArrayList<kgz> arrayList = new ArrayList<kgz>(stringArray.length);
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                String string = stringArray[i2];
                object = kgz.a;
                arrayList.add(jvf.s(string));
            }
            object = jns.s(arrayList);
        } else {
            object = null;
        }
        return object;
    }

    public final boolean c(SSLSocket sSLSocket) {
        jse.e(sSLSocket, "socket");
        if (!this.c) {
            return false;
        }
        String[] stringArray = this.f;
        if (stringArray != null && !khb.u(stringArray, sSLSocket.getEnabledProtocols(), jpv.b)) {
            return false;
        }
        stringArray = this.e;
        return stringArray == null || khb.u(stringArray, sSLSocket.getEnabledCipherSuites(), kfy.a);
    }

    public final boolean equals(Object object) {
        if (!(object instanceof kga)) {
            return false;
        }
        if (object == this) {
            return true;
        }
        boolean bl2 = this.c;
        object = (kga)object;
        if (bl2 != ((kga)object).c) {
            return false;
        }
        if (bl2) {
            if (!Arrays.equals(this.e, ((kga)object).e)) {
                return false;
            }
            if (!Arrays.equals(this.f, ((kga)object).f)) {
                return false;
            }
            if (this.d != ((kga)object).d) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int n2;
        if (this.c) {
            Object[] objectArray = this.e;
            int n3 = 0;
            n2 = objectArray != null ? Arrays.hashCode(objectArray) : 0;
            objectArray = this.f;
            if (objectArray != null) {
                n3 = Arrays.hashCode(objectArray);
            }
            n2 = ((n2 + 527) * 31 + n3) * 31 + (this.d ^ 1);
        } else {
            n2 = 17;
        }
        return n2;
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        String string = Objects.toString(this.a(), "[all enabled]");
        String string2 = Objects.toString(this.b(), "[all enabled]");
        boolean bl2 = this.d;
        StringBuilder stringBuilder = new StringBuilder("ConnectionSpec(cipherSuites=");
        stringBuilder.append(string);
        stringBuilder.append(", tlsVersions=");
        stringBuilder.append(string2);
        stringBuilder.append(", supportsTlsExtensions=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

