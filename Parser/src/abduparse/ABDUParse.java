/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abduparse;

import parser.ABDULogger;
import parser.ABDUParser;
import parser.ABDUSettings;

/**
 *
 * @author Andrej
 */
public class ABDUParse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            throw new IllegalArgumentException("Path to file to parse is required as an argument");
        }
        
        ABDUSettings settings = new ABDUSettings();
        settings.setOutputDirectory("output");
        
        ABDUParser parser = new ABDUParser(settings, new ABDULogger());
        parser.parseFile(args[0]);
        parser.printData();
    }
}