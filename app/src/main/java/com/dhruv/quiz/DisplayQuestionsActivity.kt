package com.dhruv.quiz

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import com.dhruv.quiz.Constants.CORRECT_QUESTIONS
import com.dhruv.quiz.Constants.TOTAL_QUESTIONS
import com.dhruv.quiz.Constants.USER_NAME

class DisplayQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private var mUserName : String? = null
    private var mCorrectQuestions: Int = 0
    private var mCurrentPosition:Int = 0
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionNum: Int = 1
    var tvQuestion: TextView? = null
    var ivImage : ImageView? = null
    var progressBar: ProgressBar? = null
    var tvProgress: TextView? = null
    var tvOption1 : TextView? =null
    var tvOption2 : TextView? =null
    var tvOption3 : TextView? =null
    var tvOption4 : TextView? =null
    var btn : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_questions)

//        getting the userName from mainActivity
        mUserName = intent.getStringExtra(Constants.USER_NAME)

//        initializing all my views
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.ivImage)
        progressBar = findViewById(R.id.progressBar)
        tvProgress =findViewById(R.id.tvProgress)
        tvOption1 = findViewById(R.id.option1)
        tvOption2 = findViewById(R.id.option2)
        tvOption3 = findViewById(R.id.option3)
        tvOption4 = findViewById(R.id.option4)
        btn = findViewById(R.id.btn)

//        get the questions
        mQuestionsList = Constants.getQuestions()

        setQuestion()

//        apply click functionality to all the options and btn
        tvOption1?.setOnClickListener(this)
        tvOption2?.setOnClickListener(this)
        tvOption3?.setOnClickListener(this)
        tvOption4?.setOnClickListener(this)
        btn?.setOnClickListener(this)

    }

    private fun setQuestion() {
        tvQuestion?.text = mQuestionsList!![mCurrentPosition].question
        ivImage?.setImageResource(mQuestionsList!![mCurrentPosition].flagImg)
        progressBar?.progress = mCurrentPosition + 1
        tvProgress?.text = "${mCurrentPosition + 1}/${mQuestionsList?.size}"
        tvOption1?.text = mQuestionsList!![mCurrentPosition].option1
        tvOption2?.text = mQuestionsList!![mCurrentPosition].option2
        tvOption3?.text = mQuestionsList!![mCurrentPosition].option3
        tvOption4?.text = mQuestionsList!![mCurrentPosition].option4

    }
    private fun defaultOptionsView(){
        val optionsList: ArrayList<TextView> = ArrayList<TextView>()
        tvOption1?.let { optionsList.add(it) }
        tvOption2?.let { optionsList.add(it) }
        tvOption3?.let { optionsList.add(it) }
        tvOption4?.let { optionsList.add(it) }

        for (option in optionsList ){
            option.background = ContextCompat.getDrawable(this,R.drawable.drawable_options_border_bg)
            option.typeface = Typeface.DEFAULT
        }
    }
    private fun selectedOptionView(tv: TextView,selectedOptionNum : Int){
        defaultOptionsView()
        mSelectedOptionNum = selectedOptionNum
        tv.background = ContextCompat.getDrawable(this,R.drawable.drawable_selected_option_border_bg)
        tv.typeface = Typeface.DEFAULT_BOLD
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.option1 -> tvOption1?.let { selectedOptionView(it,1) }
            R.id.option2 -> tvOption2?.let { selectedOptionView(it,2) }
            R.id.option3 -> tvOption3?.let{
                selectedOptionView(it,3)
            }
            R.id.option4 -> tvOption4?.let{
                selectedOptionView(it,4)
            }
            R.id.btn -> {
                if( btn?.text == "Submit"){
                    //                check whether client's ans is right or wrong
                    val correctAnsNum = mQuestionsList?.get(mCurrentPosition)?.correctAns
                    if( correctAnsNum != mSelectedOptionNum  ) {
                        when(mSelectedOptionNum){
                            1 -> tvOption1?.background = ContextCompat.getDrawable(this,R.drawable.drawable_wrong_ans_bg)
                            2 -> tvOption2?.background = ContextCompat.getDrawable(this,R.drawable.drawable_wrong_ans_bg)
                            3 -> tvOption3?.background = ContextCompat.getDrawable(this,R.drawable.drawable_wrong_ans_bg)
                            4 -> tvOption4?.background = ContextCompat.getDrawable(this,R.drawable.drawable_wrong_ans_bg)
                        }
                    }else{
//                        if the ans is right increase num of correct ans
//                        no need to worry about the color of correct ans that has to be there in any case whether ans is correct or not
                        mCorrectQuestions++
                    }
                    when(correctAnsNum){
                        1 -> tvOption1?.background = ContextCompat.getDrawable(this,R.drawable.drawable_correct_ans_bg)
                        2 -> tvOption2?.background = ContextCompat.getDrawable(this,R.drawable.drawable_correct_ans_bg)
                        3 -> tvOption3?.background = ContextCompat.getDrawable(this,R.drawable.drawable_correct_ans_bg)
                        4 -> tvOption4?.background = ContextCompat.getDrawable(this,R.drawable.drawable_correct_ans_bg)
                    }
                    if( mCurrentPosition < mQuestionsList?.size!! - 1){
                        btn?.text = "Next"
                    }else if( mCurrentPosition == mQuestionsList?.size!! - 1 ){
                        btn?.text = "Finish"
                    }
                }
                else if(btn?.text == "Next"){
//                    set a new question
                    defaultOptionsView()
                    mCurrentPosition++
                    setQuestion()
                    btn?.text = "Submit"
                }else if( btn?.text == "Finish" ){
//                    Toast.makeText(this,"Well Done",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,ResultActivity::class.java)
                    intent.putExtra(USER_NAME,mUserName)
                    intent.putExtra(CORRECT_QUESTIONS,mCorrectQuestions)
                    intent.putExtra(TOTAL_QUESTIONS,mQuestionsList?.size)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }

}