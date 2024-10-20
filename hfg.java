/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

final class hfg
extends ThreadLocal {
    protected final /* synthetic */ Object initialValue() {
        return new Random();
    }
}

