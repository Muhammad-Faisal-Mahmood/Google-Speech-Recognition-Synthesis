/*
 * Decompiled with CFR 0.152.
 */
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class dvc
extends InputStream
implements InputStreamRetargetInterface {
    final fqa a;

    public dvc(fqa fqa2) {
        this.a = fqa2;
    }

    @Override
    public final int read() {
        byte[] byArray = new byte[1];
        if (this.read(byArray) == -1) {
            return -1;
        }
        return byArray[0];
    }

    @Override
    public final int read(byte[] object, int n2, int n3) {
        block5: {
            try {
                n2 = ((Inflater)this.a.a).inflate((byte[])object, n2, n3);
                if (n2 > 0) {
                    return n2;
                }
                if (n3 != 0) break block5;
                return 0;
            }
            catch (DataFormatException dataFormatException) {
                throw new IOException(dataFormatException);
            }
        }
        n2 = ((Inflater)this.a.a).getRemaining();
        if (n2 == 0) {
            return -1;
        }
        n2 = ((Inflater)this.a.a).getRemaining();
        object = new StringBuilder("Read no bytes (requested up to ");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(") but did not reach end of stream, had ");
        ((StringBuilder)object).append(n2);
        throw new IOException(((StringBuilder)object).toString());
    }

    @Override
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}

