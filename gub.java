/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class gub
implements gue {
    final Object a;
    private final int b;

    public gub(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final /* synthetic */ Iterator a(guf guf2, CharSequence charSequence) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                return new guc(guf2, charSequence, ((gsz)this.a).a(charSequence));
            }
            return new gtz(guf2, charSequence, (gsy)this.a);
        }
        return new gua(guf2, charSequence, (String)this.a);
    }
}

