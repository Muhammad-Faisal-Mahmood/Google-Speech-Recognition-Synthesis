/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.RejectedExecutionException;

public final class kor
extends RejectedExecutionException {
    public kor() {
        super("Inline execution is prohibited for this request");
    }
}

