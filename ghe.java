/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.EOFException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class ghe {
    public final Context a;
    public final Map b;
    public final hpq c;
    public final iku d;
    public final jnu e;
    public final jnu f;
    public final boolean g;
    public final Map h;
    public final dtu i;
    private final Map j;

    public ghe(Context object, dtu dtu2, gto gto2, Map map, Map map2, hpq hpq2, iku iku2, jnu jnu2, jnu jnu3) {
        jse.e(gto2, "enableMultiprocessSupportInThisProcess");
        jse.e(map, "mainProcessOnlyListeners");
        jse.e(map2, "allProcessesListeners");
        jse.e(hpq2, "backgroundExecutor");
        jse.e(iku2, "androidFutures");
        jse.e(jnu2, "traceCreation");
        jse.e(jnu3, "packageInfoProvider");
        this.a = object;
        this.i = dtu2;
        this.j = map;
        this.b = map2;
        this.c = hpq2;
        this.d = iku2;
        this.e = jnu2;
        this.f = jnu3;
        if (jns.v(map.keySet(), map2.keySet()).isEmpty()) {
            this.g = (Boolean)gto2.e(false);
            object = map2;
            if (dtu2.b()) {
                object = jjj.I(map, map2);
            }
            this.h = object;
            return;
        }
        object = jns.v(map.keySet(), map2.keySet());
        Objects.toString(object);
        throw new IllegalStateException("Don't provide both an unannotated and @AllProcessesStartupAfterPackageReplacedListener StartupAfterPackageReplacedListener provider for keys ".concat(object.toString()));
    }

    public static final int b(RandomAccessFile randomAccessFile) {
        int n2;
        try {
            n2 = randomAccessFile.readInt();
        }
        catch (Throwable throwable) {
            randomAccessFile.seek(0L);
            throw throwable;
        }
        catch (EOFException eOFException) {
            n2 = -1;
        }
        randomAccessFile.seek(0L);
        return n2;
    }

    public final void a(boolean bl2) {
        gol gol2 = fxf.aq("StartupAfterPackageReplaced");
        try {
            Object object = new ghc(this, bl2);
            object = fxf.ai((hnx)object, this.c);
            gax gax2 = (gax)this.d.b();
            gol2.a((hpn)object);
            Object object2 = TimeUnit.SECONDS;
            Object object3 = gax2.d;
            ffe ffe2 = new ffe(object, object2, 13, null);
            object2 = object3.b(gqk.i(ffe2), 30L, (TimeUnit)((Object)object2));
            object3 = new ffe(object2, object, 14);
            object.c(gqk.i((Runnable)object3), gax2.c);
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                jsd.f(gol2, throwable);
                throw throwable2;
            }
        }
        jsd.f(gol2, null);
    }
}

