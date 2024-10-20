/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class fqj
implements djm {
    private final Uri a;
    private final bmu b;

    public fqj(bmu bmu2, Uri uri) {
        this.b = bmu2;
        this.a = uri;
    }

    @Override
    public final long a() {
        return this.b.u(this.a);
    }

    @Override
    public final void b(InputStream inputStream, long l2, long l3) {
        l3 = this.b.u(this.a);
        if (l2 <= l3) {
            Object object = l2 > 0L ? new fqk(2) : new fqu();
            object = (OutputStream)this.b.w(this.a, (fpp)object);
            try {
                hjg.a(inputStream, (OutputStream)object);
                return;
            }
            finally {
                if (object != null) {
                    ((OutputStream)object).close();
                }
            }
        }
        throw new IOException(String.format("Invalid resumed download; offsetBytes exceeds the existing data size: %d, %d", l2, l3));
    }
}

