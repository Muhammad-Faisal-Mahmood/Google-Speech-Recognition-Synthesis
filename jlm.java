/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

final class jlm
extends jlp {
    private final Method d;
    private final Method e;

    public jlm(Provider provider, Method method, Method method2) {
        super(provider);
        this.d = method;
        this.e = method2;
    }

    @Override
    public final String a(SSLSocket object) {
        try {
            object = (String)this.e.invoke(object, null);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException(invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    @Override
    public final void b(SSLSocket sSLSocket, String object, List object2) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        object = new ArrayList(object2.size());
        object2 = object2.iterator();
        while (object2.hasNext()) {
            jlq jlq2 = (jlq)((Object)object2.next());
            if (jlq2 == jlq.a) continue;
            object.add(jlq2.e);
        }
        try {
            this.d.invoke((Object)sSLParameters, new Object[]{object.toArray(new String[object.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
            return;
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new RuntimeException(invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException(illegalAccessException);
        }
    }

    @Override
    public final int c() {
        return 1;
    }
}

