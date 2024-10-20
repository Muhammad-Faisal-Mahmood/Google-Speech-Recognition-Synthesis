/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.graphics.drawable.Icon
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 */
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public final class si {
    final Bundle a;
    public final boolean b;
    boolean c;
    @Deprecated
    public int d;
    public final CharSequence e;
    public final PendingIntent f;
    public final kl[] g;
    private IconCompat h;

    public si(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, kl[] klArray) {
        int n2;
        block8: {
            int n3;
            this.c = true;
            this.h = iconCompat;
            n2 = n3 = iconCompat.b;
            if (n3 == -1) {
                Object object = iconCompat.c;
                if (Build.VERSION.SDK_INT >= 28) {
                    n2 = fs$$ExternalSyntheticApiModelOutline0.m$1((Icon)object);
                } else {
                    try {
                        n2 = (Integer)object.getClass().getMethod("getType", null).invoke(object, null);
                        break block8;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        Objects.toString(object);
                        Log.e((String)"IconCompat", (String)"Unable to get icon type ".concat(String.valueOf(object)), (Throwable)noSuchMethodException);
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        Objects.toString(object);
                        Log.e((String)"IconCompat", (String)"Unable to get icon type ".concat(String.valueOf(object)), (Throwable)invocationTargetException);
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        Objects.toString(object);
                        Log.e((String)"IconCompat", (String)"Unable to get icon type ".concat(String.valueOf(object)), (Throwable)illegalAccessException);
                    }
                    n2 = -1;
                }
            }
        }
        if (n2 == 2) {
            this.d = iconCompat.a();
        }
        this.e = sk.c(charSequence);
        this.f = pendingIntent;
        this.a = bundle;
        this.g = klArray;
        this.b = true;
        this.c = true;
    }

    public final IconCompat a() {
        int n2;
        if (this.h == null && (n2 = this.d) != 0) {
            this.h = IconCompat.c(n2);
        }
        return this.h;
    }
}

