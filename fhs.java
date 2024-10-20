/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.ParcelFileDescriptor
 */
import android.os.Build;
import android.os.ParcelFileDescriptor;

public final class fhs {
    public static final htx a;
    public static final htx b;
    public static final htz c;

    static {
        Object object = ParcelFileDescriptor.CREATOR;
        jse.d(object, "CREATOR");
        object = idi.C("ParcelFileDescriptor", object);
        a = object;
        Object object2 = ut$$ExternalSyntheticApiModelOutline0.m();
        jse.d(object2, "CREATOR");
        object2 = idi.C("AttributionSource", object2);
        b = object2;
        object = Build.VERSION.SDK_INT >= 35 ? new htz(new htx[]{object, object2}) : new htz(new htx[]{object});
        c = object;
    }
}

