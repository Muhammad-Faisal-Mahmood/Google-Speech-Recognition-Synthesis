/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

final class ixr
implements ixs {
    private final Object a;
    private final Object b;
    private final int c;

    public ixr(Object object, Object object2, int n2) {
        this.c = n2;
        this.a = object;
        this.b = object2;
    }

    @Override
    public final int a() {
        if (this.c != 0) {
            return ((Object[])this.b).length;
        }
        return 1;
    }

    @Override
    public final ixs c(Object object, Object object2, int n2, int n3) {
        int n4;
        int n5 = this.c;
        if (n5 != 0) {
            n5 = ((Object[])this.a)[0].hashCode();
            if (n5 != n2) {
                object = ixq.b(new ixr(object, object2, 0), n2, this, n5, n3);
            } else {
                Object object3;
                block11: {
                    for (n4 = 0; n4 < (n2 = ((Object[])(object3 = (Object[])this.a)).length); ++n4) {
                        if (object3[n4] != object) {
                            continue;
                        }
                        break block11;
                    }
                    n4 = -1;
                }
                if (n4 != -1) {
                    Object[] objectArray = Arrays.copyOf(object3, n2);
                    object3 = this.b;
                    n2 = ((Object[])this.a).length;
                    object3 = Arrays.copyOf(object3, n2);
                    objectArray[n4] = object;
                    object3[n4] = object2;
                    object = new ixr(objectArray, object3, 1);
                } else {
                    Object[] objectArray = this.b;
                    object3 = Arrays.copyOf(object3, ++n2);
                    Object object4 = this.a;
                    objectArray = Arrays.copyOf((Object[])objectArray, n2);
                    object3[((Object[])object4).length] = object;
                    objectArray[((Object[])this.a).length] = object2;
                    object = new ixr(object3, objectArray, 1);
                }
            }
            return object;
        }
        n4 = this.a.hashCode();
        if (n4 != n2) {
            object = ixq.b(new ixr(object, object2, 0), n2, this, n4, n3);
        } else {
            Object object5 = this.a;
            if (object5 == object) {
                object = new ixr(object, object2, 0);
            } else {
                Object object6 = this.b;
                object = new ixr(new Object[]{object5, object}, new Object[]{object6, object2}, 1);
            }
        }
        return object;
    }

    @Override
    public final Object d(Object object, int n2, int n3) {
        n2 = this.c;
        Object object2 = null;
        if (n2 != 0) {
            Object object3;
            n2 = 0;
            while (true) {
                Object[] objectArray = (Object[])this.a;
                object3 = object2;
                if (n2 >= objectArray.length) break;
                if (objectArray[n2] == object) {
                    object3 = ((Object[])this.b)[n2];
                    break;
                }
                ++n2;
            }
            return object3;
        }
        if (this.a == object) {
            return this.b;
        }
        return null;
    }

    public final String toString() {
        int n2 = this.c;
        if (n2 != 0) {
            StringBuilder stringBuilder = new StringBuilder("CollisionLeaf(");
            for (int i2 = 0; i2 < ((Object[])this.b).length; ++i2) {
                stringBuilder.append("(key=");
                stringBuilder.append(((Object[])this.a)[i2]);
                stringBuilder.append(" value=");
                stringBuilder.append(((Object[])this.b)[i2]);
                stringBuilder.append(") ");
            }
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
        return String.format("Leaf(key=%s value=%s)", this.a, this.b);
    }
}

