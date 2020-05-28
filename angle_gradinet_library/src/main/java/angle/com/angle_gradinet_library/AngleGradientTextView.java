package angle.com.angle_gradinet_library;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by
 * angle on 2020/5/28.
 * 闪烁字体
 */

public class AngleGradientTextView extends AppCompatTextView {
    private LinearGradient mLinearGradient;
    private Matrix mGradientMatrix;
    private Paint mPaint;
    private int mViewWidth = 0;
    private int mTranslate = 0;
    private long mDelayMilliseconds;
    private int delta = 15;
    private int colors[]= new int[]{ 0x33ffffff, 0xffffffff, 0x33fffff};
    private float positions[] = new float[]{ 0, 0.5f, 1};

    public AngleGradientTextView(Context context) {
        super(context);
    }

    public AngleGradientTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mViewWidth == 0) {
            mViewWidth = getMeasuredWidth();
            if (mViewWidth > 0) {
                mPaint = getPaint();
                String text = getText().toString();
                int size;
                if (text.length() > 0) {
                    size = mViewWidth / text.length() * 3;
                } else {
                    size = mViewWidth;
                }
                mLinearGradient = new LinearGradient(-size, 0, 0, 0,
                        colors, positions, Shader.TileMode.CLAMP);
                mPaint.setShader(mLinearGradient);
                mGradientMatrix = new Matrix();
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float mTextWidth = getPaint().measureText(getText().toString());
        mTranslate += delta;
        if (mTranslate > mTextWidth + 1 || mTranslate < 1) {
            delta = -delta;
        }
        mGradientMatrix.setTranslate(mTranslate, 0);
        mLinearGradient.setLocalMatrix(mGradientMatrix);
        postInvalidateDelayed(getDelayMilliseconds());
    }


    /**
     * 扫描时间
     *
     * @param delayMilliseconds 扫描时间
     */
    public void setDelayMilliseconds(long delayMilliseconds) {
        this.mDelayMilliseconds = delayMilliseconds;
    }

    public long getDelayMilliseconds() {
        if (mDelayMilliseconds == 0) {
            mDelayMilliseconds = 30;
            return mDelayMilliseconds;
        }
        return mDelayMilliseconds;
    }


    /**
     * 扫描颜色
     * 数组长度为3
     *
     * @param colors 颜色
     */
    public void setScanColors(int[] colors) {
        if (colors.length > 4) {
            throw new IndexOutOfBoundsException("colors the maximum size is three");
        }
        this.colors = colors;
    }

    /**
     * 扫描渐变设置
     * 数组长度为3
     *
     * @param positions 扫描渐变设置
     */
    public void setScanPositions(float[] positions) {
        if (positions.length > 4) {
            throw new IndexOutOfBoundsException("positions the maximum size is three");
        }
        this.positions = positions;
    }
}
