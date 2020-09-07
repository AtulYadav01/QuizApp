package com.atulyadav.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_bahamas,
            "Bahamas",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Israel",
            "Brazil",
            "Norway",
            "Sweden",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Australia",
            "New Zealand",
            "United Kingdom",
            "USA",
            1
        )
        questionsList.add(que3)


        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_canada,
            "Bhutan",
            "Pakistan",
            "Albenia",
            "Canada",
            4
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany",
            "China",
            "Russia",
            "Mexico",
            1
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Panama",
            "India",
            "Chile",
            "Bolivia",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_israel,
            "Cuba",
            "Bangladesh",
            "Israel",
            "Egypt",
            3
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_newzealand,
            "Bolivia",
            "India",
            "Australia",
            "New Zealand",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_southafrica,
            "Denmark",
            "Chile",
            "Bahamas",
            "South Africa",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_sweden,
            "Nigeria",
            "Sweden",
            "Mexico",
            "Madagascar",
            2
        )
        questionsList.add(que10)
        return questionsList
    }
}