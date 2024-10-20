/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class gjv
implements imb {
    private final jnu a;

    public gjv(jnu jnu2) {
        this.a = jnu2;
    }

    public final Map a() {
        Set<jnu> set = (Set<jnu>)((imc)this.a).a;
        ot ot2 = new ot();
        for (AbstractMap.SimpleImmutableEntry simpleImmutableEntry : set) {
            Set set2 = (Set)ot2.get(simpleImmutableEntry.getKey());
            set = set2;
            if (set2 == null) {
                set = Collections.newSetFromMap(new ot());
                ot2.put((gjt)simpleImmutableEntry.getKey(), set);
            }
            set.add((jnu)simpleImmutableEntry.getValue());
        }
        return ot2;
    }
}

