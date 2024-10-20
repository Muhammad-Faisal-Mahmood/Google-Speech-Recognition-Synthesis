/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

final class ae
extends ah {
    private final boolean b;
    private boolean c;
    private awg d;

    public ae(cy cy2, boolean bl2) {
        jse.e(cy2, "operation");
        super(cy2);
        this.b = bl2;
    }

    public final awg a(Context object) {
        jse.e(object, "context");
        if (this.c) {
            object = this.d;
        } else {
            cy cy2 = this.a;
            boolean bl2 = cy2.a == cx.b;
            boolean bl3 = this.b;
            object = a.ad(object, cy2.c, bl2, bl3);
            this.d = object;
            this.c = true;
        }
        return object;
    }
}

