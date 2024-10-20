/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicReference;

public abstract class kmt {
    public static final AtomicReference a = new AtomicReference();

    private kmt() {
    }

    public static kmt a() {
        return (kmt)a.get();
    }

    public abstract String b();

    public abstract boolean c();
}

