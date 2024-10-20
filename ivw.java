/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public final class ivw {
    public final List a;
    public final its b;
    private final Object[][] c;

    public ivw(List list, its its2, Object[][] objectArray) {
        a.s(list, "addresses are not set");
        this.a = list;
        a.s(its2, "attrs");
        this.b = its2;
        a.s(objectArray, "customOptions");
        this.c = objectArray;
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("addrs", this.a);
        gtn2.b("attrs", this.b);
        gtn2.b("customOptions", Arrays.deepToString((Object[])this.c));
        return gtn2.toString();
    }
}

