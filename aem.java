/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class aem
extends IOException {
    public final boolean a;
    public final int b;

    public aem(String string, Throwable throwable, boolean bl2, int n2) {
        super(string, throwable);
        this.a = bl2;
        this.b = n2;
    }

    @Override
    public final String getMessage() {
        String string = super.getMessage();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" {contentIsMalformed=");
        stringBuilder.append(this.a);
        stringBuilder.append(", dataType=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

