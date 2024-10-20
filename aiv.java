/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.TextureView$SurfaceTextureListener
 */
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

public final class aiv
implements SurfaceHolder.Callback,
TextureView.SurfaceTextureListener {
    public final aiy a;

    public aiv(aiy aiy2) {
        this.a = aiy2;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n2, int n3) {
        surfaceTexture = new Surface(surfaceTexture);
        aiy aiy2 = this.a;
        aiy2.s(surfaceTexture);
        aiy2.n = surfaceTexture;
        this.a.q(n2, n3);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.s(null);
        this.a.q(0, 0);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n2, int n3) {
        this.a.q(n2, n3);
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int n2, int n3, int n4) {
        this.a.q(n3, n4);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.q(0, 0);
    }
}

