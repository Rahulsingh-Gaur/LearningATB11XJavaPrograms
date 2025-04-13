package ex_Enum;

public enum URLs {
    Google ("www.Google.com"),
    Yahoo("www.yaho.com"),
    drive("www.Drive.com");


   private  String URL;
        URLs(String URL) {
            this.URL = URL;
        }

        String getURL() {
            return this.URL;
        }


    }

