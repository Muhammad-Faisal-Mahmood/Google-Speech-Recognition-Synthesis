/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class ern
implements hej {
    public final hwv a;
    private final int b;

    public /* synthetic */ ern(hwv hwv2, int n2) {
        this.b = n2;
        this.a = hwv2;
    }

    @Override
    public final Object a() {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object;
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 != 4) {
                            return crh.U((ebx)this.a);
                        }
                        return crh.U((ebx)this.a);
                    }
                    return crh.U((ebx)this.a);
                }
                Object object2 = this.a;
                jse.e(object2, "$partialRequestUpdate");
                erv erv2 = (erv)object2;
                object2 = object = eqz.b(erv2.c);
                if (object == null) {
                    object2 = eqz.a;
                }
                String string = ((Enum)object2).name();
                String string2 = erv2.d;
                object2 = object = eqw.b(erv2.e);
                if (object == null) {
                    object2 = eqw.a;
                }
                object2 = ((Enum)object2).name();
                object = new StringBuilder("[type=");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(",updateId=");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(",request=");
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append("]");
                return ((StringBuilder)object).toString();
            }
            Object object = this.a;
            jse.e(object, "$update");
            StringBuilder stringBuilder = new StringBuilder("[");
            Iterator iterator = ((erg)object).b.iterator();
            n2 = 0;
            while (iterator.hasNext()) {
                int n3;
                eqx eqx2 = (eqx)iterator.next();
                object = n2 > 0 ? ",{" : "{";
                stringBuilder.append((String)object);
                Enum enum_ = eqz.b(eqx2.e);
                object = enum_;
                if (enum_ == null) {
                    object = eqz.a;
                }
                stringBuilder.append("type=".concat(String.valueOf(((Enum)object).name())));
                if ((eqx2.b & 2) != 0) {
                    n3 = eqx2.f;
                    object = new StringBuilder(",recordId=");
                    ((StringBuilder)object).append(n3);
                    stringBuilder.append(((StringBuilder)object).toString());
                }
                if (eqx2.c == 2) {
                    object = (ebt)eqx2.d;
                    if (((ebt)object).b == 1) {
                        enum_ = ebu.b((Integer)((ebt)object).c);
                        object = enum_;
                        if (enum_ == null) {
                            object = ebu.a;
                        }
                        stringBuilder.append(",open=".concat(String.valueOf(((Enum)object).name())));
                    }
                    object = (n3 = eqx2.c) == 2 ? (ebt)eqx2.d : ebt.a;
                    if (((ebt)object).b == 2) {
                        object = n3 == 2 ? (ebt)eqx2.d : ebt.a;
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
                if (eqx2.c == 3) {
                    enum_ = eqw.b((Integer)eqx2.d);
                    object = enum_;
                    if (enum_ == null) {
                        object = eqw.a;
                    }
                    stringBuilder.append(",request=".concat(String.valueOf(((Enum)object).name())));
                }
                stringBuilder.append("}");
                ++n2;
            }
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        Object object = this.a;
        jse.e(object, "$partialUpdate");
        StringBuilder stringBuilder = new StringBuilder("[");
        erw erw2 = (erw)object;
        Enum enum_ = eqz.b(erw2.e);
        object = enum_;
        if (enum_ == null) {
            object = eqz.a;
        }
        stringBuilder.append("type=".concat(String.valueOf(((Enum)object).name())));
        stringBuilder.append(",updateId=".concat(String.valueOf(erw2.f)));
        if ((erw2.b & 4) != 0) {
            n2 = erw2.g;
            object = new StringBuilder(",recordId=");
            ((StringBuilder)object).append(n2);
            stringBuilder.append(((StringBuilder)object).toString());
        }
        if (erw2.c == 2) {
            object = (ebt)erw2.d;
            if (((ebt)object).b == 1) {
                enum_ = ebu.b((Integer)((ebt)object).c);
                object = enum_;
                if (enum_ == null) {
                    object = ebu.a;
                }
                stringBuilder.append(",open=".concat(String.valueOf(((Enum)object).name())));
            }
            object = (n2 = erw2.c) == 2 ? (ebt)erw2.d : ebt.a;
            if (((ebt)object).b == 2) {
                object = n2 == 2 ? (ebt)erw2.d : ebt.a;
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
        if (erw2.c == 3) {
            object = (ebq)erw2.d;
            if (((ebq)object).b == 1) {
                enum_ = ebr.b((Integer)((ebq)object).c);
                object = enum_;
                if (enum_ == null) {
                    object = ebr.a;
                }
                stringBuilder.append(",close=".concat(String.valueOf(((Enum)object).name())));
            }
            object = (n2 = erw2.c) == 3 ? (ebq)erw2.d : ebq.a;
            if (((ebq)object).b == 2) {
                object = n2 == 3 ? (ebq)erw2.d : ebq.a;
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
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

