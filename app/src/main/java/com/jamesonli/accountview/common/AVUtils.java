package com.jamesonli.accountview.common;

import java.util.Calendar;
import java.util.Date;

public class AVUtils {

    public static String dateGraphLabelParser(long epoch) {
        Date date = new Date(epoch);
        Calendar cal = Calendar.getInstance();

        cal.setTime(date);

        return String.format("%d/%d/%d", cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.YEAR));
    }
}
