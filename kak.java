/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class kak
extends jsf
implements jro {
    final Object a;
    private final int b;

    public kak(Object object, int n2) {
        this.b = n2;
        this.a = object;
        super(2);
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object iterator) {
        CharSequence charSequence;
        block39: {
            block38: {
                int n2;
                block37: {
                    block24: {
                        block21: {
                            block22: {
                                int n3;
                                int n4;
                                block36: {
                                    int n5;
                                    block35: {
                                        block32: {
                                            int n6;
                                            int n7;
                                            block34: {
                                                int n8;
                                                block33: {
                                                    block25: {
                                                        block30: {
                                                            block31: {
                                                                block29: {
                                                                    block26: {
                                                                        block27: {
                                                                            block28: {
                                                                                n2 = this.b;
                                                                                charSequence = null;
                                                                                if (n2 == 0) break block24;
                                                                                charSequence = (CharSequence)object;
                                                                                n2 = ((Number)((Object)iterator)).intValue();
                                                                                jse.e(charSequence, "$this$$receiver");
                                                                                iterator = this.a;
                                                                                if (iterator.size() != 1) break block25;
                                                                                jse.e(iterator, "<this>");
                                                                                if (!(iterator instanceof List)) break block26;
                                                                                jse.e(iterator, "<this>");
                                                                                int n9 = iterator.size();
                                                                                if (n9 == 0) break block27;
                                                                                if (n9 != 1) break block28;
                                                                                object = iterator.get(0);
                                                                                break block29;
                                                                            }
                                                                            throw new IllegalArgumentException("List has more than one element.");
                                                                        }
                                                                        throw new NoSuchElementException("List is empty.");
                                                                    }
                                                                    if (!(iterator = iterator.iterator()).hasNext()) break block30;
                                                                    object = iterator.next();
                                                                    if (iterator.hasNext()) break block31;
                                                                }
                                                                object = (String)object;
                                                                n2 = jse.M(charSequence, (String)object, n2, 4);
                                                                if (n2 < 0) break block22;
                                                                object = new joc(n2, object);
                                                                break block21;
                                                            }
                                                            throw new IllegalArgumentException("Collection has more than one element.");
                                                        }
                                                        throw new NoSuchElementException("Collection is empty.");
                                                    }
                                                    object = new jsw(jse.k(n2, 0), charSequence.length());
                                                    if (!(charSequence instanceof String)) break block32;
                                                    n8 = ((jsv)object).a;
                                                    n7 = ((jsv)object).b;
                                                    n6 = ((jsv)object).c;
                                                    if (n6 <= 0) break block33;
                                                    n2 = n8;
                                                    if (n8 <= n7) break block34;
                                                }
                                                if (n6 >= 0 || n7 > n8) break block22;
                                                n2 = n8;
                                            }
                                            while (true) {
                                                block20: {
                                                    Iterator iterator2 = iterator.iterator();
                                                    while (iterator2.hasNext()) {
                                                        object = iterator2.next();
                                                        String string = (String)object;
                                                        if (!jse.t(string, 0, (String)charSequence, n2, string.length(), false)) continue;
                                                        break block20;
                                                    }
                                                    object = null;
                                                }
                                                object = (String)object;
                                                if (object != null) {
                                                    object = new joc(n2, object);
                                                    break block21;
                                                }
                                                if (n2 != n7) {
                                                    n2 += n6;
                                                    continue;
                                                }
                                                break block22;
                                                break;
                                            }
                                        }
                                        n5 = ((jsv)object).a;
                                        n4 = ((jsv)object).b;
                                        n3 = ((jsv)object).c;
                                        if (n3 <= 0) break block35;
                                        n2 = n5;
                                        if (n5 <= n4) break block36;
                                    }
                                    if (n3 >= 0 || n4 > n5) break block22;
                                    n2 = n5;
                                }
                                while (true) {
                                    block23: {
                                        Iterator iterator3 = iterator.iterator();
                                        while (iterator3.hasNext()) {
                                            object = iterator3.next();
                                            String string = (String)object;
                                            if (!jse.R(string, 0, charSequence, n2, string.length())) continue;
                                            break block23;
                                        }
                                        object = null;
                                    }
                                    object = (String)object;
                                    if (object != null) {
                                        object = new joc(n2, object);
                                        break block21;
                                    }
                                    if (n2 == n4) break;
                                    n2 += n3;
                                }
                            }
                            object = null;
                        }
                        if (object != null) {
                            n2 = ((String)((joc)object).b).length();
                            return new joc(((joc)object).a, n2);
                        }
                        return null;
                    }
                    n2 = ((Number)object).intValue();
                    object = (jqd)((Object)iterator);
                    jqe jqe2 = object.getKey();
                    iterator = ((kah)this.a).b.get(jqe2);
                    if (jqe2 == jwi.c) break block37;
                    n2 = object != iterator ? Integer.MIN_VALUE : ++n2;
                    object = n2;
                    break block38;
                }
                iterator = (jwi)((Object)iterator);
                jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                object = (jwi)object;
                while (true) {
                    if (object == null) {
                        object = charSequence;
                        break;
                    }
                    if (object == iterator || !(object instanceof kbq)) break;
                    if ((object = ((kbq)object).E()) != null) {
                        object = object.c();
                        continue;
                    }
                    object = null;
                }
                if (object != iterator) break block39;
                if (iterator != null) {
                    ++n2;
                }
                object = n2;
            }
            return object;
        }
        charSequence = new StringBuilder("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
        ((StringBuilder)charSequence).append(object);
        ((StringBuilder)charSequence).append(", expected child of ");
        ((StringBuilder)charSequence).append(iterator);
        ((StringBuilder)charSequence).append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
        throw new IllegalStateException(((StringBuilder)charSequence).toString());
    }
}

