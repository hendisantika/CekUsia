/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.cekusia;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

/**
 *
 * @author hendi.santika
 * http://howtodoinjava.com/for-fun-only/java-code-to-calculate-age-from-date-of-birth/
 */
public class Joda {

    public static void main(String[] args) {
        LocalDate birthdate = new LocalDate(1986, 9, 19);          //Birth date
        LocalDate now = new LocalDate();                    //Today's date
        Period period = new Period(birthdate, now, PeriodType.yearMonthDay());
        //Now access the values as below
        System.out.println("Using Joda Time");
        System.out.println("Usia : " + period.getYears()+ " Tahun " +
                period.getMonths() + " Bulan "
                + period.getDays() + " Hari ");
        System.out.println();

    }
}
