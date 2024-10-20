/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class jhl
implements jez {
    public static final RuntimeException a;
    private static final Logger b;
    private static final Constructor c;
    private static final Method d;
    private static final Object[] e;
    private final Object f;

    /*
     * Could not resolve type clashes
     * Loose catch block
     * WARNING - void declaration
     */
    static {
        Method method;
        Constructor<?>[] constructorArray;
        GenericDeclaration genericDeclaration;
        block10: {
            void var3_3;
            block11: {
                GenericDeclaration genericDeclaration22;
                block9: {
                    b = Logger.getLogger(jhl.class.getName());
                    genericDeclaration22 = Class.forName("java.util.concurrent.atomic.LongAdder");
                    genericDeclaration = ((Class)genericDeclaration22).getMethod("add", Long.TYPE);
                    try {
                        ((Class)genericDeclaration22).getMethod("sum", null);
                    }
                    catch (Throwable throwable) {}
                    for (GenericDeclaration genericDeclaration22 : ((Class)genericDeclaration22).getConstructors()) {
                        int n2 = ((Constructor)genericDeclaration22).getParameterTypes().length;
                        if (n2 != 0) {
                            continue;
                        }
                        break block9;
                    }
                    genericDeclaration22 = null;
                }
                constructorArray = null;
                method = genericDeclaration;
                genericDeclaration = genericDeclaration22;
                break block10;
                break block11;
                catch (Throwable throwable) {
                    genericDeclaration = null;
                }
            }
            b.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", (Throwable)var3_3);
            constructorArray = null;
            method = genericDeclaration;
            genericDeclaration = constructorArray;
            constructorArray = var3_3;
        }
        if (constructorArray == null && genericDeclaration != null) {
            c = genericDeclaration;
            d = method;
            a = null;
        } else {
            c = null;
            d = null;
            a = new RuntimeException((Throwable)constructorArray);
        }
        e = new Object[]{1L};
    }

    public jhl() {
        RuntimeException runtimeException = a;
        if (runtimeException == null) {
            try {
                this.f = c.newInstance(null);
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
                throw new RuntimeException(invocationTargetException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException(illegalAccessException);
            }
            catch (InstantiationException instantiationException) {
                throw new RuntimeException(instantiationException);
            }
        }
        throw runtimeException;
    }

    @Override
    public final void a() {
        try {
            d.invoke(this.f, e);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException(invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }
}

