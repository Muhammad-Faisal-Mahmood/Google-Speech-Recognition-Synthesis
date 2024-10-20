/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

public class ags
extends IOException {
    public final int a;

    public ags(int n2) {
        this.a = n2;
    }

    public ags(String string, int n2) {
        super(string);
        this.a = n2;
    }

    public ags(String string, Throwable throwable, int n2) {
        super(string, throwable);
        this.a = n2;
    }

    public ags(Throwable throwable, int n2) {
        super(throwable);
        this.a = n2;
    }
}

