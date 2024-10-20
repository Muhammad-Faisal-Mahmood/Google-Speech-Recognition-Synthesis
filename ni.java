/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class ni {
    public final Set a = new CopyOnWriteArraySet();
    public volatile Context b;

    public final void a() {
        this.b = null;
    }

    public final void b(Context context) {
        jse.e(context, "context");
        this.b = context;
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((nj)iterator.next()).a(context);
        }
    }
}

