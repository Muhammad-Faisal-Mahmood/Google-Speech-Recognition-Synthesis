/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipInputStream;

final class dhp
extends InputStream
implements InputStreamRetargetInterface {
    final ZipInputStream a;

    public dhp(ZipInputStream zipInputStream) {
        this.a = zipInputStream;
    }

    @Override
    public final int available() {
        return this.a.available();
    }

    @Override
    public final void close() {
    }

    @Override
    public final int read() {
        return this.a.read();
    }

    @Override
    public final int read(byte[] byArray, int n2, int n3) {
        return this.a.read(byArray, n2, n3);
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

