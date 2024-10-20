/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

public final class cig {
    public static final int a;

    static {
        int n2 = Build.VERSION.SDK_INT >= 31 ? 0x2000000 : 0;
        a = n2;
    }
}

