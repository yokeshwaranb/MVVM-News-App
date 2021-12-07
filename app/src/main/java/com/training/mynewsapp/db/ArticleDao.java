package com.training.mynewsapp.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.training.mynewsapp.Article;

import java.util.List;

@Dao
public interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public long upsert(Article article);

    @Query("SELECT * FROM articles")
    public LiveData<List<Article>> getAllArticles();

    @Delete
    public void deleteArticle(Article article);
}
