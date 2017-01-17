/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        //Implement your code
        return "XV/III/MX";
    }
    
    public Integer convertSingleRoman(char str) throws IllegalArgumentException {
        switch (str)
        {
          case 'I':
            return 1;        
          case 'V':
            return 5;
          case 'X':
            return 10;
          case 'L':
            return 50;
          case 'C':
            return 100;
          case 'D':
            return 500;
          case 'M':
            return 1000;
        }
        return 0;
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
       
        int i = 0,j,k;
        
        for (j = 0; j < nbr.length(); j++)
        {
            k = this.convertSingleRoman(nbr.charAt(j));
            if ( k <= i )
                i += k;
            else
                i = k - i;
        }
        return i;
    }

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        //Implement your code
        return new String("XVXX");
    }

}
