/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hgi
implements hge {
    @Override
    public final /* synthetic */ void a(hez hez2, Iterator iterator, Object object) {
        if (hez2.b) {
            if (hez2.c && hgt.a() > 20) {
                while (iterator.hasNext()) {
                    object.a(hez2.a, iterator.next());
                }
                return;
            }
            hez2.a(iterator, (hey)object);
            return;
        }
        throw new IllegalStateException("non repeating key");
    }
}

