package org.quizGen.shasha.flashcardtemplate.data;

import android.provider.BaseColumns;

/**
 * @brief Contains database contracts for flash card template's simulator.
 */
class FlashContract {

    public static final class FlashCards implements BaseColumns {

        public static final String TABLE_NAME = "cards";

        public static final String QUESTION = "question";
        public static final String ANSWER = "answer";
        public static final String HINT = "hint";
        public static final String BASE64 = "base64";

    }
}
