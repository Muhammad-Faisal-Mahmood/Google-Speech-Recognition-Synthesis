/*
 * Decompiled with CFR 0.152.
 */
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

public final class ghd
implements Callable {
    public final RandomAccessFile a;
    public final ghe b;
    public final int c;

    public /* synthetic */ ghd(RandomAccessFile randomAccessFile, ghe ghe2, int n2) {
        this.a = randomAccessFile;
        this.b = ghe2;
        this.c = n2;
    }

    public final Object call() {
        RandomAccessFile randomAccessFile = this.a;
        int n2 = this.c;
        Object object = this.b;
        try {
            Object object2 = new ArrayList();
            Iterator iterator = ((ghe)object).h.values().iterator();
            while (iterator.hasNext()) {
                object = ((jnu)iterator.next()).b();
                jse.d(object, "get(...)");
                object2.add(object);
            }
            object2 = object2.iterator();
            while (object2.hasNext()) {
                ((ghb)object2.next()).a();
            }
            fvd.k(randomAccessFile, n2);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                jsd.f(randomAccessFile, throwable);
                throw throwable2;
            }
        }
        jsd.f(randomAccessFile, null);
        return null;
    }
}

