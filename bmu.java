/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothHeadset
 *  android.content.Context
 *  android.location.Location
 *  android.location.LocationManager
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.LruCache
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  hom
 */
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.wear.ambient.AmbientMode$AmbientController;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Objects;
import j$.util.Optional;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

public final class bmu {
    public static bmu d;
    public final Object a;
    public final Object b;
    public final Object c;

    public bmu() {
        this(new Random());
    }

    public bmu(abb abb2, gui gui2, gui gui3, gse gse2) {
        boolean bl2 = ((abg)abb2).b == aba.b;
        fxf.B(bl2, "FutureCallbackRegistry must be created in onCreate of the Activity/Fragment.");
        this.b = gui2;
        this.c = gse2;
        this.a = fvd.ap(new drq(this, gui3, 8, null));
        abb2.b(new gsf(this));
    }

    public bmu(BluetoothHeadset bluetoothHeadset, ehe ehe2, List list) {
        jse.e(list, "devices");
        this.c = bluetoothHeadset;
        this.b = ehe2;
        this.a = list;
    }

    public bmu(Context context) {
        Object object = new cae(context, "SODA_CLEARCUT");
        ((cae)object).e = new czy(1, null);
        object = ((cae)object).a();
        this.a = new cnr();
        this.c = context;
        this.b = object;
    }

    public bmu(Context context, LocationManager locationManager) {
        this.a = new em();
        this.c = context;
        this.b = locationManager;
    }

    public bmu(Context context, dli dli2, jnu jnu2) {
        this.b = context;
        this.c = dli2;
        this.a = jnu2;
    }

    public bmu(Context context, gto gto2, Executor executor) {
        this.a = executor;
        this.b = czh.k(executor);
        this.c = new czh(executor, new czw(gto2, context, 0));
    }

    public bmu(bbl bbl2) {
        this(bbl2.a, bbl2.b, bbl2.c);
    }

    public bmu(bmt bmt2) {
        this.c = bmt2.c;
        this.b = bmt2.b;
        this.a = bmt2.a;
    }

    public bmu(bzb bzb2) {
        jse.e(bzb2, "trackerFactory");
        this.b = bzb2;
        this.a = new Object();
        this.c = new LinkedHashMap();
    }

    public bmu(cem cem2, AmbientMode$AmbientController ambientMode$AmbientController, Runnable runnable, byte[] byArray) {
        this.c = cem2;
        this.b = ambientMode$AmbientController;
        this.a = runnable;
    }

    public bmu(cxv cxv2) {
        this.c = new HashMap();
        this.a = new HashMap();
        this.b = cxv2;
    }

    public bmu(dbl dbl2, Map map) {
        this.c = dbl2;
        this.a = map;
    }

    public bmu(dbl dbl2, Map map, byte[] byArray) {
        this(dbl2, map);
        this.b = new LruCache(32);
    }

    public bmu(ffc ffc2, Runnable runnable) {
        this.a = ffc2;
        this.c = runnable;
        this.b = null;
    }

    public bmu(fxf fxf2, fpo fpo2) {
        this.a = new HashMap();
        this.c = fxf2;
        this.b = fpo2;
    }

    public bmu(gto gto2) {
        this.a = new Object();
        this.c = new ot();
        new gzj();
        this.b = gto2;
    }

    public bmu(hav hav2, hav hav3, hav hav4) {
        this.c = hav2;
        this.a = hav3;
        this.b = hav4;
    }

    public bmu(hpq hpq2, String string) {
        this.a = new HashMap();
        this.b = hpq2;
        this.c = string;
    }

    public bmu(hvu hvu2, String string, String string2) {
        this.a = hjd.e;
        this.b = fvd.ap(new drq(this, hvu2, 3, null));
        this.c = fvd.ap(new dwt(this, string, string2, 1));
    }

    public bmu(Object object, Object object2, Object object3) {
        this.a = object;
        this.c = object2;
        this.b = object3;
    }

    public bmu(Object object, Object object2, Object object3, byte[] byArray) {
        this.c = object;
        this.b = object2;
        this.a = object3;
    }

    public bmu(Object object, Object object2, Object object3, char[] cArray) {
        this.b = object;
        this.c = object2;
        this.a = object3;
    }

    public bmu(Runnable runnable) {
        this.a = new CopyOnWriteArrayList();
        this.c = new HashMap();
        this.b = runnable;
    }

    public bmu(List list) {
        this(list, Collections.emptyList(), Collections.emptyList());
    }

    public bmu(List object, List object2, List object3) {
        Object object4;
        this.b = new HashMap();
        this.a = new HashMap();
        this.c = new ArrayList();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = (fqv)iterator.next();
            if (TextUtils.isEmpty((CharSequence)object.f())) {
                Log.w((String)"MobStore.FileStorage", (String)"Cannot register backend, name empty");
                continue;
            }
            object4 = (fqv)this.b.put(object.f(), object);
            if (object4 == null) continue;
            object2 = object4.getClass().getCanonicalName();
            object3 = object.getClass().getCanonicalName();
            object = new StringBuilder("Cannot override Backend ");
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(" with ");
            ((StringBuilder)object).append((String)object3);
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        object4 = object2.iterator();
        while (object4.hasNext()) {
            object = (fvc)object4.next();
            if (TextUtils.isEmpty((CharSequence)"compress")) {
                Log.w((String)"MobStore.FileStorage", (String)"Cannot register transform, name empty");
                continue;
            }
            object2 = (fvc)this.a.put("compress", object);
            if (object2 == null) continue;
            object2 = object2.getClass().getCanonicalName();
            object = object.getClass().getCanonicalName();
            object3 = new StringBuilder("Cannot to override Transform ");
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append(" with ");
            ((StringBuilder)object3).append((String)object);
            throw new IllegalArgumentException(((StringBuilder)object3).toString());
        }
        this.c.addAll(object3);
    }

    public bmu(Random random) {
        this(new int[0], random);
    }

    public bmu(UUID uUID, bhd bhd2, Set set) {
        jse.e(uUID, "id");
        jse.e(bhd2, "workSpec");
        this.c = uUID;
        this.b = bhd2;
        this.a = set;
    }

