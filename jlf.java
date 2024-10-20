/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.logging.Logger;

final class jlf {
    static {
        Logger.getLogger(jlf.class.getName());
    }

    private jlf() {
    }

    public static byte[][] a(List object) {
        int n2 = object.size();
        byte[][] byArrayArray = new byte[n2 + n2][];
        object = object.iterator();
        n2 = 0;
        while (object.hasNext()) {
            jlv jlv2 = (jlv)object.next();
            byArrayArray[n2] = jlv2.f.k();
            byArrayArray[n2 + 1] = jlv2.g.k();
            n2 += 2;
        }
        return jju.b(byArrayArray);
    }
}

