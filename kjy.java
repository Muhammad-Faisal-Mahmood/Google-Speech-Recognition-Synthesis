/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Objects;

public final class kjy
extends IOException {
    public final kiq a;

    public kjy(kiq kiq2) {
        jse.e((Object)kiq2, "errorCode");
        Objects.toString((Object)kiq2);
        super("stream was reset: ".concat(String.valueOf((Object)kiq2)));
        this.a = kiq2;
    }
}

