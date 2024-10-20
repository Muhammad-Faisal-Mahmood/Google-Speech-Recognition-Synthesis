/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;

public final class knm
implements AutoCloseable {
    public knm(String string) {
        Trace.beginSection((String)string);
    }

    @Override
    public final void close() {
        Trace.endSection();
    }
}

