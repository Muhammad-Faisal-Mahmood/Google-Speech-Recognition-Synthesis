/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.Editable$Factory
 */
import android.text.Editable;

public final class zp
extends Editable.Factory {
    private static final Object a = new Object();
    private static volatile Editable.Factory b;
    private static Class c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private zp() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ((Object)((Object)this)).getClass().getClassLoader());
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Editable.Factory a() {
        if (b != null) return b;
        Object object = a;
        synchronized (object) {
            if (b != null) return b;
            zp zp2 = new zp();
            b = zp2;
            return b;
        }
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class clazz = c;
        if (clazz != null) {
            return new zo(clazz, charSequence);
        }
        return super.newEditable(charSequence);
    }
}

