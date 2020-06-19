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
    private int mStoryIndex = 1;



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
            //    Log.d("destini", "Top button pressed");
            //    Log.d("destini", mButtonTop.getText().toString());
            //    Log.d("destini", mButtonTop.getText().toString());
            //    Log.d("destini", getString(R.string.T1_Ans1));
               // if(mButtonTop.getText().equals(getString(R.string.T1_Ans1))  )                            // T1_Ans1
                if(mStoryIndex == 1 || mStoryIndex == 2 )                            // T1_Ans1
                {
                    // change top button to T3_Ans1
                    mButtonTop.setText(R.string.T3_Ans1);

                    // change bottom button to T3_Ans2

                    mButtomBottom.setText(R.string.T3_Ans2);

                    // change display to T3_Story
                    mStoryTextView.setText(R.string.T3_Story);

                    mStoryIndex = 3;
                }
               // else if(mButtonTop.getText().equals(R.string.T3_Ans1))                       // T3_Ans1
                else if(mStoryIndex == 3)                       // T3_Ans1
                {

                    // change display to T6_End

                    mStoryTextView.setText(R.string.T6_End);

                    // remove buttons
                    mButtonTop.setVisibility(View.GONE);
                    mButtomBottom.setVisibility(View.GONE);
                    mStoryIndex = 4;

                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtomBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             //   if(mButtomBottom.getText().equals(getString(R.string.T1_Ans2))  )                            // T1_Ans1
                if(mStoryIndex == 1  )                            // T1_Ans1
                {
                    // change top button to T3_Ans1
                    mButtonTop.setText(R.string.T2_Ans1);

                    // change bottom button to T3_Ans2

                    mButtomBottom.setText(R.string.T2_Ans2);

                    // change display to T3_Story
                    mStoryTextView.setText(R.string.T2_Story);
                    mStoryIndex = 2;
                }
                // else if(mButtonTop.getText().equals(R.string.T3_Ans1))                       // T3_Ans1
                else if(mStoryIndex == 3)                       // terminate to T5
                {


                    mStoryTextView.setText(R.string.T5_End);

                    // remove buttons
                    mButtonTop.setVisibility(View.GONE);
                    mButtomBottom.setVisibility(View.GONE);
                    mStoryIndex = 4;

                }
                else if (mStoryIndex == 2)
                {
                    mStoryTextView.setText(R.string.T4_End);

                    // remove buttons
                    mButtonTop.setVisibility(View.GONE);
                    mButtomBottom.setVisibility(View.GONE);
                    mStoryIndex = 4;
                }


            }
        });


    }
}
