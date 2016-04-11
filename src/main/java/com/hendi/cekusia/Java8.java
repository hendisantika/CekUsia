/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hendi.cekusia;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author hendi.santika
 * http://howtodoinjava.com/for-fun-only/java-code-to-calculate-age-from-date-of-birth/
 */
public class Java8 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1986, Month.SEPTEMBER, 19);

        Period p = Period.between(birthday, today);

        //Now access the values as below
        System.out.println("Using Java 8");
        System.out.println("Usia Anda : " + p.getYears() + " Tahun "
                + p.getMonths() + " Bulan "
                + p.getDays() + " Hari ");
        System.out.println();
    }

}
