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

public final class duh
extends dul {
    final dui a;

    public duh(duj duj2, String string, dui dui2) {
        this.a = dui2;
        super(duj2, string);
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
                return this.a.a(Base64.decode((String)((String)object), (int)3));
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

