package fatty.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

import static fatty.test.R.id.testViewID;

/**
 * Created by Fatty on 2017-01-25.
 */

public class testView extends TextView {

    private Paint mPaint1,mPaint2,mPaint3,mPaint4,mPaint5;

    public testView(Context context, AttributeSet attrs) {

        super(context,attrs);

        int color = 0xffffffff;

        mPaint1 = new Paint();
        mPaint1.setColor(color);
        mPaint1.setStyle(Paint.Style.FILL);

        mPaint2 = new Paint();
        color = 0xffE1B1BB;
        mPaint2.setColor(color);
        mPaint2.setStyle(Paint.Style.FILL);

        mPaint3 = new Paint();
        color = 0xffffffff;
        mPaint3.setColor(color);
        mPaint3.setTextSize(440);//設定字體大小
        mPaint3.setStyle(Paint.Style.FILL);

        mPaint4 = new Paint();
        color = 0xff5E2430;
        mPaint4.setColor(color);
        mPaint4.setTextSize(100);//設定字體大小
        mPaint4.setStyle(Paint.Style.FILL);

        mPaint5 = new Paint();
        color = 0xff5E2430;
        mPaint5.setColor(color);
        mPaint5.setTextSize(40);//設定字體大小
        mPaint5.setStyle(Paint.Style.FILL);
        //TextView testViewID = (TextView) findViewById(R.id.testViewID);
        //testViewID.setText(Html.fromHtml("Hello World!!<br><small><small><small><font color='#5E2430'>\t\t\t\t\t\tfffff</font><small><small><small>"));
    }

    @Override
    protected void onDraw(Canvas canvas){

        canvas.drawRect(0,0,getMeasuredWidth(),getMeasuredHeight(),mPaint1);
        canvas.drawRect(10,10,getMeasuredWidth()-10,getMeasuredHeight()-10,mPaint2);
        canvas.save();

        canvas.translate(5,0);
        super.onDraw(canvas);
        canvas.restore();

        canvas.drawText("2017", 50, 800, mPaint3);//（顯示文字,顯示位置-X,顯示位置-Y, paint）
        canvas.drawText("0125", 800, 600, mPaint4);//（顯示文字,顯示位置-X,顯示位置-Y, paint）
        canvas.drawText("練習自定義View與Canvas", 560, 750, mPaint5);//（顯示文字,顯示位置-X,顯示位置-Y, paint）
        //canvas.drawText("");

    }
}
