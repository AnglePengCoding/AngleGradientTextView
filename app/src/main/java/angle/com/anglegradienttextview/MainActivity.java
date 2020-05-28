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
        mAgt.setDelayMilliseconds(500);
        mAgt.setScanPositions(new float[]{0f,0.5f,1f});
    }
}













