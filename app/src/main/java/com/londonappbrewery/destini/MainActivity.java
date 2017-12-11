package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mTopButton;
    Button mBottomButton;
    int state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        state = 0;

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == 0 || state == 1){
                    state = 2;
                    loadState(state);
                } else if(state == 2){
                    state = 6;
                    loadState(state);
                } else if(state == 4 || state == 5 || state == 6){
                    state = 0;
                    loadState(state);
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == 0){
                    state = 1;
                    loadState(state);
                } else if (state == 1) {
                    state = 4;
                    loadState(state);
                } else if (state == 2){
                    state = 5;
                    loadState(state);
                } else if(state == 4 || state == 5 || state == 6){
                    finish();
                }
            }
        });

    }

    public void loadState(int lstate){
        if(lstate == 0){
            mStoryTextView.setText(R.string.T1_Story);
            mTopButton.setText(R.string.T1_Ans1);
            mBottomButton.setText(R.string.T1_Ans2);
        } else if (lstate == 1){
            mStoryTextView.setText(R.string.T2_Story);
            mTopButton.setText(R.string.T2_Ans1);
            mBottomButton.setText(R.string.T2_Ans2);
        } else if(lstate == 2){
            mStoryTextView.setText(R.string.T3_Story);
            mTopButton.setText(R.string.T3_Ans1);
            mBottomButton.setText(R.string.T3_Ans2);
        } else if(lstate == 4){
            mStoryTextView.setText(R.string.T4_End);
            mTopButton.setText(R.string.Play_Again);
            mBottomButton.setText(R.string.Quit);
        } else if(lstate == 5){
            mStoryTextView.setText(R.string.T5_End);
            mTopButton.setText(R.string.Play_Again);
            mBottomButton.setText(R.string.Quit);
        } else if(lstate == 6) {
            mStoryTextView.setText(R.string.T6_End);
            mTopButton.setText(R.string.Play_Again);
            mBottomButton.setText(R.string.Quit);
        }

    }
}
