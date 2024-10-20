/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public final class acj
extends acl {
    public static acj a;
    public static final acq b;
    private final Application e;

    static {
        b = new aca();
    }

    public acj() {
        this(null);
    }

    public acj(Application application) {
        this.e = application;
    }

    private final ach d(Class object, Application object2) {
        block9: {
            block8: {
                NoSuchMethodException noSuchMethodException2;
                block7: {
                    IllegalAccessException illegalAccessException2;
                    block6: {
                        InstantiationException instantiationException2;
                        block5: {
                            if (!aao.class.isAssignableFrom((Class<?>)object)) break block8;
                            try {
                                object2 = (ach)((Class)object).getConstructor(Application.class).newInstance(object2);
                            }
                            catch (InvocationTargetException invocationTargetException) {
                            }
                            catch (InstantiationException instantiationException2) {
                                break block5;
                            }
                            catch (IllegalAccessException illegalAccessException2) {
                                break block6;
                            }
                            catch (NoSuchMethodException noSuchMethodException2) {
                                break block7;
                            }
                            jse.d(object2, "{\n                try {\n\u2026          }\n            }");
                            object = object2;
                            break block9;
                            Objects.toString(object);
                            throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(object)), invocationTargetException);
                        }
                        Objects.toString(object);
                        throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(object)), instantiationException2);
                    }
                    Objects.toString(object);
                    throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(object)), illegalAccessException2);
                }
                Objects.toString(object);
                throw new RuntimeException("Cannot create an instance of ".concat(String.valueOf(object)), noSuchMethodException2);
            }
            object = super.a((Class)object);
        }
        return object;
    }

    @Override
    public final ach a(Class clazz) {
        jse.e(clazz, "modelClass");
        Application application = this.e;
        if (application != null) {
            return this.d(clazz, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override
    public final ach b(Class object, acr acr2) {
        block5: {
            block3: {
                block4: {
                    block2: {
                        jse.e(object, "modelClass");
                        if (this.e == null) break block2;
                        object = ((acl)this).a((Class)object);
                        break block3;
                    }
                    if ((acr2 = (Application)acr2.a(b)) == null) break block4;
                    object = this.d((Class)object, (Application)acr2);
                    break block3;
                }
                if (aao.class.isAssignableFrom((Class<?>)object)) break block5;
                object = super.a((Class)object);
            }
            return object;
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }
}