    public bmu(ScheduledExecutorService scheduledExecutorService, ftc ftc2) {
        fvd.ap(new enf(this, 14));
        fvd.ap(new exg(this, 6));
        fvd.ap(new exm(this, 3));
        fvd.ap(new exs(this, 1));
        fvd.ap(new exw(this, 11));
        fvd.ap(new exx(this, 3));
        fvd.ap(new exx(this, 15));
        fvd.ap(new exy(this, 6));
        fvd.ap(new exy(this, 18));
        fvd.ap(new exz(this, 9));
        fvd.ap(new exg(this, 15));
        fvd.ap(new exm(this, 11));
        fvd.ap(new exs(this, 7));
        fvd.ap(new exy(this, 3));
        fvd.ap(new exz(this, 19));
        fvd.ap(new eya(this, 10));
        fvd.ap(new eyb(this, 0));
        fvd.ap(new eyc(this, 9));
        fvd.ap(new eyd(this, 1));
        fvd.ap(new exg(this, 5));
        fvd.ap(new exg(this, 18));
        fvd.ap(new exh(this, 9));
        fvd.ap(new exi(this, 1));
        fvd.ap(new exi(this, 12));
        fvd.ap(new exj(this, 3));
        fvd.ap(new exj(this, 15));
        fvd.ap(new exk(this, 6));
        fvd.ap(new exk(this, 18));
        fvd.ap(new exl(this, 11));
        fvd.ap(new exm(this, 2));
        fvd.ap(new exm(this, 15));
        fvd.ap(new exn(this, 6));
        fvd.ap(new exn(this, 18));
        fvd.ap(new exo(this, 9));
        fvd.ap(new exp(this, 1));
        fvd.ap(new exp(this, 12));
        fvd.ap(new exq(this, 3));
        fvd.ap(new exq(this, 17));
        fvd.ap(new exr(this, 8));
        fvd.ap(new exr(this, 20));
        fvd.ap(new exs(this, 12));
        fvd.ap(new ext(this, 3));
        fvd.ap(new ext(this, 15));
        fvd.ap(new exu(this, 6));
        fvd.ap(new exu(this, 18));
        fvd.ap(new exv(this, 9));
        fvd.ap(new exw(this, 2));
        fvd.ap(new exw(this, 8));
        fvd.ap(new exw(this, 9));
        fvd.ap(new exw(this, 10));
        fvd.ap(new exw(this, 13));
        fvd.ap(new exw(this, 14));
        fvd.ap(new exw(this, 15));
        fvd.ap(new exw(this, 16));
        fvd.ap(new exw(this, 17));
        fvd.ap(new exw(this, 18));
        fvd.ap(new exw(this, 19));
        fvd.ap(new exw(this, 20));
        fvd.ap(new exx(this, 1));
        fvd.ap(new exx(this, 0));
        fvd.ap(new exx(this, 4));
        fvd.ap(new exx(this, 5));
        fvd.ap(new exx(this, 6));
        fvd.ap(new exx(this, 7));
        fvd.ap(new exx(this, 8));
        fvd.ap(new exx(this, 9));
        fvd.ap(new exx(this, 10));
        fvd.ap(new exx(this, 11));
        fvd.ap(new exx(this, 12));
        fvd.ap(new exx(this, 14));
        fvd.ap(new exx(this, 16));
        fvd.ap(new exx(this, 17));
        fvd.ap(new exx(this, 18));
        fvd.ap(new exx(this, 19));
        fvd.ap(new exx(this, 20));
        fvd.ap(new exy(this, 1));
        fvd.ap(new exy(this, 0));
        fvd.ap(new exy(this, 2));
        fvd.ap(new exy(this, 4));
        fvd.ap(new exy(this, 5));
        fvd.ap(new exy(this, 7));
        fvd.ap(new exy(this, 8));
        fvd.ap(new exy(this, 9));
        fvd.ap(new exy(this, 10));
        fvd.ap(new exy(this, 11));
        fvd.ap(new exy(this, 12));
        fvd.ap(new exy(this, 13));
        fvd.ap(new exy(this, 15));
        fvd.ap(new exy(this, 16));
        fvd.ap(new exy(this, 17));
        fvd.ap(new exy(this, 19));
        fvd.ap(new exy(this, 20));
        fvd.ap(new exz(this, 1));
        fvd.ap(new exz(this, 0));
        fvd.ap(new exz(this, 2));
        fvd.ap(new exz(this, 3));
        fvd.ap(new exz(this, 5));
        fvd.ap(new exz(this, 6));
        fvd.ap(new exz(this, 7));
        fvd.ap(new exz(this, 8));
        fvd.ap(new exk(this, 20));
        fvd.ap(new exq(this, 5));
        fvd.ap(new exv(this, 11));
        fvd.ap(new exz(this, 13));
        fvd.ap(new eya(this, 3));
        fvd.ap(new eya(this, 14));
        fvd.ap(new eyc(this, 1));
        fvd.ap(new eyc(this, 11));
        fvd.ap(new eyd(this, 0));
        fvd.ap(new exg(this, 4));
        fvd.ap(new exh(this, 5));
        fvd.ap(new exh(this, 16));
        fvd.ap(new exi(this, 6));
        fvd.ap(new exi(this, 17));
        fvd.ap(new exj(this, 7));
        fvd.ap(new exj(this, 18));
        fvd.ap(new exk(this, 8));
        fvd.ap(new exk(this, 19));
        fvd.ap(new exl(this, 10));
        fvd.ap(new exm(this, 1));
        fvd.ap(new exn(this, 0));
        fvd.ap(new exn(this, 12));
        fvd.ap(new exo(this, 2));
        fvd.ap(new exo(this, 13));
        fvd.ap(new exp(this, 3));
        fvd.ap(new exp(this, 14));
        fvd.ap(new exq(this, 4));
        fvd.ap(new exq(this, 16));
        fvd.ap(new exr(this, 6));
        fvd.ap(new exr(this, 17));
        fvd.ap(new exs(this, 18));
        fvd.ap(new ext(this, 8));
        fvd.ap(new ext(this, 19));
        fvd.ap(new exu(this, 9));
        fvd.ap(new exu(this, 20));
        fvd.ap(new exv(this, 10));
        fvd.ap(new exw(this, 0));
        fvd.ap(new exw(this, 12));
        fvd.ap(new exx(this, 2));
        fvd.ap(new exx(this, 13));
        fvd.ap(new exy(this, 14));
        fvd.ap(new exz(this, 4));
        fvd.ap(new exz(this, 10));
        fvd.ap(new exz(this, 11));
        fvd.ap(new exz(this, 12));
        fvd.ap(new exz(this, 14));
        fvd.ap(new exz(this, 15));
        fvd.ap(new exz(this, 16));
        fvd.ap(new exz(this, 17));
        fvd.ap(new exz(this, 18));
        fvd.ap(new exz(this, 20));
        fvd.ap(new eya(this, 1));
        fvd.ap(new eya(this, 0));
        fvd.ap(new eya(this, 2));
        fvd.ap(new eya(this, 4));
        fvd.ap(new eya(this, 5));
        fvd.ap(new eya(this, 6));
        fvd.ap(new eya(this, 7));
        fvd.ap(new eya(this, 8));
        fvd.ap(new eya(this, 9));
        fvd.ap(new eya(this, 11));
        fvd.ap(new eya(this, 12));
        fvd.ap(new eya(this, 13));
        fvd.ap(new eya(this, 15));
        fvd.ap(new eya(this, 16));
        fvd.ap(new eya(this, 17));
        fvd.ap(new eya(this, 18));
        fvd.ap(new eya(this, 19));
        fvd.ap(new eya(this, 20));
        fvd.ap(new eyb(this, 1));
        fvd.ap(new eyb(this, 2));
        fvd.ap(new eyb(this, 3));
        fvd.ap(new eyc(this, 0));
        fvd.ap(new eyc(this, 2));
        fvd.ap(new eyc(this, 3));
        fvd.ap(new eyc(this, 4));
        fvd.ap(new eyc(this, 5));
        fvd.ap(new eyc(this, 6));
        fvd.ap(new eyc(this, 7));
        fvd.ap(new eyc(this, 8));
        fvd.ap(new eyc(this, 10));
        fvd.ap(new eyc(this, 12));
        fvd.ap(new eyc(this, 13));
        fvd.ap(new eyc(this, 14));
        fvd.ap(new eyc(this, 15));
        fvd.ap(new eyc(this, 16));
        fvd.ap(new eyc(this, 17));
        fvd.ap(new eyc(this, 18));
        fvd.ap(new eyc(this, 19));
        fvd.ap(new eyc(this, 20));
        fvd.ap(new enf(this, 15));
        fvd.ap(new enf(this, 16));
        fvd.ap(new enf(this, 17));
        fvd.ap(new enf(this, 18));
        fvd.ap(new enf(this, 19));
        fvd.ap(new enf(this, 20));
        fvd.ap(new exg(this, 1));
        fvd.ap(new exg(this, 0));
        fvd.ap(new exg(this, 2));
        fvd.ap(new exg(this, 3));
        fvd.ap(new exg(this, 7));
        fvd.ap(new exg(this, 8));
        fvd.ap(new exg(this, 9));
        fvd.ap(new exg(this, 10));
        fvd.ap(new exg(this, 11));
        fvd.ap(new exg(this, 12));
        fvd.ap(new exg(this, 13));
        fvd.ap(new exg(this, 14));
        fvd.ap(new exg(this, 16));
        fvd.ap(new exg(this, 17));
        fvd.ap(new exg(this, 19));
        fvd.ap(new exg(this, 20));
        fvd.ap(new exh(this, 1));
        fvd.ap(new exh(this, 0));
        fvd.ap(new exh(this, 2));
        fvd.ap(new exh(this, 3));
        fvd.ap(new exh(this, 4));
        fvd.ap(new exh(this, 6));
        fvd.ap(new exh(this, 7));
        fvd.ap(new exh(this, 8));
        fvd.ap(new exh(this, 10));
        fvd.ap(new exh(this, 11));
        fvd.ap(new exh(this, 12));
        fvd.ap(new exh(this, 13));
        fvd.ap(new exh(this, 14));
        fvd.ap(new exh(this, 15));
        fvd.ap(new exh(this, 17));
        fvd.ap(new exh(this, 18));
        fvd.ap(new exh(this, 19));
        fvd.ap(new exh(this, 20));
        fvd.ap(new exi(this, 0));
        fvd.ap(new exi(this, 2));
        fvd.ap(new exi(this, 3));
        fvd.ap(new exi(this, 4));
        fvd.ap(new exi(this, 5));
        fvd.ap(new exi(this, 7));
        fvd.ap(new exi(this, 8));
        fvd.ap(new exi(this, 9));
        fvd.ap(new exi(this, 10));
        fvd.ap(new exi(this, 11));
        fvd.ap(new exi(this, 13));
        fvd.ap(new exi(this, 14));
        fvd.ap(new exi(this, 15));
        fvd.ap(new exi(this, 16));
        fvd.ap(new exi(this, 18));
        fvd.ap(new exi(this, 19));
        fvd.ap(new exi(this, 20));
        fvd.ap(new exj(this, 1));
        fvd.ap(new exj(this, 0));
        fvd.ap(new exj(this, 2));
        fvd.ap(new exj(this, 4));
        fvd.ap(new exj(this, 5));
        fvd.ap(new exj(this, 6));
        fvd.ap(new exj(this, 8));
        fvd.ap(new exj(this, 9));
        fvd.ap(new exj(this, 10));
        fvd.ap(new exj(this, 11));
        fvd.ap(new exj(this, 12));
        fvd.ap(new exj(this, 13));
        fvd.ap(new exj(this, 14));
        fvd.ap(new exj(this, 16));
        fvd.ap(new exj(this, 17));
        fvd.ap(new exj(this, 19));
        fvd.ap(new exj(this, 20));
        fvd.ap(new exk(this, 1));
        fvd.ap(new exk(this, 0));
        fvd.ap(new exk(this, 2));
        fvd.ap(new exk(this, 3));
        fvd.ap(new exk(this, 4));
        fvd.ap(new exk(this, 5));
        fvd.ap(new exk(this, 7));
        fvd.ap(new exk(this, 9));
        fvd.ap(new exk(this, 10));
        fvd.ap(new exk(this, 11));
        fvd.ap(new exk(this, 12));
        fvd.ap(new exk(this, 13));
        fvd.ap(new exk(this, 14));
        fvd.ap(new exk(this, 15));
        fvd.ap(new exk(this, 16));
        fvd.ap(new exk(this, 17));
        fvd.ap(new exl(this, 1));
        fvd.ap(new exl(this, 0));
        fvd.ap(new exl(this, 2));
        fvd.ap(new exl(this, 3));
        fvd.ap(new exl(this, 4));
        fvd.ap(new exl(this, 5));
        fvd.ap(new exl(this, 6));
        fvd.ap(new exl(this, 7));
        fvd.ap(new exl(this, 8));
        fvd.ap(new exl(this, 9));
        fvd.ap(new exl(this, 12));
        fvd.ap(new exl(this, 13));
        fvd.ap(new exl(this, 14));
        fvd.ap(new exl(this, 15));
        fvd.ap(new exl(this, 16));
        fvd.ap(new exl(this, 17));
        fvd.ap(new exl(this, 18));
        fvd.ap(new exl(this, 19));
        fvd.ap(new exl(this, 20));
        fvd.ap(new exm(this, 0));
        fvd.ap(new exm(this, 4));
        fvd.ap(new exm(this, 5));
        fvd.ap(new exm(this, 6));
        fvd.ap(new exm(this, 7));
        fvd.ap(new exm(this, 8));
        fvd.ap(new exm(this, 9));
        fvd.ap(new exm(this, 10));
        fvd.ap(new exm(this, 12));
        fvd.ap(new exm(this, 13));
        fvd.ap(new exm(this, 14));
        fvd.ap(new exm(this, 16));
        fvd.ap(new exm(this, 17));
        fvd.ap(new exm(this, 18));
        fvd.ap(new exm(this, 19));
        fvd.ap(new exm(this, 20));
        fvd.ap(new exn(this, 1));
        fvd.ap(new exn(this, 2));
        fvd.ap(new exn(this, 3));
        fvd.ap(new exn(this, 4));
        fvd.ap(new exn(this, 5));
        fvd.ap(new exn(this, 7));
        fvd.ap(new exn(this, 8));
        fvd.ap(new exn(this, 9));
        fvd.ap(new exn(this, 10));
        fvd.ap(new exn(this, 11));
        fvd.ap(new exn(this, 13));
        fvd.ap(new exn(this, 14));
        fvd.ap(new exn(this, 15));
        fvd.ap(new exn(this, 16));
        fvd.ap(new exn(this, 17));
        fvd.ap(new exn(this, 19));
        fvd.ap(new exn(this, 20));
        fvd.ap(new exo(this, 1));
        fvd.ap(new exo(this, 0));
        fvd.ap(new exo(this, 3));
        fvd.ap(new exo(this, 4));
        fvd.ap(new exo(this, 5));
        fvd.ap(new exo(this, 6));
        fvd.ap(new exo(this, 7));
        fvd.ap(new exo(this, 8));
        fvd.ap(new exo(this, 10));
        fvd.ap(new exo(this, 11));
        fvd.ap(new exo(this, 12));
        fvd.ap(new exo(this, 14));
        fvd.ap(new exo(this, 15));
        fvd.ap(new exo(this, 16));
        fvd.ap(new exo(this, 17));
        fvd.ap(new exo(this, 18));
        fvd.ap(new exo(this, 19));
        fvd.ap(new exo(this, 20));
        fvd.ap(new exp(this, 0));
        fvd.ap(new exp(this, 2));
        fvd.ap(new exp(this, 4));
        fvd.ap(new exp(this, 5));
        fvd.ap(new exp(this, 6));
        fvd.ap(new exp(this, 7));
        fvd.ap(new exp(this, 8));
        fvd.ap(new exp(this, 9));
        fvd.ap(new exp(this, 10));
        fvd.ap(new exp(this, 11));
        fvd.ap(new exp(this, 13));
        fvd.ap(new exp(this, 15));
        fvd.ap(new exp(this, 16));
        fvd.ap(new exp(this, 17));
        fvd.ap(new exp(this, 18));
        fvd.ap(new exp(this, 19));
        fvd.ap(new exp(this, 20));
        fvd.ap(new exq(this, 1));
        fvd.ap(new exq(this, 0));
        fvd.ap(new exq(this, 2));
        fvd.ap(new exq(this, 6));
        fvd.ap(new exq(this, 7));
        fvd.ap(new exq(this, 8));
        fvd.ap(new exq(this, 9));
        fvd.ap(new exq(this, 10));
        fvd.ap(new exq(this, 11));
        fvd.ap(new exq(this, 12));
        fvd.ap(new exq(this, 13));
        fvd.ap(new exq(this, 14));
        fvd.ap(new exq(this, 15));
        fvd.ap(new exq(this, 18));
        fvd.ap(new exq(this, 19));
        fvd.ap(new exq(this, 20));
        fvd.ap(new exr(this, 1));
        fvd.ap(new exr(this, 0));
        fvd.ap(new exr(this, 2));
        fvd.ap(new exr(this, 3));
        fvd.ap(new exr(this, 4));
        fvd.ap(new exr(this, 5));
        fvd.ap(new exr(this, 7));
        fvd.ap(new exr(this, 9));
        fvd.ap(new exr(this, 10));
        fvd.ap(new exr(this, 11));
        fvd.ap(new exr(this, 12));
        fvd.ap(new exr(this, 13));
        fvd.ap(new exr(this, 14));
        fvd.ap(new exr(this, 15));
        fvd.ap(new exr(this, 16));
        fvd.ap(new exr(this, 18));
        fvd.ap(new exr(this, 19));
        fvd.ap(new exs(this, 0));
        fvd.ap(new exs(this, 2));
        fvd.ap(new exs(this, 3));
        fvd.ap(new exs(this, 4));
        fvd.ap(new exs(this, 5));
        fvd.ap(new exs(this, 6));
        fvd.ap(new exs(this, 8));
        fvd.ap(new exs(this, 9));
        fvd.ap(new exs(this, 10));
        fvd.ap(new exs(this, 11));
        fvd.ap(new exs(this, 13));
        fvd.ap(new exs(this, 14));
        fvd.ap(new exs(this, 15));
        fvd.ap(new exs(this, 16));
        fvd.ap(new exs(this, 17));
        fvd.ap(new exs(this, 19));
        fvd.ap(new exs(this, 20));
        fvd.ap(new ext(this, 1));
        fvd.ap(new ext(this, 0));
        fvd.ap(new ext(this, 2));
        fvd.ap(new ext(this, 4));
        fvd.ap(new ext(this, 5));
        fvd.ap(new ext(this, 6));
        fvd.ap(new ext(this, 7));
        fvd.ap(new ext(this, 9));
        fvd.ap(new ext(this, 10));
        fvd.ap(new ext(this, 11));
        fvd.ap(new ext(this, 12));
        fvd.ap(new ext(this, 13));
        fvd.ap(new ext(this, 14));
        fvd.ap(new ext(this, 16));
        fvd.ap(new ext(this, 17));
        fvd.ap(new ext(this, 18));
        fvd.ap(new ext(this, 20));
        fvd.ap(new exu(this, 1));
        fvd.ap(new exu(this, 0));
        fvd.ap(new exu(this, 2));
        fvd.ap(new exu(this, 3));
        fvd.ap(new exu(this, 4));
        fvd.ap(new exu(this, 5));
        fvd.ap(new exu(this, 7));
        fvd.ap(new exu(this, 8));
        fvd.ap(new exu(this, 10));
        fvd.ap(new exu(this, 11));
        fvd.ap(new exu(this, 12));
        fvd.ap(new exu(this, 13));
        fvd.ap(new exu(this, 14));
        this.a = fvd.ap(new exu(this, 15));
        fvd.ap(new exu(this, 16));
        fvd.ap(new exu(this, 17));
        fvd.ap(new exu(this, 19));
        fvd.ap(new exv(this, 1));
        fvd.ap(new exv(this, 0));
        fvd.ap(new exv(this, 2));
        fvd.ap(new exv(this, 3));
        fvd.ap(new exv(this, 4));
        fvd.ap(new exv(this, 5));
        fvd.ap(new exv(this, 6));
        fvd.ap(new exv(this, 7));
        fvd.ap(new exv(this, 8));
        fvd.ap(new exv(this, 12));
        fvd.ap(new exv(this, 13));
        fvd.ap(new exv(this, 14));
        fvd.ap(new exv(this, 15));
        fvd.ap(new exv(this, 16));
        fvd.ap(new exv(this, 17));
        fvd.ap(new exv(this, 18));
        fvd.ap(new exv(this, 19));
        fvd.ap(new exv(this, 20));
        fvd.ap(new exw(this, 1));
        fvd.ap(new exw(this, 3));
        fvd.ap(new exw(this, 4));
        fvd.ap(new exw(this, 5));
        fvd.ap(new exw(this, 6));
        fvd.ap(new exw(this, 7));
        ftb ftb2 = ftb.e("googlequicksearchbox_android_deidentified");
        this.c = ftb2;
        Object object = ftb2;
        object = ftb2.d();
        if (object == null) {
            object = ftb2;
            this.b = fte.b(ftc2, scheduledExecutorService, ftb2, null);
            return;
        }
        this.b = object;
        object.a(ftc2);
    }

