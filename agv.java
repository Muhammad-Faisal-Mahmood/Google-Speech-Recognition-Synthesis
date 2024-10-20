/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 */
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class agv
implements agr {
    private final Context a;
    private final List b;
    private final agr c;
    private agr d;
    private agr e;
    private agr f;
    private agr g;
    private agr h;
    private agr i;
    private agr j;
    private agr k;

    public agv(Context context, agr agr2) {
        this.a = context.getApplicationContext();
        this.c = agr2;
        this.b = new ArrayList();
    }

    private final agr g() {
        if (this.e == null) {
            agk agk2 = new agk(this.a);
            this.e = agk2;
            this.h(agk2);
        }
        return this.e;
    }

    private final void h(agr agr2) {
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            agr2.f((ahl)this.b.get(i2));
        }
    }

    private static final void i(agr agr2, ahl ahl2) {
        if (agr2 != null) {
            agr2.f(ahl2);
        }
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        agr agr2 = this.k;
        abr.i(agr2);
        return agr2.a(byArray, n2, n3);
    }

    @Override
    public final long b(agt agt2) {
        boolean bl2 = this.k == null;
        abr.f(bl2);
        Object object = agt2.a.getScheme();
        Object object2 = agt2.a;
        int n2 = agf.a;
        object2 = object2.getScheme();
        if (!TextUtils.isEmpty((CharSequence)object2) && !"file".equals(object2)) {
            if ("asset".equals(object)) {
                this.k = this.g();
            } else if ("content".equals(object)) {
                if (this.f == null) {
                    this.f = object = new ago(this.a);
                    this.h((agr)object);
                }
                this.k = this.f;
            } else if ("rtmp".equals(object)) {
                if (this.g == null) {
                    try {
                        this.g = object = (agr)Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.h((agr)object);
                    }
                    catch (Exception exception) {
                        throw new RuntimeException("Error instantiating RTMP extension", exception);
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        afx.e("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    }
                    if (this.g == null) {
                        this.g = this.c;
                    }
                }
                this.k = this.g;
            } else if ("udp".equals(object)) {
                if (this.h == null) {
                    this.h = object = new ahn();
                    this.h((agr)object);
                }
                this.k = this.h;
            } else if ("data".equals(object)) {
                if (this.i == null) {
                    this.i = object = new agp();
                    this.h((agr)object);
                }
                this.k = this.i;
            } else {
                if (!"rawresource".equals(object) && !"android.resource".equals(object)) {
                    object = this.c;
                } else {
                    if (this.j == null) {
                        this.j = object = new ahj(this.a);
                        this.h((agr)object);
                    }
                    object = this.j;
                }
                this.k = object;
            }
        } else {
            object = agt2.a.getPath();
            if (object != null && ((String)object).startsWith("/android_asset/")) {
                this.k = this.g();
            } else {
                if (this.d == null) {
                    this.d = object = new ahb();
                    this.h((agr)object);
                }
                this.k = this.d;
            }
        }
        return this.k.b(agt2);
    }

    @Override
    public final Uri c() {
        agr agr2 = this.k;
        if (agr2 == null) {
            return null;
        }
        return agr2.c();
    }

    @Override
    public final void d() {
        agr agr2 = this.k;
        if (agr2 != null) {
            try {
                agr2.d();
                return;
            }
            finally {
                this.k = null;
            }
        }
    }

    @Override
    public final Map e() {
        Object object = this.k;
        object = object == null ? Collections.emptyMap() : object.e();
        return object;
    }

    @Override
    public final void f(ahl ahl2) {
        abr.i(ahl2);
        this.c.f(ahl2);
        this.b.add(ahl2);
        agv.i(this.d, ahl2);
        agv.i(this.e, ahl2);
        agv.i(this.f, ahl2);
        agv.i(this.g, ahl2);
        agv.i(this.h, ahl2);
        agv.i(this.i, ahl2);
        agv.i(this.j, ahl2);
    }
}

