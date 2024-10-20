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
import org.xmlpull.v1.XmlPullParser;

public final class rh {
    float a = Float.NaN;
    float b = Float.NaN;
    float c = Float.NaN;
    float d = Float.NaN;
    int e = -1;
    ro f;

    public rh(Context context, XmlPullParser xmlPullParser) {
        xmlPullParser = context.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), rs.j);
        int n2 = xmlPullParser.getIndexCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = xmlPullParser.getIndex(i2);
            if (n3 == 0) {
                this.e = xmlPullParser.getResourceId(0, this.e);
                Object object = context.getResources().getResourceTypeName(this.e);
                context.getResources().getResourceName(this.e);
                if (!"layout".equals(object)) continue;
                this.f = object = new ro();
                ((ro)object).b(context, this.e);
                continue;
            }
            if (n3 == 1) {
                this.d = xmlPullParser.getDimension(1, this.d);
                continue;
            }
            if (n3 == 2) {
                this.b = xmlPullParser.getDimension(2, this.b);
                continue;
            }
            if (n3 == 3) {
                this.c = xmlPullParser.getDimension(3, this.c);
                continue;
            }
            if (n3 != 4) continue;
            this.a = xmlPullParser.getDimension(4, this.a);
        }
        xmlPullParser.recycle();
    }
}

