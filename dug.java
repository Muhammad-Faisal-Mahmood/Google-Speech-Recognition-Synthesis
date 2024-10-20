/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.Log
 */
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

public final class dug
extends dul {
    public dug(duj duj2, String string, Object object) {
        super(duj2, string, object, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final Object a(Object object) {
        if (object instanceof String) {
            try {
                byte[] byArray = Base64.decode((String)((String)object), (int)3);
                ikt ikt2 = ikt.a;
                int n2 = byArray.length;
                Object object2 = hwj.a;
                object2 = hyo.a;
                hwv hwv2 = hwv.o(ikt2, byArray, 0, n2, hwj.a);
                hwv.D(hwv2);
                return (ikt)hwv2;
            }
            catch (IOException | IllegalArgumentException exception) {}
        }
        String string = super.d();
        String string2 = String.valueOf(object);
        object = new StringBuilder("Invalid byte[] value for ");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(": ");
        ((StringBuilder)object).append(string2);
        Log.e((String)"PhenotypeFlag", (String)((StringBuilder)object).toString());
        return null;
    }
}

