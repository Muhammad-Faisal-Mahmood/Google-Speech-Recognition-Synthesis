/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;

public final class dwd
implements dwf {
    public final Object a;
    private final int b;

    public /* synthetic */ dwd(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object a(Object object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return (String)((Class)this.a).cast(object);
                    }
                    return (Boolean)((Class)this.a).cast(object);
                }
                object = (byte[])object;
                return this.a.a(object);
            }
            return (Long)((Class)this.a).cast(object);
        }
        object = Base64.decode((String)((String)object), (int)3);
        return this.a.a(object);
    }
}

