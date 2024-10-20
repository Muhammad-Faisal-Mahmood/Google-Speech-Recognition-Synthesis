/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

public final class hcg
extends gwy {
    private static final long serialVersionUID = 0L;
    transient gui c;

    public hcg(Map map, gui gui2) {
        super(map);
        this.c = gui2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (gui)Objects.requireNonNull(objectInputStream.readObject());
        this.l((Map)Objects.requireNonNull(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        objectOutputStream.writeObject(this.a);
    }

    @Override
    public final Map i() {
        Map map = this.a;
        map = map instanceof NavigableMap ? new gxf((gxp)this, (NavigableMap)map) : (map instanceof SortedMap ? new gxi((gxp)this, (SortedMap)map) : new gxb(this, map));
        return map;
    }

    @Override
    public final Set j() {
        Object object = this.a;
        object = object instanceof NavigableMap ? new gxg((gxp)this, (NavigableMap)object) : (object instanceof SortedMap ? new gxj((gxp)this, (SortedMap)object) : new gxe(this, (Map)object));
        return object;
    }
}

