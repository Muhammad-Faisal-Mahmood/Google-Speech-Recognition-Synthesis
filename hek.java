/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

final class hek
extends hez {
    public hek(Class clazz) {
        super("group_by", clazz, true);
    }

    @Override
    public final void a(Iterator object, hey hey2) {
        if (object.hasNext()) {
            Object e2 = object.next();
            if (!object.hasNext()) {
                hey2.a(this.a, e2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("[");
            stringBuilder.append(e2);
            do {
                stringBuilder.append(',');
                stringBuilder.append(object.next());
            } while (object.hasNext());
            object = this.a;
            stringBuilder.append(']');
            hey2.a((String)object, stringBuilder.toString());
        }
    }
}

