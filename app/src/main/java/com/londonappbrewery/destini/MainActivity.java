package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    private Button mButtonTop;
    private Button mButtomBottom;
    private TextView mStoryTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mButtonTop = findViewById(R.id.buttonTop);
        mButtomBottom = findViewById(R.id.buttonBottom);
        mStoryTextView = findViewById(R.id.storyTextView);




        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("destini", "Top button pressed");
                Log.d("destini", mButtonTop.getText().toString());
                Log.d("destini", mButtonTop.getText().toString());
                Log.d("destini", getString(R.string.T1_Ans1));
                if(mButtonTop.getText().equals(getString(R.string.T1_Ans1))  )                            // T1_Ans1
                {
                    // change top button to T3_Ans1

                    // change bottom button to T3_Ans2

                    // change display to T3_Story
                    mStoryTextView.setText(R.string.T3_Story);
                }
                else if(mButtonTop.getText().equals(R.string.T3_Ans1))                       // T3_Ans1
                {

                    // change display to T6_End

                    // remove buttons

                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtomBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
