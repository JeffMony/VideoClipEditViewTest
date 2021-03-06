package com.video.mp4compose.filter;

import com.video.mp4compose.utils.GLESUtils;

/**
 * Created by sudamasayuki on 2018/01/06.
 */

public class GlInvertComposeFilter extends GlComposeFilter {
    private static final String FRAGMENT_SHADER =
            "#extension GL_OES_EGL_image_external : require\n" +
                    "precision mediump float;" +
                    "varying vec2 vTextureCoord;" +
                    "uniform samplerExternalOES sTexture;\n" +
                    "void main() {" +
                    "lowp vec4 color = texture2D(sTexture, vTextureCoord);" +
                    "gl_FragColor = vec4((1.0 - color.rgb), color.w);" +
                    "}";

    public GlInvertComposeFilter() {
        super(GLESUtils.DEFAULT_VERTEX_SHADER, FRAGMENT_SHADER);
    }
}

