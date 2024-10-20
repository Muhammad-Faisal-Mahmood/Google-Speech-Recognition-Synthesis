/*
 * Decompiled with CFR 0.152.
 */
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public final class jsu
extends jso {
    @Override
    public final Random a() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        jse.d(threadLocalRandom, "current(...)");
        return threadLocalRandom;
    }
}

