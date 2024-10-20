/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

public final class sr
implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    public sr(Context context) {
        this.b = context;
    }

    @Deprecated
    public final Iterator iterator() {
        return this.a.iterator();
    }
}