    public bmu(jnu jnu2, jnu jnu3, jnu jnu4, byte[] byArray) {
        this.c = jnu2;
        this.a = jnu3;
        this.b = jnu4;
    }

    public bmu(jnu jnu2, jnu jnu3, jnu jnu4, byte[] byArray, byte[] byArray2) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.c = jnu3;
        jnu4.getClass();
        this.b = jnu4;
    }

    public bmu(jnu jnu2, jnu jnu3, jnu jnu4, byte[] byArray, byte[] byArray2, byte[] byArray3) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.c = jnu3;
        jnu4.getClass();
        this.a = jnu4;
    }

    public bmu(jnu jnu2, jnu jnu3, jnu jnu4, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4) {
        this.b = jnu2;
        this.a = jnu3;
        this.c = jnu4;
    }

    public bmu(jnu jnu2, jnu jnu3, jnu jnu4, char[] cArray) {
        jnu2.getClass();
        this.c = jnu2;
        jnu3.getClass();
        this.a = jnu3;
        jnu4.getClass();
        this.b = jnu4;
    }

    public bmu(jnu jnu2, jnu jnu3, jnu jnu4, char[] cArray, byte[] byArray) {
        jnu2.getClass();
        this.b = jnu2;
        jnu3.getClass();
        this.c = jnu3;
        jnu4.getClass();
        this.a = jnu4;
    }

    public bmu(jnu jnu2, jnu jnu3, jnu jnu4, short[] sArray) {
        jnu2.getClass();
        this.a = jnu2;
        jnu3.getClass();
        this.c = jnu3;
        jnu4.getClass();
        this.b = jnu4;
    }

    public bmu(qh qh2) {
        this.a = new ArrayList();
        this.b = new qo();
        this.c = qh2;
    }

    public bmu(int[] nArray, Random object) {
        this.a = nArray;
        this.b = object;
        this.c = new int[nArray.length];
        int n2 = 0;
        while (n2 < nArray.length) {
            object = this.c;
            int n3 = nArray[n2];
            ((int[])object)[n3] = n2++;
        }
    }

    private static final Uri W(Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    private final fpo X(Uri uri) {
        Object object = this.Z(uri);
        fpn fpn2 = new fpn();
        fpn2.f = this;
        fpn2.a = this.Y(uri.getScheme());
        fpn2.c = this.c;
        fpn2.b = object;
        fpn2.d = uri;
        Object object2 = uri;
        if (!object.isEmpty()) {
            ArrayList<Uri> arrayList = new ArrayList<Uri>(uri.getPathSegments());
            object2 = uri;
            if (!arrayList.isEmpty()) {
                object2 = uri;
                if (!uri.getPath().endsWith("/")) {
                    object2 = (String)arrayList.get(arrayList.size() - 1);
                    object = object.listIterator(object.size());
                    while (object.hasPrevious()) {
                        fvc fvc2 = (fvc)object.previous();
                    }
                    arrayList.set(arrayList.size() - 1, (Uri)object2);
                    object2 = uri.buildUpon().path(TextUtils.join((CharSequence)"/", arrayList)).encodedFragment(null).build();
                }
            }
        }
        fpn2.e = object2;
        return new fpo(fpn2);
    }

    private final fqv Y(String string) {
        fqv fqv2 = (fqv)this.b.get(string);
        if (fqv2 != null) {
            return fqv2;
        }
        throw new fqb(String.format("Requested backend isn't registered: %s", string));
    }

    private final gzx Z(Uri object) {
        Object object2;
        int n2;
        Object object3 = new gzs();
        Object object4 = fqh.a;
        Object object5 = new gzs();
        object4 = object.getEncodedFragment();
        if (!TextUtils.isEmpty((CharSequence)object4) && ((String)object4).startsWith("transform=")) {
            object4 = ((String)object4).substring(10);
            object4 = gzx.n(guf.c("+").a().e((CharSequence)object4));
        } else {
            object4 = hct.a;
        }
        int n3 = object4.size();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            String string = (String)object4.get(n2);
            object2 = fqh.a.matcher(string);
            if (((Matcher)object2).matches()) {
                ((gzs)object5).h(((Matcher)object2).group(1));
                continue;
            }
            throw new IllegalArgumentException("Invalid fragment spec: ".concat(String.valueOf(string)));
        }
        object2 = ((gzs)object5).g();
        n3 = ((hct)object2).c;
        for (n2 = n4; n2 < n3; ++n2) {
            object4 = (String)object2.get(n2);
            object5 = (fvc)this.a.get(object4);
            if (object5 != null) {
                ((gzs)object3).h(object5);
                continue;
            }
            object = String.valueOf(object);
            object3 = new StringBuilder("Requested transform isn't registered: ");
            ((StringBuilder)object3).append((String)object4);
            ((StringBuilder)object3).append(": ");
            ((StringBuilder)object3).append((String)object);
            throw new fqb(((StringBuilder)object3).toString());
        }
        return ((gzs)object3).g().a();
    }

    private final Method aa(Class object) {
        Object object2 = (Class[])this.b;
        object = object2 = bmu.ab((Class)object, (String)this.c, (Class[])object2);
        if (object2 != null) {
            Object object3 = this.a;
            object = object2;
            if (object3 != null) {
                Class<?> clazz = ((Method)object2).getReturnType();
                object = object2;
                if (!((Class)object3).isAssignableFrom(clazz)) {
                    object = null;
                }
            }
        }
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Method ab(Class genericDeclaration, String string, Class[] classArray) {
        Object var4_5 = null;
        if (genericDeclaration == null) {
            return null;
        }
        try {
            if ((((Class)genericDeclaration).getModifiers() & 1) == 0) {
                return bmu.ab(((Class)genericDeclaration).getSuperclass(), string, classArray);
            }
            genericDeclaration = ((Class)genericDeclaration).getMethod(string, classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return var4_5;
        }
        try {
            int n2 = ((Method)genericDeclaration).getModifiers();
            if (1 == (n2 & 1)) return genericDeclaration;
            return var4_5;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return genericDeclaration;
        }
    }

    public final void A(Uri object, Uri object2) {
        Object object3 = this.X((Uri)object);
        Object object4 = ((fpo)object3).a;
        object = this.X((Uri)object2);
        if (object4 == object.a) {
            object2 = ((fpo)object3).a;
            object3 = ((fpo)object3).e;
            object = (Uri)object.e;
            object2.l((Uri)object3, (Uri)object);
            return;
        }
        throw new fqb("Cannot rename file across backends");
    }

    public final boolean B(Uri object) {
        object = this.X((Uri)object);
        return object.a.g((Uri)object.e);
    }

    public final boolean C(Uri uri) {
        return this.Y(uri.getScheme()).m(bmu.W(uri));
    }

    @Deprecated
    public final void D(Uri uri) {
        if (!this.B(uri)) {
            return;
        }
        if (!this.C(uri)) {
            this.z(uri);
            return;
        }
        Iterator iterator = this.v(uri).iterator();
        while (iterator.hasNext()) {
            this.D((Uri)iterator.next());
        }
        this.y(uri);
    }

    public final ffg E(fgu fgu2, fgr fgr2, ffk ffk2) {
        Object object = this.a;
        Object object2 = this.c.b();
        gfw gfw2 = ((fgp)object).a();
        object = (hpr)this.b.b();
        object.getClass();
        return new ffg((cya)object2, gfw2, (hpr)object, fgu2, fgr2, ffk2);
    }

    public final evi F(hpn hpn2, jrk jrk2, hpn hpn3, jrk jrk3, hpn hpn4, gto gto2, Runnable runnable, jnf jnf2) {
        hpn2.getClass();
        jvb jvb2 = (jvb)this.a.b();
        jvb2.getClass();
        Executor executor = (Executor)this.c.b();
        executor.getClass();
        Executor executor2 = (Executor)this.b.b();
        executor2.getClass();
        return new evi(hpn2, jrk2, hpn3, jrk3, hpn4, gto2, runnable, jnf2, jvb2, executor, executor2);
    }

    public final epa G(eot eot2) {
        Object object = this.c;
        Object object2 = this.b.b();
        ell ell2 = (ell)object.b();
        ell2.getClass();
        object = (jvb)this.a.b();
        object.getClass();
        return new epa(eot2, gsl.a, (bzb)object2, ell2, (jvb)object);
    }

    public final boolean H(dlu dlu2) {
        if (((imr)this.a).a().booleanValue()) {
            return ((dli)this.c).c.a == 2;
        }
        return dlt.d((Context)this.b, dlu2);
    }

    public final void I(AmbientMode$AmbientController ambientMode$AmbientController) {
        ((CopyOnWriteArrayList)this.a).add(ambientMode$AmbientController);
        this.b.run();
    }

    public final void J(AmbientMode$AmbientController ambientMode$AmbientController) {
        ((CopyOnWriteArrayList)this.a).remove(ambientMode$AmbientController);
        if ((a)this.c.remove(ambientMode$AmbientController) == null) {
            this.b.run();
            return;
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object K(Object object, Object ... object2) {
        try {
            Object object3 = this.aa(object.getClass());
            if (object3 == null) {
                object2 = this.c;
                String string = String.valueOf(object);
                object = new StringBuilder("Method ");
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(" not supported for object ");
                ((StringBuilder)object).append(string);
                object3 = new AssertionError((Object)((StringBuilder)object).toString());
                throw object3;
            }
            try {
                return ((Method)object3).invoke(object, (Object[])object2);
            }
            catch (IllegalAccessException illegalAccessException) {
                object2 = new AssertionError((Object)"Unexpectedly could not call: ".concat(object3.toString()));
                ((Throwable)object2).initCause(illegalAccessException);
                throw object2;
            }
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getTargetException();
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            object2 = new AssertionError((Object)"Unexpected exception");
            ((Throwable)object2).initCause(throwable);
            throw object2;
        }
    }

    public final boolean L(Object object) {
        return this.aa(object.getClass()) != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void M(Object object, Object ... object2) {
        Method method;
        block6: {
            try {
                method = this.aa(object.getClass());
                if (method != null) break block6;
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
                Throwable throwable = invocationTargetException.getTargetException();
                if (throwable instanceof RuntimeException) {
                    throw (RuntimeException)throwable;
                }
                object2 = new AssertionError((Object)"Unexpected exception");
                ((Throwable)object2).initCause(throwable);
                throw object2;
            }
        }
        try {
            method.invoke(object, (Object[])object2);
            return;
        }
        catch (IllegalAccessException illegalAccessException) {
            return;
        }
    }

    public final IllegalArgumentException N() {
        Object object = this.a;
        Object object2 = this.b;
        Object object3 = this.c;
        String string = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object3 = String.valueOf(object3);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("Multiple entries with same key: ");
        stringBuilder.append(string);
        stringBuilder.append("=");
        stringBuilder.append((String)object2);
        stringBuilder.append(" and ");
        stringBuilder.append((String)object3);
        stringBuilder.append("=");
        stringBuilder.append((String)object);
        return new IllegalArgumentException(stringBuilder.toString());
    }

    public final void O(hpn hpn2, Object object, geb geb2, gto gto2, Executor executor) {
        fxf.av();
        hhk.T(hpn2, gqk.g(new gdy(this, object, geb2, gto2, 0)), executor);
    }

    public final void P(hpn hpn2, Object object) {
        this.O(hpn2, object, geb.a, gsl.a, (Executor)hom.a);
    }

    public final void Q(hpn hpn2, Object object) {
        this.O(hpn2, object, geb.b, gsl.a, (Executor)hom.a);
    }

    public final hpn R(hpn object, hny object2) {
        Object object3 = (Set)((imc)this.c).a;
        Object object4 = hav.i(object3.size());
        object3 = object3.iterator();
        while (object3.hasNext()) {
            ((hat)object4).j(new gme((hny)object2, (gcg)object3.next(), 1));
        }
        object2 = this.b;
        object = new frn(object, 7);
        object4 = ((hat)object4).g();
        return ((bzo)object2).I((hnx)object, (hav)object4);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final gbj S(Class object) {
        jse.e(object, "serviceClass");
        Object object2 = this.a;
        synchronized (object2) {
            void var2_11;
            Object v2;
            Object object3 = this.c;
            Object v3 = v2 = object3.get(object);
            if (v2 != null) return (gbj)var2_11;
            Object object4 = ((bzb)this.b).a;
            ((ilt)((cya)object4).b).a();
            gbb gbb2 = (gbb)((cya)object4).a.b();
            hpr hpr2 = (hpr)((cya)object4).d.b();
            ((gdd)((cya)object4).e).a();
            gbe gbe2 = ((gbf)((cya)object4).c).a();
            gbj gbj2 = new gbj(hpr2, gbe2, (Class)object);
            object3.put(object, gbj2);
            return (gbj)var2_11;
        }
    }

    public final void T(cxt object, AmbientModeSupport$AmbientController object2, Parcelable parcelable) {
        int n2;
        boolean bl2;
        boolean bl3;
        Object object3;
        block5: {
            object3 = (by)this.b.a();
            bl3 = ((by)object3).V();
            bl2 = false;
            bl3 = !bl3 && !((by)object3).w;
            fxf.B(bl3, "Called when state-loss is possible.");
            object3 = (gsi)this.a.a();
            gsi.f();
            pb pb2 = ((gsi)object3).a;
            if (pb2.a) {
                pc.b(pb2);
            }
            int n3 = pb2.d;
            for (n2 = 0; n2 < n3; ++n2) {
                if (pb2.c[n2] != object2) {
                    continue;
                }
                break block5;
            }
            n2 = -1;
        }
        bl3 = n2 != -1;
        fxf.B(bl3, "Callback not registered.");
        n2 = ((gsi)object3).a.a(n2);
        object = new gsj(n2, parcelable, (hpn)((cxt)object).a);
        gsi.f();
        bl3 = pc.a(((gsi)object3).a, n2) != null;
        fxf.B(bl3, "Callback not registered.");
        bl3 = bl2;
        if (((gsi)object3).c != null) {
            bl3 = true;
        }
        fxf.B(bl3, "Listening outside of callback window.");
        fxf.B(((gsi)object3).g, "Executing tasks from lifecycle methods is disallowed since it can result in unnecessary operations during configuration changes or other lifecycle transitions.");
        fxf.B(((gsi)object3).i ^ true, "Calling listen() from FutureCallbackRegistry callbacks is disallowed because hopping through the UI thread adds extra latency. Chain the new Future to the original Future using Futures.transformAsync instead.");
        object2 = ((gsi)object3).d;
        ((gsj)object).c.c(new gjf(object, 13), (Executor)hom.a);
        ((gsi)object3).b.add(object);
        ((gsj)object).c((gsi)object3);
        if (!((gsj)object).b()) {
            object2 = (AmbientModeSupport$AmbientController)pc.a(((gsi)object3).a, n2);
            ((gsi)object3).h((gsj)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void U(Object object, AmbientModeSupport$AmbientController ambientModeSupport$AmbientController) {
        fpk.c();
        a.s(object, "Cannot subscribe with a null key");
        ov ov2 = new ov();
        Object object2 = this.a;
        synchronized (object2) {
            ham ham2 = new ham();
            hap hap2 = (hap)this.c.get(object);
            if (hap2 != null) {
                ham2.b(hap2);
            }
            ham2.g(ambientModeSupport$AmbientController);
            this.c.put(object, ham2.a());
        }
        object = new ou(ov2);
        while (object.hasNext()) {
            ((gea)object.next()).a();
        }
        return;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void V(Object var1_1, AmbientModeSupport$AmbientController var2_2) {
        fpk.c();
        a.s(var1_1, "Cannot unsubscribe from a null key");
        var7_3 = new ov();
        var6_4 = this.a;
        synchronized (var6_4) {
            var10_5 = (hap)this.c.get(var1_1);
            var5_6 = var10_5 != null;
            fxf.B(var5_6, "Failed to remove a subscription key. State is corrupted.");
            var8_7 = this.c;
            var9_8 = new ham();
            var9_8.b((Iterable)var10_5);
            var4_9 = var10_5.a(var2_2) - 1;
            Objects.requireNonNull(var9_8.a);
            var3_10 = var4_9;
            if (var4_9 != 0) ** GOTO lbl23
            if (!var9_8.c) {
                var9_8.a = var10_5 = new hco(var9_8.a);
                var9_8.c = true;
                var4_9 = 0;
            } else {
                var3_10 = 0;
lbl23:
                // 2 sources

                var4_9 = var3_10;
                if (var9_8.b) {
                    var9_8.a = var10_5 = new hcn(var9_8.a);
                    var9_8.c = false;
                    var4_9 = var3_10;
                }
            }
            var9_8.b = false;
            fxf.K(var2_2);
            if (var4_9 == 0) {
                var9_8.a.f(var2_2, fvd.X(var2_2));
            } else {
                var10_5 = var9_8.a;
                fxf.K(var2_2);
                var10_5.o(var2_2, var4_9);
            }
            var8_7.put(var1_1, var9_8.a());
            if (((hap)this.c.get(var1_1)).isEmpty()) {
                this.c.remove(var1_1);
            }
        }
        var1_1 = new ou(var7_3);
        while (true) {
            if (!var1_1.hasNext()) {
                return;
            }
            ((gea)var1_1.next()).b();
        }
    }

    public final String a() {
        String string = ((UUID)this.c).toString();
        jse.d(string, "id.toString()");
        return string;
    }

    public final int b() {
        return ((int[])this.a).length;
    }

    public final bmu c(int n2) {
        int[] nArray;
        int n3;
        int n4;
        Object object;
        int[] nArray2 = new int[n2];
        int[] nArray3 = new int[n2];
        int n5 = 0;
        int n6 = 0;
        while (n6 < n2) {
            object = this.b;
            n4 = ((int[])this.a).length;
            nArray2[n6] = ((Random)object).nextInt(n4 + 1);
            object = this.b;
            n4 = n6 + 1;
            n3 = ((Random)object).nextInt(n4);
            nArray3[n6] = nArray3[n3];
            nArray3[n3] = n6;
            n6 = n4;
        }
        Arrays.sort(nArray2);
        object = new int[((int[])this.a).length + n2];
        n4 = 0;
        n6 = 0;
        while (n5 < (nArray = (int[])this.a).length + n2) {
            if (n4 < n2 && n6 == nArray2[n4]) {
                object[n5] = nArray3[n4];
                ++n4;
            } else {
                n3 = nArray[n6];
                object[n5] = n3;
                if (n3 >= 0) {
                    object[n5] = n3 + n2;
                }
                ++n6;
            }
            ++n5;
        }
        return new bmu((int[])object, new Random(((Random)this.b).nextLong()));
    }

    public final void d(Menu menu, MenuInflater menuInflater) {
        Iterator iterator = ((CopyOnWriteArrayList)this.a).iterator();
        while (iterator.hasNext()) {
            ((by)((AmbientMode$AmbientController)iterator.next()).a).P(menu, menuInflater);
        }
    }

    public final void e(Menu menu) {
        Iterator iterator = ((CopyOnWriteArrayList)this.a).iterator();
        while (iterator.hasNext()) {
            ((by)((AmbientMode$AmbientController)iterator.next()).a).R(menu);
        }
    }

    public final boolean f(MenuItem menuItem) {
        Iterator iterator = ((CopyOnWriteArrayList)this.a).iterator();
        while (iterator.hasNext()) {
            if (!((by)((AmbientMode$AmbientController)iterator.next()).a).Q(menuItem)) continue;
            return true;
        }
        return false;
    }

    public final void g(qh qh2) {
        ((ArrayList)this.a).clear();
        int n2 = qh2.aI.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            qg qg2 = (qg)qh2.aI.get(i2);
            if (qg2.M() != 3 && qg2.N() != 3) continue;
            ((ArrayList)this.a).add(qg2);
        }
        qh2.c();
    }

    public final boolean h(rg object, qg qg2, int n2) {
        int n3;
        Object object2 = this.b;
        ((qo)object2).i = n3 = qg2.M();
        object2 = this.b;
        ((qo)object2).j = n3 = qg2.N();
        object2 = this.b;
        ((qo)object2).a = n3 = qg2.j();
        object2 = this.b;
        n3 = qg2.h();
        object2 = (qo)object2;
        ((qo)object2).b = n3;
        ((qo)object2).g = false;
        ((qo)object2).h = n2;
        n2 = ((qo)object2).i;
        n3 = ((qo)object2).j;
        n2 = n2 == 3 && qg2.X > 0.0f ? 1 : 0;
        n3 = n3 == 3 && qg2.X > 0.0f ? 1 : 0;
        if (n2 != 0 && qg2.u[0] == 4) {
            ((qo)object2).i = 1;
        }
        if (n3 != 0 && qg2.u[1] == 4) {
            ((qo)object2).j = 1;
        }
        ((rg)object).a(qg2, (qo)object2);
        qg2.C(((qo)this.b).c);
        qg2.x(((qo)this.b).d);
        object = (qo)this.b;
        qg2.F = ((qo)object).f;
        qg2.u(((qo)object).e);
        object = (qo)this.b;
        ((qo)object).h = 0;
        return ((qo)object).g;
    }

    public final void i(qh object, int n2, int n3, int n4) {
        int n5 = ((qg)object).ac;
        int n6 = ((qg)object).ad;
        ((qg)object).B(0);
        ((qg)object).A(0);
        ((qg)object).C(n3);
        ((qg)object).x(n4);
        ((qg)object).B(n5);
        ((qg)object).A(n6);
        object = this.c;
        ((qh)object).b = n2;
        ((qn)object).T();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Location j(String string) {
        try {
            if (!((LocationManager)this.b).isProviderEnabled(string)) return null;
            return ((LocationManager)this.b).getLastKnownLocation(string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public final String k() {
        return dec.f(this.c.values(), new cxc(13));
    }

    public final List l(ddu ddu2) {
        ArrayList<dhv> arrayList = new ArrayList<dhv>();
        for (dhv dhv2 : this.c.values()) {
            if (!dhv2.b.equals(ddu2)) continue;
            arrayList.add(dhv2);
        }
        return arrayList;
    }

    public final void m(dir dir2) {
        ddu ddu2 = dir2.e;
        if (this.l(ddu2).isEmpty()) {
            dir2.f.run();
            this.a.remove(ddu2);
        }
    }

    public final boolean n(String string) {
        return this.c.containsKey(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn o(Object object) {
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/base/TaskRunner", "cancel", 167, "TaskRunner.java")).u("Canceling task for: %s", this.q(object));
        Object object2 = this.a;
        synchronized (object2) {
            dea dea2 = (dea)this.a.get(object);
            if (dea2 == null) {
                return hhk.K(null);
            }
            synchronized (dea2) {
                object = dea2.b;
                if (object != null) {
                } else {
                    dea2.c.b();
                    object = new hqa();
                    dea2.b = object;
                    return dea2.b;
                }
            }
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final hpn p(Object object, ddz object2) {
        ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/base/TaskRunner", "execute", 118, "TaskRunner.java")).u("Executing task for %s", this.q(object));
        Object object3 = this.a;
        synchronized (object3) {
            Object object4 = (dea)this.a.get(object);
            dea dea2 = object4;
            if (object4 == null) {
                dea2 = new dea();
                this.a.put(object, dea2);
                object4 = this.b;
                Object object5 = new ddy(this, (ddz)object2, dea2, object, 0);
                object2 = object4.bf((Callable)object5);
                object4 = hhk.Z(new hpn[]{object2});
                object5 = new cvt(this, object, dea2, (hpn)object2, 3);
                dea2.a = ((iuv)object4).b((hnx)object5, (Executor)this.b);
            }
            return hhk.L(dea2.a);
        }
    }

    public final String q(Object object) {
        Object object2 = this.c;
        String string = object.toString();
        object = string;
        if (object2 != null) {
            object = a.ao(string, (String)object2, ":");
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r(String string) {
        synchronized (this) {
            Iterator iterator = ((LruCache)this.b).snapshot().entrySet().iterator();
            while (iterator.hasNext()) {
                Object object = iterator.next();
                Object object2 = ((krd)object.getValue()).b;
                if (object2 != null && !((dct)((dbx)object2).e()).a.equals(string)) continue;
                object2 = this.b;
                object = (File)object.getKey();
                ((LruCache)object2).remove(object);
            }
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final dbx s(String object, int n2, File file) {
        synchronized (this) {
            Object object2;
            Object object3;
            block21: {
                block20: {
                    object3 = (krd)((LruCache)this.b).get((Object)file);
                    if (!file.exists()) {
                        if (object3 != null) {
                            ((LruCache)this.b).remove((Object)file);
                        }
                        return null;
                    }
                    if (object3 == null) break block20;
                    object2 = object3;
                    if (file.lastModified() <= ((krd)object3).a) break block21;
                    ((LruCache)this.b).remove((Object)file);
                }
                object2 = null;
            }
            object3 = object2;
            if (object2 == null) {
                hji hji2 = new hji();
                FileInputStream fileInputStream = new FileInputStream(file);
                hji2.c(fileInputStream);
                object2 = object3 = (dbl)this.a.get(object);
                if (object3 == null) {
                    object2 = this.c;
                }
                ((hfk)ddd.a.l().j("com/google/android/libraries/micore/superpacks/ManifestFileCache", "parseManifestFile", 137, "ManifestFileCache.java")).C("Parsing manifest file %s with parser: %s", dec.e(file), object2);
                object2 = ((dbl)object2).a(fileInputStream, (String)object, n2);
                object = new krd((dbx)object2, file.lastModified());
                hji2.close();
                catch (Throwable throwable) {
                    try {
                        throw hji2.b(throwable, dbo.class);
                    }
                    catch (Throwable throwable2) {
                        try {
                            hji2.close();
                            throw throwable2;
                        }
                        catch (dbo dbo2) {
                            object = new krd(dbo2, file.lastModified());
                        }
                    }
                }
                ((LruCache)this.b).put((Object)file, object);
                object3 = object;
            }
            if ((object = ((krd)object3).c) == null) {
                object = ((krd)object3).b;
                return (dbx)object;
            }
            throw (Throwable)object;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void t(iea optional) {
        if (!TextUtils.equals((CharSequence)((iea)((Object)optional)).c, (CharSequence)"SODA_CLEARCUT")) {
            return;
        }
        Object object = ((iea)((Object)optional)).d;
        Object object2 = hwj.a();
        Object object3 = ihw.a;
        object = ((hvu)object).k();
        hwv hwv2 = ((hwv)object3).n();
        {
            catch (hxn hxn2) {
                Log.w((String)"SodaMetricsClearcut", (String)"Failed to parse message as SodaExtension", (Throwable)hxn2);
                return;
            }
            object3 = hyo.a.b(hwv2);
            object3.l(hwv2, hvz.p((hvy)object), (hwj)object2);
            object3.g(hwv2);
            {
                block33: {
                    block32: {
                        block35: {
                            int n2;
                            block34: {
                                block31: {
                                    catch (RuntimeException runtimeException) {
                                        if (!(runtimeException.getCause() instanceof hxn)) throw runtimeException;
                                        throw (hxn)runtimeException.getCause();
                                    }
                                    catch (IOException iOException) {
                                        if (iOException.getCause() instanceof hxn) {
                                            throw (hxn)iOException.getCause();
                                        }
                                        object2 = new hxn(iOException);
                                        throw object2;
                                    }
                                    catch (hzc hzc2) {
                                        throw hzc2.a();
                                    }
                                    catch (hxn hxn3) {
                                        object2 = hxn3;
                                        if (!hxn3.a) throw object2;
                                        object2 = new hxn(hxn3);
                                        throw object2;
                                    }
                                    try {
                                        ((hvy)object).z(0);
                                    }
                                    catch (hxn hxn4) {}
                                    throw hxn4;
                                    {
                                        hwv.D(hwv2);
                                        hwv2 = (ihw)hwv2;
                                        object2 = object = ((ihw)hwv2).c;
                                        if (object == null) {
                                            object2 = ihx.a;
                                        }
                                        object2 = object = ((ihx)object2).c;
                                        if (object == null) {
                                            object2 = ihv.a;
                                        }
                                        object2 = object = ((ihv)object2).b;
                                        if (object != null) break block31;
                                        object2 = ihj.a;
                                    }
                                }
                                object2 = object = idy.b(((ihj)object2).b);
                                if (object == null) {
                                    object2 = idy.a;
                                }
                                if ((n2 = ((Enum)object2).ordinal()) == 8 || n2 == 29 || n2 == 13 || n2 == 14) break block33;
                                object2 = object = ((ihw)hwv2).c;
                                if (object == null) {
                                    object2 = ihx.a;
                                }
                                object2 = object = ((ihx)object2).c;
                                if (object == null) {
                                    object2 = ihv.a;
                                }
                                object2 = object = ((ihv)object2).b;
                                if (object == null) {
                                    object2 = ihj.a;
                                }
                                if (object2 == null) return;
                                object = object3 = idy.b(((ihj)object2).b);
                                if (object3 == null) {
                                    object = idy.a;
                                }
                                if (!(((Enum)object).equals(idy.f) || (n2 = a.F(((ihj)object2).d)) != 0 && n2 == 4 || !((String)(object2 = fgh.a((ihj)object2))).startsWith("com.google") && !((String)object2).startsWith("com.android"))) {
                                    if (!fgh.a.containsKey(object2)) return;
                                }
                                object2 = this.b;
                                object = this.c;
                                object3 = (crc)this.a;
                                object = cro.a((Context)object, (crc)object3);
                                object3 = ((caj)object2).g(hwv2, (cro)object);
                                ((cag)object3).i = ((iea)((Object)optional)).c;
                                object2 = ((ihw)hwv2).c;
                                optional = object2;
                                if (object2 == null) {
                                    optional = ihx.a;
                                }
                                object2 = ((ihx)((Object)optional)).c;
                                optional = object2;
                                if (object2 == null) {
                                    optional = ihv.a;
                                }
                                object2 = ((ihv)((Object)optional)).b;
                                optional = object2;
                                if (object2 == null) {
                                    optional = ihj.a;
                                }
                                if (optional != null) break block34;
                                optional = Optional.empty();
                                break block32;
                            }
                            object2 = object = idy.b(((ihj)((Object)optional)).b);
                            if (object == null) {
                                object2 = idy.a;
                            }
                            if (((Enum)object2).equals(idy.f) || (n2 = a.F(((ihj)((Object)optional)).d)) != 0 && n2 == 4) break block35;
                            object2 = object = idy.b(((ihj)((Object)optional)).b);
                            if (object == null) {
                                object2 = idy.a;
                            }
                            if (((Enum)object2).equals(idy.C) && (n2 = a.F(((ihj)((Object)optional)).d)) != 0 && n2 == 6) {
                                optional = Optional.of(91187825);
                                break block32;
                            } else {
                                object2 = object = idy.b(((ihj)((Object)optional)).b);
                                if (object == null) {
                                    object2 = idy.a;
                                }
                                if (((Enum)object2).equals(idy.D) && (n2 = a.F(((ihj)((Object)optional)).d)) != 0 && n2 == 6) {
                                    optional = Optional.of(85741106);
                                    break block32;
                                } else {
                                    optional = fgh.a(optional);
                                    optional = Optional.ofNullable((Integer)fgh.a.get(optional));
                                }
                            }
                            break block32;
                        }
                        optional = Optional.of(109599039);
                    }
                    optional.ifPresent(new bme(object3, 8));
                    ((cag)object3).a();
                    return;
                }
                ((heg)((heg)((heg)cnw.a.f()).g(30, TimeUnit.SECONDS)).j("com/google/android/libraries/assistant/soda/metrics/SodaMetricsUtils", "isMetricsLoggingSupported", 21, "SodaMetricsUtils.java")).s("Metrics logging not supported for host app id: %d", ((idy)object2).E);
                return;
            }
        }
    }

    public final long u(Uri object) {
        object = this.X((Uri)object);
        return object.a.p((Uri)object.e);
    }

    public final Iterable v(Uri object2) {
        fqv fqv2 = this.Y(object2.getScheme());
        gzx gzx2 = this.Z((Uri)object2);
        ArrayList<Uri> arrayList = new ArrayList<Uri>();
        String string = object2.getEncodedFragment();
        Iterator iterator = fqv2.h(bmu.W(object2)).iterator();
        while (iterator.hasNext()) {
            fqv2 = ((Uri)iterator.next()).buildUpon().encodedFragment(string).build();
            object2 = fqv2;
            if (!gzx2.isEmpty()) {
                ArrayList<String> arrayList2 = new ArrayList<String>(fqv2.getPathSegments());
                object2 = fqv2;
                if (!arrayList2.isEmpty()) {
                    object2 = fqv2;
                    if (!fqv2.getPath().endsWith("/")) {
                        String string2 = (String)fvd.P(arrayList2);
                        for (Object object2 : gzx2) {
                        }
                        arrayList2.set(arrayList2.size() - 1, string2);
                        object2 = fqv2.buildUpon().path(TextUtils.join((CharSequence)"/", arrayList2)).build();
                    }
                }
            }
            arrayList.add((Uri)object2);
        }
        return arrayList;
    }

    public final Object w(Uri uri, fpp fpp2) {
        return fpp2.a(this.X(uri));
    }

    public final void x(Uri uri) {
        this.Y(uri.getScheme()).i(bmu.W(uri));
    }

    public final void y(Uri uri) {
        this.Y(uri.getScheme()).j(bmu.W(uri));
    }

    public final void z(Uri object) {
        object = this.X((Uri)object);
        object.a.k((Uri)object.e);
    }
}

