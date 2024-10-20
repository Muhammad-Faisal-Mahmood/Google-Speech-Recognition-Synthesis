/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

public final class ue
implements Callable {
    final String a;
    final Context b;
    final List c;
    final int d;

    public ue(String string, Context context, List list, int n2) {
        this.a = string;
        this.b = context;
        this.c = list;
        this.d = n2;
    }

    public final hti a() {
        try {
            hti hti2 = ug.b(this.a, this.b, this.c, this.d);
            return hti2;
        }
        catch (Throwable throwable) {
            return new hti(-3);
        }
    }
}

