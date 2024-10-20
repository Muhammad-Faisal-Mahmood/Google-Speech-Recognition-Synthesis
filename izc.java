/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Handler
 */
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class izc
implements jco {
    final Context a;
    final Executor b;
    final jgp c;
    final jgp d;
    final iyx e;
    final iyr f;
    final iyu g;
    ScheduledExecutorService h;
    Executor i;
    private boolean j;

    public izc(izb izb2) {
        Object object = izb2.a;
        fxf.K(object);
        this.a = object;
        fxf.K(izb2.h);
        object = Build.VERSION.SDK_INT >= 28 ? fs$$ExternalSyntheticApiModelOutline0.m((Context)object) : new uj(new Handler(object.getMainLooper()), 1);
        this.b = object;
        object = izb2.c;
        this.c = object;
        jgp jgp2 = izb2.b;
        fxf.K(jgp2);
        this.d = jgp2;
        this.e = izb2.d;
        this.f = izb2.e;
        this.g = izb2.f;
        fxf.K(izb2.g);
        this.h = (ScheduledExecutorService)object.a();
        this.i = jgp2.a();
    }

    @Override
    public final Collection b() {
        return Collections.singleton(iyp.class);
    }

    @Override
    public final ScheduledExecutorService c() {
        return this.h;
    }

    @Override
    public final void close() {
        this.j = true;
        this.c.b(this.h);
        this.h = null;
        this.d.b(this.i);
        this.i = null;
    }
}

