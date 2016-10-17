package com.geojit.libin.travelmate.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.Button;

import com.geojit.libin.travelmate.R;

/**
 * Created by 10945 on 10/17/2016.
 */

public class TMButton extends Button {
    public TMButton(Context context) {
        super(context);

        init(context, null);
    }

    public TMButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context, attrs);
    }

    public TMButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public TMButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray attributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.TMTextView, 0, 0);

            try {
                int font = attributes.getInteger(R.styleable.TMTextView_font, 0);

                Typeface type;
                switch (font) {
                    case 0:
                        int fontStyle = attributes.getInteger(R.styleable.TMTextView_fontstyle, 0);

                        switch (fontStyle) {
                            case 0:
                                type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreams/CaviarDreams.ttf");
                                this.setTypeface(type);
                                break;

                            case 1:
                                type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreams/Caviar_Dreams_Bold.ttf");
                                this.setTypeface(type);
                                break;

                            case 2:
                                type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreams/CaviarDreams_BoldItalic.ttf");
                                this.setTypeface(type);
                                break;

                            case 3:
                                type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreams/CaviarDreams_Italic.ttf");
                                this.setTypeface(type);
                                break;

                            default:
                                type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreams/CaviarDreams.ttf");
                                this.setTypeface(type);
                                break;
                        }

                        break;

                    default:
                        type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreams/CaviarDreams.ttf");
                        this.setTypeface(type);
                }


            } finally {
                attributes.recycle();
            }

        } else {
            Typeface type = Typeface.createFromAsset(context.getAssets(), "fonts/CaviarDreams/CaviarDreams.ttf");
            this.setTypeface(type);
        }

    }
}
