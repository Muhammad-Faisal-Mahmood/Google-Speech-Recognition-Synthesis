/*
 * Decompiled with CFR 0.152.
 */
import org.chromium.base.ThreadUtils;

public final class knu
extends knt
implements knr {
    public knu(int n2) {
        super(n2, "UiThreadTaskRunner", 2);
    }

    @Override
    protected final void c() {
        ThreadUtils.a().post(this.e);
    }
}

