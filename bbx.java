/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.List;
import java.util.UUID;

public abstract class bbx {
    public static bbx d(Context context) {
        jse.e(context, "context");
        return bdn.i(context);
    }

    public abstract bbp a(String var1);

    public abstract bbp b(UUID var1);

    public abstract bbp c(List var1);

    public abstract bbp e(String var1, int var2, List var3);

    public final bbp f(bmu bmu2) {
        return this.c(jns.d(bmu2));
    }

    public abstract bbp g(String var1, int var2, bmu var3);

    public abstract hpn h(bzb var1);
}

