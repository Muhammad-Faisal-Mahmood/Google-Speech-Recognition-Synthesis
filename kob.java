/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Process
 *  android.os.SystemClock
 *  android.util.Log
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class kob {
    public JSONObject a;
    public final koq b;
    private final List c;

    public kob(Context object) {
        long l2 = SystemClock.uptimeMillis();
        ArrayList arrayList = new ArrayList(kof.c((Context)object));
        if (!arrayList.isEmpty()) {
            Object object2 = arrayList.iterator();
            while (object2.hasNext()) {
                ((koe)object2.next()).a.e();
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new py(5));
                arrayList = (koe)arrayList.get(0);
                object = kqy.a((Context)object, ((koe)((Object)arrayList)).b);
                object2 = new kqt();
                try {
                    koq koq2;
                    ((kqt)object2).c = false;
                    ((kqt)object2).g = 1;
                    ((kqt)object2).h = ((koe)((Object)arrayList)).b;
                    ((kqt)object2).f = Process.myUid();
                    Object object3 = new kqw("129.0.6614.4");
                    ((kqt)object2).d = object3;
                    if (Log.isLoggable((String)"CronetEngine.Builder", (int)3)) {
                        String.format("Using '%s' provider for creating CronetEngine.Builder.", ((koe)((Object)arrayList)).a);
                    }
                    if ((object3 = kob.c(koq2 = ((koe)((Object)arrayList)).a.d().b)) != null) {
                        ((kqt)object2).e = arrayList = new kqw((String)object3);
                    }
                    ((kqt)object2).a = koq2.a();
                    ((kqt)object2).c = true;
                    this(koq2);
                    return;
                }
                finally {
                    ((kqt)object2).b = (int)(SystemClock.uptimeMillis() - l2);
                    ((kqx)object).b((kqt)object2);
                }
            }
            throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
        }
        throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
    }

    public kob(koq koq2) {
        this.c = new ArrayList();
        this.b = koq2;
    }

    private static int b(koq object) {
        int n2;
        block4: {
            block3: {
                try {
                    object = kob.d((koq)object, "getApiLevel");
                    if (object != null) break block3;
                    n2 = -1;
                    break block4;
                }
                catch (ReflectiveOperationException reflectiveOperationException) {
                    throw new RuntimeException("Failed to retrieve Cronet impl API level", reflectiveOperationException);
                }
            }
            n2 = (Integer)((Method)object).invoke(null, null);
        }
        return n2;
    }

    private static String c(koq object) {
        block3: {
            Method method;
            try {
                method = kob.d((koq)object, "getCronetVersion");
                object = null;
                if (method == null) break block3;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                throw new RuntimeException("Failed to retrieve Cronet impl version", reflectiveOperationException);
            }
            object = (String)method.invoke(null, null);
        }
        return object;
    }

    private static Method d(koq object, String string) {
        try {
            object = object.getClass().getClassLoader().loadClass("org.chromium.net.impl.ImplVersion").getMethod(string, null);
            return object;
        }
        catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
            return null;
        }
    }

    public final koj a() {
        StringBuilder stringBuilder;
        int n2 = kob.b(this.b);
        if (n2 != -1 && n2 < 33) {
            stringBuilder = new StringBuilder("The implementation version is lower than the API version. Calls to methods added in API ");
            stringBuilder.append(n2 + 1);
            stringBuilder.append(" and newer will likely have no effect.");
            Log.w((String)"CronetEngine.Builder", (String)stringBuilder.toString());
        }
        Object object = this.a;
        Object object2 = this.c;
        if (object == null && object2.isEmpty()) {
            object = null;
        } else {
            stringBuilder = object;
            if (object == null) {
                stringBuilder = new JSONObject();
            }
            object2 = object2.iterator();
            while (true) {
                object = stringBuilder;
                if (!object2.hasNext()) break;
                object = (kok)object2.next();
                try {
                    object.a();
                }
                catch (JSONException jSONException) {
                    throw new IllegalStateException("Unable to apply JSON patch!", jSONException);
                }
            }
        }
        if (object != null) {
            this.b.j(object.toString());
        }
        return this.b.c();
    }
}

