/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public abstract class hvu
implements Iterable,
Serializable {
    public static final hvu b = new hvt(hxl.b);
    private static final long serialVersionUID = 1L;
    public int c = 0;

    private static hvu c(Iterator object, int n2) {
        if (n2 > 0) {
            if (n2 == 1) {
                object = (hvu)object.next();
            } else {
                int n3 = n2 >>> 1;
                object = hvu.c((Iterator)object, n3).p(hvu.c((Iterator)object, n2 - n3));
            }
            return object;
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", n2));
    }

    static int n(int n2, int n3, int n4) {
        int n5 = n3 - n2;
        if ((n2 | n3 | n5 | n4 - n3) < 0) {
            if (n2 >= 0) {
                if (n3 < n2) {
                    throw new IndexOutOfBoundsException(a.an(n3, n2, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(a.an(n4, n3, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(a.ah(n2, "Beginning index: ", " < 0"));
        }
        return n5;
    }

    public static hvu q(byte[] byArray) {
        return hvu.s(byArray, 0, byArray.length);
    }

    public static hvu r(String string, Charset charset) {
        return new hvt(string.getBytes(charset));
    }

    public static hvu s(byte[] byArray, int n2, int n3) {
        hvu.n(n2, n2 + n3, byArray.length);
        byte[] byArray2 = new byte[n3];
        System.arraycopy(byArray, n2, byArray2, 0, n3);
        return new hvt(byArray2);
    }

    public static hvu t(String string) {
        return new hvt(string.getBytes(hxl.a));
    }

    public static hvu u(InputStream object) {
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        int n2 = 256;
        while (true) {
            int n3;
            int n4;
            Object object2 = new byte[n2];
            for (n3 = 0; n3 < n2 && (n4 = ((InputStream)object).read((byte[])object2, n3, n2 - n3)) != -1; n3 += n4) {
            }
            object2 = n3 == 0 ? null : (Object)hvu.s(object2, 0, n3);
            if (object2 == null) {
                n2 = arrayList.size();
                object = n2 == 0 ? b : hvu.c(arrayList.iterator(), n2);
                return object;
            }
            arrayList.add((byte[])object2);
            n2 = Math.min(n2 + n2, 8192);
        }
    }

    static void w(int n2, int n3) {
        if ((n3 - (n2 + 1) | n2) < 0) {
            if (n2 < 0) {
                throw new ArrayIndexOutOfBoundsException(a.af(n2, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(a.an(n3, n2, "Index > length: ", ", "));
        }
    }

    public abstract byte a(int var1);

    public abstract byte b(int var1);

    public abstract int d();

    protected abstract void e(byte[] var1, int var2, int var3, int var4);

    public abstract boolean equals(Object var1);

    protected abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int n2;
        int n3 = n2 = this.c;
        if (n2 == 0) {
            n3 = this.d();
            n3 = n2 = this.i(n3, 0, n3);
            if (n2 == 0) {
                n3 = 1;
            }
            this.c = n3;
        }
        return n3;
    }

    protected abstract int i(int var1, int var2, int var3);

    public abstract hvu j(int var1, int var2);

    public abstract hvy k();

    public abstract ByteBuffer l();

    public abstract void m(hvn var1);

    public hvr o() {
        return new hvo(this);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final hvu p(hvu object) {
        if (Integer.MAX_VALUE - this.d() >= ((hvu)object).d()) {
            Iterable iterable;
            int[] nArray = hyt.a;
            if (((hvu)object).d() == 0) return this;
            if (this.d() == 0) return object;
            int n2 = this.d() + ((hvu)object).d();
            if (n2 < 128) {
                return hyt.g(this, (hvu)object);
            }
            if (this instanceof hyt) {
                hyt hyt2 = (hyt)this;
                if (hyt2.f.d() + ((hvu)object).d() < 128) {
                    object = hyt.g(hyt2.f, (hvu)object);
                    return new hyt(hyt2.e, (hvu)object);
                }
                iterable = hyt2.e;
                hvu hvu2 = hyt2.f;
                if (((hvu)iterable).f() > hvu2.f() && hyt2.g > ((hvu)object).f()) {
                    object = new hyt(hyt2.f, (hvu)object);
                    return new hyt(hyt2.e, (hvu)object);
                }
            }
            if (n2 >= hyt.c(Math.max(this.f(), ((hvu)object).f()) + 1)) {
                return new hyt(this, (hvu)object);
            }
            iterable = new ArrayDeque();
            fvc.aE(this, (ArrayDeque)iterable);
            fvc.aE((hvu)object, (ArrayDeque)iterable);
            hvu hvu3 = (hvu)((ArrayDeque)iterable).pop();
            while (true) {
                void var4_6;
                object = var4_6;
                if (((ArrayDeque)iterable).isEmpty()) return object;
                hyt hyt3 = new hyt((hvu)((ArrayDeque)iterable).pop(), (hvu)var4_6);
            }
        }
        int n3 = this.d();
        int n4 = ((hvu)object).d();
        object = new StringBuilder("ByteString would be too long: ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("+");
        ((StringBuilder)object).append(n4);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String string = Integer.toHexString(System.identityHashCode(this));
        int n2 = this.d();
        String string2 = this.d() <= 50 ? fvc.aD(this) : fvc.aD(this.j(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", string, n2, string2);
    }

    public final hvu v(int n2) {
        return this.j(n2, this.d());
    }

    public final boolean x() {
        return this.d() == 0;
    }

    public final byte[] y() {
        int n2 = this.d();
        if (n2 == 0) {
            return hxl.b;
        }
        byte[] byArray = new byte[n2];
        this.e(byArray, 0, 0, n2);
        return byArray;
    }

    @Deprecated
    public final void z(byte[] byArray, int n2, int n3) {
        hvu.n(0, n3, this.d());
        hvu.n(n2, n2 + n3, byArray.length);
        if (n3 > 0) {
            this.e(byArray, 0, n2, n3);
        }
    }
}

