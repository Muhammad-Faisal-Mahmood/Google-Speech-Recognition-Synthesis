/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Map;

public final class jjh {
    public final String a;
    public final Map b;

    public jjh(String string, Map map) {
        a.s(string, "policyName");
        this.a = string;
        a.s(map, "rawConfigValue");
        this.b = map;
    }

    public final boolean equals(Object object) {
        if (object instanceof jjh) {
            object = (jjh)object;
            if (this.a.equals(((jjh)object).a) && this.b.equals(((jjh)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        gtn gtn2 = fxf.R(this);
        gtn2.b("policyName", this.a);
        gtn2.b("rawConfigValue", this.b);
        return gtn2.toString();
    }
}

