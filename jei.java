/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

final class jei
extends ive {
    private final Map a;

    public jei(Map map) {
        this.a = map;
    }

    @Override
    public final ksb a(String string) {
        return (ksb)this.a.get(string);
    }
}

