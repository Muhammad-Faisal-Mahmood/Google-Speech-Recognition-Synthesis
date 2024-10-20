/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

@Deprecated
final class abq
implements abc {
    private final Object a;
    private final aap b;

    public abq(Object object) {
        this.a = object;
        this.b = aar.a.b(object.getClass());
    }

    @Override
    public final void a(abe abe2, aaz aaz2) {
        aap aap2 = this.b;
        List list = (List)aap2.a.get((Object)aaz2);
        Object object = this.a;
        aap.a(list, abe2, aaz2, object);
        aap.a((List)aap2.a.get((Object)aaz.ON_ANY), abe2, aaz2, object);
    }
}

