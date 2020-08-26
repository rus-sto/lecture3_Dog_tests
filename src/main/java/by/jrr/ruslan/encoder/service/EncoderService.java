package by.jrr.ruslan.encoder.service;



public class EncoderService {




        public String decode(char symbol){
            return symbol+" => "+(int)symbol;
        }

         public String encode(int code) {
            return code+" => "+(char)code;
        }
    }


