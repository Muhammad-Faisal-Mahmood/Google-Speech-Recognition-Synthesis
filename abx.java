/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Objects;

public final class abx
implements abc {
    private final int a;
    private final Object b;

    public abx(aau aau2, int n2) {
        this.a = n2;
        jse.e(aau2, "generatedAdapter");
        this.b = aau2;
    }

    public abx(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final void a(abe aauArray, aaz aaz2) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                this.b.a();
                this.b.a();
                return;
            }
            new HashMap();
            int n3 = 0;
            n2 = 0;
            while (true) {
                aauArray = (aau[])this.b;
                if (n2 >= aauArray.length) break;
                aauArray[n2].a();
                ++n2;
            }
            for (int i2 = n3; i2 < aauArray.length; ++i2) {
                aauArray[i2].a();
            }
            return;
        }
        if (aaz2 == aaz.ON_CREATE) {
            aauArray.getLifecycle().c(this);
            ((acc)this.b).b();
            return;
        }
        Objects.toString((Object)aaz2);
        throw new IllegalStateException("Next event must be ON_CREATE, it was ".concat(((Object)((Object)aaz2)).toString()));
    }
}

