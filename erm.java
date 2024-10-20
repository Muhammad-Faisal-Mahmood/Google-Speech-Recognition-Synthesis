/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class erm
implements hej {
    public final erh a;

    public /* synthetic */ erm(erh erh2) {
        this.a = erh2;
    }

    @Override
    public final Object a() {
        Object object = this.a;
        jse.e(object, "$delta");
        StringBuilder stringBuilder = new StringBuilder("[");
        Iterator iterator = ((erh)object).b.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            int n3;
            eqy eqy2 = (eqy)iterator.next();
            object = n2 > 0 ? ",{" : "{";
            stringBuilder.append((String)object);
            Enum enum_ = eqz.b(eqy2.e);
            object = enum_;
            if (enum_ == null) {
                object = eqz.a;
            }
            stringBuilder.append("type=".concat(String.valueOf(((Enum)object).name())));
            if ((eqy2.b & 2) != 0) {
                n3 = eqy2.f;
                object = new StringBuilder(",recordId=");
                ((StringBuilder)object).append(n3);
                stringBuilder.append(((StringBuilder)object).toString());
            }
            if (eqy2.c == 2) {
                object = (ebt)eqy2.d;
                if (((ebt)object).b == 1) {
                    enum_ = ebu.b((Integer)((ebt)object).c);
                    object = enum_;
                    if (enum_ == null) {
                        object = ebu.a;
                    }
                    stringBuilder.append(",open=".concat(String.valueOf(((Enum)object).name())));
                }
                object = (n3 = eqy2.c) == 2 ? (ebt)eqy2.d : ebt.a;
                if (((ebt)object).b == 2) {
                    object = n3 == 2 ? (ebt)eqy2.d : ebt.a;
                    if (((ebt)object).b == 2) {
                        enum_ = ebs.b((Integer)((ebt)object).c);
                        object = enum_;
                        if (enum_ == null) {
                            object = ebs.a;
                        }
                    } else {
                        object = ebs.a;
                    }
                    stringBuilder.append(",open=".concat(String.valueOf(((Enum)object).name())));
                }
            }
            if (eqy2.c == 3) {
                object = (ebq)eqy2.d;
                if (((ebq)object).b == 1) {
                    enum_ = ebr.b((Integer)((ebq)object).c);
                    object = enum_;
                    if (enum_ == null) {
                        object = ebr.a;
                    }
                    stringBuilder.append(",close=".concat(String.valueOf(((Enum)object).name())));
                }
                object = (n3 = eqy2.c) == 3 ? (ebq)eqy2.d : ebq.a;
                if (((ebq)object).b == 2) {
                    object = n3 == 3 ? (ebq)eqy2.d : ebq.a;
                    if (((ebq)object).b == 2) {
                        enum_ = ebp.b((Integer)((ebq)object).c);
                        object = enum_;
                        if (enum_ == null) {
                            object = ebp.a;
                        }
                    } else {
                        object = ebp.a;
                    }
                    stringBuilder.append(",close=".concat(String.valueOf(((Enum)object).name())));
                }
            }
            stringBuilder.append("}");
            ++n2;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

