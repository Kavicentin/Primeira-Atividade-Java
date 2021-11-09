package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println ("Seu sistema está em " + loc.getDisplayLanguage());
    }
    
}
