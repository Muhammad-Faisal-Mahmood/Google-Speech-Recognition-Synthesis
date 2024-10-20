/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Callable;

final class ccc
extends ccd {
    private final Callable d;

    public ccc(Callable callable) {
        super(false, null);
        this.d = callable;
    }

    @Override
    public final void a() {
        try {
            String string = (String)this.d.call();
            return;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

