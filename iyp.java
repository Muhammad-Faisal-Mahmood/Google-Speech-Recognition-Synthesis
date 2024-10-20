/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.net.SocketAddress;

public final class iyp
extends SocketAddress {
    private static final long serialVersionUID = 0L;
    public final Intent a;

    protected iyp(Intent intent) {
        boolean bl2;
        ComponentName componentName = intent.getComponent();
        boolean bl3 = bl2 = true;
        if (componentName == null) {
            bl3 = intent.getPackage() != null ? bl2 : false;
        }
        fxf.r(bl3, "'bindIntent' must be explicit. Specify either a package or ComponentName.");
        this.a = intent;
    }

    public static iyp a(Context context) {
        return iyp.b(context, context.getClass());
    }

    public static iyp b(Context context, Class clazz) {
        context = new ComponentName(context, clazz);
        return new iyp(new Intent("grpc.io.action.BIND").setComponent((ComponentName)context));
    }

    public final String c() {
        if (this.a.getPackage() != null) {
            return this.a.getPackage();
        }
        return this.a.getComponent().getPackageName();
    }

    public final boolean equals(Object object) {
        if (object instanceof iyp) {
            object = (iyp)object;
            return this.a.filterEquals(((iyp)object).a);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent;
        Intent intent2 = intent = this.a;
        if (intent.getPackage() != null) {
            intent2 = intent.cloneFilter().setPackage(null);
        }
        return intent2.filterHashCode();
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("AndroidComponentAddress[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

