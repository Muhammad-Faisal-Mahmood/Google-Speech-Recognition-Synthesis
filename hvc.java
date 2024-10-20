/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class hvc
implements hye {
    public static void g(Iterable iterable3, List object) {
        block17: {
            block16: {
                block15: {
                    hxl.c(iterable3);
                    if (!(iterable3 instanceof hxu)) break block15;
                    Iterable iterable2 = ((hxu)iterable3).a();
                    iterable3 = (hxu)object;
                    int n2 = object.size();
                    object = iterable2.iterator();
                    while (object.hasNext()) {
                        iterable2 = object.next();
                        if (iterable2 == null) {
                            int n3 = iterable3.size();
                            object = new StringBuilder("Element at index ");
                            ((StringBuilder)object).append(n3 - n2);
                            ((StringBuilder)object).append(" is null.");
                            object = ((StringBuilder)object).toString();
                            n3 = iterable3.size();
                            while (--n3 >= n2) {
                                iterable3.remove(n3);
                            }
                            throw new NullPointerException((String)object);
                        }
                        if (iterable2 instanceof hvu) {
                            iterable2 = (hvu)iterable2;
                            iterable3.b();
                            continue;
                        }
                        if (iterable2 instanceof byte[]) {
                            hvu.q((byte[])iterable2);
                            iterable3.b();
                            continue;
                        }
                        iterable3.add((String)((String)((Object)iterable2)));
                    }
                    break block16;
                }
                if (!(iterable3 instanceof hyn)) {
                    int n4;
                    if (iterable3 instanceof Collection) {
                        n4 = ((Collection)iterable3).size();
                        if (object instanceof ArrayList) {
                            ((ArrayList)object).ensureCapacity(object.size() + n4);
                        }
                        if (object instanceof hyp) {
                            ((hyp)object).e(object.size() + n4);
                        }
                    }
                    int n5 = object.size();
                    if (iterable3 instanceof List && iterable3 instanceof RandomAccess) {
                        iterable3 = (List)iterable3;
                        int n6 = iterable3.size();
                        for (n4 = 0; n4 < n6; ++n4) {
                            Object e2 = iterable3.get(n4);
                            if (e2 == null) {
                                hvc.n((List)object, n5);
                            }
                            object.add(e2);
                        }
                    } else {
                        for (Iterable iterable3 : iterable3) {
                            if (iterable3 == null) {
                                hvc.n((List)object, n5);
                            }
                            object.add(iterable3);
                        }
                    }
                }
                break block17;
            }
            return;
        }
        object.addAll((Collection)iterable3);
    }

    private static void n(List list, int n2) {
        int n3 = list.size();
        CharSequence charSequence = new StringBuilder("Element at index ");
        charSequence.append(n3 - n2);
        charSequence.append(" is null.");
        charSequence = charSequence.toString();
        n3 = list.size();
        while (--n3 >= n2) {
            list.remove(n3);
        }
        throw new NullPointerException((String)charSequence);
    }

    public abstract hvc a();

    protected abstract hvc b(hvd var1);

    public final hvc c(byte[] byArray, hwj hwj2) {
        return this.l(byArray, byArray.length, hwj2);
    }

    public final String h() {
        return a.ax(this, "Reading ", " from a ByteString threw an IOException (should never happen).");
    }

    public abstract void i(hvy var1, hwj var2);

    public hvc k(byte[] byArray, int n2) {
        throw null;
    }

    public hvc l(byte[] byArray, int n2, hwj hwj2) {
        throw null;
    }
}

