/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class hhp
extends AbstractMap {
    public static final Comparator a = new dfs(8);
    public final Object[] b;
    public final int[] c;
    public final Set d = new hho(this, -1);
    private Integer e = null;
    private String f = null;

    public hhp(hhp objectArray, hhp hhp2) {
        int n2;
        int n3 = objectArray.size() + hhp2.size();
        int n4 = objectArray.b() + hhp2.b();
        int n5 = n3 + 1;
        Object[] objectArray2 = new Object[n4];
        int[] nArray = new int[n5];
        int n6 = 0;
        nArray[0] = n3;
        Object object = objectArray.c(0);
        Object object2 = hhp2.c(0);
        int n7 = 0;
        int n8 = n2 = 0;
        block0: while (true) {
            int n9;
            if (object == null && object2 == null) {
                n3 = nArray[n6];
                n2 = n3 - n7;
                if (n2 == 0) {
                    objectArray = objectArray2;
                } else {
                    for (n9 = n6; n9 <= n7; ++n9) {
                        nArray[n9] = nArray[n9] - n2;
                    }
                    n9 = nArray[n7];
                    if (hhp.e(n4, n9)) {
                        objectArray = new Object[n9];
                        System.arraycopy(objectArray2, n6, objectArray, n6, n7);
                    } else {
                        objectArray = objectArray2;
                    }
                    System.arraycopy(objectArray2, n3, objectArray, n7, n9 - n7);
                }
                this.b = objectArray;
                n6 = nArray[n6] + 1;
                objectArray = nArray;
                if (hhp.e(n5, n6)) {
                    objectArray = Arrays.copyOf(nArray, n6);
                }
                this.c = (int[])objectArray;
                return;
            }
            int n10 = n7 + 1;
            n9 = object == null ? 1 : (object2 == null ? -1 : n6);
            int n11 = n9;
            if (n9 == 0) {
                n11 = n9 = ((String)object.getKey()).compareTo((String)object2.getKey());
                if (n9 == 0) {
                    n9 = n8 + 1;
                    n11 = n2 + 1;
                    objectArray2[n7] = this.d((String)object.getKey(), n7);
                    object = (hho)object.getValue();
                    hho hho2 = (hho)object2.getValue();
                    n7 = n2 = n6;
                    while (true) {
                        if (n7 >= ((hho)object).size() && n2 >= hho2.size()) {
                            nArray[n10] = n3;
                            object = super.c(n11);
                            object2 = hhp2.c(n9);
                            n2 = n11;
                            n7 = n10;
                            n8 = n9;
                            continue block0;
                        }
                        if (n7 == ((hho)object).size()) {
                            n6 = 1;
                        } else if (n2 == hho2.size()) {
                            n6 = -1;
                        }
                        n8 = n6 == 0 ? hhr.a.compare(((hho)object).c(n7), hho2.c(n2)) : n6;
                        if (n8 < 0) {
                            object2 = ((hho)object).c(n7);
                            ++n7;
                        } else {
                            object2 = hho2.c(n2);
                            n6 = n7;
                            if (n8 == 0) {
                                n6 = n7 + 1;
                            }
                            ++n2;
                            n7 = n6;
                        }
                        objectArray2[n3] = object2;
                        ++n3;
                        n6 = 0;
                    }
                }
            }
            if (n11 < 0) {
                n3 = this.a((Map.Entry)object, n7, n3, objectArray2, nArray);
                object = super.c(++n2);
            } else {
                n3 = this.a((Map.Entry)object2, n7, n3, objectArray2, nArray);
                object2 = hhp2.c(++n8);
            }
            n7 = n10;
            n6 = 0;
        }
    }

    public hhp(List object) {
        Object[] objectArray = object.iterator();
        if (!objectArray.hasNext()) {
            int n2 = object.size();
            objectArray = new Object[n2];
            if (!(object = object.iterator()).hasNext()) {
                object = objectArray;
                if (hhp.e(n2, 0)) {
                    object = Arrays.copyOf(objectArray, 0);
                }
                this.b = object;
                this.c = new int[]{0};
                return;
            }
            object = ((bzq)object.next()).a;
            throw null;
        }
        object = ((bzq)objectArray.next()).a;
        throw null;
    }

    private final int a(Map.Entry entry, int n2, int n3, Object[] objectArray, int[] nArray) {
        hho hho2 = (hho)entry.getValue();
        int n4 = hho2.a() - hho2.b();
        System.arraycopy(hho2.b.b, hho2.b(), objectArray, n3, n4);
        objectArray[n2] = this.d((String)entry.getKey(), n2);
        nArray[n2 + 1] = n3 += n4;
        return n3;
    }

    private final int b() {
        return this.c[this.size()];
    }

    private final Map.Entry c(int n2) {
        if (n2 < this.c[0]) {
            return (Map.Entry)this.b[n2];
        }
        return null;
    }

    private final Map.Entry d(String string, int n2) {
        return new AbstractMap.SimpleImmutableEntry<String, hho>(string, new hho(this, n2));
    }

    private static boolean e(int n2, int n3) {
        return n2 > 16 && n2 * 9 > n3 * 10;
    }

    @Override
    public final Set entrySet() {
        return this.d;
    }

    @Override
    public final int hashCode() {
        if (this.e == null) {
            this.e = super.hashCode();
        }
        return this.e;
    }

    @Override
    public final String toString() {
        if (this.f == null) {
            this.f = super.toString();
        }
        return this.f;
    }
}

