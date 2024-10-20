/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ThreadFactory;

public final class coe
implements ThreadFactory {
    private final int a;

    public /* synthetic */ coe(int n2) {
        this.a = n2;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
            }
            return new ui(runnable);
        }
        return new Thread(runnable);
    }
}

