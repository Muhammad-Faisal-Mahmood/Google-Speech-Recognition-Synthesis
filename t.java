/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.os.Build$VERSION
 *  android.util.Log
 *  dalvik.system.BaseDexClassLoader
 */
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public final class t {
    private static final Set a;
    private static final boolean b;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        String string;
        boolean bl2;
        String string2;
        block8: {
            boolean bl3;
            a = new HashSet();
            string2 = System.getProperty("java.vm.version");
            bl2 = bl3 = false;
            if (string2 != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(string2, ".");
                bl2 = stringTokenizer.hasMoreTokens();
                Object var5_4 = null;
                string = bl2 ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreTokens()) {
                    String string3 = stringTokenizer.nextToken();
                }
                bl2 = bl3;
                if (string != null) {
                    void var5_6;
                    bl2 = bl3;
                    if (var5_6 != null) {
                        try {
                            int n2 = Integer.parseInt(string);
                            int n3 = Integer.parseInt((String)var5_6);
                            if (n2 <= 2) {
                                bl2 = bl3;
                                if (n2 != 2) break block8;
                                bl2 = bl3;
                                if (n3 <= 0) break block8;
                            }
                            bl2 = true;
                        }
                        catch (NumberFormatException numberFormatException) {
                            bl2 = bl3;
                        }
                    }
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder("VM with version ");
        stringBuilder.append(string2);
        string = true != bl2 ? " does not have multidex support" : " has multidex support";
        stringBuilder.append(string);
        Log.i((String)"MultiDex", (String)stringBuilder.toString());
        b = bl2;
    }

    public static Field a(Object object, String string) {
        Serializable serializable;
        for (serializable = object.getClass(); serializable != null; serializable = ((Class)serializable).getSuperclass()) {
            try {
                Field field = ((Class)serializable).getDeclaredField(string);
                if (!field.isAccessible()) {
                    field.setAccessible(true);
                }
                return field;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                continue;
            }
        }
        serializable = new StringBuilder("Field ");
        ((StringBuilder)serializable).append(string);
        ((StringBuilder)serializable).append(" not found in ");
        ((StringBuilder)serializable).append(object.getClass());
        throw new NoSuchFieldException(((StringBuilder)serializable).toString());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void b(Context object) {
        Object object2;
        block41: {
            File file;
            Object object3;
            Object object4;
            Object var5_3;
            block38: {
                int n2;
                File[] fileArray;
                StringBuilder stringBuilder;
                block39: {
                    Exception exception22;
                    block37: {
                        block42: {
                            Set set;
                            block40: {
                                block36: {
                                    Log.i((String)"MultiDex", (String)"Installing application");
                                    if (b) {
                                        Log.i((String)"MultiDex", (String)"VM has multidex support, MultiDex support library is disabled.");
                                        return;
                                    }
                                    var5_3 = null;
                                    try {
                                        object4 = object.getApplicationInfo();
                                        break block36;
                                    }
                                    catch (Exception exception22) {
                                        break block37;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        Log.w((String)"MultiDex", (String)"Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", (Throwable)runtimeException);
                                        object4 = null;
                                    }
                                }
                                if (object4 == null) {
                                    Log.i((String)"MultiDex", (String)"No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
                                    return;
                                }
                                object3 = new File(((ApplicationInfo)object4).sourceDir);
                                file = new File(((ApplicationInfo)object4).dataDir);
                                set = a;
                                // MONITORENTER : set
                                if (!set.contains(object3)) break block40;
                                // MONITOREXIT : set
                                break block41;
                            }
                            set.add(object3);
                            object4 = new StringBuilder("MultiDex is not guaranteed to work in SDK version ");
                            ((StringBuilder)object4).append(Build.VERSION.SDK_INT);
                            ((StringBuilder)object4).append(": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"");
                            ((StringBuilder)object4).append(System.getProperty("java.vm.version"));
                            ((StringBuilder)object4).append("\"");
                            Log.w((String)"MultiDex", (String)((StringBuilder)object4).toString());
                            try {
                                object4 = object2 = object.getClassLoader();
                            }
                            catch (RuntimeException runtimeException) {
                                Log.w((String)"MultiDex", (String)"Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", (Throwable)runtimeException);
                            }
                            if (object2 instanceof BaseDexClassLoader) break block42;
                            Log.e((String)"MultiDex", (String)"Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                            object4 = null;
                        }
                        if (object4 == null) {
                            // MONITOREXIT : set
                            break block41;
                        } else {
                            object2 = new File(object.getFilesDir(), "secondary-dexes");
                            if (!((File)object2).isDirectory()) break block38;
                            stringBuilder = new StringBuilder("Clearing old secondary dex dir (");
                            stringBuilder.append(((File)object2).getPath());
                            stringBuilder.append(").");
                            Log.i((String)"MultiDex", (String)stringBuilder.toString());
                            fileArray = ((File)object2).listFiles();
                            if (fileArray == null) {
                                stringBuilder = new StringBuilder("Failed to list secondary dex dir content (");
                                stringBuilder.append(((File)object2).getPath());
                                stringBuilder.append(").");
                                Log.w((String)"MultiDex", (String)stringBuilder.toString());
                                break block38;
                            }
                            n2 = fileArray.length;
                            break block39;
                        }
                    }
                    Log.e((String)"MultiDex", (String)"MultiDex installation failure", (Throwable)exception22);
                    object = new StringBuilder("MultiDex installation failed (");
                    ((StringBuilder)object).append(exception22.getMessage());
                    ((StringBuilder)object).append(").");
                    throw new RuntimeException(((StringBuilder)object).toString());
                }
                for (int i2 = 0; i2 < n2; ++i2) {
                    File file2 = fileArray[i2];
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Trying to delete old file ");
                    stringBuilder.append(file2.getPath());
                    stringBuilder.append(" of size ");
                    stringBuilder.append(file2.length());
                    Log.i((String)"MultiDex", (String)stringBuilder.toString());
                    if (!file2.delete()) {
                        Log.w((String)"MultiDex", (String)"Failed to delete old file ".concat(String.valueOf(file2.getPath())));
                        continue;
                    }
                    Log.i((String)"MultiDex", (String)"Deleted old file ".concat(String.valueOf(file2.getPath())));
                    continue;
                }
                try {
                    if (!((File)object2).delete()) {
                        Log.w((String)"MultiDex", (String)"Failed to delete secondary dex dir ".concat(String.valueOf(((File)object2).getPath())));
                    } else {
                        Log.i((String)"MultiDex", (String)"Deleted old secondary dex dir ".concat(String.valueOf(((File)object2).getPath())));
                    }
                }
                catch (Throwable throwable) {
                    Log.w((String)"MultiDex", (String)"Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", (Throwable)throwable);
                }
            }
            object2 = new File(file, "code_cache");
            try {
                t.d((File)object2);
            }
            catch (IOException iOException) {
                object2 = new File(object.getFilesDir(), "code_cache");
                t.d((File)object2);
            }
            file = new File((File)object2, "secondary-dexes");
            t.d(file);
            object2 = new w((File)object3, file);
            object3 = ((w)object2).a((Context)object, false);
            try {
                t.c((ClassLoader)object4, file, (List)object3);
            }
            catch (IOException iOException) {
                Log.w((String)"MultiDex", (String)"Failed to install extracted secondary dex files, retrying with forced extraction", (Throwable)iOException);
                t.c((ClassLoader)object4, file, ((w)object2).a((Context)object, true));
            }
            object = var5_3;
            if (object != null) throw object;
        }
        Log.i((String)"MultiDex", (String)"install done");
        return;
        finally {
            ((w)object2).close();
        }
    }

    private static void c(ClassLoader object, File object2, List objectArray) {
        block9: {
            if (!objectArray.isEmpty()) {
                Object object3 = t.a(object, "pathList").get(object);
                ArrayList arrayList = new ArrayList();
                Object[] objectArray2 = new ArrayList(objectArray);
                objectArray = new Class[]{ArrayList.class, File.class, ArrayList.class};
                for (object = object3.getClass(); object != null; object = ((Class)object).getSuperclass()) {
                    Method method;
                    block8: {
                        try {
                            method = ((Class)object).getDeclaredMethod("makeDexElements", (Class<?>[])objectArray);
                            if (method.isAccessible()) break block8;
                            method.setAccessible(true);
                        }
                        catch (NoSuchMethodException noSuchMethodException) {
                            continue;
                        }
                    }
                    object2 = (Object[])method.invoke(object3, objectArray2, object2, arrayList);
                    object = t.a(object3, "dexElements");
                    objectArray = (Object[])((Field)object).get(object3);
                    objectArray2 = objectArray.getClass().getComponentType();
                    int n2 = objectArray.length;
                    int n3 = ((Object[])object2).length;
                    objectArray2 = (Object[])Array.newInstance(objectArray2, n2 + n3);
                    System.arraycopy(objectArray, 0, objectArray2, 0, n2);
                    System.arraycopy(object2, 0, objectArray2, n2, n3);
                    ((Field)object).set(object3, objectArray2);
                    if (arrayList.size() > 0) {
                        n2 = arrayList.size();
                        for (n3 = 0; n3 < n2; ++n3) {
                            Log.w((String)"MultiDex", (String)"Exception in makeDexElement", (Throwable)((IOException)arrayList.get(n3)));
                        }
                        object2 = t.a(object3, "dexElementsSuppressedExceptions");
                        objectArray = (IOException[])((Field)object2).get(object3);
                        if (objectArray == null) {
                            object = arrayList.toArray(new IOException[arrayList.size()]);
                        } else {
                            n3 = arrayList.size();
                            n2 = objectArray.length;
                            object = new IOException[n3 + n2];
                            arrayList.toArray((T[])object);
                            System.arraycopy(objectArray, 0, object, arrayList.size(), n2);
                        }
                        ((Field)object2).set(object3, object);
                        object = new IOException("I/O exception during makeDexElement");
                        ((Throwable)object).initCause((Throwable)arrayList.get(0));
                        throw object;
                    }
                    break block9;
                }
                object = new StringBuilder("Method makeDexElements with parameters ");
                ((StringBuilder)object).append(Arrays.asList(objectArray));
                ((StringBuilder)object).append(" not found in ");
                ((StringBuilder)object).append(object3.getClass());
                throw new NoSuchMethodException(((StringBuilder)object).toString());
            }
        }
    }

    private static void d(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File file2 = file.getParentFile();
            if (file2 == null) {
                StringBuilder stringBuilder = new StringBuilder("Failed to create dir ");
                stringBuilder.append(file.getPath());
                stringBuilder.append(". Parent file is null.");
                Log.e((String)"MultiDex", (String)stringBuilder.toString());
            } else {
                StringBuilder stringBuilder = new StringBuilder("Failed to create dir ");
                stringBuilder.append(file.getPath());
                stringBuilder.append(". parent file is a dir ");
                stringBuilder.append(file2.isDirectory());
                stringBuilder.append(", a file ");
                stringBuilder.append(file2.isFile());
                stringBuilder.append(", exists ");
                stringBuilder.append(file2.exists());
                stringBuilder.append(", readable ");
                stringBuilder.append(file2.canRead());
                stringBuilder.append(", writable ");
                stringBuilder.append(file2.canWrite());
                Log.e((String)"MultiDex", (String)stringBuilder.toString());
            }
            throw new IOException("Failed to create directory ".concat(String.valueOf(file.getPath())));
        }
    }
}

