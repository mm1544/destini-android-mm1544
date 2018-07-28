package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* SOLUTION TO THE PROBLEM: "can't resolve AppCompatActivity"

    https://stackoverflow.com/questions/34947794/cant-resolve-appcompatactivity/50897316#50897316
     */

    /*
    private QuestionModel[] questionBank = new QuestionModel[]{
            new QuestionModel(R.string.T1_Story, R.string.T1_Ans1, R.string.T2_Ans1),
    };

    */




    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton, mBottomButton;
    private int mQuestionID;
    private int mAnswer1ID;
    private int mAnswer2ID;
    private int mStoryIndexc = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //???

        // intial setting
        mAnswer1ID = R.string.T1_Ans1;
        mAnswer2ID = R.string.T1_Ans2;


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAnswer1ID == R.string.T1_Ans1) {

                    mAnswer1ID = R.string.T3_Ans1;
                    mAnswer2ID = R.string.T3_Ans2;
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);

                } else if (mAnswer1ID == R.string.T3_Ans1){
                    mStoryTextView.setText(R.string.T6_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);

                }else if(mAnswer1ID == R.string.T2_Ans1){
                    mAnswer1ID = R.string.T3_Ans1;
                    mAnswer2ID = R.string.T3_Ans2;
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);

                }else{
                    Log.d("Check", "No mach");
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mAnswer2ID == R.string.T1_Ans2) {

                    mAnswer1ID = R.string.T2_Ans1;
                    mAnswer2ID = R.string.T2_Ans2;
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);

                } else if(mAnswer2ID == R.string.T3_Ans2){
                    mStoryTextView.setText(R.string.T5_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);

                }else if(mAnswer2ID == R.string.T2_Ans2){
                    mStoryTextView.setText(R.string.T4_End);
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);

                }
                else {
                    Log.d("Check", "No mach");
                }

            }
        });

    }




    /*
    // do we realy need it??
    private void updateStory(int chosenAnswer ){
    }
    */

    //private void update(int question, int answer1, int answer2){
    //}
}
