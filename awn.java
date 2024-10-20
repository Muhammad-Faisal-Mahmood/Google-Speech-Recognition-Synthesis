/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class awn {
    public String a;
    public awm b;
    public boolean c;
    public boolean d;
    private final Context e;

    public awn(Context context) {
        jse.e(context, "context");
        this.e = context;
    }

    public final duj a() {
        awm awm2 = this.b;
        if (awm2 != null) {
            String string;
            if (this.c && ((string = this.a) == null || string.length() == 0)) {
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            return new duj(this.e, this.a, awm2, this.c, this.d);
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}

