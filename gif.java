/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 */
import android.content.Context;
import android.content.ContextWrapper;

public final class gif
extends ContextWrapper
implements ilw {
    private final gie a;

    public gif(Context context, gib gib2) {
        super(context);
        this.a = new gie(context, gib2);
    }

    @Override
    public final Object bn() {
        return this.a.bn();
    }
}

