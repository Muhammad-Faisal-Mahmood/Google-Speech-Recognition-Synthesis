/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class fqf
extends FilterInputStream
implements InputStreamRetargetInterface {
    public fqf(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read(byte[] byArray) {
        return this.in.read(byArray);
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

