/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class ilj
implements ilw {
    public final aco a;
    public final Context b;
    private final Object c = new Object();
    private volatile brc d;

    public ilj(Context context, gib gib2) {
        this.a = gib2;
        this.b = context;
    }

    public ilj(mr mr2) {
        this.a = mr2;
        this.b = mr2;
    }

    public static final acn a(aco aco2, Context context) {
        return new acn(aco2, (ack)new ilf(context, 0));
    }
}

