/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;
import java.util.List;

final class iyf
implements iww {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ Object a(byte[] object) {
        void var1_5;
        block4: {
            int n2;
            int n3;
            block5: {
                block3: {
                    List list = iyh.a;
                    int n4 = ((byte[])object).length;
                    n3 = 0;
                    n2 = n4;
                    if (n4 == 1) {
                        if (object[0] == 48) {
                            iyh iyh2 = iyh.b;
                            return var1_5;
                        }
                        n2 = 1;
                    }
                    if (n2 == 1) break block3;
                    if (n2 != 2 || (n2 = object[0]) < 48 || n2 > 57) break block4;
                    n2 = (n2 - 48) * 10;
                    n3 = 1;
                    break block5;
                }
                n2 = 0;
            }
            n3 = object[n3];
            if (n3 >= 48 && n3 <= 57 && (n2 += n3 - 48) < iyh.a.size()) {
                iyh iyh3 = (iyh)iyh.a.get(n2);
                return var1_5;
            }
        }
        iyh iyh4 = iyh.d.e("Unknown code ".concat(new String((byte[])object, StandardCharsets.US_ASCII)));
        return var1_5;
    }
}

