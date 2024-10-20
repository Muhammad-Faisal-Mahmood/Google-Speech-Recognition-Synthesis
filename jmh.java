/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class jmh
extends InputStream
implements InputStreamRetargetInterface,
ivt {
    public hyf a;
    public final hym b;
    public ByteArrayInputStream c;

    public jmh(hyf hyf2, hym hym2) {
        this.a = hyf2;
        this.b = hym2;
    }

    @Override
    public final int available() {
        Object object = this.a;
        if (object != null) {
            return object.k();
        }
        object = this.c;
        if (object != null) {
            return ((ByteArrayInputStream)object).available();
        }
        return 0;
    }

    @Override
    public final int read() {
        Object object = this.a;
        if (object != null) {
            this.c = new ByteArrayInputStream(object.g());
            this.a = null;
        }
        if ((object = this.c) != null) {
            return ((ByteArrayInputStream)object).read();
        }
        return -1;
    }

    @Override
    public final int read(byte[] object, int n2, int n3) {
        Object object2 = this.a;
        if (object2 != null) {
            int n4 = object2.k();
            if (n4 == 0) {
                this.a = null;
                this.c = null;
                return -1;
            }
            if (n3 >= n4) {
                object = new hwb((byte[])object, n2, n4);
                this.a.aZ((hwd)object);
                ((hwd)object).ah();
                this.a = null;
                this.c = null;
                return n4;
            }
            this.c = new ByteArrayInputStream(this.a.g());
            this.a = null;
        }
        if ((object2 = this.c) != null) {
            return ((ByteArrayInputStream)object2).read((byte[])object, n2, n3);
        }
        return -1;
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

