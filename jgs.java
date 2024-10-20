/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;
import java.util.List;

public final class jgs {
    public int a;
    public int b;
    public int c;
    public Object d;

    public jgs() {
        this.d = agf.f;
    }

    public jgs(List list) {
        this.d(list);
    }

    public jgs(byte[] byArray) {
        int n2 = byArray.length;
        this.d = byArray;
        this.b = n2;
    }

    public jgs(char[] cArray) {
        int n2 = 8;
        if (Integer.bitCount(8) != 1) {
            n2 = Integer.highestOneBit(7);
            n2 += n2;
        }
        this.c = n2 - 1;
        this.d = new int[n2];
    }

    public final its a() {
        if (this.f()) {
            return ((iux)this.d.get((int)this.b)).c;
        }
        throw new IllegalStateException("Index is off the end of the address group list");
    }

    public final SocketAddress b() {
        if (this.f()) {
            return (SocketAddress)((iux)this.d.get((int)this.b)).b.get(this.c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
    }

    public final void d(List object) {
        a.s(object, "newGroups");
        this.d = object;
        this.c();
        object = ((gzx)object).v();
        int n2 = 0;
        while (object.hasNext()) {
            n2 += ((iux)object.next()).b.size();
        }
        this.a = n2;
    }

    public final boolean e() {
        int n2;
        if (!this.f()) {
            return false;
        }
        iux iux2 = (iux)this.d.get(this.b);
        this.c = n2 = this.c + 1;
        if (n2 >= iux2.b.size()) {
            this.b = n2 = this.b + 1;
            this.c = 0;
            return n2 < ((hct)this.d).c;
        }
        return true;
    }

    public final boolean f() {
        return this.b < ((hct)this.d).c;
    }

    public final boolean g(SocketAddress socketAddress) {
        block1: {
            int n2;
            int n3 = 0;
            while (true) {
                Object object = this.d;
                if (n3 >= ((hct)object).c) break block1;
                n2 = ((iux)object.get((int)n3)).b.indexOf(socketAddress);
                if (n2 != -1) break;
                ++n3;
            }
            this.b = n3;
            this.c = n2;
            return true;
        }
        return false;
    }

    public final int h(int n2) {
        Object object;
        int n3;
        int n4;
        if (n2 == 0) {
            return 0;
        }
        this.c += n2;
        int n5 = 0;
        while ((n4 = this.c) > 8) {
            this.c = n3 = n4 - 8;
            object = this.d;
            n4 = this.a;
            this.a = n4 + 1;
            n5 |= (((byte[])object)[n4] & 0xFF) << n3;
        }
        object = this.d;
        int n6 = this.a;
        n3 = ((byte[])object)[n6];
        if (n4 == 8) {
            this.c = 0;
            this.a = n6 + 1;
        }
        this.i();
        return -1 >>> 32 - n2 & (n5 | (n3 & 0xFF) >> 8 - n4);
    }

    public final void i() {
        boolean bl2;
        block2: {
            block3: {
                boolean bl3;
                int n2 = this.a;
                bl2 = bl3 = false;
                if (n2 < 0) break block2;
                int n3 = this.b;
                if (n2 < n3) break block3;
                bl2 = bl3;
                if (n2 != n3) break block2;
                bl2 = bl3;
                if (this.c != 0) break block2;
            }
            bl2 = true;
        }
        abr.f(bl2);
    }

    public final void j(int n2) {
        int n3;
        this.a = n3 = n2 / 8;
        this.c = n2 - n3 * 8;
        this.i();
    }

    public final int k() {
        int n2 = this.b;
        if (n2 != this.a) {
            int n3 = ((int[])this.d)[n2];
            this.b = n2 + 1 & this.c;
            return n3;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void l(int n2) {
        Object object = this.d;
        int n3 = this.a;
        Object object2 = (int[])object;
        object2[n3] = n2;
        this.a = n3 = this.c & n3 + 1;
        n2 = this.b;
        if (n3 == n2) {
            int n4 = ((int[])object2).length;
            n3 = n4 + n4;
            if (n3 >= 0) {
                object = new int[n3];
                jns.W(object2, (int[])object, 0, n2, n4);
                object2 = this.d;
                int n5 = this.b;
                jns.W(object2, (int[])object, n4 - n2, 0, n5);
                this.d = object;
                this.b = 0;
                this.a = n4;
                this.c = n3 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public final void m() {
        this.a = this.b;
    }

    public final boolean n() {
        return this.b == this.a;
    }
}

