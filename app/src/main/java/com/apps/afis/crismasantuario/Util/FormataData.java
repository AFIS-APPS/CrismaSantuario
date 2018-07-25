package com.apps.afis.crismasantuario.Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class FormataData {
    private static Calendar currentData;

    public static String getDataAtual(){

        currentData = Calendar.getInstance();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String data = formataData.format(currentData.getTime());

        return data;
    }

    public static String getAnoAtual(){

        currentData = Calendar.getInstance();
        String sysYear = String.valueOf(currentData.get(Calendar.YEAR));

        return sysYear;
    }
}
