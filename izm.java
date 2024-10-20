/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;

final class izm
extends InputStream
implements InputStreamRetargetInterface,
ivt {
    private byte[][] a;
    private byte[] b;
    private int c;
    private int d;
    private int e;
    private boolean f;

    public izm(byte[] byArray) {
        this.a = null;
        int n2 = byArray.length;
        if (n2 <= 0) {
            byArray = null;
        }
        this.b = byArray;
        this.e = n2;
    }

    public izm(byte[][] byArray, int n2) {
        this.a = byArray;
        this.e = n2;
        if (byArray.length > 0) {
            this.b = byArray[0];
        }
    }

    private final void a() {
        int n2;
        this.c = n2 = this.c + 1;
        this.d = 0;
        byte[][] byArray = this.a;
        if (byArray != null && n2 < byArray.length) {
            this.b = byArray[n2];
            return;
        }
        this.b = null;
    }

    @Override
    public final int available() {
        return this.e;
    }

    @Override
    public final void close() {
        if (!this.f) {
            this.f = true;
            Object object = this.a;
            if (object != null) {
                for (int i2 = 0; i2 < ((byte[][])object).length; ++i2) {
                    izn.a(object[i2]);
                }
            } else {
                object = this.b;
                if (object != null) {
                    izn.a((byte[])object);
                }
            }
            this.b = null;
            this.a = null;
        }
    }

    @Override
    public final int read() {
        byte[] byArray = this.b;
        if (byArray != null) {
            int n2;
            int n3 = this.d;
            this.d = n2 = n3 + 1;
            n3 = byArray[n3];
            --this.e;
            if (n2 == byArray.length) {
                this.a();
            }
            return n3;
        }
        return -1;
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        int n4 = n3;
        int n5 = n2;
        n2 = n4;
        while (true) {
            byte[] byArray2 = this.b;
            n4 = n2;
            if (byArray2 == null) break;
            n4 = this.d;
            n4 = hhk.af(n2, byArray2.length - n4, this.e);
            System.arraycopy(this.b, this.d, byArray, n5, n4);
            n5 += n4;
            this.e -= n4;
            if ((n2 -= n4) == 0) {
                this.d = n5 = this.d + n4;
                n4 = n2;
                if (n5 != this.b.length) break;
                this.a();
                n4 = n2;
                break;
            }
            this.a();
        }
        if ((n2 = n3 - n4) <= 0 && this.e <= 0) {
            return -1;
        }
        return n2;
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

