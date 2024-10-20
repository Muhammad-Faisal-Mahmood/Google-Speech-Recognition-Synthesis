/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Xml
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.Context;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;

public final class age {
    public int a;
    public Object b;
    private int c;
    private Object d;

    public age() {
        this.d = new long[10];
        this.b = new Object[10];
    }

    public age(Context context, XmlPullParser xmlPullParser) {
        this.b = new ArrayList();
        this.c = -1;
        xmlPullParser = context.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), rs.h);
        int n2 = xmlPullParser.getIndexCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = xmlPullParser.getIndex(i2);
            if (n3 == 0) {
                this.a = xmlPullParser.getResourceId(0, this.a);
                continue;
            }
            if (n3 != 1) continue;
            this.c = xmlPullParser.getResourceId(1, this.c);
            Object object = context.getResources().getResourceTypeName(this.c);
            context.getResources().getResourceName(this.c);
            if (!"layout".equals(object)) continue;
            this.d = object = new ro();
            n3 = this.c;
            ro ro2 = (ro)object;
            ((ro)object).b(context, n3);
        }
        xmlPullParser.recycle();
    }

    private final Object f() {
        boolean bl2 = this.a > 0;
        abr.f(bl2);
        Object object = this.b;
        int n2 = this.c;
        Object[] objectArray = (Object[])object;
        object = objectArray[n2];
        objectArray[n2] = null;
        this.c = (n2 + 1) % objectArray.length;
        --this.a;
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a() {
        synchronized (this) {
            return this.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b() {
        synchronized (this) {
            int n2 = this.a;
            if (n2 != 0) return this.f();
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(long l2) {
        synchronized (this) {
            int n2;
            Object object;
            Object object2 = null;
            while (this.a > 0 && l2 - ((long[])(object = this.d))[n2 = this.c] >= 0L) {
                object2 = this.f();
            }
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(long l2, Object object) {
        synchronized (this) {
            Object[] objectArray;
            int n2;
            int n3;
            int n4 = this.a;
            if (n4 > 0 && l2 <= ((long[])this.d)[((n3 = this.c) + n4 - 1) % (n2 = ((Object[])this.b).length)]) {
                this.e();
            }
            if (this.a >= (n4 = ((Object[])this.b).length)) {
                n3 = n4 + n4;
                long[] lArray = new long[n3];
                objectArray = new Object[n3];
                n3 = this.c;
                System.arraycopy(this.d, n3, lArray, 0, n4 -= n3);
                System.arraycopy(this.b, this.c, objectArray, 0, n4);
                n3 = this.c;
                if (n3 > 0) {
                    System.arraycopy(this.d, 0, lArray, n4, n3);
                    System.arraycopy(this.b, 0, objectArray, n4, this.c);
                }
                this.d = lArray;
                this.b = objectArray;
                this.c = 0;
            }
            n3 = this.c;
            n4 = this.a;
            objectArray = this.b;
            n3 = (n3 + n4) % objectArray.length;
            ((long[])this.d)[n3] = l2;
            objectArray[n3] = object;
            this.a = n4 + 1;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        synchronized (this) {
            this.c = 0;
            this.a = 0;
            Arrays.fill((Object[])this.b, null);
            return;
        }
    }
}

