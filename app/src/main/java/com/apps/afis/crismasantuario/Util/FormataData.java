package com.apps.afis.crismasantuario.Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormataData {
    private static Calendar currentData;

    public static Date getDataAtual(){

        currentData = Calendar.getInstance();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());

        formataData.format(currentData.getTime());
        return currentData.getTime();
    }

    public static String getAnoAtual(){

        currentData = Calendar.getInstance();
        String sysYear = String.valueOf(currentData.get(Calendar.YEAR));

        return sysYear;
    }
}
