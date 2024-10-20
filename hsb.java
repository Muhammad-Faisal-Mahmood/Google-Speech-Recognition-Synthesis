/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.function.Supplier;

public final class hsb
implements Supplier {
    public final Object a;
    private final int b;

    public /* synthetic */ hsb(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public final Object get() {
        if (this.b != 0) {
            return ((fgw)this.a).d();
        }
        return new koi((Context)this.a);
    }
}

