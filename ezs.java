/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import j$.util.Optional;

public final class ezs {
    public static final hfn a = hfn.o("LPRequestClient");
    public final ezl b;
    public final ezu c;
    public final dxi d;
    public final boolean e;
    public final hpq f;
    private final Context g;

    public ezs(ezl ezl2, ezu ezu2, Context context, dxi dxi2, boolean bl2, hpq hpq2) {
        jse.e(ezl2, "languagePackManager");
        jse.e(ezu2, "languagePackRequestState");
        jse.e(dxi2, "appFlowLogger");
        jse.e(hpq2, "lightweightExecutor");
        this.b = ezl2;
        this.c = ezu2;
        this.g = context;
        this.d = dxi2;
        this.e = bl2;
        this.f = hpq2;
    }

    public static final /* synthetic */ hpn d(ezs ezs2, bql bql2, String object, Optional object2, ezj ezj2, gto gto2, Optional object3) {
        if (!jse.i(object, ezj2.a.toLanguageTag())) {
            ((hfk)a.h()).C("Requested locale %s does not match the locale of the download candidate: %s. This could be API misuse.", object, ezj2.a);
        }
        ezu ezu2 = ezs2.c;
        bzo bzo2 = fde.f(faq.b.l());
        bzo2.R((String)object);
        ((Optional)object2).ifPresent(new bme(new etv(bzo2, 7), 9));
        object = ezu2.a(bzo2.Q());
        object3 = fxf.ak((hpn)object, new cyc(new eqi(ezs2, ezj2, (Optional)object3, gto2, 2), 14), ezs2.f);
        gto2 = ezs2.g;
        object2 = ezj2.a.toLanguageTag();
        jse.d(object2, "toLanguageTag(...)");
        fxf.al((hpn)object3, new ezp((Context)gto2, (String)object2, ezj2.b), ezs2.f);
        return fxf.aj((hpn)object, new eex(new ezq(bql2, object3, 2), 14), ezs2.f);
    }

    public final hpn a() {
        ((hfk)a.f()).r("#getAllPacks");
        Object object = this.b;
        hpn hpn2 = object.c();
        hpn hpn3 = object.f();
        object = object.d();
        return fxf.aE(new hpn[]{hpn2, hpn3, object}).B(new cmq((Object)hpn2, (Object)hpn3, object, 6, null), this.f);
    }

    public final hpn b(faq faq2) {
        jse.e(faq2, "languagePackRequest");
        Object object = this.b;
        hpn hpn2 = object.c();
        object = object.d();
        return fxf.aE(new hpn[]{hpn2, object}).B(new ezn(hpn2, (hpn)object, faq2, this), this.f);
    }

    public final hpn c(faq faq2) {
        jse.e(faq2, "languagePackRequest");
        return fxf.aj(this.b.c(), new eex(new etv(faq2, 6), 15), this.f);
    }

    public final hpn e(String string, int n2, Optional optional, gto gto2, Optional optional2) {
        jse.e(string, "locale");
        jse.e(optional, "applicationDomain");
        jse.e(optional2, "downloadCondition");
        this.d.a(dxv.ae);
        jse.e(string, "locale");
        jse.e(optional, "applicationDomain");
        jse.e(optional2, "downloadCondition");
        return fxf.ak(this.a(), new cyc(new ezr(string, n2, this, optional, gto2, optional2), 15), this.f);
    }
}

