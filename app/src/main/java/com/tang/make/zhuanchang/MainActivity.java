package com.tang.make.zhuanchang;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         final LinearLayout linearLayout= (LinearLayout) findViewById(R.id.ll);
        final TextView textView=(TextView) findViewById(R.id.tv);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                /*
//                这个情况是不适用V7包的
//                 */
//              startActivity(new Intent(MainActivity.this,SecondActivity.class),
//                      ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,linearLayout,"shareAnim").toBundle());
//
//                /*
//                使用V7包
//                 */
//                startActivity(new Intent(MainActivity.this,SecondActivity.class),
//                        ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,linearLayout,"shareAnim").toBundle());

                startActivity(new Intent(MainActivity.this,SecondActivity.class),
                        ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,
                                Pair.create((View)linearLayout,"shareAnim"),
                                Pair.create((View)textView,"shareAnimTextView")).toBundle());
            }
        });
    }
}
