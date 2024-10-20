/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;

final class izt {
    final InputStream a;
    final byte[] b;
    final int c;
    final boolean d;

    public izt(InputStream inputStream, byte[] byArray, int n2, boolean bl2) {
        this.a = inputStream;
        this.b = byArray;
        this.c = n2;
        this.d = bl2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransactionData[");
        stringBuilder.append(this.c);
        stringBuilder.append("b ");
        String string = this.a != null ? "stream" : "array";
        stringBuilder.append(string);
        string = true != this.d ? "]" : "(last)]";
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

