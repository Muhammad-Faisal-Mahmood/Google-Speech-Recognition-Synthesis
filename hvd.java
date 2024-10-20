/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.OutputStream;

public abstract class hvd
implements hyf {
    public int memoizedHashCode = 0;

    public int d(hyu hyu2) {
        throw null;
    }

    @Override
    public final hvu e() {
        try {
            int n2 = this.k();
            Object object = hvu.b;
            object = new byte[n2];
            hwd hwd2 = hwd.ag((byte[])object);
            this.aZ(hwd2);
            object = idi.w(hwd2, (byte[])object);
            return object;
        }
        catch (IOException iOException) {
            throw new RuntimeException(a.ax(this, "Serializing ", " to a ByteString threw an IOException (should never happen)."), iOException);
        }
    }

    @Override
    public final void f(OutputStream object) {
        object = new hwa((OutputStream)object, hwd.S(this.k()));
        this.aZ((hwd)object);
        ((hwd)object).i();
    }

    @Override
    public final byte[] g() {
        try {
            byte[] byArray = new byte[this.k()];
            hwd hwd2 = hwd.ag(byArray);
            this.aZ(hwd2);
            hwd2.ah();
            return byArray;
        }
        catch (IOException iOException) {
            throw new RuntimeException(a.ax(this, "Serializing ", " to a byte array threw an IOException (should never happen)."), iOException);
        }
    }
}

