/*
 * Decompiled with CFR 0.152.
 */
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class imj
implements imb {
    public static final imb a = imc.a(Collections.emptySet());
    private final List b;
    private final List c;

    public imj(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    public final Set a() {
        Collection<Object> collection;
        int n2;
        ArrayList<Collection<Object>> arrayList = this.c;
        int n3 = this.b.size();
        arrayList = new ArrayList<Collection<Object>>(arrayList.size());
        int n4 = this.c.size();
        int n5 = 0;
        for (n2 = 0; n2 < n4; ++n2) {
            collection = (Collection)((img)this.c.get(n2)).b();
            n3 += collection.size();
            arrayList.add(collection);
        }
        collection = new HashSet(fvc.ah(n3));
        n3 = this.b.size();
        for (n2 = 0; n2 < n3; ++n2) {
            Object object = ((img)this.b.get(n2)).b();
            idi.l(object);
            collection.add(object);
        }
        n3 = arrayList.size();
        for (n2 = n5; n2 < n3; ++n2) {
            for (Object object : (Collection)arrayList.get(n2)) {
                idi.l(object);
                collection.add(object);
            }
        }
        return DesugarCollections.unmodifiableSet(collection);
    }
}

