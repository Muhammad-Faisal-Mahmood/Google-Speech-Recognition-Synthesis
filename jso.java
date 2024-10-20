/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class jso
extends jst {
    public abstract Random a();

    @Override
    public final int b() {
        return this.a().nextInt(0x7FFF0000);
    }
}

