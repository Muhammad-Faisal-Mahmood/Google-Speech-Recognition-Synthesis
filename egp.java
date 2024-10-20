/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 *  android.os.ParcelFileDescriptor$AutoCloseInputStream
 */
import android.os.ParcelFileDescriptor;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

public final class egp
extends ParcelFileDescriptor.AutoCloseInputStream
implements InputStreamRetargetInterface,
efr {
    private static final hei a = hei.m("com/google/android/libraries/search/audio/audiosource/impl/audiostream/AudioPfdStream");
    private final AtomicBoolean b = new AtomicBoolean(false);

    public egp(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor);
    }

    @Override
    public final /* synthetic */ eft a(byte[] byArray, int n2) {
        return new eft(this.read(byArray, 0, n2), 0L, 6, null);
    }

    public final void b() {
        this.b.set(true);
        super.close();
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        try {
            n2 = super.read(byArray, n2, n3);
            if (n2 >= 0) {
                return n2;
            }
            return -1;
        }
        catch (IOException iOException) {
            if (this.b.get()) {
                ((heg)((heg)a.f()).j("com/google/android/libraries/search/audio/audiosource/impl/audiostream/AudioPfdStream", "read", 28, "AudioPfdStream.java")).r("#audio# IOException is ignored as the AudioPfdStream has been closed intentionally.");
                return -1;
            }
            throw iOException;
        }
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo((InputStream)((Object)this), outputStream);
    }
}

