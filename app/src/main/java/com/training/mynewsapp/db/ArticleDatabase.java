package com.training.mynewsapp.db;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.training.mynewsapp.models.Article;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Article.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class ArticleDatabase extends RoomDatabase {
    public abstract ArticleDao getArticleDao();

//    public static ArticleDatabase articleDatabase = null;


    private static volatile ArticleDatabase INSTANCE;
    //    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor = Executors.newSingleThreadExecutor();
    static final Handler dbHandler = new Handler(Looper.getMainLooper());

    // singleton pattern for getting single instance of DB
    static ArticleDatabase getArticleDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ArticleDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room
                            .databaseBuilder(
                                    context.getApplicationContext(),
                                    ArticleDatabase.class,
                                    "articles_table"
                            ).build();
                }
            }
        }
        return INSTANCE;
    }
}
