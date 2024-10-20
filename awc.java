/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;

public final class awc
implements abc {
    private final awh a;

    public awc(awh awh2) {
        this.a = awh2;
    }

    @Override
    public final void a(abe object, aaz object2) {
        if (object2 == aaz.ON_CREATE) {
            object.getLifecycle().c(this);
            object = this.a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (object != null) {
                if (object.containsKey("classes_to_restore") && (object = object.getStringArrayList("classes_to_restore")) != null) {
                    Object object3 = object.iterator();
                    while (object3.hasNext()) {
                        Constructor constructor;
                        object = (String)object3.next();
                        try {
                            object2 = Class.forName((String)object, false, awc.class.getClassLoader()).asSubclass(awd.class);
                            jse.d(object2, "{\n                Class.\u2026class.java)\n            }");
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            throw new RuntimeException(a.aj((String)object, "Class ", " wasn't found"), classNotFoundException);
                        }
                        try {
                            constructor = ((Class)object2).getDeclaredConstructor(null);
                            constructor.setAccessible(true);
                        }
                        catch (NoSuchMethodException noSuchMethodException) {
                            object3 = new StringBuilder("Class ");
                            ((StringBuilder)object3).append(((Class)object2).getSimpleName());
                            ((StringBuilder)object3).append(" must have default constructor in order to be automatically recreated");
                            throw new IllegalStateException(((StringBuilder)object3).toString(), noSuchMethodException);
                        }
                        try {
                            object2 = constructor.newInstance(null);
                            jse.d(object2, "{\n                constr\u2026wInstance()\n            }");
                            object2 = (awd)object2;
                            object2.a(this.a);
                        }
                        catch (Exception exception) {
                            throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(object)), exception);
                        }
                    }
                }
            } else {
                return;
            }
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError((Object)"Next event must be ON_CREATE");
    }
}

