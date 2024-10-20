/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

public final class kki {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap<Object, String> linkedHashMap = new LinkedHashMap<Object, String>();
        Object object = kgp.class.getPackage();
        object = object != null ? ((Package)object).getName() : null;
        if (object != null) {
            linkedHashMap.put(object, "OkHttp");
        }
        linkedHashMap.put(kgp.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(kiv.class.getName(), "okhttp.Http2");
        linkedHashMap.put(khh.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = jjj.K(linkedHashMap);
    }
}

