/*
 * Decompiled with CFR 0.152.
 */
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public final class fpm
extends fqg {
    private final List a;

    public fpm(OutputStream outputStream, List list) {
        super(outputStream);
        this.a = list;
        fvc.H(true, "Output was null", new Object[0]);
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
            fqy fqy2 = (fqy)iterator.next();
            try {
                fqy2.close();
            }
            catch (Throwable throwable) {
            }
        }
    }

    @Override
    public final void write(int n2) {
        this.out.write(n2);
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((fqy)iterator.next()).a(1);
        }
    }

    @Override
    public final void write(byte[] byArray) {
        this.out.write(byArray);
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((fqy)iterator.next()).a(byArray.length);
        }
    }

    @Override
    public final void write(byte[] object, int n2, int n3) {
        this.out.write((byte[])object, n2, n3);
        object = this.a.iterator();
        while (object.hasNext()) {
            ((fqy)object.next()).a(n3);
        }
    }
}

