/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class gwy
extends gxp
implements hce {
    private static final long serialVersionUID = 6588350623831699109L;

    protected gwy(Map map) {
        super(map);
    }

    @Override
    public final Collection c(Object object, Collection collection) {
        return this.h(object, (List)collection, null);
    }

    public final List d(Object object) {
        return (List)super.b(object);
    }
}

