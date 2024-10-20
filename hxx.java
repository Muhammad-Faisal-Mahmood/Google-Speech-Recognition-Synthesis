/*
 * Decompiled with CFR 0.152.
 */
final class hxx
implements hyd {
    public static final hxx a = new hxx(1);
    private final int b;

    public hxx(int n2) {
        this.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hyc a(Class clazz) {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!hwv.class.isAssignableFrom(clazz)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(clazz.getName())));
        }
        try {
            Object object;
            Class<hwv> clazz2 = clazz.asSubclass(hwv.class);
            Object object2 = object = (hwv)hwv.defaultInstanceMap.get(clazz2);
            if (object == null) {
                try {
                    Class.forName(clazz2.getName(), true, clazz2.getClassLoader());
                }
                catch (ClassNotFoundException classNotFoundException) {
                    object = new IllegalStateException("Class initialization cannot fail.", classNotFoundException);
                    throw object;
                }
                object2 = (hwv)hwv.defaultInstanceMap.get(clazz2);
            }
            object = object2;
            if (object2 != null) return (hyc)((hwv)object).C(3);
            object = (hwv)((hwv)hzj.g(clazz2)).C(6);
            if (object == null) {
                object2 = new IllegalStateException();
                throw object2;
            }
            hwv.defaultInstanceMap.put(clazz2, object);
            return (hyc)((hwv)object).C(3);
        }
        catch (Exception exception) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(clazz.getName())), exception);
        }
    }

    @Override
    public final boolean b(Class clazz) {
        if (this.b != 0) {
            return hwv.class.isAssignableFrom(clazz);
        }
        return false;
    }
}

