/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$Action$Builder
 *  android.app.Notification$BigTextStyle
 *  android.app.Notification$Builder
 *  android.app.PendingIntent
 *  android.app.RemoteInput
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Icon
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public final class sk {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    CharSequence e;
    CharSequence f;
    public PendingIntent g;
    public int h;
    sl i;
    int j;
    int k;
    boolean l;
    public boolean m = false;
    public String n;
    Bundle o;
    public String p;
    public final Notification q;
    @Deprecated
    public final ArrayList r;

    public sk(Context context, String string) {
        Notification notification;
        this.q = notification = new Notification();
        this.a = context;
        this.p = string;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.h = 0;
        this.r = new ArrayList();
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        CharSequence charSequence2 = charSequence;
        if (charSequence.length() > 5120) {
            charSequence2 = charSequence.subSequence(0, 5120);
        }
        return charSequence2;
    }

    /*
     * Unable to fully structure code
     */
    public final Notification a() {
        block43: {
            new ArrayList<E>();
            var9_1 = new Bundle();
            var6_2 = this.p;
            var8_6 = new Notification.Builder(this.a, (String)var6_2);
            var10_7 = this.q;
            var6_2 = var8_6.setWhen(var10_7.when).setSmallIcon(var10_7.icon, var10_7.iconLevel).setContent(var10_7.contentView).setTicker(var10_7.tickerText, null).setVibrate(var10_7.vibrate).setLights(var10_7.ledARGB, var10_7.ledOnMS, var10_7.ledOffMS);
            var5_8 = (var10_7.flags & 2) != 0;
            var6_2 = var6_2.setOngoing(var5_8);
            var5_8 = (var10_7.flags & 8) != 0;
            var6_2 = var6_2.setOnlyAlertOnce(var5_8);
            var5_8 = (var10_7.flags & 16) != 0;
            var6_2 = var6_2.setAutoCancel(var5_8).setDefaults(var10_7.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(var10_7.deleteIntent);
            var5_8 = (var10_7.flags & 128) != 0;
            var6_2.setFullScreenIntent(null, var5_8).setNumber(0).setProgress(this.j, this.k, this.l);
            var8_6.setLargeIcon(null);
            var8_6.setSubText(null).setUsesChronometer(false).setPriority(this.h);
            var12_9 = this.b;
            var3_10 = var12_9.size();
            for (var1_11 = 0; var1_11 < var3_10; ++var1_11) {
                block42: {
                    block41: {
                        var11_15 = (si)var12_9.get(var1_11);
                        var7_14 = var11_15.a();
                        if (var7_14 == null) break block41;
                        var2_12 = var7_14.b;
                        switch (var2_12) {
                            default: {
                                throw new IllegalArgumentException("Unknown type");
                            }
                            case 6: {
                                if (Build.VERSION.SDK_INT < 30) ** GOTO lbl35
                                var6_2 = sk$$ExternalSyntheticApiModelOutline1.m(var7_14.b());
                                ** GOTO lbl81
lbl35:
                                // 1 sources

                                var6_2 = var7_14.b();
                                Objects.toString(var6_2);
                                throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(var6_2)));
                            }
                            case 5: {
                                var6_2 = ag$$ExternalSyntheticApiModelOutline0.m((Bitmap)var7_14.c);
                                ** GOTO lbl81
                            }
                            case 4: {
                                var6_2 = Icon.createWithContentUri((String)((String)var7_14.c));
                                ** GOTO lbl81
                            }
                            case 3: {
                                var6_2 = Icon.createWithData((byte[])((byte[])var7_14.c), (int)var7_14.f, (int)var7_14.g);
                                ** GOTO lbl81
                            }
                            case 2: {
                                if (var2_12 != -1) ** GOTO lbl70
                                var6_2 = var7_14.c;
                                if (Build.VERSION.SDK_INT < 28) ** GOTO lbl54
                                var6_2 = fs$$ExternalSyntheticApiModelOutline0.m((Icon)var6_2);
                                ** GOTO lbl74
lbl54:
                                // 1 sources

                                try {
                                    var6_2 = (String)var6_2.getClass().getMethod("getResPackage", null).invoke(var6_2, null);
                                    ** GOTO lbl74
                                }
                                catch (NoSuchMethodException var6_3) {
                                    Log.e((String)"IconCompat", (String)"Unable to get icon package", (Throwable)var6_3);
                                }
                                catch (InvocationTargetException var6_4) {
                                    Log.e((String)"IconCompat", (String)"Unable to get icon package", (Throwable)var6_4);
                                }
                                catch (IllegalAccessException var6_5) {
                                    Log.e((String)"IconCompat", (String)"Unable to get icon package", (Throwable)var6_5);
                                }
                                var6_2 = null;
                                ** GOTO lbl74
lbl70:
                                // 1 sources

                                if (var2_12 == 2) {
                                    var6_2 = var7_14.k;
                                    var6_2 = var6_2 != null && !TextUtils.isEmpty((CharSequence)var6_2) ? var7_14.k : ((String)var7_14.c).split(":", -1)[0];
                                }
                                ** GOTO lbl76
lbl74:
                                // 4 sources

                                var6_2 = Icon.createWithResource((String)var6_2, (int)var7_14.f);
                                ** GOTO lbl81
lbl76:
                                // 1 sources

                                Objects.toString(var7_14);
                                throw new IllegalStateException("called getResPackage() on ".concat(var7_14.toString()));
                            }
                            case 1: {
                                var6_2 = Icon.createWithBitmap((Bitmap)((Bitmap)var7_14.c));
lbl81:
                                // 6 sources

                                var13_16 = var7_14.h;
                                if (var13_16 != null) {
                                    var6_2.setTintList((ColorStateList)var13_16);
                                }
                                var13_16 = var7_14.i;
                                var7_14 = var6_2;
                                if (var13_16 != IconCompat.a) {
                                    var6_2.setTintMode((PorterDuff.Mode)var13_16);
                                    var7_14 = var6_2;
                                }
                                break block42;
                            }
                            case -1: 
                        }
                        var7_14 = (Icon)var7_14.c;
                        break block42;
                    }
                    var7_14 = null;
                }
                var6_2 = new Notification.Action.Builder((Icon)var7_14, var11_15.e, var11_15.f);
                var13_16 = var11_15.g;
                if (var13_16 != null) {
                    var4_13 = ((PorterDuff.Mode)var13_16).length;
                    var7_14 = new RemoteInput[var4_13];
                    if (var4_13 <= 0) {
                        for (var2_12 = 0; var2_12 < var4_13; ++var2_12) {
                            var6_2.addRemoteInput((RemoteInput)var7_14[var2_12]);
                        }
                    } else {
                        var6_2 = var13_16[0];
                        throw null;
                    }
                }
                var7_14 = new Bundle(var11_15.a);
                var5_8 = var11_15.b;
                var7_14.putBoolean("android.support.allowGeneratedReplies", true);
                var5_8 = var11_15.b;
                ag$$ExternalSyntheticApiModelOutline1.m((Notification.Action.Builder)var6_2, true);
                var7_14.putInt("android.support.action.semanticAction", 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    fs$$ExternalSyntheticApiModelOutline0.m((Notification.Action.Builder)var6_2, 0);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    dp$$ExternalSyntheticApiModelOutline0.m((Notification.Action.Builder)var6_2, false);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    ut$$ExternalSyntheticApiModelOutline0.m((Notification.Action.Builder)var6_2, false);
                }
                var7_14.putBoolean("android.support.action.showsUserInterface", var11_15.c);
                var6_2.addExtras((Bundle)var7_14);
                var8_6.addAction(var6_2.build());
            }
            var6_2 = this.o;
            if (var6_2 != null) {
                var9_1.putAll((Bundle)var6_2);
            }
            var8_6.setShowWhen(true);
            var8_6.setLocalOnly(this.m);
            var8_6.setGroup(null);
            var8_6.setSortKey(null);
            var8_6.setGroupSummary(false);
            var8_6.setCategory(this.n);
            var8_6.setColor(0);
            var8_6.setVisibility(0);
            var8_6.setPublicVersion(null);
            var8_6.setSound(var10_7.sound, var10_7.audioAttributes);
            if (Build.VERSION.SDK_INT >= 28) ** GOTO lbl170
            var7_14 = this.c;
            var6_2 = new ArrayList<E>(var7_14.size());
            if (!(var7_14 = var7_14.iterator()).hasNext()) {
                var10_7 = this.r;
                var7_14 = new ov(var6_2.size() + var10_7.size());
                var7_14.addAll((Collection)var6_2);
                var7_14.addAll((Collection)var10_7);
                var6_2 = new ArrayList(var7_14);
            } else {
                var6_2 = (sq)var7_14.next();
                throw null;
lbl170:
                // 1 sources

                var6_2 = this.r;
            }
            if (!var6_2.isEmpty()) {
                var6_2 = var6_2.iterator();
                while (var6_2.hasNext()) {
                    var8_6.addPerson((String)var6_2.next());
                }
            }
            if (this.d.size() <= 0) break block43;
            var6_2 = var7_14 = this.b().getBundle("android.car.EXTENSIONS");
            if (var7_14 == null) {
                var6_2 = new Bundle();
            }
            var10_7 = new Bundle((Bundle)var6_2);
            var12_9 = new Bundle();
            for (var1_11 = 0; var1_11 < this.d.size(); ++var1_11) {
                block46: {
                    block45: {
                        block44: {
                            var7_14 = this.d;
                            var11_15 = Integer.toString(var1_11);
                            var13_16 = (si)var7_14.get(var1_11);
                            var14_17 = new Bundle();
                            var7_14 = var13_16.a();
                            var2_12 = var7_14 != null ? var7_14.a() : 0;
                            var14_17.putInt("icon", var2_12);
                            var14_17.putCharSequence("title", var13_16.e);
                            var14_17.putParcelable("actionIntent", (Parcelable)var13_16.f);
                            var7_14 = new Bundle(var13_16.a);
                            var5_8 = var13_16.b;
                            var7_14.putBoolean("android.support.allowGeneratedReplies", true);
                            var14_17.putBundle("extras", (Bundle)var7_14);
                            var15_18 = var13_16.g;
                            if (var15_18 != null) break block44;
                            var7_14 = null;
                            break block45;
                        }
                        var2_12 = var15_18.length;
                        var7_14 = new Bundle[var2_12];
                        if (var2_12 > 0) break block46;
                    }
                    var14_17.putParcelableArray("remoteInputs", (Parcelable[])var7_14);
                    var14_17.putBoolean("showsUserInterface", var13_16.c);
                    var14_17.putInt("semanticAction", 0);
                    var12_9.putBundle((String)var11_15, var14_17);
                    continue;
                }
                var6_2 = var15_18[0];
                new Bundle();
                throw null;
            }
            var6_2.putBundle("invisible_actions", (Bundle)var12_9);
            var10_7.putBundle("invisible_actions", (Bundle)var12_9);
            this.b().putBundle("android.car.EXTENSIONS", var6_2);
            var9_1.putBundle("android.car.EXTENSIONS", (Bundle)var10_7);
        }
        var8_6.setExtras(this.o);
        ag$$ExternalSyntheticApiModelOutline1.m(var8_6, null);
        ag$$ExternalSyntheticApiModelOutline0.m(var8_6, 0);
        ag$$ExternalSyntheticApiModelOutline0.m(var8_6, null);
        ag$$ExternalSyntheticApiModelOutline0.m(var8_6, null);
        ag$$ExternalSyntheticApiModelOutline0.m(var8_6, 0L);
        ag$$ExternalSyntheticApiModelOutline0.m$1(var8_6, 0);
        if (!TextUtils.isEmpty((CharSequence)this.p)) {
            var8_6.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (Build.VERSION.SDK_INT >= 28 && (var6_2 = this.c).size() > 0) {
            var6_2 = (sq)var6_2.get(0);
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            dp$$ExternalSyntheticApiModelOutline0.m(var8_6, true);
            dp$$ExternalSyntheticApiModelOutline0.m(var8_6, null);
        }
        if ((var7_14 = this.i) != null) {
            new Notification.BigTextStyle(var8_6).setBigContentTitle(null).bigText(((sj)var7_14).a);
        }
        var6_2 = var8_6.build();
        if (var7_14 != null && (var7_14 = var6_2.extras) != null) {
            var7_14.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        return var6_2;
    }

    public final Bundle b() {
        if (this.o == null) {
            this.o = new Bundle();
        }
        return this.o;
    }

    public final void d(int n2, boolean bl2) {
        if (bl2) {
            Notification notification = this.q;
            notification.flags = n2 | notification.flags;
            return;
        }
        Notification notification = this.q;
        notification.flags = ~n2 & notification.flags;
    }

    public final void e(CharSequence charSequence) {
        this.f = sk.c(charSequence);
    }

    public final void f(CharSequence charSequence) {
        this.e = sk.c(charSequence);
    }

    public final void g(boolean bl2) {
        this.d(2, bl2);
    }

    public final void h(int n2, int n3, boolean bl2) {
        this.j = n2;
        this.k = n3;
        this.l = bl2;
    }

    public final void i(int n2) {
        this.q.icon = n2;
    }

    public final void j(sl sl2) {
        if (this.i != sl2) {
            sk sk2;
            this.i = sl2;
            if (sl2 != null && sl2.b != this && (sk2 = (sl2.b = this)) != null) {
                sk2.j(sl2);
            }
        }
    }
}

