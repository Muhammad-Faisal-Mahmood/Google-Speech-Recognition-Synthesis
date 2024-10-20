/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

final class jku
extends jkv {
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;
    private static final Method h;
    private static final Method i;
    private static final Constructor j;
    private static final bmu k;
    private static final bmu l;
    private static final bmu m;
    private static final bmu n;
    private static final bmu o;
    private static final bmu p;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Executable executable;
        GenericDeclaration genericDeclaration;
        block29: {
            Object var6_3;
            block28: {
                block27: {
                    Class<?> clazz;
                    GenericDeclaration genericDeclaration2;
                    Class<?> clazz2;
                    block25: {
                        Class<?> clazz3;
                        block30: {
                            block24: {
                                block22: {
                                    block23: {
                                        block21: {
                                            block26: {
                                                genericDeclaration = Boolean.TYPE;
                                                var6_3 = null;
                                                k = new bmu(null, (Object)"setUseSessionTickets", new Class[]{genericDeclaration});
                                                l = new bmu(null, (Object)"setHostname", new Class[]{String.class});
                                                m = new bmu(byte[].class, (Object)"getAlpnSelectedProtocol", new Class[0]);
                                                n = new bmu(null, (Object)"setAlpnProtocols", new Class[]{byte[].class});
                                                o = new bmu(byte[].class, (Object)"getNpnSelectedProtocol", new Class[0]);
                                                p = new bmu(null, (Object)"setNpnProtocols", new Class[]{byte[].class});
                                                try {
                                                    genericDeclaration = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                                                }
                                                catch (NoSuchMethodException noSuchMethodException) {
                                                    executable = null;
                                                    clazz3 = null;
                                                    break block21;
                                                }
                                                catch (ClassNotFoundException classNotFoundException) {
                                                    executable = null;
                                                    clazz3 = null;
                                                    break block22;
                                                }
                                                try {
                                                    executable = SSLParameters.class.getMethod("getApplicationProtocols", null);
                                                }
                                                catch (NoSuchMethodException noSuchMethodException) {
                                                    executable = null;
                                                    clazz3 = genericDeclaration;
                                                    genericDeclaration = noSuchMethodException;
                                                    break block21;
                                                }
                                                catch (ClassNotFoundException classNotFoundException) {
                                                    executable = null;
                                                    clazz3 = genericDeclaration;
                                                    genericDeclaration = classNotFoundException;
                                                    break block22;
                                                }
                                                try {
                                                    clazz2 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                                                }
                                                catch (NoSuchMethodException noSuchMethodException) {
                                                    clazz3 = genericDeclaration;
                                                    genericDeclaration = noSuchMethodException;
                                                    break block21;
                                                }
                                                catch (ClassNotFoundException classNotFoundException) {
                                                    clazz3 = genericDeclaration;
                                                    genericDeclaration = classNotFoundException;
                                                    break block22;
                                                }
                                                try {
                                                    genericDeclaration2 = Class.forName("android.net.ssl.SSLSockets");
                                                    clazz3 = genericDeclaration2.getMethod("isSupportedSocket", SSLSocket.class);
                                                }
                                                catch (NoSuchMethodException noSuchMethodException) {
                                                    clazz = null;
                                                    clazz3 = genericDeclaration;
                                                    genericDeclaration = clazz;
                                                    break block23;
                                                }
                                                catch (ClassNotFoundException classNotFoundException) {
                                                    clazz = null;
                                                    clazz3 = genericDeclaration;
                                                    genericDeclaration = clazz2;
                                                    clazz2 = clazz;
                                                    break block24;
                                                }
                                                try {
                                                    genericDeclaration2 = genericDeclaration2.getMethod("setUseSessionTickets", SSLSocket.class, Boolean.TYPE);
                                                    clazz = genericDeclaration;
                                                    genericDeclaration = clazz3;
                                                    break block25;
                                                }
                                                catch (NoSuchMethodException noSuchMethodException) {
                                                }
                                                catch (ClassNotFoundException classNotFoundException) {
                                                    break block26;
                                                }
                                                clazz = clazz3;
                                                clazz3 = genericDeclaration;
                                                genericDeclaration = clazz;
                                                break block23;
                                            }
                                            clazz = clazz3;
                                            clazz3 = genericDeclaration;
                                            genericDeclaration = clazz2;
                                            clazz2 = clazz;
                                            break block24;
                                        }
                                        clazz2 = null;
                                        clazz = null;
                                        genericDeclaration2 = genericDeclaration;
                                        genericDeclaration = clazz;
                                    }
                                    jkv.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable)((Object)genericDeclaration2));
                                    genericDeclaration2 = clazz2;
                                    clazz2 = genericDeclaration;
                                    break block30;
                                }
                                clazz = null;
                                clazz2 = null;
                                genericDeclaration2 = genericDeclaration;
                                genericDeclaration = clazz;
                            }
                            jkv.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable)((Object)genericDeclaration2));
                            genericDeclaration2 = genericDeclaration;
                        }
                        clazz = null;
                        genericDeclaration = clazz2;
                        clazz2 = genericDeclaration2;
                        genericDeclaration2 = clazz;
                        clazz = clazz3;
                    }
                    f = clazz;
                    g = executable;
                    h = clazz2;
                    d = genericDeclaration;
                    e = genericDeclaration2;
                    try {
                        genericDeclaration = SSLParameters.class.getMethod("setServerNames", List.class);
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                        genericDeclaration = null;
                        break block27;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        genericDeclaration = null;
                        break block28;
                    }
                    try {
                        executable = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        break block29;
                    }
                    catch (NoSuchMethodException noSuchMethodException) {
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        break block28;
                    }
                }
                jkv.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable)((Object)executable));
                executable = var6_3;
                break block29;
            }
            jkv.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable)((Object)executable));
            executable = var6_3;
        }
        i = genericDeclaration;
        j = executable;
    }

    public jku(jlp jlp2) {
        super(jlp2);
    }

    @Override
    public final String a(SSLSocket object) {
        block14: {
            block13: {
                Object object2 = h;
                if (object2 != null) {
                    try {
                        object2 = (String)((Method)object2).invoke(object, null);
                        return object2;
                    }
                    catch (InvocationTargetException invocationTargetException) {
                        if (invocationTargetException.getTargetException() instanceof UnsupportedOperationException) {
                            jkv.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
                        }
                        throw new RuntimeException(invocationTargetException);
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        throw new RuntimeException(illegalAccessException);
                    }
                }
                if (this.c.c() == 1) {
                    object2 = (byte[])m.K(object, new Object[0]);
                    if (object2 == null) break block13;
                    try {
                        object2 = new String((byte[])object2, jls.b);
                        return object2;
                    }
                    catch (Exception exception) {
                        jkv.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", exception);
                    }
                }
            }
            if (this.c.c() != 3) {
                object = (byte[])o.K(object, new Object[0]);
                if (object == null) break block14;
                try {
                    object = new String((byte[])object, jls.b);
                    return object;
                }
                catch (Exception exception) {
                    jkv.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", exception);
                }
            }
        }
        return null;
    }

    @Override
    public final String b(SSLSocket sSLSocket, String string, List list) {
        String string2 = ((jkv)this).a(sSLSocket);
        if (string2 == null) {
            return super.b(sSLSocket, string, list);
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected final void c(SSLSocket var1_1, String var2_5, List var3_8) {
        var6_9 = new ArrayList();
        var7_10 = var3_8.iterator();
        while (var7_10.hasNext()) {
            var6_9.add(((jlq)var7_10.next()).e);
        }
        var6_9 = var6_9.toArray(new String[0]);
        var7_10 = var1_1.getSSLParameters();
        if (var2_5 == null) ** GOTO lbl34
        try {
            block20: {
                var5_11 = var2_5.contains("_");
                if (var5_11) break block20;
                try {
                    var5_11 = jeb.f((String)var2_5).getAuthority().indexOf(64) == -1;
                    fxf.v(var5_11, "Userinfo must not be present on authority: '%s'", var2_5);
                    var8_12 = jku.d;
                    if (var8_12 != null) {
                    }
                    ** GOTO lbl-1000
                }
                catch (IllegalArgumentException var2_7) {
                    break block20;
                }
                if (((Boolean)var8_12.invoke(null, new Object[]{var1_1})).booleanValue()) {
                    jku.e.invoke(null, new Object[]{var1_1, true});
                } else lbl-1000:
                // 2 sources

                {
                    jku.k.M(var1_1, new Object[]{true});
                }
                var9_13 = jku.i;
                if (var9_13 != null && (var8_12 = jku.j) != null) {
                    var9_13.invoke(var7_10, new Object[]{Collections.singletonList(var8_12.newInstance(new Object[]{var2_5}))});
                } else {
                    jku.l.M(var1_1, new Object[]{var2_5});
                }
            }
            if ((var2_5 = jku.h) == null) ** GOTO lbl51
            {
                catch (InvocationTargetException var1_3) {
                    throw new RuntimeException(var1_3);
                }
            }
            try {
                var2_5.invoke((Object)var1_1, null);
                jku.f.invoke(var7_10, new Object[]{var6_9});
                var4_14 = true;
            }
            catch (InvocationTargetException var2_6) {
                if (!(var2_6.getTargetException() instanceof UnsupportedOperationException)) {
                    throw var2_6;
                }
                jkv.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
lbl51:
                // 2 sources

                var4_14 = false;
            }
            var1_1.setSSLParameters((SSLParameters)var7_10);
            if (var4_14 && (var2_5 = jku.g) != null && (var5_11 = Arrays.equals(var6_9, (String[])var2_5.invoke((Object)var1_1.getSSLParameters(), null)))) {
                return;
            }
        }
        catch (InstantiationException var1_2) {
            throw new RuntimeException(var1_2);
        }
        catch (IllegalAccessException var1_4) {
            throw new RuntimeException(var1_4);
        }
        var3_8 = jlp.e((List)var3_8);
        var2_5 = new Object[]{var3_8};
        if (this.c.c() == 1) {
            jku.n.K(var1_1, (Object[])var2_5);
        }
        if (this.c.c() != 3) {
            jku.p.K(var1_1, (Object[])var2_5);
            return;
        }
        throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
    }
}

