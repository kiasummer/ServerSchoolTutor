package com.nn.kovaleva.irina.serverschooltutor.provider.tables;

import android.net.Uri;
import android.provider.BaseColumns;

public class UserSubjectTable implements BaseColumns {
    public static final String AUTHORITY = "com.nn.kovaleva.irina.serverschooltutor.database";
    public static final String TABLE_NAME = "user_subject";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + TABLE_NAME);

    public static final String  USER_ID = "id_user";
    public static final String  SUBJECT_NAME = "subject";
}
