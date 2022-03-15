package com.dhruv.quiz

object Constants {
// the below all const var are my keys to share with other activities
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_QUESTIONS: String = "correct_questions"
    fun getQuestions() : ArrayList<Question> {
        val list : ArrayList<Question> = ArrayList<Question>()
        val question1 = Question(
            "Which country belongs to this flag?",R.drawable.af,
            "Iran","Afghanistan","Kuwait","Syria",
            2
        )
        list.add(question1)
        val question2 = Question(
            "Which country belongs to this flag?",R.drawable.al,
            "Albania","Angola","Bahrain","Guam",
            1
        )
        list.add(question2)

        val question3 = Question(
            "Which country belongs to this flag?",R.drawable.ar,
            "Finland","El Salvador","Argentina","Honduras",
            3
        )
        list.add(question3)

        val question4 = Question(
            "Which country belongs to this flag?",R.drawable.au,
            "Montserrat","Cocos","New Zealand","Australia",
            4
        )
        list.add(question4)

        val question5 = Question(
            "Which country belongs to this flag?",R.drawable.be,
            "France","Belgium","Germany","Netherlands",
            2
        )
        list.add(question5)

        val question6 = Question(
            "Which country belongs to this flag?",R.drawable.bm,
            "Ukraine","Finland","England","Bermuda",
            4
        )
        list.add(question6)

        val question7 = Question(
            "Which country belongs to this flag?",R.drawable.ca,
            "Russia","Canada","Cuba","South Korea",
            2
        )
        list.add(question7)

        val question8 = Question(
            "Which country belongs to this flag?",R.drawable.cn,
            "China","Belgium","Turkey","Japan",
            1
        )
        list.add(question8)

        val question9 = Question(
            "Which country belongs to this flag?",R.drawable.dk,
            "Finland","Denmark","Ireland","Sweden",
            2
        )
        list.add(question9)

        val question10 = Question(
            "Which country belongs to this flag?",R.drawable.eg,
            "Haiti","Egypt","Latvia","Hungary",
            2
        )
        list.add(question10)


        val question11 = Question(
            "Which country belongs to this flag?",R.drawable.fi,
            "Denmark","France","Finland","Malta",
            3
        )
        list.add(question11)
        val question12 = Question(
            "Which country belongs to this flag?",R.drawable.fr,
            "Belgium","Izrael","Finland","France",
            4
        )
        list.add(question12)
        val question13 = Question(
            "Which country belongs to this flag?",R.drawable.ie,
            "India","Iran","Ireland","Italy",
            3
        )
        list.add(question13)
        val question14 = Question(
            "Which country belongs to this flag?",R.drawable.`in`,
            "Iran","Ireland","Finland","India",
            4
        )
        list.add(question14)
        val question15 = Question(
            "Which country belongs to this flag?",R.drawable.it,
            "Italy","Izrael","Iran","Ireland",
            1
        )
        list.add(question15)
        val question16 = Question(
            "Which country belongs to this flag?",R.drawable.jp,
            "Denmark","Netherlands","Japan","Poland",
            3
        )
        list.add(question16)
        val question17 = Question(
            "Which country belongs to this flag?",R.drawable.kz,
            "Yemen","Yugoslavia","Izrael","Kazakhstan",
            4
        )
        list.add(question17)

        val question18 = Question(
            "Which country belongs to this flag?",R.drawable.kr,
            "Latvia","South Korea","North Korea","Jordan",
            2
        )
        list.add(question18)

        val question19 = Question(
            "Which country belongs to this flag?",R.drawable.mx,
            "Guyana","Mali","Mexico","Macau",
            3
        )
        list.add(question19)

        val question20 = Question(
            "Which country belongs to this flag?",R.drawable.nl,
            "Netherlands","Finland","Egypt","Belgium",
            1
        )
        list.add(question20)

        val question21 = Question(
            "Which country belongs to this flag?",R.drawable.nz,
            "New Zealand","Australia","Pitcairn","Uruguay",
            1
        )
        list.add(question21)

        val question22 = Question(
            "Which country belongs to this flag?",R.drawable.no,
            "Finland","Norway","Denmark","Sweden",
            2
        )
        list.add(question22)

        val question23 = Question(
            "Which country belongs to this flag?",R.drawable.ro,
            "Italy","Belgium","Romania","Portugal",
            3
        )
        list.add(question23)

        val question24 = Question(
            "Which country belongs to this flag?",R.drawable.ru,
            "Netherlands","France","Egypt","Russia",
            4
        )
        list.add(question24)

        val question25 = Question(
            "Which country belongs to this flag?",R.drawable.ua,
            "Turkey","Vietnam","Russia","Ukraine",
            4
        )
        list.add(question25)

        val question26 = Question(
            "Which country belongs to this flag?",R.drawable.us,
            "UK","New Zealand","USA","Malaysia",
            3
        )
        list.add(question26)

        val question27 = Question(
            "Which country belongs to this flag?",R.drawable.uz,
            "Uzbekistan","Czech Republic","Costa Rica","Uruguay",
            1
        )
        list.add(question27)

        val question28 = Question(
            "Which country belongs to this flag?",R.drawable.ye,
            "Uganda","Yemen","Netherlands","Sri Lanka",
            2
        )
        list.add(question28)

        val question29 = Question(
            "Which country belongs to this flag?",R.drawable.zw,
            "Vietnam","Zimbabwe","Sri Lanka","Spain",
            2
        )
        list.add(question29)

        val question30 = Question(
            "Which country belongs to this flag?",R.drawable.za,
            "South Africa","Sweden","Switzerland","Slovenia",
            1
        )
        list.add(question30)

        val question31 = Question(
            "Which country belongs to this flag?",R.drawable.pl,
            "Singapore","Poland","Indonesia","Ukraine",
            2
        )
        list.add(question31)


        val question32= Question(
            "Which country belongs to this flag?",R.drawable.id,
            "Singapore","Poland","Indonesia","Ukraine",
            3
        )
        list.add(question32)

        val question33 = Question(
            "Which country belongs to this flag?",R.drawable.es,
            "Spain","Portugal","Singapore","Romania",
            1
        )
        list.add(question33)

        val question34 = Question(
            "Which country belongs to this flag?",R.drawable.bt,
            "Bermuda","Barbados","Chile","Bhutan",
            4
        )
        list.add(question34)

        val question35 = Question(
            "Which country belongs to this flag?",R.drawable.br,
            "Cuba","Belarus","Brazil","Chad",
            3
        )
        list.add(question35)

        val question36 = Question(
            "Which country belongs to this flag?",R.drawable.gn,
            "Nigeria","Belgium","Guinea","Algeria",
            3
        )
        list.add(question36)

        val question37 = Question(
            "Which country belongs to this flag?",R.drawable.hu,
            "Netherlands","Iran","India","Hungary",
            4
        )
        list.add(question37)

        val question38 = Question(
            "Which country belongs to this flag?",R.drawable.`is`,
            "Iceland","Norway","Sweden","Finland",
            1
        )
        list.add(question38)

        val question39 = Question(
            "Which country belongs to this flag?",R.drawable.il,
            "Libya","Izrael","Mauritius","Denmark",
            2
        )
        list.add(question39)

        val question40 = Question(
            "Which country belongs to this flag?",R.drawable.jm,
            "Jordan","Algeria","Jamaica","Kuwait",
            3
        )
        list.add(question40)


        val question41 = Question(
            "Which country belongs to this flag?",R.drawable.la,
            "Lebanon","Latvia","Laos","Liberia",
            3
        )
        list.add(question41)
        val question42 = Question(
            "Which country belongs to this flag?",R.drawable.ml,
            "Mali","Belgium","Guinea","Luxembourg",
            1
        )
        list.add(question42)
        val question43 = Question(
            "Which country belongs to this flag?",R.drawable.mu,
            "Palestine","Morocco","Brazil","Mauritius",
            4
        )
        list.add(question43)
        val question44 = Question(
            "Which country belongs to this flag?",R.drawable.ne,
            "Cuba","Iran","India","Niger",
            4
        )
        list.add(question44)
        val question45 = Question(
            "Which country belongs to this flag?",R.drawable.ph,
            "Poland","Philippines","Peru","Paraguay",
            2
        )
        list.add(question45)
        val question46 = Question(
            "Which country belongs to this flag?",R.drawable.ph,
            "Poland","Philippines","Portugal","Peru",
            3
        )
        list.add(question46)
        val question47 = Question(
            "Which country belongs to this flag?",R.drawable.sg,
            "Singapore","Switzerland","Sudan","Spain",
            1
        )
        list.add(question47)


        val question48 = Question(
            "Which country belongs to this flag?",R.drawable.tr,
            "Tunisia","Turkey","Tonga","Uruguay",
            2
        )
        list.add(question48)
        val question49 = Question(
            "Which country belongs to this flag?",R.drawable.va,
            "Vatican City","Belarus","Uganda","Tuvalu",
            1
        )
        list.add(question49)
        val question50 = Question(
            "Which country belongs to this flag?",R.drawable.zm,
            "Suriname","Togo","UAE","Zambia",
            4
        )
        list.add(question50)





        val totalSize = list.size
        val selectedQuestions: ArrayList<Question> = ArrayList<Question>()

        for( i in 1..10 ){
            val randomQuestionIdx = (0 until totalSize).random()
            val randomQuestion = list[randomQuestionIdx]
            selectedQuestions.add(randomQuestion)
        }
        return selectedQuestions

    }
}