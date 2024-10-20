/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class eeg
implements dzj {
    private final dzj a;
    private final int b;

    public eeg(dzj dzj2, int n2) {
        this.a = dzj2;
        this.b = n2;
    }

    @Override
    public final Executor a() {
        Executor executor = this.a.a();
        jse.d(executor, "getExecutor(...)");
        return executor;
    }

    @Override
    public final void b(dzn dzn2) {
        jse.e(dzn2, "audioData");
        Object object = dzn2;
        if ((dzn2.b & 4) != 0) {
            object = (hwp)dzn2.C(5);
            ((hwp)object).x(dzn2);
            object = dox.g((hwp)object);
            ((cxt)object).i(dzn2.g - this.b);
            object = ((cxt)object).e();
        }
        this.a.b((dzn)object);
    }
}

