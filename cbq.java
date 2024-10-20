/*
 * Decompiled with CFR 0.152.
 */
import java.security.MessageDigest;
import java.util.concurrent.Callable;

public final class cbq
implements Callable {
    public final boolean a;
    public final String b;
    public final cfu c;

    public /* synthetic */ cbq(boolean bl2, String string, cfu cfu2) {
        this.a = bl2;
        this.b = string;
        this.c = cfu2;
    }

    public final Object call() {
        Object object = cby.c;
        String string = this.b;
        Object object2 = this.c;
        boolean bl2 = this.a;
        object = !bl2 && cby.d((String)string, (cfu)object2, (boolean)true, (boolean)false).b ? "debug cert rejected" : "not allowed";
        Object object3 = cgs.a();
        kl.at(object3);
        object2 = ((MessageDigest)object3).digest(((cbv)object2).a);
        object3 = cgu.a;
        int n2 = ((Object)object2).length;
        char[] cArray = new char[n2 + n2];
        int n3 = 0;
        n2 = 0;
        while (true) {
            int n4 = n2;
            if (n3 >= ((Object)object2).length) break;
            Object object4 = object2[n3];
            object3 = cgu.a;
            cArray[n4] = (char)object3[(object4 & 0xFF) >>> 4];
            n2 = n4 + 2;
            cArray[n4 + 1] = (char)object3[object4 & 0xF];
            ++n3;
        }
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", object, string, new String(cArray), bl2, "244030000.false");
    }
}

