package com.nn.kovaleva.irina.serverschooltutor.provider.tables;

import android.net.Uri;
import android.provider.BaseColumns;


public class Contacts implements BaseColumns {
    public static final String AUTHORITY = "com.nn.kovaleva.irina.serverschooltutor.database";
    public static final String TABLE_NAME = "contacts";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + TABLE_NAME);

    public static final String  USER_FIRST_ID = "id_first";
    public static final String  USER_SECOND_ID = "id_second";
}
