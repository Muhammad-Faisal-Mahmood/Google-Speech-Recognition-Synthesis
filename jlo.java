/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

final class jlo
implements InvocationHandler {
    public static final int c = 0;
    public boolean a;
    public String b;
    private final List d;

    public jlo(List list) {
        this.d = list;
    }

    @Override
    public final Object invoke(Object object, Method method, Object[] object2) {
        String string = method.getName();
        Class<?> clazz = method.getReturnType();
        object = object2;
        if (object2 == null) {
            object = jls.a;
        }
        if (string.equals("supports") && Boolean.TYPE == clazz) {
            return true;
        }
        if (string.equals("unsupported") && Void.TYPE == clazz) {
            this.a = true;
            return null;
        }
        if (string.equals("protocols") && ((Object[])object).length == 0) {
            return this.d;
        }
        if ((string.equals("selectProtocol") || string.equals("select")) && clazz == String.class && ((Object[])object).length == 1 && (object2 = object[0]) instanceof List) {
            object = (List)object2;
            int n2 = object.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!this.d.contains(object.get(i2))) continue;
                this.b = object = (String)object.get(i2);
                return object;
            }
            this.b = object = (String)this.d.get(0);
            return object;
        }
        if ((string.equals("protocolSelected") || string.equals("selected")) && ((Object[])object).length == 1) {
            this.b = (String)object[0];
            return null;
        }
        return method.invoke((Object)this, (Object[])object);
    }
}

