/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec$CodecException
 */
import android.media.MediaCodec;

public final class alw
extends ahv {
    public final int a;

    public alw(Throwable throwable, alx object) {
        object = object == null ? null : ((alx)object).a;
        super("Decoder failed: ".concat(String.valueOf(object)), throwable);
        boolean bl2 = throwable instanceof MediaCodec.CodecException;
        if (bl2) {
            ((MediaCodec.CodecException)throwable).getDiagnosticInfo();
        }
        int n2 = agf.a;
        n2 = bl2 ? ((MediaCodec.CodecException)throwable).getErrorCode() : 0;
        this.a = n2;
    }
}

