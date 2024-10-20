/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

final class kkc
implements InvocationHandler {
    public boolean a;
    public String b;
    private final List c;

    public kkc(List list) {
        this.c = list;
    }

    @Override
    public final Object invoke(Object object, Method object2, Object[] object3) {
        jse.e(object, "proxy");
        jse.e(object2, "method");
        object = object3;
        if (object3 == null) {
            object = new Object[]{};
        }
        object3 = ((Method)object2).getName();
        Object object4 = ((Method)object2).getReturnType();
        if (jse.i(object3, "supports") && jse.i(Boolean.TYPE, object4)) {
            return true;
        }
        if (jse.i(object3, "unsupported") && jse.i(Void.TYPE, object4)) {
            this.a = true;
            return null;
        }
        if (jse.i(object3, "protocols") && ((Object[])object).length == 0) {
            return this.c;
        }
        if ((jse.i(object3, "selectProtocol") || jse.i(object3, "select")) && jse.i(String.class, object4) && ((Object[])object).length == 1 && (object4 = object[0]) instanceof List) {
            jse.c(object4, "null cannot be cast to non-null type kotlin.collections.List<*>");
            object = (List)object4;
            int n2 = object.size();
            if (n2 >= 0) {
                int n3 = 0;
                while (true) {
                    object2 = object.get(n3);
                    jse.c(object2, "null cannot be cast to non-null type kotlin.String");
                    object2 = (String)object2;
                    if (this.c.contains(object2)) {
                        this.b = object2;
                        return object2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
            this.b = object = (String)this.c.get(0);
            return object;
        }
        if ((jse.i(object3, "protocolSelected") || jse.i(object3, "selected")) && ((Object[])object).length == 1) {
            object = object[0];
            jse.c(object, "null cannot be cast to non-null type kotlin.String");
            this.b = (String)object;
            return null;
        }
        return ((Method)object2).invoke((Object)this, Arrays.copyOf(object, ((Object[])object).length));
    }
}

