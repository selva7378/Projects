package com.example.roomdb.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EmployeeDatabaseDao_Impl implements EmployeeDatabaseDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Employee> __insertionAdapterOfEmployee;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public EmployeeDatabaseDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEmployee = new EntityInsertionAdapter<Employee>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `Employees` (`employeeId`,`name`,`email`,`phoneNumber`,`occupation`,`address`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Employee entity) {
        statement.bindLong(1, entity.getEmployeeId());
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getEmail() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getEmail());
        }
        if (entity.getPhNumber() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPhNumber());
        }
        if (entity.getOccupation() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getOccupation());
        }
        if (entity.getAddress() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getAddress());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM employees";
        return _query;
      }
    };
  }

  @Override
  public void insert(final Employee employee) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfEmployee.insert(employee);
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
  public LiveData<Employee> get() {
    final String _sql = "SELECT * FROM employees ORDER BY employeeId DESC LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"employees"}, false, new Callable<Employee>() {
      @Override
      @Nullable
      public Employee call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfEmployeeId = CursorUtil.getColumnIndexOrThrow(_cursor, "employeeId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPhNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNumber");
          final int _cursorIndexOfOccupation = CursorUtil.getColumnIndexOrThrow(_cursor, "occupation");
          final int _cursorIndexOfAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "address");
          final Employee _result;
          if (_cursor.moveToFirst()) {
            final int _tmpEmployeeId;
            _tmpEmployeeId = _cursor.getInt(_cursorIndexOfEmployeeId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpPhNumber;
            if (_cursor.isNull(_cursorIndexOfPhNumber)) {
              _tmpPhNumber = null;
            } else {
              _tmpPhNumber = _cursor.getString(_cursorIndexOfPhNumber);
            }
            final String _tmpOccupation;
            if (_cursor.isNull(_cursorIndexOfOccupation)) {
              _tmpOccupation = null;
            } else {
              _tmpOccupation = _cursor.getString(_cursorIndexOfOccupation);
            }
            final String _tmpAddress;
            if (_cursor.isNull(_cursorIndexOfAddress)) {
              _tmpAddress = null;
            } else {
              _tmpAddress = _cursor.getString(_cursorIndexOfAddress);
            }
            _result = new Employee(_tmpEmployeeId,_tmpName,_tmpEmail,_tmpPhNumber,_tmpOccupation,_tmpAddress);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
