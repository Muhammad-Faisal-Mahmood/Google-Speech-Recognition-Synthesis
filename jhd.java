/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public final class jhd
extends iwi {
    public static final int a = 0;
    private static final boolean b = jeb.j("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST");

    @Override
    public final iwh a(ivz ivz2) {
        if (b) {
            return new jgx(ivz2);
        }
        return new jhc(ivz2);
    }

    @Override
    public final ixd b(Map object) {
        try {
            Boolean bl2 = jew.a((Map)object, "shuffleAddressList");
            object = b ? new jgt(bl2) : new jgz(bl2);
            object = new ixd(object);
            return object;
        }
        catch (RuntimeException runtimeException) {
            return new ixd(iyh.k.d(runtimeException).e("Failed parsing configuration for pick_first"));
        }
    }

    @Override
    public final String c() {
        return "pick_first";
    }

    @Override
    public final void d() {
    }

    @Override
    public final void e() {
    }
}

