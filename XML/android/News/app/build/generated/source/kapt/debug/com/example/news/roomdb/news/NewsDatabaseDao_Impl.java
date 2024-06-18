package com.example.news.roomdb.news;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDatabaseDao_Impl implements NewsDatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<News> __insertionAdapterOfNews;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public NewsDatabaseDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNews = new EntityInsertionAdapter<News>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `News` (`newsId`,`category`,`author`,`content`,`date`,`id`,`imageUrl`,`readMoreUrl`,`time`,`title`,`url`,`success`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final News entity) {
        statement.bindLong(1, entity.getNewsId());
        if (entity.getCategory() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getCategory());
        }
        if (entity.getAuthor() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getAuthor());
        }
        if (entity.getContent() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getContent());
        }
        if (entity.getDate() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getDate());
        }
        if (entity.getId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getId());
        }
        if (entity.getImageUrl() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getImageUrl());
        }
        if (entity.getReadMoreUrl() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getReadMoreUrl());
        }
        if (entity.getTime() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getTime());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getTitle());
        }
        if (entity.getUrl() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getUrl());
        }
        if (entity.getSuccess() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getSuccess());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM News";
        return _query;
      }
    };
  }

  @Override
  public void insert(final News news) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNews.insert(news);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public List<News> getAll() {
    final String _sql = "SELECT * FROM News";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNewsId = CursorUtil.getColumnIndexOrThrow(_cursor, "newsId");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfReadMoreUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "readMoreUrl");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSuccess = CursorUtil.getColumnIndexOrThrow(_cursor, "success");
      final List<News> _result = new ArrayList<News>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final News _item;
        final int _tmpNewsId;
        _tmpNewsId = _cursor.getInt(_cursorIndexOfNewsId);
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        final String _tmpAuthor;
        if (_cursor.isNull(_cursorIndexOfAuthor)) {
          _tmpAuthor = null;
        } else {
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        final String _tmpReadMoreUrl;
        if (_cursor.isNull(_cursorIndexOfReadMoreUrl)) {
          _tmpReadMoreUrl = null;
        } else {
          _tmpReadMoreUrl = _cursor.getString(_cursorIndexOfReadMoreUrl);
        }
        final String _tmpTime;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmpTime = null;
        } else {
          _tmpTime = _cursor.getString(_cursorIndexOfTime);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpSuccess;
        if (_cursor.isNull(_cursorIndexOfSuccess)) {
          _tmpSuccess = null;
        } else {
          _tmpSuccess = _cursor.getString(_cursorIndexOfSuccess);
        }
        _item = new News(_tmpNewsId,_tmpCategory,_tmpAuthor,_tmpContent,_tmpDate,_tmpId,_tmpImageUrl,_tmpReadMoreUrl,_tmpTime,_tmpTitle,_tmpUrl,_tmpSuccess);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<News> getAll(final int pageSize, final int offset) {
    final String _sql = "SELECT * FROM News LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, pageSize);
    _argIndex = 2;
    _statement.bindLong(_argIndex, offset);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNewsId = CursorUtil.getColumnIndexOrThrow(_cursor, "newsId");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfReadMoreUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "readMoreUrl");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSuccess = CursorUtil.getColumnIndexOrThrow(_cursor, "success");
      final List<News> _result = new ArrayList<News>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final News _item;
        final int _tmpNewsId;
        _tmpNewsId = _cursor.getInt(_cursorIndexOfNewsId);
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        final String _tmpAuthor;
        if (_cursor.isNull(_cursorIndexOfAuthor)) {
          _tmpAuthor = null;
        } else {
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        final String _tmpReadMoreUrl;
        if (_cursor.isNull(_cursorIndexOfReadMoreUrl)) {
          _tmpReadMoreUrl = null;
        } else {
          _tmpReadMoreUrl = _cursor.getString(_cursorIndexOfReadMoreUrl);
        }
        final String _tmpTime;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmpTime = null;
        } else {
          _tmpTime = _cursor.getString(_cursorIndexOfTime);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpSuccess;
        if (_cursor.isNull(_cursorIndexOfSuccess)) {
          _tmpSuccess = null;
        } else {
          _tmpSuccess = _cursor.getString(_cursorIndexOfSuccess);
        }
        _item = new News(_tmpNewsId,_tmpCategory,_tmpAuthor,_tmpContent,_tmpDate,_tmpId,_tmpImageUrl,_tmpReadMoreUrl,_tmpTime,_tmpTitle,_tmpUrl,_tmpSuccess);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<News> getAllByCategory(final String category, final int pageSize, final int offset) {
    final String _sql = "SELECT * FROM News WHERE category = ? LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, pageSize);
    _argIndex = 3;
    _statement.bindLong(_argIndex, offset);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNewsId = CursorUtil.getColumnIndexOrThrow(_cursor, "newsId");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfReadMoreUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "readMoreUrl");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSuccess = CursorUtil.getColumnIndexOrThrow(_cursor, "success");
      final List<News> _result = new ArrayList<News>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final News _item;
        final int _tmpNewsId;
        _tmpNewsId = _cursor.getInt(_cursorIndexOfNewsId);
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        final String _tmpAuthor;
        if (_cursor.isNull(_cursorIndexOfAuthor)) {
          _tmpAuthor = null;
        } else {
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        final String _tmpReadMoreUrl;
        if (_cursor.isNull(_cursorIndexOfReadMoreUrl)) {
          _tmpReadMoreUrl = null;
        } else {
          _tmpReadMoreUrl = _cursor.getString(_cursorIndexOfReadMoreUrl);
        }
        final String _tmpTime;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmpTime = null;
        } else {
          _tmpTime = _cursor.getString(_cursorIndexOfTime);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpSuccess;
        if (_cursor.isNull(_cursorIndexOfSuccess)) {
          _tmpSuccess = null;
        } else {
          _tmpSuccess = _cursor.getString(_cursorIndexOfSuccess);
        }
        _item = new News(_tmpNewsId,_tmpCategory,_tmpAuthor,_tmpContent,_tmpDate,_tmpId,_tmpImageUrl,_tmpReadMoreUrl,_tmpTime,_tmpTitle,_tmpUrl,_tmpSuccess);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<News> search(final String query, final int pageSize, final int offset) {
    final String _sql = "SELECT * FROM News WHERE title LIKE '%' || ? || '%' LIMIT ? OFFSET ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, pageSize);
    _argIndex = 3;
    _statement.bindLong(_argIndex, offset);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfNewsId = CursorUtil.getColumnIndexOrThrow(_cursor, "newsId");
      final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
      final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageUrl");
      final int _cursorIndexOfReadMoreUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "readMoreUrl");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfSuccess = CursorUtil.getColumnIndexOrThrow(_cursor, "success");
      final List<News> _result = new ArrayList<News>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final News _item;
        final int _tmpNewsId;
        _tmpNewsId = _cursor.getInt(_cursorIndexOfNewsId);
        final String _tmpCategory;
        if (_cursor.isNull(_cursorIndexOfCategory)) {
          _tmpCategory = null;
        } else {
          _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
        }
        final String _tmpAuthor;
        if (_cursor.isNull(_cursorIndexOfAuthor)) {
          _tmpAuthor = null;
        } else {
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final String _tmpDate;
        if (_cursor.isNull(_cursorIndexOfDate)) {
          _tmpDate = null;
        } else {
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
        }
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpImageUrl;
        if (_cursor.isNull(_cursorIndexOfImageUrl)) {
          _tmpImageUrl = null;
        } else {
          _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
        }
        final String _tmpReadMoreUrl;
        if (_cursor.isNull(_cursorIndexOfReadMoreUrl)) {
          _tmpReadMoreUrl = null;
        } else {
          _tmpReadMoreUrl = _cursor.getString(_cursorIndexOfReadMoreUrl);
        }
        final String _tmpTime;
        if (_cursor.isNull(_cursorIndexOfTime)) {
          _tmpTime = null;
        } else {
          _tmpTime = _cursor.getString(_cursorIndexOfTime);
        }
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpSuccess;
        if (_cursor.isNull(_cursorIndexOfSuccess)) {
          _tmpSuccess = null;
        } else {
          _tmpSuccess = _cursor.getString(_cursorIndexOfSuccess);
        }
        _item = new News(_tmpNewsId,_tmpCategory,_tmpAuthor,_tmpContent,_tmpDate,_tmpId,_tmpImageUrl,_tmpReadMoreUrl,_tmpTime,_tmpTitle,_tmpUrl,_tmpSuccess);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
