package com.sabeeldev.alarmclock.database;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AlarmDao_Impl implements AlarmDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Alarm> __insertionAdapterOfAlarm;

  private final LinkedHashmapToStringConventer __linkedHashmapToStringConventer = new LinkedHashmapToStringConventer();

  private final HashmapToStringConventer __hashmapToStringConventer = new HashmapToStringConventer();

  private final SharedSQLiteStatement __preparedStmtOfUpdateAlarmStatus;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllAlarms;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAlarm;

  public AlarmDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAlarm = new EntityInsertionAdapter<Alarm>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `alarmData` (`aid`,`name`,`hours`,`minutes`,`isVibrate`,`days`,`ringtone`,`turnOffMode`,`isOn`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Alarm value) {
        stmt.bindLong(1, value.getAid());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        stmt.bindLong(3, value.getHours());
        stmt.bindLong(4, value.getMinutes());
        final int _tmp;
        _tmp = value.getVibrate() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final String _tmp_1;
        _tmp_1 = __linkedHashmapToStringConventer.fromToHashMap(value.getDays());
        if (_tmp_1 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_1);
        }
        if (value.getRingtone() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRingtone());
        }
        final String _tmp_2;
        _tmp_2 = __hashmapToStringConventer.fromToHashMap(value.getTurnOffMode());
        if (_tmp_2 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_2);
        }
        final int _tmp_3;
        _tmp_3 = value.isOn() ? 1 : 0;
        stmt.bindLong(9, _tmp_3);
      }
    };
    this.__preparedStmtOfUpdateAlarmStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE alarmData SET isOn=? WHERE aid=?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllAlarms = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from alarmData";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAlarm = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from alarmData WHERE aid=?";
        return _query;
      }
    };
  }

  @Override
  public long insertAlarm(final Alarm alarm) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfAlarm.insertAndReturnId(alarm);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateAlarmStatus(final long id, final boolean value) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAlarmStatus.acquire();
    int _argIndex = 1;
    final int _tmp;
    _tmp = value ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateAlarmStatus.release(_stmt);
    }
  }

  @Override
  public void deleteAllAlarms() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllAlarms.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllAlarms.release(_stmt);
    }
  }

  @Override
  public void deleteAlarm(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAlarm.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAlarm.release(_stmt);
    }
  }

  @Override
  public Maybe<List<Alarm>> getAllAlarms() {
    final String _sql = "SELECT * FROM alarmData";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Maybe.fromCallable(new Callable<List<Alarm>>() {
      @Override
      public List<Alarm> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAid = CursorUtil.getColumnIndexOrThrow(_cursor, "aid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfHours = CursorUtil.getColumnIndexOrThrow(_cursor, "hours");
          final int _cursorIndexOfMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "minutes");
          final int _cursorIndexOfVibrate = CursorUtil.getColumnIndexOrThrow(_cursor, "isVibrate");
          final int _cursorIndexOfDays = CursorUtil.getColumnIndexOrThrow(_cursor, "days");
          final int _cursorIndexOfRingtone = CursorUtil.getColumnIndexOrThrow(_cursor, "ringtone");
          final int _cursorIndexOfTurnOffMode = CursorUtil.getColumnIndexOrThrow(_cursor, "turnOffMode");
          final int _cursorIndexOfIsOn = CursorUtil.getColumnIndexOrThrow(_cursor, "isOn");
          final List<Alarm> _result = new ArrayList<Alarm>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Alarm _item;
            final long _tmpAid;
            _tmpAid = _cursor.getLong(_cursorIndexOfAid);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpHours;
            _tmpHours = _cursor.getInt(_cursorIndexOfHours);
            final int _tmpMinutes;
            _tmpMinutes = _cursor.getInt(_cursorIndexOfMinutes);
            final boolean _tmpVibrate;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfVibrate);
            _tmpVibrate = _tmp != 0;
            final LinkedHashMap<String, Boolean> _tmpDays;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDays)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfDays);
            }
            _tmpDays = __linkedHashmapToStringConventer.toHashMap(_tmp_1);
            final String _tmpRingtone;
            if (_cursor.isNull(_cursorIndexOfRingtone)) {
              _tmpRingtone = null;
            } else {
              _tmpRingtone = _cursor.getString(_cursorIndexOfRingtone);
            }
            final HashMap<String, Boolean> _tmpTurnOffMode;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfTurnOffMode)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfTurnOffMode);
            }
            _tmpTurnOffMode = __hashmapToStringConventer.toHashMap(_tmp_2);
            final boolean _tmpIsOn;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsOn);
            _tmpIsOn = _tmp_3 != 0;
            _item = new Alarm(_tmpAid,_tmpName,_tmpHours,_tmpMinutes,_tmpVibrate,_tmpDays,_tmpRingtone,_tmpTurnOffMode,_tmpIsOn);
            _result.add(_item);
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

  @Override
  public Single<Alarm> getAlarm(final long id) {
    final String _sql = "SELECT * FROM alarmData WHERE aid=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createSingle(new Callable<Alarm>() {
      @Override
      public Alarm call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfAid = CursorUtil.getColumnIndexOrThrow(_cursor, "aid");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfHours = CursorUtil.getColumnIndexOrThrow(_cursor, "hours");
          final int _cursorIndexOfMinutes = CursorUtil.getColumnIndexOrThrow(_cursor, "minutes");
          final int _cursorIndexOfVibrate = CursorUtil.getColumnIndexOrThrow(_cursor, "isVibrate");
          final int _cursorIndexOfDays = CursorUtil.getColumnIndexOrThrow(_cursor, "days");
          final int _cursorIndexOfRingtone = CursorUtil.getColumnIndexOrThrow(_cursor, "ringtone");
          final int _cursorIndexOfTurnOffMode = CursorUtil.getColumnIndexOrThrow(_cursor, "turnOffMode");
          final int _cursorIndexOfIsOn = CursorUtil.getColumnIndexOrThrow(_cursor, "isOn");
          final Alarm _result;
          if(_cursor.moveToFirst()) {
            final long _tmpAid;
            _tmpAid = _cursor.getLong(_cursorIndexOfAid);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final int _tmpHours;
            _tmpHours = _cursor.getInt(_cursorIndexOfHours);
            final int _tmpMinutes;
            _tmpMinutes = _cursor.getInt(_cursorIndexOfMinutes);
            final boolean _tmpVibrate;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfVibrate);
            _tmpVibrate = _tmp != 0;
            final LinkedHashMap<String, Boolean> _tmpDays;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfDays)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfDays);
            }
            _tmpDays = __linkedHashmapToStringConventer.toHashMap(_tmp_1);
            final String _tmpRingtone;
            if (_cursor.isNull(_cursorIndexOfRingtone)) {
              _tmpRingtone = null;
            } else {
              _tmpRingtone = _cursor.getString(_cursorIndexOfRingtone);
            }
            final HashMap<String, Boolean> _tmpTurnOffMode;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfTurnOffMode)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfTurnOffMode);
            }
            _tmpTurnOffMode = __hashmapToStringConventer.toHashMap(_tmp_2);
            final boolean _tmpIsOn;
            final int _tmp_3;
            _tmp_3 = _cursor.getInt(_cursorIndexOfIsOn);
            _tmpIsOn = _tmp_3 != 0;
            _result = new Alarm(_tmpAid,_tmpName,_tmpHours,_tmpMinutes,_tmpVibrate,_tmpDays,_tmpRingtone,_tmpTurnOffMode,_tmpIsOn);
          } else {
            _result = null;
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
