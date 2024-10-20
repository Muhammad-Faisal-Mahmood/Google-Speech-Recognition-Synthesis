/*
 * Decompiled with CFR 0.152.
 */
import java.io.FilterOutputStream;
import java.io.OutputStream;

public class fqg
extends FilterOutputStream {
    public fqg(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    public void write(byte[] byArray) {
        this.out.write(byArray);
    }

    @Override
    public void write(byte[] byArray, int n2, int n3) {
        this.out.write(byArray, n2, n3);
    }
}

