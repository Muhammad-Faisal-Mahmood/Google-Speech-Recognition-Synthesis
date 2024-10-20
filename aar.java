/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Deprecated
final class aar {
    static final aar a = new aar();
    public final Map b;
    private final Map c = new HashMap();

    public aar() {
        this.b = new HashMap();
    }

    private static final void d(Map object, aaq object2, aaz aaz2, Class clazz) {
        aaz aaz3 = (aaz)((Object)object.get(object2));
        if (aaz3 != null && aaz2 != aaz3) {
            object = ((aaq)object2).b;
            object2 = new StringBuilder("Method ");
            ((StringBuilder)object2).append(((Method)object).getName());
            ((StringBuilder)object2).append(" in ");
            ((StringBuilder)object2).append(clazz.getName());
            ((StringBuilder)object2).append(" already declared with different @OnLifecycleEvent value: previous value ");
            ((StringBuilder)object2).append((Object)aaz3);
            ((StringBuilder)object2).append(", new value ");
            ((StringBuilder)object2).append((Object)aaz2);
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }
        if (aaz3 == null) {
            object.put(object2, aaz2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final aap a(Class clazz, Method[] object) {
        void var8_8;
        int n2;
        Class clazz2 = clazz.getSuperclass();
        HashMap hashMap = new HashMap();
        if (clazz2 != null) {
            hashMap.putAll(this.b(clazz2).b);
        }
        Class<?>[] classArray = clazz.getInterfaces();
        int n3 = classArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            for (Map.Entry entry : this.b(classArray[n2]).b.entrySet()) {
                aar.d(hashMap, (aaq)entry.getKey(), (aaz)((Object)entry.getValue()), clazz);
            }
        }
        Object object2 = object;
        if (object == null) {
            Method[] methodArray = this.c(clazz);
        }
        int n4 = ((void)var8_8).length;
        boolean bl2 = false;
        for (n3 = 0; n3 < n4; ++n3) {
            object = var8_8[n3];
            OnLifecycleEvent onLifecycleEvent = ((Method)object).getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent == null) continue;
            classArray = ((Method)object).getParameterTypes();
            int n5 = classArray.length;
            if (n5 > 0) {
                if (!abe.class.isAssignableFrom(classArray[0])) throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                n2 = 1;
            } else {
                n2 = 0;
            }
            aaz aaz2 = onLifecycleEvent.a();
            if (n5 > 1) {
                if (!aaz.class.isAssignableFrom(classArray[1])) throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                if (aaz2 != aaz.ON_ANY) throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                n2 = 2;
            }
            if (n5 > 2) throw new IllegalArgumentException("cannot have more than 2 params");
            aar.d(hashMap, new aaq(n2, (Method)object), aaz2, clazz);
            bl2 = true;
        }
        object = new aap(hashMap);
        this.c.put(clazz, object);
        this.b.put(clazz, bl2);
        return object;
    }

    final aap b(Class clazz) {
        aap aap2 = (aap)this.c.get(clazz);
        if (aap2 != null) {
            return aap2;
        }
        return this.a(clazz, null);
    }

    public final Method[] c(Class methodArray) {
        try {
            methodArray = methodArray.getDeclaredMethods();
            return methodArray;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", noClassDefFoundError);
        }
    }
}

