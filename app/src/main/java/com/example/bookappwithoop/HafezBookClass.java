package com.example.bookappwithoop;

public class HafezBookClass extends Book{
    @Override
    public String getBOOKBIO() {
        return "The book \"The Poetry of Hafez\" is a collection of verses and poems by the renowned Persian poet, Khwaja Shams-ud-Din Muhammad Hafez Shirazi. This book is commonly known as the \"Divan-e-Hafez.\" The poetry of Hafez is written in the form of ghazals, expressing themes of love, friendship, God, humanity, and aspects of marriage and romantic life.\n" + "\n" + "Hafez's ghazals, composed of couplets in Persian, captivate readers with their lyrical beauty and profound meanings. Through the use of metaphor, imagery, and allegory in his poetry, Hafez portrays emotions, the vicissitudes of life, and the complexities of human existence.\n" + "\n" + "The verses of Hafez, renowned for their philosophical depth, linguistic richness, and poetic craftsmanship, have endured for centuries, captivating literary enthusiasts in Iran and around the world. Even centuries after Hafez's death, his poetry continues to be studied, appreciated, and discussed, resonating with readers interested in the art of poetry and literature.\n" + "\n" + "If you are fond of classic and philosophical poetry, the book \"The Poetry of Hafez\" can be an inspiring resource for you. As you delve into this book, you will encounter a profound contemplation on existence, love, meaning, and the mysteries of life.\n";
    }

    @Override
    public String getBOOKName() {
        return "Hafez Poems";
    }
}
