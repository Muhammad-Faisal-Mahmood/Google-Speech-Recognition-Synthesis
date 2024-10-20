/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
import android.database.Cursor;
import java.util.List;

public final class ghk
extends jsf
implements jro {
    public static final ghk a;
    public static final ghk b;
    public static final ghk c;
    public static final ghk d;
    public static final ghk e;
    public static final ghk f;
    public static final ghk g;
    public static final ghk h;
    public static final ghk i;
    public static final ghk j;
    public static final ghk k;
    private final int l;

    static {
        k = new ghk(10);
        j = new ghk(9);
        i = new ghk(8);
        h = new ghk(7);
        g = new ghk(6);
        f = new ghk(5);
        e = new ghk(4);
        d = new ghk(3);
        c = new ghk(2);
        b = new ghk(1);
        a = new ghk(0);
    }

    public ghk(int n2) {
        this.l = n2;
        super(2);
    }

    @Override
    public final /* synthetic */ Object b(Object object, Object object2) {
        int n2 = this.l;
        boolean bl2 = false;
        boolean bl3 = false;
        Object object3 = null;
        Object object4 = null;
        switch (n2) {
            default: {
                object4 = (kby)object;
                object2 = (jqd)object2;
                object = object4;
                if (!(object2 instanceof jxb)) break;
                object = (jxb)object2;
                object3 = object.a(((kby)object4).a);
                object2 = ((kby)object4).b;
                n2 = ((kby)object4).d;
                object2[n2] = object3;
                object2 = ((kby)object4).c;
                ((kby)object4).d = n2 + 1;
                jse.c(object, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                object2[n2] = object;
                object = object4;
                break;
            }
            case 9: {
                object = (jxb)object;
                object2 = (jqd)object2;
                if (object == null) {
                    object = object4;
                    if (object2 instanceof jxb) {
                        object = (jxb)object2;
                    }
                }
                return object;
            }
            case 8: {
                object4 = (jqd)object2;
                object2 = object;
                if (object4 instanceof jxb) {
                    object2 = object3;
                    if (object instanceof Integer) {
                        object2 = (Integer)object;
                    }
                    n2 = object2 != null ? object2.intValue() : 1;
                    object2 = n2 == 0 ? object4 : Integer.valueOf(n2 + 1);
                }
                return object2;
            }
            case 7: {
                n2 = ((Number)object).intValue();
                object = (jqd)object2;
                return n2 + 1;
            }
            case 6: {
                return jse.i(object, object2);
            }
            case 5: {
                bl2 = (Boolean)object;
                object = (jqd)object2;
                if (bl2 || object instanceof gqt) {
                    bl3 = true;
                }
                return bl3;
            }
            case 4: {
                object = (jqf)object;
                object2 = (jqd)object2;
                object = object2 instanceof gqt ? object.plus(((gqt)object2).c()) : object.plus((jqf)object2);
                return object;
            }
            case 3: {
                object = (jqf)object;
                object2 = (jqd)object2;
                jse.e(object, "acc");
                jse.e(object2, "element");
                object4 = object.minusKey(object2.getKey());
                object = object2;
                if (object4 != jqg.a) {
                    object = (jqc)object4.get(jqc.b);
                    object = object == null ? new jqa((jqf)object4, (jqd)object2) : ((object4 = object4.minusKey(jqc.b)) == jqg.a ? new jqa((jqf)object2, (jqd)object) : new jqa(new jqa((jqf)object4, (jqd)object2), (jqd)object));
                }
                return object;
            }
            case 2: {
                object = (String)object;
                object2 = (jqd)object2;
                jse.e(object, "acc");
                jse.e(object2, "element");
                if (object.length() == 0) {
                    object = object2.toString();
                } else {
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append((String)object);
                    ((StringBuilder)object4).append(", ");
                    ((StringBuilder)object4).append(object2);
                    object = ((StringBuilder)object4).toString();
                }
                return object;
            }
            case 1: {
                object = (bzq)object;
                object2 = (Cursor)object2;
                jse.e(object, "<unused var>");
                bl3 = bl2;
                if (object2.getCount() > 0) {
                    bl3 = true;
                }
                return bl3;
            }
            case 0: {
                object4 = (bzq)object;
                object = (Cursor)object2;
                jse.e(object4, "<unused var>");
                object4 = new jpk(null);
                while (object.moveToNext()) {
                    object2 = object.getString(object.getColumnIndexOrThrow("listener_key"));
                    jse.d(object2, "getString(...)");
                    object4.add(object2);
                }
                object = jns.c((List)object4);
            }
        }
        return object;
    }
}

