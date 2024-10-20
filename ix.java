/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

final class ix {
    public static final boolean a;
    public static final Method b;
    public static final Field c;
    public static final Field d;
    public static final Field e;
    public static final Field f;

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl2;
        Field field;
        Field field2;
        Field field3;
        Method method;
        block17: {
            block18: {
                block19: {
                    block22: {
                        block21: {
                            block20: {
                                Class<?> clazz = Class.forName("android.graphics.Insets");
                                method = Drawable.class.getMethod("getOpticalInsets", null);
                                field3 = clazz.getField("left");
                                field2 = clazz.getField("top");
                                field = clazz.getField("right");
                                Field field4 = clazz.getField("bottom");
                                bl2 = true;
                                break block17;
                                catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException reflectiveOperationException) {
                                    field = null;
                                    break block18;
                                }
                                catch (NoSuchFieldException noSuchFieldException) {
                                    break block19;
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    break block19;
                                }
                                catch (NoSuchMethodException noSuchMethodException) {
                                    break block19;
                                }
                                catch (NoSuchFieldException noSuchFieldException) {
                                    break block20;
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    break block21;
                                }
                                catch (NoSuchMethodException noSuchMethodException) {
                                    break block22;
                                }
                                catch (NoSuchFieldException noSuchFieldException) {
                                    method = null;
                                }
                            }
                            field3 = null;
                            break block19;
                            catch (ClassNotFoundException classNotFoundException) {
                                method = null;
                            }
                        }
                        field3 = null;
                        break block19;
                        catch (NoSuchMethodException noSuchMethodException) {
                            method = null;
                        }
                    }
                    field3 = null;
                }
                field2 = null;
                field = null;
                break block18;
                catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException reflectiveOperationException) {}
            }
            bl2 = false;
            Object var5_3 = null;
        }
        if (bl2) {
            void var5_4;
            b = method;
            c = field3;
            d = field2;
            e = field;
            f = var5_4;
            a = true;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        a = false;
    }
}

