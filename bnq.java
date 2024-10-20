/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import java.util.List;

public interface bnq {
    @Deprecated
    public boolean isStateSet();

    public void setLogo(Drawable var1);

    public void setMenuItems(List var1);

    public void setNavButtonMode(bmp var1);

    @Deprecated
    public void setNavButtonMode(bnk var1);

    @Deprecated
    public void setState(bnp var1);

    public void setSubtitle(CharSequence var1);

    public void setTabs(List var1);

    public void setTitle(int var1);

    public void setTitle(CharSequence var1);
}

