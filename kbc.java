/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;

final class kbc
extends jsf
implements jrk {
    final Object a;
    private final int b;

    public kbc(Object object, int n2) {
        this.b = n2;
        this.a = object;
        super(1);
    }

    @Override
    public final /* synthetic */ Object a(Object object) {
        int n2 = this.b;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    Object object2 = null;
                    if (n2 != 3) {
                        Object object3 = this.a;
                        Throwable throwable = (Throwable)object;
                        object = object3 = (Throwable)object3.a(throwable);
                        try {
                            if (!jse.i(throwable.getMessage(), ((Throwable)object3).getMessage())) {
                                boolean bl2 = jse.i(((Throwable)object3).getMessage(), throwable.toString());
                                object = object3;
                                if (!bl2) {
                                    object = null;
                                }
                            }
                        }
                        catch (Throwable throwable2) {
                            object = jns.aj(throwable2);
                        }
                        if (object instanceof jod) {
                            object = object2;
                        }
                        return (Throwable)object;
                    }
                    object2 = this.a;
                    object = (Throwable)object;
                    object2 = ((Constructor)object2).newInstance(null);
                    jse.c(object2, "null cannot be cast to non-null type kotlin.Throwable");
                    object2 = (Throwable)object2;
                    ((Throwable)object2).initCause((Throwable)object);
                    return object2;
                }
                object = (Throwable)object;
                object = ((Constructor)this.a).newInstance(object);
                jse.c(object, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable)object;
            }
            object = (Throwable)object;
            String string = ((Throwable)object).getMessage();
            object = ((Constructor)this.a).newInstance(string, object);
            jse.c(object, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable)object;
        }
        object = (Throwable)object;
        Object object4 = ((Throwable)object).getMessage();
        object4 = ((Constructor)this.a).newInstance(object4);
        jse.c(object4, "null cannot be cast to non-null type kotlin.Throwable");
        object4 = (Throwable)object4;
        ((Throwable)object4).initCause((Throwable)object);
        return object4;
    }
}

