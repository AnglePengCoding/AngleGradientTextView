package angle.com.anglegradienttextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import angle.com.angle_gradinet_library.AngleGradientTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AngleGradientTextView mAgt =findViewById(R.id.mAgt);
        mAgt.setScanPositions(new float[]{0f,1f,0f});
        mAgt.setScanColors(new int[]{0x43fff44f, 0xffff33ff, 0x65f2fff});
        mAgt.setDelayMilliseconds(2);
    }
}













