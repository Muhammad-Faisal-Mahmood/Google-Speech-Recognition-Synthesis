/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import android.os.StrictMode;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class hsd
implements imb {
    private final jnu a;
    private final jnu b;
    private final jnu c;
    private final jnu d;
    private final jnu e;
    private final jnu f;
    private final jnu g;
    private final jnu h;
    private final jnu i;
    private final jnu j;

    public hsd(jnu jnu2, jnu jnu3, jnu jnu4, jnu jnu5, jnu jnu6, jnu jnu7, jnu jnu8, jnu jnu9, jnu jnu10, jnu jnu11) {
        this.a = jnu2;
        this.b = jnu3;
        this.c = jnu4;
        this.d = jnu5;
        this.e = jnu6;
        this.f = jnu7;
        this.g = jnu8;
        this.h = jnu9;
        this.i = jnu10;
        this.j = jnu11;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final /* synthetic */ Object b() {
        Throwable throwable3222222;
        StrictMode.ThreadPolicy threadPolicy;
        gol gol2;
        block36: {
            Object object;
            Object object2;
            Object object3;
            block35: {
                boolean bl2;
                Object object4;
                Object object5;
                Object object6;
                block39: {
                    block38: {
                        Serializable serializable;
                        Context context;
                        block37: {
                            block34: {
                                int n2;
                                Object object7;
                                block33: {
                                    context = ((ilt)this.a).a();
                                    Object object8 = ((imj)this.b).a();
                                    object7 = (Set)((imc)this.c).a;
                                    object3 = ((bqw)this.d).a();
                                    object2 = (gto)((imc)this.e).a;
                                    object6 = (gto)((imc)this.f).a;
                                    serializable = ((bqw)this.j).a();
                                    gol2 = fxf.aq("CronetConfigurationModule#provideCronetEngine");
                                    object5 = this.i;
                                    object4 = this.h;
                                    Object object9 = this.g;
                                    threadPolicy = StrictMode.getThreadPolicy();
                                    object = (hsf)((gtt)object3).a;
                                    if (((Boolean)((gto)object6).e(false)).booleanValue()) {
                                        object6 = new ArrayList();
                                        object = kof.c(context).iterator();
                                        while (object.hasNext()) {
                                            ((ArrayList)object6).add((kof)((koe)object.next()).a);
                                        }
                                        object = DesugarCollections.unmodifiableList(object6).iterator();
                                        while (object.hasNext()) {
                                            object6 = (kof)object.next();
                                            if (!((kof)object6).a().equals("App-Packaged-Cronet-Provider")) continue;
                                            ((kof)object6).e();
                                            object = Optional.of(object6);
                                            break;
                                        }
                                    } else {
                                        object = Optional.empty();
                                    }
                                    object6 = new hjm(2);
                                    object6 = ((Optional)object).map(object6);
                                    object = new hsb(context, 0);
                                    object6 = (koi)((Optional)object6).orElseGet(object);
                                    object8 = object8.iterator();
                                    while (object8.hasNext()) {
                                        object = ((hsh)object8.next()).a;
                                        ((kob)object6).b.m((String)object);
                                    }
                                    object = (gto)((imc)object9).a;
                                    if (((gto)object).g() && object7.isEmpty()) {
                                        object = new IllegalArgumentException("Google digests were provided, but no hostnames were pinned - this is either a security vulnerability or a waste of APK size. Add hostnames, or remove the dep on google digests.");
                                        throw object;
                                    }
                                    if (!object7.isEmpty() && !((gto)object).g()) {
                                        object = new IllegalArgumentException("Pinning was requested, but digests weren't provided. Add a dependency on the google digests.");
                                        throw object;
                                    }
                                    if (((gto)object2).g()) {
                                        fxf.B(object7.isEmpty() ^ true, "Local trust anchor bypass was specified, but no pinned hostnames were provided.");
                                        bl2 = (Boolean)((gto)object2).c();
                                        ((kob)object6).b.h(bl2);
                                    }
                                    object9 = object7.iterator();
                                    while (object9.hasNext()) {
                                        object8 = (hsg)object9.next();
                                        object2 = ((hsg)object8).a();
                                        object7 = (Set)((gto)object).c();
                                        bl2 = ((hsg)object8).c();
                                        object8 = ((hsg)object8).b();
                                        ((kob)object6).b.d((String)object2, (Set)object7, bl2, (Date)object8);
                                    }
                                    object2 = StrictMode.getThreadPolicy();
                                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)StrictMode.ThreadPolicy.LAX);
                                    object7 = (hsf)((gtt)object3).a;
                                    bl2 = ((hsf)object7).b;
                                    ((kob)object6).b.i(bl2);
                                    bl2 = ((hsf)object7).c;
                                    ((kob)object6).b.e(bl2);
                                    object = ((hsf)object7).g;
                                    if (object != null) {
                                        bl2 = ((String)object).isEmpty();
                                        if (bl2) {
                                            object = null;
                                        } else {
                                            object = new JSONObject((String)object);
                                        }
                                        ((koi)object6).a = object;
                                        break block33;
                                        catch (JSONException jSONException) {
                                            object = new IllegalArgumentException("Experimental options parsing failed", jSONException);
                                            throw object;
                                        }
                                    }
                                }
                                if ((n2 = ((hsf)object7).h) == 20) break block34;
                                ((kob)object6).b.l(n2);
                            }
                            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)object2);
                            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)StrictMode.ThreadPolicy.LAX);
                            object = (hsf)((gtt)object3).a;
                            if (!((hsf)object).d) break block37;
                            serializable = new File(context.getCacheDir(), ((hsf)object).a);
                            ((File)serializable).mkdirs();
                            if (!((File)serializable).isDirectory()) break block38;
                            ((koi)object6).c(((File)serializable).getAbsolutePath());
                            ((koi)object6).b(2, ((hsf)object).f);
                            break block39;
                        }
                        if (((hsf)object).a != null && ((Boolean)((gto)serializable).e(false)).booleanValue()) {
                            serializable = new File(context.getCacheDir(), ((hsf)object).a);
                            ((File)serializable).mkdirs();
                            if (((File)serializable).isDirectory()) {
                                ((koi)object6).c(((File)serializable).getAbsolutePath());
                            }
                        }
                    }
                    object = (hsf)((gtt)object3).a;
                    ((koi)object6).b(0, 0L);
                }
                bl2 = ((hsf)((gtt)object3).a).e;
                ((kob)object6).b.g(bl2);
                object = ((kob)object6).a();
                if (!((hsf)((gtt)object3).a).e) break block35;
                object4 = ((Set)((imc)object4).a).iterator();
                while (object4.hasNext()) {
                    ((koc)object).d((kpd)object4.next());
                }
                object5 = ((Set)((imc)object5).a).iterator();
                while (object5.hasNext()) {
                    ((koc)object).e((kpe)object5.next());
                }
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return object;
            catch (Throwable throwable2) {
                try {
                    StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)object2);
                    throw throwable2;
                }
                catch (Throwable throwable3222222) {
                    break block36;
                }
                catch (IllegalStateException illegalStateException) {
                    object3 = (hsf)((gtt)object3).a;
                    throw illegalStateException;
                }
            }
        }
        try {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            throw throwable3222222;
        }
        catch (Throwable throwable4) {
            throw throwable4;
        }
        finally {
            gol2.close();
        }
    }
}

