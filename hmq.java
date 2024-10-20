/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class hmq
extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public final List a;

    public hmq(List list) {
        super("Cyclical graphs can not be topologically sorted.");
        this.a = list;
    }
}

