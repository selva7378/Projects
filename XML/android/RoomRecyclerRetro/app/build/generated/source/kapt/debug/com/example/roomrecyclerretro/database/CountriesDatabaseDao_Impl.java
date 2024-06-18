package com.example.roomrecyclerretro.database;

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
public final class CountriesDatabaseDao_Impl implements CountriesDatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Countries> __insertionAdapterOfCountries;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public CountriesDatabaseDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCountries = new EntityInsertionAdapter<Countries>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `Countries` (`countryId`,`name`,`flag`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Countries entity) {
        statement.bindLong(1, entity.getCountryId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getFlag() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getFlag());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM Countries";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Countries countries) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfCountries.insert(countries);
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
  public List<Countries> get() {
    final String _sql = "SELECT * FROM Countries";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfCountryId = CursorUtil.getColumnIndexOrThrow(_cursor, "countryId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfFlag = CursorUtil.getColumnIndexOrThrow(_cursor, "flag");
      final List<Countries> _result = new ArrayList<Countries>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final Countries _item;
        final int _tmpCountryId;
        _tmpCountryId = _cursor.getInt(_cursorIndexOfCountryId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpFlag;
        if (_cursor.isNull(_cursorIndexOfFlag)) {
          _tmpFlag = null;
        } else {
          _tmpFlag = _cursor.getString(_cursorIndexOfFlag);
        }
        _item = new Countries(_tmpCountryId,_tmpName,_tmpFlag);
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
