/*
 * Decompiled with CFR 0.152.
 */
import java.net.ProxySelector;

final class jhe
implements gui {
    private final int a;

    public jhe(int n2) {
        this.a = n2;
    }

    @Override
    public final /* synthetic */ Object a() {
        if (this.a != 0) {
            return new guh();
        }
        return ProxySelector.getDefault();
    }
}

