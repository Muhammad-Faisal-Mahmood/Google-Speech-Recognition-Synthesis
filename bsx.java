/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;

public final class bsx
implements imb {
    private final jnu a;
    private final jnu b;

    public bsx(jnu jnu2, jnu jnu3) {
        this.a = jnu2;
        this.b = jnu3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final dbx a() {
        Object object = (Context)this.a.b();
        bud bud2 = ((btv)this.b).a();
        Object object2 = dbk.a;
        object = object.getAssets().open(object.getString(2132017466));
        try {
            object2 = ((dbl)object2).a((InputStream)object, "ttsvoices", bud2.b);
            if (object == null) return object2;
        }
        catch (Throwable throwable) {
            if (object == null) throw throwable;
            try {
                ((InputStream)object).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    throwable.addSuppressed(throwable2);
                    throw throwable;
                }
                catch (dbo dbo2) {
                    throw new IllegalStateException("Error parsing superpacks-manifest: ", dbo2);
                }
                catch (IOException iOException) {
                    throw new UncheckedIOException("Error reading superpacks-manifest: ", iOException);
                }
            }
        }
        ((InputStream)object).close();
        return object2;
    }
}

