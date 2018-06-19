package com.nn.kovaleva.irina.serverschooltutor.provider.tables;

import android.net.Uri;
import android.provider.BaseColumns;

public class EducationTable implements BaseColumns {
    public static final String AUTHORITY = "com.nn.kovaleva.irina.serverschooltutor.database";
    public static final String TABLE_NAME = "education";
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/" + TABLE_NAME);

    public static final String  USER_ID = "id_user";
    public static final String  UNIVERSITY = "university";
    public static final String  FACULTY = "faculty";
    public static final String  ENDING_YEAR = "ending_year";
}
