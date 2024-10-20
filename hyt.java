/*
 * Decompiled with CFR 0.152.
 */
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public final class hyt
extends hvu {
    public static final int[] a = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 0x8CCCC9, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1L;
    public final int d;
    public final hvu e;
    public final hvu f;
    public final int g;
    private final int h;

    public hyt(hvu hvu2, hvu hvu3) {
        int n2;
        this.e = hvu2;
        this.f = hvu3;
        this.h = n2 = hvu2.d();
        this.d = n2 + hvu3.d();
        this.g = Math.max(hvu2.f(), hvu3.f()) + 1;
    }

    public static int c(int n2) {
        int[] nArray = a;
        int n3 = nArray.length;
        if (n2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return nArray[n2];
    }

    public static hvu g(hvu hvu2, hvu hvu3) {
        int n2 = hvu2.d();
        int n3 = hvu3.d();
        byte[] byArray = new byte[n2 + n3];
        hvu2.z(byArray, 0, n2);
        hvu3.z(byArray, n2, n3);
        return new hvt(byArray);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override
    public final byte a(int n2) {
        hyt.w(n2, this.d);
        return this.b(n2);
    }

    @Override
    public final byte b(int n2) {
        int n3 = this.h;
        if (n2 < n3) {
            return this.e.b(n2);
        }
        return this.f.b(n2 - n3);
    }

    @Override
    public final int d() {
        return this.d;
    }

    @Override
    protected final void e(byte[] byArray, int n2, int n3, int n4) {
        int n5 = this.h;
        if (n2 + n4 <= n5) {
            this.e.e(byArray, n2, n3, n4);
            return;
        }
        if (n2 >= n5) {
            this.f.e(byArray, n2 - n5, n3, n4);
            return;
        }
        hvu hvu2 = this.e;
        hvu2.e(byArray, n2, n3, n5 -= n2);
        this.f.e(byArray, 0, n3 + n5, n4 - n5);
    }

    @Override
    public final boolean equals(Object object) {
        block11: {
            boolean bl2 = true;
            if (object == this) {
                return true;
            }
            if (!(object instanceof hvu)) {
                return false;
            }
            if (this.d != ((hvu)(object = (hvu)object)).d()) {
                return false;
            }
            if (this.d == 0) break block11;
            int n2 = this.c;
            int n3 = ((hvu)object).c;
            if (n2 != 0 && n3 != 0 && n2 != n3) {
                return false;
            }
            hys hys2 = new hys(this);
            hvs hvs2 = hys2.a();
            hys hys3 = new hys((hvu)object);
            object = hys3.a();
            n3 = 0;
            int n4 = n2 = 0;
            while (true) {
                int n5;
                int n6;
                int n7;
                block14: {
                    block15: {
                        boolean bl3;
                        block13: {
                            block12: {
                                n7 = hvs2.d() - n3;
                                n6 = ((hvu)object).d() - n2;
                                n5 = Math.min(n7, n6);
                                bl3 = n3 == 0 ? hvs2.g((hvu)object, n2, n5) : ((hvs)object).g(hvs2, n3, n5);
                                if (bl3) break block12;
                                bl3 = false;
                                break block13;
                            }
                            int n8 = this.d;
                            if ((n4 += n5) < n8) break block14;
                            if (n4 != n8) break block15;
                            bl3 = bl2;
                        }
                        return bl3;
                    }
                    throw new IllegalStateException();
                }
                if (n5 == n7) {
                    hvs2 = hys2.a();
                    n3 = 0;
                } else {
                    n3 += n5;
                }
                if (n5 == n6) {
                    object = hys3.a();
                    n2 = 0;
                    continue;
                }
                n2 += n5;
            }
        }
        return true;
    }

    @Override
    protected final int f() {
        return this.g;
    }

    @Override
    public final boolean h() {
        int n2 = this.g;
        return this.d >= hyt.c(n2);
    }

    @Override
    protected final int i(int n2, int n3, int n4) {
        int n5 = this.h;
        if (n3 + n4 <= n5) {
            return this.e.i(n2, n3, n4);
        }
        if (n3 >= n5) {
            return this.f.i(n2, n3 - n5, n4);
        }
        hvu hvu2 = this.e;
        n2 = hvu2.i(n2, n3, n5 -= n3);
        return this.f.i(n2, 0, n4 - n5);
    }

    @Override
    public final /* synthetic */ Iterator iterator() {
        return new hyr(this);
    }

    @Override
    public final hvu j(int n2, int n3) {
        int n4 = hyt.n(n2, n3, this.d);
        if (n4 == 0) {
            return hvu.b;
        }
        if (n4 == this.d) {
            return this;
        }
        n4 = this.h;
        if (n3 <= n4) {
            return this.e.j(n2, n3);
        }
        n3 -= n4;
        if (n2 >= n4) {
            return this.f.j(n2 - n4, n3);
        }
        hvu hvu2 = this.e;
        hvu hvu3 = this.f;
        return new hyt(hvu2.v(n2), hvu3.j(0, n3));
    }

    @Override
    public final hvy k() {
        Object object = new ArrayList<ByteBuffer>();
        Object object2 = new hys(this);
        while (((hys)object2).hasNext()) {
            object.add(((hys)object2).a().l());
        }
        int n2 = hvy.e;
        Iterator iterator = object.iterator();
        n2 = 0;
        int n3 = 0;
        while (iterator.hasNext()) {
            object2 = (ByteBuffer)iterator.next();
            n3 += ((Buffer)object2).remaining();
            if (((ByteBuffer)object2).hasArray()) {
                n2 |= 1;
                continue;
            }
            if (((ByteBuffer)object2).isDirect()) {
                n2 |= 2;
                continue;
            }
            n2 |= 4;
        }
        object = n2 == 2 ? new hvw((Iterable)object, n3) : hvy.K(new hxo((Iterable)object));
        return object;
    }

    @Override
    public final ByteBuffer l() {
        throw null;
    }

    @Override
    public final void m(hvn hvn2) {
        this.e.m(hvn2);
        this.f.m(hvn2);
    }

    @Override
    public final hvr o() {
        return new hyr(this);
    }

    Object writeReplace() {
        return new hvt(this.y());
    }
}

