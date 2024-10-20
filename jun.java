/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;

public final class jun
extends jut {
    public final jtz a;

    public jun(jqb jqb2, Throwable throwable, boolean bl2) {
        Throwable throwable2 = throwable;
        if (throwable == null) {
            throwable2 = new CancellationException(a.ak(jqb2, "Continuation ", " was cancelled normally"));
        }
        super(throwable2, bl2);
        this.a = new jtz(false, jud.a);
    }
}

