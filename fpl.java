/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public final class fpl
extends fqf {
    private final List a;

    public fpl(InputStream inputStream, List list) {
        super(inputStream);
        this.a = list;
        fvc.H(true, "Input was null", new Object[0]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() {
        Iterator iterator = this.a.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                super.close();
                return;
            }
            fqx fqx2 = (fqx)iterator.next();
            try {
                fqx2.close();
            }
            catch (Throwable throwable) {
            }
        }
    }

    @Override
    public final int read() {
        int n2 = this.in.read();
        if (n2 != -1) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                ((fqx)iterator.next()).a();
            }
        }
        return n2;
    }

    @Override
    public final int read(byte[] object) {
        int n2 = this.in.read((byte[])object);
        if (n2 != -1) {
            object = this.a.iterator();
            while (object.hasNext()) {
                ((fqx)object.next()).a();
            }
        }
        return n2;
    }

    @Override
    public final int read(byte[] object, int n2, int n3) {
        if ((n2 = this.in.read((byte[])object, n2, n3)) != -1) {
            object = this.a.iterator();
            while (object.hasNext()) {
                ((fqx)object.next()).a();
            }
        }
        return n2;
    }
}

