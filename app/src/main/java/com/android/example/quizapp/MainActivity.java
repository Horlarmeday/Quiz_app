package com.android.example.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //the name entry
    private EditText nameText;

    //The Question one radiobuttons
    private RadioButton qOneFirstRadioButton, qOneSecRadioButton, qOneThirdRadioButton;

    //The Question two radiobuttons
    private RadioButton qTwoFirstRadioButton, qTwoSecRadioButton;

    //The Question three radiobuttons
    private RadioButton qThreeFirstRadioButton, qThreeSecRadioButton;

    //The Question four radiobuttons
    private RadioButton qFourFirstRadioButton, qFourSecRadioButton;

    //The Question five radiobuttons
    private RadioButton qFiveFirstRadioButton, qFiveSecRadioButton, qFiveThirdRadioButton;

    //The Question six radiobuttons
    private RadioButton qSixFirstRadioButton, qSixSecRadioButton;

    //The Question seven checkboxes
    private CheckBox qSevenFirstCheckbox, qSevenSecCheckbox, qSevenThirdCheckbox;

    private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the view that we will need to read user input from
        nameText = (EditText)findViewById(R.id.edit_text_name);

        //Initializing the QUESTION ONE radio buttons
        qOneFirstRadioButton = (RadioButton)findViewById(R.id.qone_first_radio_button);
        qOneSecRadioButton = (RadioButton)findViewById(R.id.qone_sec_radio_button);
        qOneThirdRadioButton = (RadioButton)findViewById(R.id.qone_third_radio_button);

        //Initializing the QUESTION TWO radio buttons
        qTwoFirstRadioButton = (RadioButton)findViewById(R.id.qtwo_first_radio_button);
        qTwoSecRadioButton = (RadioButton)findViewById(R.id.qtwo_sec_radio_button);

        //Initializing the QUESTION THREE radio buttons
        qThreeFirstRadioButton = (RadioButton)findViewById(R.id.qthree_first_radio_button);
        qThreeSecRadioButton = (RadioButton)findViewById(R.id.qthree_sec_radio_button);

        //Initializing the QUESTION FOUR radio buttons
        qFourFirstRadioButton = (RadioButton)findViewById(R.id.qfour_first_radio_button);
        qFourSecRadioButton = (RadioButton)findViewById(R.id.qfour_sec_radio_button);

        //Initializing the QUESTION FIVE radio buttons
        qFiveFirstRadioButton = (RadioButton)findViewById(R.id.qfive_first_radio_button);
        qFiveSecRadioButton = (RadioButton)findViewById(R.id.qfive_sec_radio_button);
        qFiveThirdRadioButton = (RadioButton)findViewById(R.id.qfive_third_radio_button);

        //Initializing the QUESTION SIX radio buttons
        qSixFirstRadioButton = (RadioButton)findViewById(R.id.qsix_first_radio_button);
        qSixSecRadioButton = (RadioButton)findViewById(R.id.qsix_sec_radio_button);

        //Initializing the QUESTION SEVEN CheckBox
        qSevenFirstCheckbox = (CheckBox) findViewById(R.id.qseven_first_checkbox);
        qSevenSecCheckbox = (CheckBox) findViewById(R.id.qseven_sec_checkbox);
        qSevenThirdCheckbox = (CheckBox) findViewById(R.id.qseven_third_checkbox);

    }

    /**
     * This method is called when the submit button is clicked
     * @param view
     */
    public void submitAnswers(View view) {
        //Checking if the text field is empty
        name = nameText.getText().toString().trim();
        if(TextUtils.isEmpty(name)){
            Toast.makeText(this, "You haven't entered your name!", Toast.LENGTH_SHORT).show();
            return;
        }

        //Checking if the radiobuttons checked is true or false
        final boolean qOneFirstAnswer = qOneFirstRadioButton.isChecked();
        final boolean qOneSecondAnswer = qOneSecRadioButton.isChecked();
        final boolean qOneThirdAnswer = qOneThirdRadioButton.isChecked();
        //Checking if user has answered question one or not
        int quesOneScore;
        if(!(qOneFirstRadioButton.isChecked() || qOneSecRadioButton.isChecked() || qOneThirdRadioButton.isChecked())){
            Toast.makeText(this, "You haven't answered question one", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            quesOneScore = validateQuestOneAnswer(qOneFirstAnswer, qOneSecondAnswer, qOneThirdAnswer);
        }

        //Checking if the radiobuttons checked is true or false
        final boolean qTwoFirstAnswer = qTwoFirstRadioButton.isChecked();
        final boolean qTwoSecondAnswer = qTwoSecRadioButton.isChecked();
        //Checking if user has answered question two or not
        int quesTwoScore;
        if(!(qTwoFirstRadioButton.isChecked() || qTwoSecRadioButton.isChecked())){
            Toast.makeText(this, "You haven't answered question two", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            quesTwoScore = validateQuesTwoAnswer(qTwoFirstAnswer, qTwoSecondAnswer);
        }

        //Checking if the radiobuttons checked is correct or not
        final boolean qThreeFirstAnswer = qThreeFirstRadioButton.isChecked();
        final boolean qThreeSecondAnswer = qThreeSecRadioButton.isChecked();
        //Checking if user has answered question three or not
        int quesThreeScore;
        if(!(qThreeFirstRadioButton.isChecked() || qThreeSecRadioButton.isChecked())){
            Toast.makeText(this, "You haven't answered question three", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            quesThreeScore = validateQuesThreeAnswer(qThreeFirstAnswer, qThreeSecondAnswer);
        }

        //Checking if the radiobuttons checked is correct or not
        final boolean qFourFirstAnswer = qFourFirstRadioButton.isChecked();
        final boolean qFourSecondAnswer = qFourSecRadioButton.isChecked();
        //Checking if user has answered question four or not
        int quesFourScore;
        if(!(qFourFirstRadioButton.isChecked() || qFourSecRadioButton.isChecked())){
            Toast.makeText(this, "You haven't answered question four", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            quesFourScore = validateQuestFourAnswer(qFourFirstAnswer, qFourSecondAnswer);
        }

        //Checking if the radiobuttons checked is correct or not
        final boolean qFiveFirstAnswer = qFiveFirstRadioButton.isChecked();
        final boolean qFiveSecondAnswer = qFiveSecRadioButton.isChecked();
        final boolean qFiveThirdAnswer = qFiveThirdRadioButton.isChecked();
        //Checking if user has answered question five or not
        int quesFiveScore;
        if(!(qFiveFirstRadioButton.isChecked() || qFiveSecRadioButton.isChecked() || qFiveThirdRadioButton.isChecked())){
            Toast.makeText(this, "You haven't answered question five", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            quesFiveScore = validateQuestFiveAnswer(qFiveFirstAnswer, qFiveSecondAnswer, qFiveThirdAnswer);
        }

        //Checking if the radiobuttons checked is correct or not
        final boolean qSixFirstAnswer = qSixFirstRadioButton.isChecked();
        final boolean qSixSecondAnswer = qSixSecRadioButton.isChecked();
        //Checking if user has answered question five or not
        int quesSixScore;
        if(!(qSixFirstRadioButton.isChecked() || qSixSecRadioButton.isChecked())){
            Toast.makeText(this, "You haven't answered question six", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            quesSixScore = validateQuestSixAnswer(qSixFirstAnswer, qSixSecondAnswer);
        }

        //Checking if the radiobuttons checked is correct or not
        final boolean qSevenFirstAnswer = qSevenFirstCheckbox.isChecked();
        final boolean qSevenSecondAnswer = qSevenSecCheckbox.isChecked();
        final boolean qSevenThirdAnswer = qSevenThirdCheckbox.isChecked();
        //Checking if user has answered question five or not
        int quesSevenScore;
        if(!(qSevenFirstCheckbox.isChecked() || qSevenSecCheckbox.isChecked() || qSevenThirdCheckbox.isChecked())){
            Toast.makeText(this, "You haven't answered question seven", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            quesSevenScore = validateQuestSevenAnswer(qSevenFirstAnswer, qSevenSecondAnswer, qSevenThirdAnswer);
        }

        //The total score of the User's answer
        int totalScore = calculateScore(quesOneScore, quesTwoScore, quesThreeScore,
                         quesFourScore, quesFiveScore, quesSixScore, quesSevenScore);

        int overAllscore = 14;

        Toast.makeText(this, name + ", You scored " + totalScore + " out of " + overAllscore, Toast.LENGTH_SHORT).show();

        if(totalScore < 7){
            Toast.makeText(this, "Try better next time " + name, Toast.LENGTH_SHORT).show();
        }
        else if(totalScore <= 10){
            Toast.makeText(this, "An average score " + name, Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "You are good " + name + "!", Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * This method checks for the correct answers in question one
     * @param firstAnswer is true if checked and updates the score
     * @param secondAnswer is true if checked and updates the score
     * @param thirdAnswer is true if checked and updates the score
     * @return questionOneAnswer
     */
    private int validateQuestOneAnswer(boolean firstAnswer, boolean secondAnswer, boolean thirdAnswer){

        int questionOneAnswer = 0;

        if (firstAnswer){
             questionOneAnswer = 0;
        }
        else if(secondAnswer){
             questionOneAnswer = 2;
        }
        else if(thirdAnswer){
             questionOneAnswer = 0;
        }

        return questionOneAnswer;
    }


    /**
     * This method checks for the correct answers in question two
     * @param firstAnswer is true if checked and updates the score
     * @param secondAnswer is true if checked and updates the score
     * @return questionTwoAnswer
     */
    private int validateQuesTwoAnswer(boolean firstAnswer, boolean secondAnswer){

        int questionTwoAnswer = 0;

        if (firstAnswer){
            questionTwoAnswer = 2;
        }
        else if(secondAnswer){
            questionTwoAnswer = 0;
        }

        return questionTwoAnswer;
    }

    /**
     * This method checks for the correct answers in question three
     * @param firstAnswer is true if checked and updates the score
     * @param secondAnswer is true if checked and updates the score
     * @return questionThreeAnswer
     */
    private int validateQuesThreeAnswer(boolean firstAnswer, boolean secondAnswer) {
        int questionThreeAnswer = 0;

        if (firstAnswer){
            questionThreeAnswer = 0;
        }
        else if(secondAnswer){
            questionThreeAnswer = 2;
        }

        return questionThreeAnswer;
    }

    /**
     * This method checks for the correct answers in question four
     * @param firstAnswer is true if checked and updates the corresponding score
     * @param secondAnswer is true if checked and updates the corresponding score
     * @return questionFourAnswer
     */
    private int validateQuestFourAnswer(boolean firstAnswer, boolean secondAnswer) {
        int questionFourAnswer = 0;

        if (firstAnswer){
            questionFourAnswer = 0;
        }
        else if(secondAnswer){
            questionFourAnswer = 2;
        }

        return questionFourAnswer;
    }

    /**
     * This method checks for the correct answers in question five
     * @param firstAnswer is true if checked and updates the corresponding score
     * @param secondAnswer is true if checked and updates the corresponding score
     * @param thirdAnswer is true if checked and updates the corresponding score
     * @return Five
     */
    private int validateQuestFiveAnswer(boolean firstAnswer, boolean secondAnswer, boolean thirdAnswer) {
        int questionFiveAnswer = 0;

        if (firstAnswer){
            questionFiveAnswer = 0;
        }
        else if(secondAnswer){
            questionFiveAnswer = 0;
        }
        else if(thirdAnswer){
            questionFiveAnswer = 2;
        }

        return questionFiveAnswer;
    }
    /**
     * This method checks for the correct answers in question six
     * @param firstAnswer is true if checked and updates the corresponding score
     * @param secondAnswer is true if checked and updates the corresponding score
     * @return questionSixAnswer
     */

    private int validateQuestSixAnswer(boolean firstAnswer, boolean secondAnswer) {
        int questionSixAnswer = 0;

        if (firstAnswer){
            questionSixAnswer = 2;
        }
        else if(secondAnswer){
            questionSixAnswer = 0;
        }

        return questionSixAnswer;
    }

    /**
     * This method checks for the correct answers in question six
     * @param firstAnswer is true if checked and updates the corresponding score
     * @param secondAnswer is true if checked and updates the corresponding score
     * @param thirdAnswer is true if checked and updates the corresponding score
     * @return questionSevenAnswer
     */
    private int validateQuestSevenAnswer(boolean firstAnswer, boolean secondAnswer, boolean thirdAnswer) {
        int questionSevenAnswer = 0;

        if (firstAnswer && secondAnswer){
            questionSevenAnswer = 2;
        }
        if (thirdAnswer){
            questionSevenAnswer = 0;
        }


        return questionSevenAnswer;
    }

    /*
     * This method calculates the total score of QUIZ
     */
    private int calculateScore(int questionOne, int questionTwo, int questionThree, int questionFour, int questionFive,
                              int questionSix, int questionSeven){

        return questionOne +
                questionTwo +
                questionThree +
                questionFour +
                questionFive +
                questionSix +
                questionSeven;
    }

    /**
     * This methods responds to view answers click
     * @param view
     */
    public void viewAnswers(View view) {
        if (!(qOneFirstRadioButton.isChecked() || qOneSecRadioButton.isChecked() || qOneThirdRadioButton.isChecked()) ||
                !(qTwoFirstRadioButton.isChecked() || qTwoSecRadioButton.isChecked())
                || !(qThreeFirstRadioButton.isChecked() || qThreeSecRadioButton.isChecked())
                || !(qFourFirstRadioButton.isChecked() || qFourSecRadioButton.isChecked())
                || !(qFiveFirstRadioButton.isChecked() || qFiveSecRadioButton.isChecked() || qFiveThirdRadioButton.isChecked())
                || !(qSixFirstRadioButton.isChecked() || qSixSecRadioButton.isChecked())
                || !(qSevenFirstCheckbox.isChecked() || qSevenSecCheckbox.isChecked() || qSevenThirdCheckbox.isChecked())
                || (TextUtils.isEmpty(name))
                ) {
                    Toast.makeText(this, "Answer the questions first!", Toast.LENGTH_SHORT).show();
        }
        else{
            //Setting text color for the question one correct and incorrect answers
            qOneFirstRadioButton.setTextColor(getResources().getColor(R.color.wrong_ans_color));
            qOneSecRadioButton.setTextColor(getResources().getColor(R.color.right_ans_color));
            qOneThirdRadioButton.setTextColor(getResources().getColor(R.color.wrong_ans_color));

            //Setting text color for the question two correct and incorrect answers
            qTwoFirstRadioButton.setTextColor(getResources().getColor(R.color.right_ans_color));
            qTwoSecRadioButton.setTextColor(getResources().getColor(R.color.wrong_ans_color));

            //Setting text color for the question three correct and incorrect answers
            qThreeFirstRadioButton.setTextColor(getResources().getColor(R.color.wrong_ans_color));
            qThreeSecRadioButton.setTextColor(getResources().getColor(R.color.right_ans_color));

            //Setting text color for the question four correct and incorrect answers
            qFourFirstRadioButton.setTextColor(getResources().getColor(R.color.wrong_ans_color));
            qFourSecRadioButton.setTextColor(getResources().getColor(R.color.right_ans_color));

            //Setting text color for the question five correct and incorrect answers
            qFiveFirstRadioButton.setTextColor(getResources().getColor(R.color.wrong_ans_color));
            qFiveSecRadioButton.setTextColor(getResources().getColor(R.color.wrong_ans_color));
            qFiveThirdRadioButton.setTextColor(getResources().getColor(R.color.right_ans_color));

            //Setting text color for the question six correct and incorrect answers
            qSixFirstRadioButton.setTextColor(getResources().getColor(R.color.right_ans_color));
            qSixSecRadioButton.setTextColor(getResources().getColor(R.color.wrong_ans_color));

            //Setting text color for the question seven correct and incorrect answers
            qSevenFirstCheckbox.setTextColor(getResources().getColor(R.color.right_ans_color));
            qSevenSecCheckbox.setTextColor(getResources().getColor(R.color.right_ans_color));
            qSevenThirdCheckbox.setTextColor(getResources().getColor(R.color.wrong_ans_color));

            Toast.makeText(this, "You are a cheat " + name, Toast.LENGTH_SHORT).show();

        }
    }
}
